package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleOptions extends StObject {
  
  var assertions: Record[String, String]
  
  var meta: CustomPluginOptions
  
  var moduleSideEffects: Boolean | `no-treeshake`
  
  var syntheticNamedExports: Boolean | String
}
object ModuleOptions {
  
  inline def apply(
    assertions: Record[String, String],
    meta: CustomPluginOptions,
    moduleSideEffects: Boolean | `no-treeshake`,
    syntheticNamedExports: Boolean | String
  ): ModuleOptions = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    
    inline def setAssertions(value: Record[String, String]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: CustomPluginOptions): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setModuleSideEffects(value: Boolean | `no-treeshake`): Self = StObject.set(x, "moduleSideEffects", value.asInstanceOf[js.Any])
    
    inline def setSyntheticNamedExports(value: Boolean | String): Self = StObject.set(x, "syntheticNamedExports", value.asInstanceOf[js.Any])
  }
}
