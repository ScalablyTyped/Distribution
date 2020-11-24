package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.PartialNull<rollup.rollup.ModuleOptions>> */
@js.native
trait PartialResolvedId extends _ResolveIdResult {
  
  var external: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var meta: js.UndefOr[CustomPluginOptions | Null] = js.native
  
  var moduleSideEffects: js.UndefOr[Boolean | `no-treeshake` | Null] = js.native
  
  var syntheticNamedExports: js.UndefOr[Boolean | String | Null] = js.native
}
object PartialResolvedId {
  
  @scala.inline
  def apply(id: String): PartialResolvedId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialResolvedId]
  }
  
  @scala.inline
  implicit class PartialResolvedIdOps[Self <: PartialResolvedId] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal(value: Boolean): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    
    @scala.inline
    def setMeta(value: CustomPluginOptions): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setMetaNull: Self = this.set("meta", null)
    
    @scala.inline
    def setModuleSideEffects(value: Boolean | `no-treeshake`): Self = this.set("moduleSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleSideEffects: Self = this.set("moduleSideEffects", js.undefined)
    
    @scala.inline
    def setModuleSideEffectsNull: Self = this.set("moduleSideEffects", null)
    
    @scala.inline
    def setSyntheticNamedExports(value: Boolean | String): Self = this.set("syntheticNamedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntheticNamedExports: Self = this.set("syntheticNamedExports", js.undefined)
    
    @scala.inline
    def setSyntheticNamedExportsNull: Self = this.set("syntheticNamedExports", null)
  }
}
