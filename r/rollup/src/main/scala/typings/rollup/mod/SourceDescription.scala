package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.PartialNull<rollup.rollup.ModuleOptions>> */
trait SourceDescription extends StObject {
  
  var ast: js.UndefOr[AcornNode] = js.undefined
  
  var code: String
  
  var map: js.UndefOr[SourceMapInput] = js.undefined
  
  var meta: js.UndefOr[CustomPluginOptions | Null] = js.undefined
  
  var moduleSideEffects: js.UndefOr[Boolean | `no-treeshake` | Null] = js.undefined
  
  var syntheticNamedExports: js.UndefOr[Boolean | String | Null] = js.undefined
}
object SourceDescription {
  
  @scala.inline
  def apply(code: String): SourceDescription = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDescription]
  }
  
  @scala.inline
  implicit class SourceDescriptionMutableBuilder[Self <: SourceDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: AcornNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: SourceMapInput): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapNull: Self = StObject.set(x, "map", null)
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMeta(value: CustomPluginOptions): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaNull: Self = StObject.set(x, "meta", null)
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setModuleSideEffects(value: Boolean | `no-treeshake`): Self = StObject.set(x, "moduleSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleSideEffectsNull: Self = StObject.set(x, "moduleSideEffects", null)
    
    @scala.inline
    def setModuleSideEffectsUndefined: Self = StObject.set(x, "moduleSideEffects", js.undefined)
    
    @scala.inline
    def setSyntheticNamedExports(value: Boolean | String): Self = StObject.set(x, "syntheticNamedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntheticNamedExportsNull: Self = StObject.set(x, "syntheticNamedExports", null)
    
    @scala.inline
    def setSyntheticNamedExportsUndefined: Self = StObject.set(x, "syntheticNamedExports", js.undefined)
  }
}
