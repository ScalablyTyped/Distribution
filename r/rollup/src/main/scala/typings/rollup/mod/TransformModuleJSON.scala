package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.PartialNull<rollup.rollup.ModuleOptions>> */
trait TransformModuleJSON extends StObject {
  
  var ast: js.UndefOr[AcornNode] = js.undefined
  
  var code: String
  
  // note if plugins use new this.cache to opt-out auto transform cache
  var customTransformCache: Boolean
  
  var meta: js.UndefOr[CustomPluginOptions | Null] = js.undefined
  
  var moduleSideEffects: js.UndefOr[Boolean | `no-treeshake` | Null] = js.undefined
  
  var originalCode: String
  
  var originalSourcemap: ExistingDecodedSourceMap | Null
  
  var resolvedIds: js.UndefOr[ResolvedIdMap] = js.undefined
  
  var sourcemapChain: js.Array[DecodedSourceMapOrMissing]
  
  var syntheticNamedExports: js.UndefOr[Boolean | String | Null] = js.undefined
  
  var transformDependencies: js.Array[String]
}
object TransformModuleJSON {
  
  inline def apply(
    code: String,
    customTransformCache: Boolean,
    originalCode: String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    transformDependencies: js.Array[String]
  ): TransformModuleJSON = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], customTransformCache = customTransformCache.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourcemapChain = sourcemapChain.asInstanceOf[js.Any], transformDependencies = transformDependencies.asInstanceOf[js.Any], originalSourcemap = null)
    __obj.asInstanceOf[TransformModuleJSON]
  }
  
  extension [Self <: TransformModuleJSON](x: Self) {
    
    inline def setAst(value: AcornNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCustomTransformCache(value: Boolean): Self = StObject.set(x, "customTransformCache", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: CustomPluginOptions): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaNull: Self = StObject.set(x, "meta", null)
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setModuleSideEffects(value: Boolean | `no-treeshake`): Self = StObject.set(x, "moduleSideEffects", value.asInstanceOf[js.Any])
    
    inline def setModuleSideEffectsNull: Self = StObject.set(x, "moduleSideEffects", null)
    
    inline def setModuleSideEffectsUndefined: Self = StObject.set(x, "moduleSideEffects", js.undefined)
    
    inline def setOriginalCode(value: String): Self = StObject.set(x, "originalCode", value.asInstanceOf[js.Any])
    
    inline def setOriginalSourcemap(value: ExistingDecodedSourceMap): Self = StObject.set(x, "originalSourcemap", value.asInstanceOf[js.Any])
    
    inline def setOriginalSourcemapNull: Self = StObject.set(x, "originalSourcemap", null)
    
    inline def setResolvedIds(value: ResolvedIdMap): Self = StObject.set(x, "resolvedIds", value.asInstanceOf[js.Any])
    
    inline def setResolvedIdsUndefined: Self = StObject.set(x, "resolvedIds", js.undefined)
    
    inline def setSourcemapChain(value: js.Array[DecodedSourceMapOrMissing]): Self = StObject.set(x, "sourcemapChain", value.asInstanceOf[js.Any])
    
    inline def setSourcemapChainVarargs(value: DecodedSourceMapOrMissing*): Self = StObject.set(x, "sourcemapChain", js.Array(value :_*))
    
    inline def setSyntheticNamedExports(value: Boolean | String): Self = StObject.set(x, "syntheticNamedExports", value.asInstanceOf[js.Any])
    
    inline def setSyntheticNamedExportsNull: Self = StObject.set(x, "syntheticNamedExports", null)
    
    inline def setSyntheticNamedExportsUndefined: Self = StObject.set(x, "syntheticNamedExports", js.undefined)
    
    inline def setTransformDependencies(value: js.Array[String]): Self = StObject.set(x, "transformDependencies", value.asInstanceOf[js.Any])
    
    inline def setTransformDependenciesVarargs(value: String*): Self = StObject.set(x, "transformDependencies", js.Array(value :_*))
  }
}
