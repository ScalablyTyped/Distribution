package typings.rollup.mod

import typings.rollup.anon.Id
import typings.rollup.rollupBooleans.`true`
import typings.rollup.rollupStrings.`inline`
import typings.rollup.rollupStrings.auto
import typings.rollup.rollupStrings.default
import typings.rollup.rollupStrings.hidden
import typings.rollup.rollupStrings.named
import typings.rollup.rollupStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizedOutputOptions extends js.Object {
  var amd: Id = js.native
  var assetFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String]) = js.native
  var chunkFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String]) = js.native
  var compact: Boolean = js.native
  var dir: js.UndefOr[String] = js.native
  /** @deprecated Use the "renderDynamicImport" plugin hook instead. */
  var dynamicImportFunction: js.UndefOr[String] = js.native
  var entryFileNames: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String]) = js.native
  var esModule: Boolean = js.native
  var exports: default | named | none | auto = js.native
  var extend: Boolean = js.native
  var externalLiveBindings: Boolean = js.native
  var file: js.UndefOr[String] = js.native
  var format: InternalModuleFormat = js.native
  var freeze: Boolean = js.native
  var globals: GlobalsOption = js.native
  var hoistTransitiveImports: Boolean = js.native
  var indent: `true` | String = js.native
  var inlineDynamicImports: Boolean = js.native
  var interop: Boolean = js.native
  var manualChunks: ManualChunksOption = js.native
  var minifyInternalExports: Boolean = js.native
  var name: js.UndefOr[String] = js.native
  var namespaceToStringTag: Boolean = js.native
  var noConflict: Boolean = js.native
  var paths: OptionsPaths = js.native
  var plugins: js.Array[OutputPlugin] = js.native
  var preferConst: Boolean = js.native
  var preserveModules: Boolean = js.native
  var sourcemap: Boolean | `inline` | hidden = js.native
  var sourcemapExcludeSources: Boolean = js.native
  var sourcemapFile: js.UndefOr[String] = js.native
  var sourcemapPathTransform: js.UndefOr[SourcemapPathTransformOption] = js.native
  var strict: Boolean = js.native
  var systemNullSetters: Boolean = js.native
  def banner(): String | js.Promise[String] = js.native
  def footer(): String | js.Promise[String] = js.native
  def intro(): String | js.Promise[String] = js.native
  def outro(): String | js.Promise[String] = js.native
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
    interop: Boolean,
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
    val __obj = js.Dynamic.literal(amd = amd.asInstanceOf[js.Any], assetFileNames = assetFileNames.asInstanceOf[js.Any], banner = js.Any.fromFunction0(banner), chunkFileNames = chunkFileNames.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], entryFileNames = entryFileNames.asInstanceOf[js.Any], esModule = esModule.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], extend = extend.asInstanceOf[js.Any], externalLiveBindings = externalLiveBindings.asInstanceOf[js.Any], footer = js.Any.fromFunction0(footer), format = format.asInstanceOf[js.Any], freeze = freeze.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], hoistTransitiveImports = hoistTransitiveImports.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], inlineDynamicImports = inlineDynamicImports.asInstanceOf[js.Any], interop = interop.asInstanceOf[js.Any], intro = js.Any.fromFunction0(intro), manualChunks = manualChunks.asInstanceOf[js.Any], minifyInternalExports = minifyInternalExports.asInstanceOf[js.Any], namespaceToStringTag = namespaceToStringTag.asInstanceOf[js.Any], noConflict = noConflict.asInstanceOf[js.Any], outro = js.Any.fromFunction0(outro), paths = paths.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], preferConst = preferConst.asInstanceOf[js.Any], preserveModules = preserveModules.asInstanceOf[js.Any], sourcemap = sourcemap.asInstanceOf[js.Any], sourcemapExcludeSources = sourcemapExcludeSources.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], systemNullSetters = systemNullSetters.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOutputOptions]
  }
  @scala.inline
  implicit class NormalizedOutputOptionsOps[Self <: NormalizedOutputOptions] (val x: Self) extends AnyVal {
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
    def setAmd(value: Id): Self = this.set("amd", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetFileNamesFunction1(value: /* chunkInfo */ PreRenderedAsset => String): Self = this.set("assetFileNames", js.Any.fromFunction1(value))
    @scala.inline
    def setAssetFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedAsset, String])): Self = this.set("assetFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setBanner(value: () => String | js.Promise[String]): Self = this.set("banner", js.Any.fromFunction0(value))
    @scala.inline
    def setChunkFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = this.set("chunkFileNames", js.Any.fromFunction1(value))
    @scala.inline
    def setChunkFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = this.set("chunkFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryFileNamesFunction1(value: /* chunkInfo */ PreRenderedChunk => String): Self = this.set("entryFileNames", js.Any.fromFunction1(value))
    @scala.inline
    def setEntryFileNames(value: String | (js.Function1[/* chunkInfo */ PreRenderedChunk, String])): Self = this.set("entryFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setEsModule(value: Boolean): Self = this.set("esModule", value.asInstanceOf[js.Any])
    @scala.inline
    def setExports(value: default | named | none | auto): Self = this.set("exports", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtend(value: Boolean): Self = this.set("extend", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalLiveBindings(value: Boolean): Self = this.set("externalLiveBindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: () => String | js.Promise[String]): Self = this.set("footer", js.Any.fromFunction0(value))
    @scala.inline
    def setFormat(value: InternalModuleFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setFreeze(value: Boolean): Self = this.set("freeze", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalsFunction1(value: /* name */ String => String): Self = this.set("globals", js.Any.fromFunction1(value))
    @scala.inline
    def setGlobals(value: GlobalsOption): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoistTransitiveImports(value: Boolean): Self = this.set("hoistTransitiveImports", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndent(value: `true` | String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def setInlineDynamicImports(value: Boolean): Self = this.set("inlineDynamicImports", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterop(value: Boolean): Self = this.set("interop", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntro(value: () => String | js.Promise[String]): Self = this.set("intro", js.Any.fromFunction0(value))
    @scala.inline
    def setManualChunksFunction2(value: (/* id */ String, /* api */ GetManualChunkApi) => js.UndefOr[String | Null]): Self = this.set("manualChunks", js.Any.fromFunction2(value))
    @scala.inline
    def setManualChunks(value: ManualChunksOption): Self = this.set("manualChunks", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinifyInternalExports(value: Boolean): Self = this.set("minifyInternalExports", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespaceToStringTag(value: Boolean): Self = this.set("namespaceToStringTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoConflict(value: Boolean): Self = this.set("noConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutro(value: () => String | js.Promise[String]): Self = this.set("outro", js.Any.fromFunction0(value))
    @scala.inline
    def setPathsFunction1(value: /* id */ String => String): Self = this.set("paths", js.Any.fromFunction1(value))
    @scala.inline
    def setPaths(value: OptionsPaths): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginsVarargs(value: OutputPlugin*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[OutputPlugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferConst(value: Boolean): Self = this.set("preferConst", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveModules(value: Boolean): Self = this.set("preserveModules", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcemap(value: Boolean | `inline` | hidden): Self = this.set("sourcemap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcemapExcludeSources(value: Boolean): Self = this.set("sourcemapExcludeSources", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemNullSetters(value: Boolean): Self = this.set("systemNullSetters", value.asInstanceOf[js.Any])
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDynamicImportFunction(value: String): Self = this.set("dynamicImportFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicImportFunction: Self = this.set("dynamicImportFunction", js.undefined)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSourcemapFile(value: String): Self = this.set("sourcemapFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcemapFile: Self = this.set("sourcemapFile", js.undefined)
    @scala.inline
    def setSourcemapPathTransform(value: (/* relativeSourcePath */ String, /* sourcemapPath */ String) => String): Self = this.set("sourcemapPathTransform", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSourcemapPathTransform: Self = this.set("sourcemapPathTransform", js.undefined)
  }
  
}

