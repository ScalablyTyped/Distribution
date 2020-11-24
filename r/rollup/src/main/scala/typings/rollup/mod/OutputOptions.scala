package typings.rollup.mod

import typings.rollup.anon.Define
import typings.rollup.rollupStrings.`inline`
import typings.rollup.rollupStrings.auto
import typings.rollup.rollupStrings.default
import typings.rollup.rollupStrings.hidden
import typings.rollup.rollupStrings.named
import typings.rollup.rollupStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputOptions extends js.Object {
  
  var amd: js.UndefOr[Define] = js.native
  
  var assetFileNames: js.UndefOr[String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])] = js.native
  
  var banner: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  
  var chunkFileNames: js.UndefOr[String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  // only required for bundle.write
  var dir: js.UndefOr[String] = js.native
  
  /** @deprecated Use the "renderDynamicImport" plugin hook instead. */
  var dynamicImportFunction: js.UndefOr[String] = js.native
  
  var entryFileNames: js.UndefOr[String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])] = js.native
  
  var esModule: js.UndefOr[Boolean] = js.native
  
  var exports: js.UndefOr[default | named | none | auto] = js.native
  
  var extend: js.UndefOr[Boolean] = js.native
  
  var externalLiveBindings: js.UndefOr[Boolean] = js.native
  
  // only required for bundle.write
  var file: js.UndefOr[String] = js.native
  
  var footer: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  
  var format: js.UndefOr[ModuleFormat] = js.native
  
  var freeze: js.UndefOr[Boolean] = js.native
  
  var globals: js.UndefOr[GlobalsOption] = js.native
  
  var hoistTransitiveImports: js.UndefOr[Boolean] = js.native
  
  var indent: js.UndefOr[String | Boolean] = js.native
  
  var inlineDynamicImports: js.UndefOr[Boolean] = js.native
  
  var interop: js.UndefOr[InteropType | GetInterop] = js.native
  
  var intro: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  
  var manualChunks: js.UndefOr[ManualChunksOption] = js.native
  
  var minifyInternalExports: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespaceToStringTag: js.UndefOr[Boolean] = js.native
  
  var noConflict: js.UndefOr[Boolean] = js.native
  
  var outro: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.native
  
  var paths: js.UndefOr[OptionsPaths] = js.native
  
  var plugins: js.UndefOr[js.Array[OutputPlugin]] = js.native
  
  var preferConst: js.UndefOr[Boolean] = js.native
  
  var preserveModules: js.UndefOr[Boolean] = js.native
  
  var preserveModulesRoot: js.UndefOr[String] = js.native
  
  var sourcemap: js.UndefOr[Boolean | `inline` | hidden] = js.native
  
  var sourcemapExcludeSources: js.UndefOr[Boolean] = js.native
  
  var sourcemapFile: js.UndefOr[String] = js.native
  
  var sourcemapPathTransform: js.UndefOr[SourcemapPathTransformOption] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var systemNullSetters: js.UndefOr[Boolean] = js.native
}
object OutputOptions {
  
