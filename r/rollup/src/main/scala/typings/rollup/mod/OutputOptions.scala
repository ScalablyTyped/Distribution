package typings.rollup.mod

import typings.rollup.rollupStrings.`if-default-prop`
import typings.rollup.rollupStrings.`inline`
import typings.rollup.rollupStrings.auto
import typings.rollup.rollupStrings.default
import typings.rollup.rollupStrings.hidden
import typings.rollup.rollupStrings.named
import typings.rollup.rollupStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputOptions extends StObject {
  
  var amd: js.UndefOr[AmdOptions] = js.undefined
  
  var assetFileNames: js.UndefOr[String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])] = js.undefined
  
  var banner: js.UndefOr[String | AddonFunction] = js.undefined
  
  var chunkFileNames: js.UndefOr[String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])] = js.undefined
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  // only required for bundle.write
  var dir: js.UndefOr[String] = js.undefined
  
  /** @deprecated Use the "renderDynamicImport" plugin hook instead. */
  var dynamicImportFunction: js.UndefOr[String] = js.undefined
  
  var dynamicImportInCjs: js.UndefOr[Boolean] = js.undefined
  
  var entryFileNames: js.UndefOr[String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])] = js.undefined
  
  var esModule: js.UndefOr[Boolean | `if-default-prop`] = js.undefined
  
  var experimentalMinChunkSize: js.UndefOr[Double] = js.undefined
  
  var exports: js.UndefOr[default | named | none | auto] = js.undefined
  
  var extend: js.UndefOr[Boolean] = js.undefined
  
  var externalImportAssertions: js.UndefOr[Boolean] = js.undefined
  
  var externalLiveBindings: js.UndefOr[Boolean] = js.undefined
  
  // only required for bundle.write
  var file: js.UndefOr[String] = js.undefined
  
  var footer: js.UndefOr[String | AddonFunction] = js.undefined
  
  var format: js.UndefOr[ModuleFormat] = js.undefined
  
  var freeze: js.UndefOr[Boolean] = js.undefined
  
  var generatedCode: js.UndefOr[GeneratedCodePreset | GeneratedCodeOptions] = js.undefined
  
  var globals: js.UndefOr[GlobalsOption] = js.undefined
  
  var hoistTransitiveImports: js.UndefOr[Boolean] = js.undefined
  
  var indent: js.UndefOr[String | Boolean] = js.undefined
  
  var inlineDynamicImports: js.UndefOr[Boolean] = js.undefined
  
  var interop: js.UndefOr[InteropType | GetInterop] = js.undefined
  
  var intro: js.UndefOr[String | AddonFunction] = js.undefined
  
  var manualChunks: js.UndefOr[ManualChunksOption] = js.undefined
  
  var minifyInternalExports: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /** @deprecated Use "generatedCode.symbols" instead. */
  var namespaceToStringTag: js.UndefOr[Boolean] = js.undefined
  
  var noConflict: js.UndefOr[Boolean] = js.undefined
  
  var outro: js.UndefOr[String | AddonFunction] = js.undefined
  
  var paths: js.UndefOr[OptionsPaths] = js.undefined
  
  var plugins: js.UndefOr[OutputPluginOption] = js.undefined
  
  /** @deprecated Use "generatedCode.constBindings" instead. */
  var preferConst: js.UndefOr[Boolean] = js.undefined
  
  var preserveModules: js.UndefOr[Boolean] = js.undefined
  
  var preserveModulesRoot: js.UndefOr[String] = js.undefined
  
  var sanitizeFileName: js.UndefOr[Boolean | (js.Function1[/* fileName */ String, String])] = js.undefined
  
  var sourcemap: js.UndefOr[Boolean | `inline` | hidden] = js.undefined
  
  var sourcemapBaseUrl: js.UndefOr[String] = js.undefined
  
  var sourcemapExcludeSources: js.UndefOr[Boolean] = js.undefined
  
  var sourcemapFile: js.UndefOr[String] = js.undefined
  
  var sourcemapPathTransform: js.UndefOr[SourcemapPathTransformOption] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var systemNullSetters: js.UndefOr[Boolean] = js.undefined
  
  var validate: js.UndefOr[Boolean] = js.undefined
}
object OutputOptions {
  
