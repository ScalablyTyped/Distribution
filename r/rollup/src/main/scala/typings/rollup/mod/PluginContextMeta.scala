package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginContextMeta extends StObject {
  
  var rollupVersion: String = js.native
  
  var watchMode: Boolean = js.native
}
object PluginContextMeta {
  
  @scala.inline
  def apply(rollupVersion: String, watchMode: Boolean): PluginContextMeta = {
    val __obj = js.Dynamic.literal(rollupVersion = rollupVersion.asInstanceOf[js.Any], watchMode = watchMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginContextMeta]
  }
  
  @scala.inline
  implicit class PluginContextMetaMutableBuilder[Self <: PluginContextMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRollupVersion(value: String): Self = StObject.set(x, "rollupVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchMode(value: Boolean): Self = StObject.set(x, "watchMode", value.asInstanceOf[js.Any])
  }
}
