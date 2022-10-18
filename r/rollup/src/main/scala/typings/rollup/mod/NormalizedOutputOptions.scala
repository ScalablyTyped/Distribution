package typings.rollup.mod

import typings.rollup.rollupBooleans.`true`
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

trait NormalizedOutputOptions extends StObject {
  
  var amd: NormalizedAmdOptions
  
  var assetFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])
  
  def banner(chunk: RenderedChunk): String | js.Promise[String]
  @JSName("banner")
  var banner_Original: AddonFunction
  
  var chunkFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])
  
  var compact: Boolean
  
  var dir: js.UndefOr[String] = js.undefined
  
  /** @deprecated Use the "renderDynamicImport" plugin hook instead. */
  var dynamicImportFunction: js.UndefOr[String] = js.undefined
  
  var dynamicImportInCjs: Boolean
  
  var entryFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])
  
  var esModule: Boolean | `if-default-prop`
  
  var exports: default | named | none | auto
  
  var extend: Boolean
  
  var externalImportAssertions: Boolean
  
  var externalLiveBindings: Boolean
  
  var file: js.UndefOr[String] = js.undefined
  
  def footer(chunk: RenderedChunk): String | js.Promise[String]
  @JSName("footer")
  var footer_Original: AddonFunction
  
  var format: InternalModuleFormat
  
  var freeze: Boolean
  
  var generatedCode: NormalizedGeneratedCodeOptions
  
  var globals: GlobalsOption
  
  var hoistTransitiveImports: Boolean
  
  var indent: `true` | String
  
  var inlineDynamicImports: Boolean
  
  def interop(): InteropType
  def interop(id: String): InteropType
  @JSName("interop")
  var interop_Original: GetInterop
  
  def intro(chunk: RenderedChunk): String | js.Promise[String]
  @JSName("intro")
  var intro_Original: AddonFunction
  
  var manualChunks: ManualChunksOption
  
  var minifyInternalExports: Boolean
  
  var name: js.UndefOr[String] = js.undefined
  
  /** @deprecated Use "generatedCode.symbols" instead. */
  var namespaceToStringTag: Boolean
  
  var noConflict: Boolean
  
  def outro(chunk: RenderedChunk): String | js.Promise[String]
  @JSName("outro")
  var outro_Original: AddonFunction
  
  var paths: OptionsPaths
  
  var plugins: js.Array[OutputPlugin]
  
  /** @deprecated Use "generatedCode.constBindings" instead. */
  var preferConst: Boolean
  
  var preserveModules: Boolean
  
  var preserveModulesRoot: js.UndefOr[String] = js.undefined
  
  def sanitizeFileName(fileName: String): String
  
  var sourcemap: Boolean | `inline` | hidden
  
  var sourcemapBaseUrl: js.UndefOr[String] = js.undefined
  
  var sourcemapExcludeSources: Boolean
  
  var sourcemapFile: js.UndefOr[String] = js.undefined
  
  var sourcemapPathTransform: js.UndefOr[SourcemapPathTransformOption] = js.undefined
  
  var strict: Boolean
  
  var systemNullSetters: Boolean
  
  var validate: Boolean
}
object NormalizedOutputOptions {
  
