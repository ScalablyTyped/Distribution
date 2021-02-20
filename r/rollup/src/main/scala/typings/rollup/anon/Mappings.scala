package typings.rollup.anon

import typings.rollup.mod.DecodedSourceMapOrMissing
import typings.rollup.rollupBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mappings extends DecodedSourceMapOrMissing {
  
  var mappings: js.UndefOr[scala.Nothing] = js.native
  
  var missing: `true` = js.native
  
  var plugin: String = js.native
}
object Mappings {
  
  @scala.inline
  def apply(missing: `true`, plugin: String): Mappings = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mappings]
  }
  
  @scala.inline
  implicit class MappingsMutableBuilder[Self <: Mappings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissing(value: `true`): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
  }
}
