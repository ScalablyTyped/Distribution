package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleOptions extends js.Object {
  
  var meta: CustomPluginOptions = js.native
  
  var moduleSideEffects: Boolean | `no-treeshake` = js.native
  
  var syntheticNamedExports: Boolean | String = js.native
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
  implicit class ModuleOptionsOps[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMeta(value: CustomPluginOptions): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleSideEffects(value: Boolean | `no-treeshake`): Self = this.set("moduleSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntheticNamedExports(value: Boolean | String): Self = this.set("syntheticNamedExports", value.asInstanceOf[js.Any])
  }
}
