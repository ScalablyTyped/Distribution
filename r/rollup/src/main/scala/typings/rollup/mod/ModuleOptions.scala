package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleOptions extends StObject {
  
  var meta: CustomPluginOptions
  
  var moduleSideEffects: Boolean | `no-treeshake`
  
  var syntheticNamedExports: Boolean | String
}
object ModuleOptions {
  
  @scala.inline
  def apply(
    meta: CustomPluginOptions,
    moduleSideEffects: Boolean | `no-treeshake`,
    syntheticNamedExports: Boolean | String
  ): ModuleOptions = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptions]
  }
  
  @scala.inline
  implicit class ModuleOptionsMutableBuilder[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: CustomPluginOptions): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleSideEffects(value: Boolean | `no-treeshake`): Self = StObject.set(x, "moduleSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntheticNamedExports(value: Boolean | String): Self = StObject.set(x, "syntheticNamedExports", value.asInstanceOf[js.Any])
  }
}
