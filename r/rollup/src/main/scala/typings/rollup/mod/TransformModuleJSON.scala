package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.PartialNull<rollup.rollup.ModuleOptions>> */
@js.native
trait TransformModuleJSON extends StObject {
  
  var ast: js.UndefOr[AcornNode] = js.native
  
  var code: String = js.native
  
  // note if plugins use new this.cache to opt-out auto transform cache
  var customTransformCache: Boolean = js.native
  
  var meta: js.UndefOr[CustomPluginOptions | Null] = js.native
  
  var moduleSideEffects: js.UndefOr[Boolean | `no-treeshake` | Null] = js.native
  
  var originalCode: String = js.native
  
  var originalSourcemap: ExistingDecodedSourceMap | Null = js.native
  
  var resolvedIds: js.UndefOr[ResolvedIdMap] = js.native
  
  var sourcemapChain: js.Array[DecodedSourceMapOrMissing] = js.native
  
  var syntheticNamedExports: js.UndefOr[Boolean | String | Null] = js.native
  
  var transformDependencies: js.Array[String] = js.native
}
object TransformModuleJSON {
  
  @scala.inline
  def apply(
    code: String,
    customTransformCache: Boolean,
    originalCode: String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    transformDependencies: js.Array[String]
  ): TransformModuleJSON = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], customTransformCache = customTransformCache.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourcemapChain = sourcemapChain.asInstanceOf[js.Any], transformDependencies = transformDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformModuleJSON]
  }
  
  @scala.inline
  implicit class TransformModuleJSONMutableBuilder[Self <: TransformModuleJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: AcornNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTransformCache(value: Boolean): Self = StObject.set(x, "customTransformCache", value.asInstanceOf[js.Any])
    
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
    def setOriginalCode(value: String): Self = StObject.set(x, "originalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalSourcemap(value: ExistingDecodedSourceMap): Self = StObject.set(x, "originalSourcemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalSourcemapNull: Self = StObject.set(x, "originalSourcemap", null)
    
    @scala.inline
    def setResolvedIds(value: ResolvedIdMap): Self = StObject.set(x, "resolvedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedIdsUndefined: Self = StObject.set(x, "resolvedIds", js.undefined)
    
    @scala.inline
    def setSourcemapChain(value: js.Array[DecodedSourceMapOrMissing]): Self = StObject.set(x, "sourcemapChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapChainVarargs(value: DecodedSourceMapOrMissing*): Self = StObject.set(x, "sourcemapChain", js.Array(value :_*))
    
    @scala.inline
    def setSyntheticNamedExports(value: Boolean | String): Self = StObject.set(x, "syntheticNamedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntheticNamedExportsNull: Self = StObject.set(x, "syntheticNamedExports", null)
    
    @scala.inline
    def setSyntheticNamedExportsUndefined: Self = StObject.set(x, "syntheticNamedExports", js.undefined)
    
    @scala.inline
    def setTransformDependencies(value: js.Array[String]): Self = StObject.set(x, "transformDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformDependenciesVarargs(value: String*): Self = StObject.set(x, "transformDependencies", js.Array(value :_*))
  }
}
