package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginContextMeta extends StObject {
  
  var rollupVersion: String
  
  var watchMode: Boolean
}
object PluginContextMeta {
  
  inline def apply(rollupVersion: String, watchMode: Boolean): PluginContextMeta = {
    val __obj = js.Dynamic.literal(rollupVersion = rollupVersion.asInstanceOf[js.Any], watchMode = watchMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginContextMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginContextMeta] (val x: Self) extends AnyVal {
    
    inline def setRollupVersion(value: String): Self = StObject.set(x, "rollupVersion", value.asInstanceOf[js.Any])
    
    inline def setWatchMode(value: Boolean): Self = StObject.set(x, "watchMode", value.asInstanceOf[js.Any])
  }
}
