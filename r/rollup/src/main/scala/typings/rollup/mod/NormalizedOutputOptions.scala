package typings.rollup.mod

import typings.rollup.anon.Id
import typings.rollup.rollupBooleans.`true`
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
  
  var amd: Id
  
  var assetFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])
  
  def banner(): String | js.Promise[String]
  
  var chunkFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])
  
  var compact: Boolean
  
  var dir: js.UndefOr[String] = js.undefined
  
  /** @deprecated Use the "renderDynamicImport" plugin hook instead. */
  var dynamicImportFunction: js.UndefOr[String] = js.undefined
  
  var entryFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])
  
  var esModule: Boolean
  
  var exports: default | named | none | auto
  
  var extend: Boolean
  
  var externalLiveBindings: Boolean
  
  var file: js.UndefOr[String] = js.undefined
  
  def footer(): String | js.Promise[String]
  
  var format: InternalModuleFormat
  
  var freeze: Boolean
  
  var globals: GlobalsOption
  
  var hoistTransitiveImports: Boolean
  
  var indent: `true` | String
  
  var inlineDynamicImports: Boolean
  
  def interop(): InteropType
  def interop(id: String): InteropType
  @JSName("interop")
  var interop_Original: GetInterop
  
  def intro(): String | js.Promise[String]
  
  var manualChunks: ManualChunksOption
  
  var minifyInternalExports: Boolean
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespaceToStringTag: Boolean
  
  var noConflict: Boolean
  
  def outro(): String | js.Promise[String]
  
  var paths: OptionsPaths
  
  var plugins: js.Array[OutputPlugin]
  
  var preferConst: Boolean
  
  var preserveModules: Boolean
  
  var preserveModulesRoot: js.UndefOr[String] = js.undefined
  
  var sourcemap: Boolean | `inline` | hidden
  
  var sourcemapExcludeSources: Boolean
  
  var sourcemapFile: js.UndefOr[String] = js.undefined
  
  var sourcemapPathTransform: js.UndefOr[SourcemapPathTransformOption] = js.undefined
  
  var strict: Boolean
  
  var systemNullSetters: Boolean
}
object NormalizedOutputOptions {
  