  inline def apply(
    amd: NormalizedAmdOptions,
    assetFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String]),
    banner: /* chunk */ RenderedChunk => String | js.Promise[String],
    chunkFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String]),
    compact: Boolean,
    dynamicImportInCjs: Boolean,
    entryFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String]),
    esModule: Boolean | `if-default-prop`,
    exports: default | named | none | auto,
    extend: Boolean,
    externalImportAssertions: Boolean,
    externalLiveBindings: Boolean,
    footer: /* chunk */ RenderedChunk => String | js.Promise[String],
    format: InternalModuleFormat,
    freeze: Boolean,
    generatedCode: NormalizedGeneratedCodeOptions,
    globals: GlobalsOption,
    hoistTransitiveImports: Boolean,
    indent: `true` | String,
    inlineDynamicImports: Boolean,
    interop: /* id */ String | Null => InteropType,
    intro: /* chunk */ RenderedChunk => String | js.Promise[String],
    manualChunks: ManualChunksOption,
    minifyInternalExports: Boolean,
    namespaceToStringTag: Boolean,
    noConflict: Boolean,
    outro: /* chunk */ RenderedChunk => String | js.Promise[String],
    paths: OptionsPaths,
    plugins: js.Array[OutputPlugin],
    preferConst: Boolean,
    preserveModules: Boolean,
    sanitizeFileName: String => String,
    sourcemap: Boolean | `inline` | hidden,
    sourcemapExcludeSources: Boolean,
    strict: Boolean,
    systemNullSetters: Boolean,
    validate: Boolean
  ): NormalizedOutputOptions = {
    val __obj = js.Dynamic.literal(amd = amd.asInstanceOf[js.Any], assetFileNames = assetFileNames.asInstanceOf[js.Any], banner = js.Any.fromFunction1(banner), chunkFileNames = chunkFileNames.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], dynamicImportInCjs = dynamicImportInCjs.asInstanceOf[js.Any], entryFileNames = entryFileNames.asInstanceOf[js.Any], esModule = esModule.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], extend = extend.asInstanceOf[js.Any], externalImportAssertions = externalImportAssertions.asInstanceOf[js.Any], externalLiveBindings = externalLiveBindings.asInstanceOf[js.Any], footer = js.Any.fromFunction1(footer), format = format.asInstanceOf[js.Any], freeze = freeze.asInstanceOf[js.Any], generatedCode = generatedCode.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], hoistTransitiveImports = hoistTransitiveImports.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], inlineDynamicImports = inlineDynamicImports.asInstanceOf[js.Any], interop = js.Any.fromFunction1(interop), intro = js.Any.fromFunction1(intro), manualChunks = manualChunks.asInstanceOf[js.Any], minifyInternalExports = minifyInternalExports.asInstanceOf[js.Any], namespaceToStringTag = namespaceToStringTag.asInstanceOf[js.Any], noConflict = noConflict.asInstanceOf[js.Any], outro = js.Any.fromFunction1(outro), paths = paths.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], preferConst = preferConst.asInstanceOf[js.Any], preserveModules = preserveModules.asInstanceOf[js.Any], sanitizeFileName = js.Any.fromFunction1(sanitizeFileName), sourcemap = sourcemap.asInstanceOf[js.Any], sourcemapExcludeSources = sourcemapExcludeSources.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], systemNullSetters = systemNullSetters.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOutputOptions]
  }
  
  extension [Self <: NormalizedOutputOptions](x: Self) {
    
    inline def setAmd(value: NormalizedAmdOptions): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    inline def setAssetFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])): Self = StObject.set(x, "assetFileNames", value.asInstanceOf[js.Any])
    
    inline def setAssetFileNamesFunction1(value: /* chunkInfo */ PreRenderedAsset => String): Self = StObject.set(x, "assetFileNames", js.Any.fromFunction1(value))
    
    inline def setBanner(value: /* chunk */ RenderedChunk => String | js.Promise[String]): Self = StObject.set(x, "banner", js.Any.fromFunction1(value))
    
    inline def setChunkFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = StObject.set(x, "chunkFileNames", value.asInstanceOf[js.Any])
    
    inline def setChunkFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = StObject.set(x, "chunkFileNames", js.Any.fromFunction1(value))
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDynamicImportFunction(value: String): Self = StObject.set(x, "dynamicImportFunction", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportFunctionUndefined: Self = StObject.set(x, "dynamicImportFunction", js.undefined)
    
    inline def setDynamicImportInCjs(value: Boolean): Self = StObject.set(x, "dynamicImportInCjs", value.asInstanceOf[js.Any])
    
    inline def setEntryFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = StObject.set(x, "entryFileNames", value.asInstanceOf[js.Any])
    
    inline def setEntryFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = StObject.set(x, "entryFileNames", js.Any.fromFunction1(value))
    
    inline def setEsModule(value: Boolean | `if-default-prop`): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
    
    inline def setExports(value: default | named | none | auto): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: Boolean): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExternalImportAssertions(value: Boolean): Self = StObject.set(x, "externalImportAssertions", value.asInstanceOf[js.Any])
    
    inline def setExternalLiveBindings(value: Boolean): Self = StObject.set(x, "externalLiveBindings", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFooter(value: /* chunk */ RenderedChunk => String | js.Promise[String]): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
    
    inline def setFormat(value: InternalModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
    
    inline def setGeneratedCode(value: NormalizedGeneratedCodeOptions): Self = StObject.set(x, "generatedCode", value.asInstanceOf[js.Any])
    
    inline def setGlobals(value: GlobalsOption): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsFunction1(value: /* name */ String => String): Self = StObject.set(x, "globals", js.Any.fromFunction1(value))
    
    inline def setHoistTransitiveImports(value: Boolean): Self = StObject.set(x, "hoistTransitiveImports", value.asInstanceOf[js.Any])
    
    inline def setIndent(value: `true` | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setInlineDynamicImports(value: Boolean): Self = StObject.set(x, "inlineDynamicImports", value.asInstanceOf[js.Any])
    
    inline def setInterop(value: /* id */ String | Null => InteropType): Self = StObject.set(x, "interop", js.Any.fromFunction1(value))
    
    inline def setIntro(value: /* chunk */ RenderedChunk => String | js.Promise[String]): Self = StObject.set(x, "intro", js.Any.fromFunction1(value))
    
    inline def setManualChunks(value: ManualChunksOption): Self = StObject.set(x, "manualChunks", value.asInstanceOf[js.Any])
    
    inline def setManualChunksFunction2(value: (/* id */ String, /* meta */ ManualChunkMeta) => String | NullValue): Self = StObject.set(x, "manualChunks", js.Any.fromFunction2(value))
    
    inline def setMinifyInternalExports(value: Boolean): Self = StObject.set(x, "minifyInternalExports", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespaceToStringTag(value: Boolean): Self = StObject.set(x, "namespaceToStringTag", value.asInstanceOf[js.Any])
    
    inline def setNoConflict(value: Boolean): Self = StObject.set(x, "noConflict", value.asInstanceOf[js.Any])
    
    inline def setOutro(value: /* chunk */ RenderedChunk => String | js.Promise[String]): Self = StObject.set(x, "outro", js.Any.fromFunction1(value))
    
    inline def setPaths(value: OptionsPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsFunction1(value: /* id */ String => String): Self = StObject.set(x, "paths", js.Any.fromFunction1(value))
    
    inline def setPlugins(value: js.Array[OutputPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: OutputPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPreferConst(value: Boolean): Self = StObject.set(x, "preferConst", value.asInstanceOf[js.Any])
    
    inline def setPreserveModules(value: Boolean): Self = StObject.set(x, "preserveModules", value.asInstanceOf[js.Any])
    
    inline def setPreserveModulesRoot(value: String): Self = StObject.set(x, "preserveModulesRoot", value.asInstanceOf[js.Any])
    
    inline def setPreserveModulesRootUndefined: Self = StObject.set(x, "preserveModulesRoot", js.undefined)
    
    inline def setSanitizeFileName(value: String => String): Self = StObject.set(x, "sanitizeFileName", js.Any.fromFunction1(value))
    
    inline def setSourcemap(value: Boolean | `inline` | hidden): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    inline def setSourcemapBaseUrl(value: String): Self = StObject.set(x, "sourcemapBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setSourcemapBaseUrlUndefined: Self = StObject.set(x, "sourcemapBaseUrl", js.undefined)
    
    inline def setSourcemapExcludeSources(value: Boolean): Self = StObject.set(x, "sourcemapExcludeSources", value.asInstanceOf[js.Any])
    
    inline def setSourcemapFile(value: String): Self = StObject.set(x, "sourcemapFile", value.asInstanceOf[js.Any])
    
    inline def setSourcemapFileUndefined: Self = StObject.set(x, "sourcemapFile", js.undefined)
    
    inline def setSourcemapPathTransform(value: (/* relativeSourcePath */ String, /* sourcemapPath */ String) => String): Self = StObject.set(x, "sourcemapPathTransform", js.Any.fromFunction2(value))
    
    inline def setSourcemapPathTransformUndefined: Self = StObject.set(x, "sourcemapPathTransform", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setSystemNullSetters(value: Boolean): Self = StObject.set(x, "systemNullSetters", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