  @scala.inline
  def apply(): OutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputOptions]
  }
  
  @scala.inline
  implicit class OutputOptionsOps[Self <: OutputOptions] (val x: Self) extends AnyVal {
    
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
    def setAmd(value: Define): Self = this.set("amd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmd: Self = this.set("amd", js.undefined)
    
    @scala.inline
    def setAssetFileNamesFunction1(value: /* chunkInfo */ PreRenderedAsset => String): Self = this.set("assetFileNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssetFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])): Self = this.set("assetFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetFileNames: Self = this.set("assetFileNames", js.undefined)
    
    @scala.inline
    def setBannerFunction0(value: () => String | js.Promise[String]): Self = this.set("banner", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBanner(value: String | (js.Function0[String | js.Promise[String]])): Self = this.set("banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBanner: Self = this.set("banner", js.undefined)
    
    @scala.inline
    def setChunkFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = this.set("chunkFileNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChunkFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = this.set("chunkFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkFileNames: Self = this.set("chunkFileNames", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setDynamicImportFunction(value: String): Self = this.set("dynamicImportFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicImportFunction: Self = this.set("dynamicImportFunction", js.undefined)
    
    @scala.inline
    def setEntryFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = this.set("entryFileNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEntryFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = this.set("entryFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryFileNames: Self = this.set("entryFileNames", js.undefined)
    
    @scala.inline
    def setEsModule(value: Boolean): Self = this.set("esModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsModule: Self = this.set("esModule", js.undefined)
    
    @scala.inline
    def setExports(value: default | named | none | auto): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExports: Self = this.set("exports", js.undefined)
    
    @scala.inline
    def setExtend(value: Boolean): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    
    @scala.inline
    def setExternalLiveBindings(value: Boolean): Self = this.set("externalLiveBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalLiveBindings: Self = this.set("externalLiveBindings", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFooterFunction0(value: () => String | js.Promise[String]): Self = this.set("footer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFooter(value: String | (js.Function0[String | js.Promise[String]])): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFormat(value: ModuleFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFreeze(value: Boolean): Self = this.set("freeze", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreeze: Self = this.set("freeze", js.undefined)
    
    @scala.inline
    def setGlobalsFunction1(value: /* name */ String => String): Self = this.set("globals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGlobals(value: GlobalsOption): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    
    @scala.inline
    def setHoistTransitiveImports(value: Boolean): Self = this.set("hoistTransitiveImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoistTransitiveImports: Self = this.set("hoistTransitiveImports", js.undefined)
    
    @scala.inline
    def setIndent(value: String | Boolean): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setInlineDynamicImports(value: Boolean): Self = this.set("inlineDynamicImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineDynamicImports: Self = this.set("inlineDynamicImports", js.undefined)
    
    @scala.inline
    def setInteropFunction1(value: /* id */ String | Null => InteropType): Self = this.set("interop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInterop(value: InteropType | GetInterop): Self = this.set("interop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterop: Self = this.set("interop", js.undefined)
    
    @scala.inline
    def setIntroFunction0(value: () => String | js.Promise[String]): Self = this.set("intro", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIntro(value: String | (js.Function0[String | js.Promise[String]])): Self = this.set("intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntro: Self = this.set("intro", js.undefined)
    
    @scala.inline
    def setManualChunksFunction2(value: (/* id */ String, /* api */ GetManualChunkApi) => js.UndefOr[String | Null]): Self = this.set("manualChunks", js.Any.fromFunction2(value))
    
    @scala.inline
    def setManualChunks(value: ManualChunksOption): Self = this.set("manualChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualChunks: Self = this.set("manualChunks", js.undefined)
    
    @scala.inline
    def setMinifyInternalExports(value: Boolean): Self = this.set("minifyInternalExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinifyInternalExports: Self = this.set("minifyInternalExports", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamespaceToStringTag(value: Boolean): Self = this.set("namespaceToStringTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceToStringTag: Self = this.set("namespaceToStringTag", js.undefined)
    
    @scala.inline
    def setNoConflict(value: Boolean): Self = this.set("noConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoConflict: Self = this.set("noConflict", js.undefined)
    
    @scala.inline
    def setOutroFunction0(value: () => String | js.Promise[String]): Self = this.set("outro", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOutro(value: String | (js.Function0[String | js.Promise[String]])): Self = this.set("outro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutro: Self = this.set("outro", js.undefined)
    
    @scala.inline
    def setPathsFunction1(value: /* id */ String => String): Self = this.set("paths", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPaths(value: OptionsPaths): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: OutputPlugin*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[OutputPlugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPreferConst(value: Boolean): Self = this.set("preferConst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferConst: Self = this.set("preferConst", js.undefined)
    
    @scala.inline
    def setPreserveModules(value: Boolean): Self = this.set("preserveModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveModules: Self = this.set("preserveModules", js.undefined)
    
    @scala.inline
    def setPreserveModulesRoot(value: String): Self = this.set("preserveModulesRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveModulesRoot: Self = this.set("preserveModulesRoot", js.undefined)
    
    @scala.inline
    def setSourcemap(value: Boolean | `inline` | hidden): Self = this.set("sourcemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcemap: Self = this.set("sourcemap", js.undefined)
    
    @scala.inline
    def setSourcemapExcludeSources(value: Boolean): Self = this.set("sourcemapExcludeSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcemapExcludeSources: Self = this.set("sourcemapExcludeSources", js.undefined)
    
    @scala.inline
    def setSourcemapFile(value: String): Self = this.set("sourcemapFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcemapFile: Self = this.set("sourcemapFile", js.undefined)
    
    @scala.inline
    def setSourcemapPathTransform(value: (/* relativeSourcePath */ String, /* sourcemapPath */ String) => String): Self = this.set("sourcemapPathTransform", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSourcemapPathTransform: Self = this.set("sourcemapPathTransform", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setSystemNullSetters(value: Boolean): Self = this.set("systemNullSetters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemNullSetters: Self = this.set("systemNullSetters", js.undefined)
  }
}
