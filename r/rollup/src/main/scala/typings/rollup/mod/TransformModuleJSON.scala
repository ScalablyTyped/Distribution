package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<rollup.rollup.PartialNull<rollup.rollup.ModuleOptions>> */
@js.native
trait TransformModuleJSON extends js.Object {
  
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
  implicit class TransformModuleJSONOps[Self <: TransformModuleJSON] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTransformCache(value: Boolean): Self = this.set("customTransformCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalCode(value: String): Self = this.set("originalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapChainVarargs(value: DecodedSourceMapOrMissing*): Self = this.set("sourcemapChain", js.Array(value :_*))
    
    @scala.inline
    def setSourcemapChain(value: js.Array[DecodedSourceMapOrMissing]): Self = this.set("sourcemapChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformDependenciesVarargs(value: String*): Self = this.set("transformDependencies", js.Array(value :_*))
    
    @scala.inline
    def setTransformDependencies(value: js.Array[String]): Self = this.set("transformDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAst(value: AcornNode): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAst: Self = this.set("ast", js.undefined)
    
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
    def setOriginalSourcemap(value: ExistingDecodedSourceMap): Self = this.set("originalSourcemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalSourcemapNull: Self = this.set("originalSourcemap", null)
    
    @scala.inline
    def setResolvedIds(value: ResolvedIdMap): Self = this.set("resolvedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedIds: Self = this.set("resolvedIds", js.undefined)
    
    @scala.inline
    def setSyntheticNamedExports(value: Boolean | String): Self = this.set("syntheticNamedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntheticNamedExports: Self = this.set("syntheticNamedExports", js.undefined)
    
    @scala.inline
    def setSyntheticNamedExportsNull: Self = this.set("syntheticNamedExports", null)
  }
}
