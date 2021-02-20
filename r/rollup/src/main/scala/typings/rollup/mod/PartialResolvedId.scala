package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import org.scalablytyped.runtime.StObject
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
  implicit class PartialResolvedIdMutableBuilder[Self <: PartialResolvedId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
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