  inline def apply(): OutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputOptions]
  }
  
  extension [Self <: OutputOptions](x: Self) {
    
    inline def setAmd(value: AmdOptions): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    inline def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    inline def setAssetFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])): Self = StObject.set(x, "assetFileNames", value.asInstanceOf[js.Any])
    
    inline def setAssetFileNamesFunction1(value: /* chunkInfo */ PreRenderedAsset => String): Self = StObject.set(x, "assetFileNames", js.Any.fromFunction1(value))
    
    inline def setAssetFileNamesUndefined: Self = StObject.set(x, "assetFileNames", js.undefined)
    
    inline def setBanner(value: String | AddonFunction): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerFunction1(value: /* chunk */ RenderedChunk => String | js.Promise[String]): Self = StObject.set(x, "banner", js.Any.fromFunction1(value))
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setChunkFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = StObject.set(x, "chunkFileNames", value.asInstanceOf[js.Any])
    
    inline def setChunkFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = StObject.set(x, "chunkFileNames", js.Any.fromFunction1(value))
    
    inline def setChunkFileNamesUndefined: Self = StObject.set(x, "chunkFileNames", js.undefined)
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDynamicImportFunction(value: String): Self = StObject.set(x, "dynamicImportFunction", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportFunctionUndefined: Self = StObject.set(x, "dynamicImportFunction", js.undefined)
    
    inline def setDynamicImportInCjs(value: Boolean): Self = StObject.set(x, "dynamicImportInCjs", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportInCjsUndefined: Self = StObject.set(x, "dynamicImportInCjs", js.undefined)
    
    inline def setEntryFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = StObject.set(x, "entryFileNames", value.asInstanceOf[js.Any])
    
    inline def setEntryFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = StObject.set(x, "entryFileNames", js.Any.fromFunction1(value))
    
    inline def setEntryFileNamesUndefined: Self = StObject.set(x, "entryFileNames", js.undefined)
    
    inline def setEsModule(value: Boolean | `if-default-prop`): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
    
    inline def setEsModuleUndefined: Self = StObject.set(x, "esModule", js.undefined)
    
    inline def setExperimentalMinChunkSize(value: Double): Self = StObject.set(x, "experimentalMinChunkSize", value.asInstanceOf[js.Any])
    
    inline def setExperimentalMinChunkSizeUndefined: Self = StObject.set(x, "experimentalMinChunkSize", js.undefined)
    
    inline def setExports(value: default | named | none | auto): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExtend(value: Boolean): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setExternalImportAssertions(value: Boolean): Self = StObject.set(x, "externalImportAssertions", value.asInstanceOf[js.Any])
    
    inline def setExternalImportAssertionsUndefined: Self = StObject.set(x, "externalImportAssertions", js.undefined)
    
    inline def setExternalLiveBindings(value: Boolean): Self = StObject.set(x, "externalLiveBindings", value.asInstanceOf[js.Any])
    
    inline def setExternalLiveBindingsUndefined: Self = StObject.set(x, "externalLiveBindings", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFooter(value: String | AddonFunction): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterFunction1(value: /* chunk */ RenderedChunk => String | js.Promise[String]): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFormat(value: ModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
    
    inline def setFreezeUndefined: Self = StObject.set(x, "freeze", js.undefined)
    
    inline def setGeneratedCode(value: GeneratedCodePreset | GeneratedCodeOptions): Self = StObject.set(x, "generatedCode", value.asInstanceOf[js.Any])
    
    inline def setGeneratedCodeUndefined: Self = StObject.set(x, "generatedCode", js.undefined)
    
    inline def setGlobals(value: GlobalsOption): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsFunction1(value: /* name */ String => String): Self = StObject.set(x, "globals", js.Any.fromFunction1(value))
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setHoistTransitiveImports(value: Boolean): Self = StObject.set(x, "hoistTransitiveImports", value.asInstanceOf[js.Any])
    
    inline def setHoistTransitiveImportsUndefined: Self = StObject.set(x, "hoistTransitiveImports", js.undefined)
    
    inline def setIndent(value: String | Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setInlineDynamicImports(value: Boolean): Self = StObject.set(x, "inlineDynamicImports", value.asInstanceOf[js.Any])
    
    inline def setInlineDynamicImportsUndefined: Self = StObject.set(x, "inlineDynamicImports", js.undefined)
    
    inline def setInterop(value: InteropType | GetInterop): Self = StObject.set(x, "interop", value.asInstanceOf[js.Any])
    
    inline def setInteropFunction1(value: /* id */ String | Null => InteropType): Self = StObject.set(x, "interop", js.Any.fromFunction1(value))
    
    inline def setInteropUndefined: Self = StObject.set(x, "interop", js.undefined)
    
    inline def setIntro(value: String | AddonFunction): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
    
    inline def setIntroFunction1(value: /* chunk */ RenderedChunk => String | js.Promise[String]): Self = StObject.set(x, "intro", js.Any.fromFunction1(value))
    
    inline def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
    
    inline def setManualChunks(value: ManualChunksOption): Self = StObject.set(x, "manualChunks", value.asInstanceOf[js.Any])
    
    inline def setManualChunksFunction2(value: (/* id */ String, /* meta */ ManualChunkMeta) => String | NullValue): Self = StObject.set(x, "manualChunks", js.Any.fromFunction2(value))
    
    inline def setManualChunksUndefined: Self = StObject.set(x, "manualChunks", js.undefined)
    
    inline def setMinifyInternalExports(value: Boolean): Self = StObject.set(x, "minifyInternalExports", value.asInstanceOf[js.Any])
    
    inline def setMinifyInternalExportsUndefined: Self = StObject.set(x, "minifyInternalExports", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespaceToStringTag(value: Boolean): Self = StObject.set(x, "namespaceToStringTag", value.asInstanceOf[js.Any])
    
    inline def setNamespaceToStringTagUndefined: Self = StObject.set(x, "namespaceToStringTag", js.undefined)
    
    inline def setNoConflict(value: Boolean): Self = StObject.set(x, "noConflict", value.asInstanceOf[js.Any])
    
    inline def setNoConflictUndefined: Self = StObject.set(x, "noConflict", js.undefined)
    
    inline def setOutro(value: String | AddonFunction): Self = StObject.set(x, "outro", value.asInstanceOf[js.Any])
    
    inline def setOutroFunction1(value: /* chunk */ RenderedChunk => String | js.Promise[String]): Self = StObject.set(x, "outro", js.Any.fromFunction1(value))
    
    inline def setOutroUndefined: Self = StObject.set(x, "outro", js.undefined)
    
    inline def setPaths(value: OptionsPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsFunction1(value: /* id */ String => String): Self = StObject.set(x, "paths", js.Any.fromFunction1(value))
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPlugins(value: OutputPluginOption): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPreferConst(value: Boolean): Self = StObject.set(x, "preferConst", value.asInstanceOf[js.Any])
    
    inline def setPreferConstUndefined: Self = StObject.set(x, "preferConst", js.undefined)
    
    inline def setPreserveModules(value: Boolean): Self = StObject.set(x, "preserveModules", value.asInstanceOf[js.Any])
    
    inline def setPreserveModulesRoot(value: String): Self = StObject.set(x, "preserveModulesRoot", value.asInstanceOf[js.Any])
    
    inline def setPreserveModulesRootUndefined: Self = StObject.set(x, "preserveModulesRoot", js.undefined)
    
    inline def setPreserveModulesUndefined: Self = StObject.set(x, "preserveModules", js.undefined)
    
    inline def setSanitizeFileName(value: Boolean | (js.Function1[/* fileName */ String, String])): Self = StObject.set(x, "sanitizeFileName", value.asInstanceOf[js.Any])
    
    inline def setSanitizeFileNameFunction1(value: /* fileName */ String => String): Self = StObject.set(x, "sanitizeFileName", js.Any.fromFunction1(value))
    
    inline def setSanitizeFileNameUndefined: Self = StObject.set(x, "sanitizeFileName", js.undefined)
    
    inline def setSourcemap(value: Boolean | `inline` | hidden): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    inline def setSourcemapBaseUrl(value: String): Self = StObject.set(x, "sourcemapBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setSourcemapBaseUrlUndefined: Self = StObject.set(x, "sourcemapBaseUrl", js.undefined)
    
    inline def setSourcemapExcludeSources(value: Boolean): Self = StObject.set(x, "sourcemapExcludeSources", value.asInstanceOf[js.Any])
    
    inline def setSourcemapExcludeSourcesUndefined: Self = StObject.set(x, "sourcemapExcludeSources", js.undefined)
    
    inline def setSourcemapFile(value: String): Self = StObject.set(x, "sourcemapFile", value.asInstanceOf[js.Any])
    
    inline def setSourcemapFileUndefined: Self = StObject.set(x, "sourcemapFile", js.undefined)
    
    inline def setSourcemapPathTransform(value: (/* relativeSourcePath */ String, /* sourcemapPath */ String) => String): Self = StObject.set(x, "sourcemapPathTransform", js.Any.fromFunction2(value))
    
    inline def setSourcemapPathTransformUndefined: Self = StObject.set(x, "sourcemapPathTransform", js.undefined)
    
    inline def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setSystemNullSetters(value: Boolean): Self = StObject.set(x, "systemNullSetters", value.asInstanceOf[js.Any])
    
    inline def setSystemNullSettersUndefined: Self = StObject.set(x, "systemNullSetters", js.undefined)
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
