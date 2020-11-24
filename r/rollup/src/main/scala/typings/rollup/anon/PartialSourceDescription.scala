package typings.rollup.anon

import typings.rollup.mod.AcornNode
import typings.rollup.mod.CustomPluginOptions
import typings.rollup.mod.SourceMapInput
import typings.rollup.rollupStrings.`no-treeshake`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rollup.rollup.SourceDescription> */
@js.native
trait PartialSourceDescription extends js.Object {
  
  var ast: js.UndefOr[AcornNode] = js.native
  
  var code: js.UndefOr[String] = js.native
  
  var map: js.UndefOr[SourceMapInput] = js.native
  
  var meta: js.UndefOr[CustomPluginOptions | Null] = js.native
  
  var moduleSideEffects: js.UndefOr[Boolean | `no-treeshake` | Null] = js.native
  
  var syntheticNamedExports: js.UndefOr[Boolean | String | Null] = js.native
}
object PartialSourceDescription {
  
  @scala.inline
  def apply(): PartialSourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSourceDescription]
  }
  
  @scala.inline
  implicit class PartialSourceDescriptionOps[Self <: PartialSourceDescription] (val x: Self) extends AnyVal {
    
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
    def setAst(value: AcornNode): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAst: Self = this.set("ast", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setMap(value: SourceMapInput): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setMapNull: Self = this.set("map", null)
    
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