  @scala.inline
  def apply(
    amd: Id,
    assetFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String]),
    banner: () => String | js.Promise[String],
    chunkFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String]),
    compact: Boolean,
    entryFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String]),
    esModule: Boolean,
    exports: default | named | none | auto,
    extend: Boolean,
    externalLiveBindings: Boolean,
    footer: () => String | js.Promise[String],
    format: InternalModuleFormat,
    freeze: Boolean,
    globals: GlobalsOption,
    hoistTransitiveImports: Boolean,
    indent: `true` | String,
    inlineDynamicImports: Boolean,
    interop: /* id */ String | Null => InteropType,
    intro: () => String | js.Promise[String],
    manualChunks: ManualChunksOption,
    minifyInternalExports: Boolean,
    namespaceToStringTag: Boolean,
    noConflict: Boolean,
    outro: () => String | js.Promise[String],
    paths: OptionsPaths,
    plugins: js.Array[OutputPlugin],
    preferConst: Boolean,
    preserveModules: Boolean,
    sourcemap: Boolean | `inline` | hidden,
    sourcemapExcludeSources: Boolean,
    strict: Boolean,
    systemNullSetters: Boolean
  ): NormalizedOutputOptions = {
    val __obj = js.Dynamic.literal(amd = amd.asInstanceOf[js.Any], assetFileNames = assetFileNames.asInstanceOf[js.Any], banner = js.Any.fromFunction0(banner), chunkFileNames = chunkFileNames.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], entryFileNames = entryFileNames.asInstanceOf[js.Any], esModule = esModule.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], extend = extend.asInstanceOf[js.Any], externalLiveBindings = externalLiveBindings.asInstanceOf[js.Any], footer = js.Any.fromFunction0(footer), format = format.asInstanceOf[js.Any], freeze = freeze.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], hoistTransitiveImports = hoistTransitiveImports.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], inlineDynamicImports = inlineDynamicImports.asInstanceOf[js.Any], interop = js.Any.fromFunction1(interop), intro = js.Any.fromFunction0(intro), manualChunks = manualChunks.asInstanceOf[js.Any], minifyInternalExports = minifyInternalExports.asInstanceOf[js.Any], namespaceToStringTag = namespaceToStringTag.asInstanceOf[js.Any], noConflict = noConflict.asInstanceOf[js.Any], outro = js.Any.fromFunction0(outro), paths = paths.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], preferConst = preferConst.asInstanceOf[js.Any], preserveModules = preserveModules.asInstanceOf[js.Any], sourcemap = sourcemap.asInstanceOf[js.Any], sourcemapExcludeSources = sourcemapExcludeSources.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], systemNullSetters = systemNullSetters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOutputOptions]
  }
  
  @scala.inline
  implicit class NormalizedOutputOptionsMutableBuilder[Self <: NormalizedOutputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmd(value: Id): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])): Self = StObject.set(x, "assetFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetFileNamesFunction1(value: /* chunkInfo */ PreRenderedAsset => String): Self = StObject.set(x, "assetFileNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBanner(value: () => String | js.Promise[String]): Self = StObject.set(x, "banner", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChunkFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = StObject.set(x, "chunkFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = StObject.set(x, "chunkFileNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setDynamicImportFunction(value: String): Self = StObject.set(x, "dynamicImportFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicImportFunctionUndefined: Self = StObject.set(x, "dynamicImportFunction", js.undefined)
    
    @scala.inline
    def setEntryFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = StObject.set(x, "entryFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = StObject.set(x, "entryFileNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEsModule(value: Boolean): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExports(value: default | named | none | auto): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: Boolean): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalLiveBindings(value: Boolean): Self = StObject.set(x, "externalLiveBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setFooter(value: () => String | js.Promise[String]): Self = StObject.set(x, "footer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormat(value: InternalModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals(value: GlobalsOption): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalsFunction1(value: /* name */ String => String): Self = StObject.set(x, "globals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoistTransitiveImports(value: Boolean): Self = StObject.set(x, "hoistTransitiveImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: `true` | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineDynamicImports(value: Boolean): Self = StObject.set(x, "inlineDynamicImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterop(value: /* id */ String | Null => InteropType): Self = StObject.set(x, "interop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntro(value: () => String | js.Promise[String]): Self = StObject.set(x, "intro", js.Any.fromFunction0(value))
    
    @scala.inline
    def setManualChunks(value: ManualChunksOption): Self = StObject.set(x, "manualChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualChunksFunction2(value: (/* id */ String, /* api */ GetManualChunkApi) => js.UndefOr[String | Null]): Self = StObject.set(x, "manualChunks", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMinifyInternalExports(value: Boolean): Self = StObject.set(x, "minifyInternalExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespaceToStringTag(value: Boolean): Self = StObject.set(x, "namespaceToStringTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoConflict(value: Boolean): Self = StObject.set(x, "noConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutro(value: () => String | js.Promise[String]): Self = StObject.set(x, "outro", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaths(value: OptionsPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsFunction1(value: /* id */ String => String): Self = StObject.set(x, "paths", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlugins(value: js.Array[OutputPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsVarargs(value: OutputPlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setPreferConst(value: Boolean): Self = StObject.set(x, "preferConst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveModules(value: Boolean): Self = StObject.set(x, "preserveModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveModulesRoot(value: String): Self = StObject.set(x, "preserveModulesRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveModulesRootUndefined: Self = StObject.set(x, "preserveModulesRoot", js.undefined)
    
    @scala.inline
    def setSourcemap(value: Boolean | `inline` | hidden): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapExcludeSources(value: Boolean): Self = StObject.set(x, "sourcemapExcludeSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapFile(value: String): Self = StObject.set(x, "sourcemapFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapFileUndefined: Self = StObject.set(x, "sourcemapFile", js.undefined)
    
    @scala.inline
    def setSourcemapPathTransform(value: (/* relativeSourcePath */ String, /* sourcemapPath */ String) => String): Self = StObject.set(x, "sourcemapPathTransform", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSourcemapPathTransformUndefined: Self = StObject.set(x, "sourcemapPathTransform", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNullSetters(value: Boolean): Self = StObject.set(x, "systemNullSetters", value.asInstanceOf[js.Any])
  }
}
