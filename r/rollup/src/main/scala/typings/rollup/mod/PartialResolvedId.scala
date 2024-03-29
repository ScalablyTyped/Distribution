package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import typings.rollup.rollupStrings.absolute
import typings.rollup.rollupStrings.relative
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.PartialNull<rollup.rollup.ModuleOptions>> */
trait PartialResolvedId
  extends StObject
     with _ResolveIdResult
     with _ResolveIdResultWithoutNullValue {
  
  var assertions: js.UndefOr[(Record[String, String]) | Null] = js.undefined
  
  var external: js.UndefOr[Boolean | absolute | relative] = js.undefined
  
  var id: String
  
  var meta: js.UndefOr[CustomPluginOptions | Null] = js.undefined
  
  var moduleSideEffects: js.UndefOr[Boolean | `no-treeshake` | Null] = js.undefined
  
  var resolvedBy: js.UndefOr[String] = js.undefined
  
  var syntheticNamedExports: js.UndefOr[Boolean | String | Null] = js.undefined
}
object PartialResolvedId {
  
  inline def apply(id: String): PartialResolvedId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialResolvedId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialResolvedId] (val x: Self) extends AnyVal {
    
    inline def setAssertions(value: Record[String, String]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setAssertionsNull: Self = StObject.set(x, "assertions", null)
    
    inline def setAssertionsUndefined: Self = StObject.set(x, "assertions", js.undefined)
    
    inline def setExternal(value: Boolean | absolute | relative): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: CustomPluginOptions): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaNull: Self = StObject.set(x, "meta", null)
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setModuleSideEffects(value: Boolean | `no-treeshake`): Self = StObject.set(x, "moduleSideEffects", value.asInstanceOf[js.Any])
    
    inline def setModuleSideEffectsNull: Self = StObject.set(x, "moduleSideEffects", null)
    
    inline def setModuleSideEffectsUndefined: Self = StObject.set(x, "moduleSideEffects", js.undefined)
    
    inline def setResolvedBy(value: String): Self = StObject.set(x, "resolvedBy", value.asInstanceOf[js.Any])
    
    inline def setResolvedByUndefined: Self = StObject.set(x, "resolvedBy", js.undefined)
    
    inline def setSyntheticNamedExports(value: Boolean | String): Self = StObject.set(x, "syntheticNamedExports", value.asInstanceOf[js.Any])
    
    inline def setSyntheticNamedExportsNull: Self = StObject.set(x, "syntheticNamedExports", null)
    
    inline def setSyntheticNamedExportsUndefined: Self = StObject.set(x, "syntheticNamedExports", js.undefined)
  }
}
