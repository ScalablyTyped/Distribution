package typings.rollup.rollupMod

import typings.rollup.Anon_Define
import typings.rollup.rollupStrings.`inline`
import typings.rollup.rollupStrings.auto
import typings.rollup.rollupStrings.default
import typings.rollup.rollupStrings.hidden
import typings.rollup.rollupStrings.named
import typings.rollup.rollupStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGenerateOptions extends OutputOptions {
  var bundle: OutputChunk
}

object OnGenerateOptions {
  @scala.inline
  def apply(
    bundle: OutputChunk,
    amd: Anon_Define = null,
    assetFileNames: String = null,
    banner: String | (js.Function0[String | js.Promise[String]]) = null,
    chunkFileNames: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    dynamicImportFunction: String = null,
    entryFileNames: String = null,
    esModule: js.UndefOr[Boolean] = js.undefined,
    exports: default | named | none | auto = null,
    extend: js.UndefOr[Boolean] = js.undefined,
    externalLiveBindings: js.UndefOr[Boolean] = js.undefined,
    file: String = null,
    footer: String | (js.Function0[String | js.Promise[String]]) = null,
    format: ModuleFormat = null,
    freeze: js.UndefOr[Boolean] = js.undefined,
    globals: GlobalsOption = null,
    importMetaUrl: (/* chunkId */ String, /* moduleId */ String) => String = null,
    indent: js.UndefOr[Boolean] = js.undefined,
    interop: js.UndefOr[Boolean] = js.undefined,
    intro: String | (js.Function0[String | js.Promise[String]]) = null,
    name: String = null,
    namespaceToStringTag: js.UndefOr[Boolean] = js.undefined,
    noConflict: js.UndefOr[Boolean] = js.undefined,
    outro: String | (js.Function0[String | js.Promise[String]]) = null,
    paths: OptionsPaths = null,
    preferConst: js.UndefOr[Boolean] = js.undefined,
    sourcemap: Boolean | `inline` | hidden = null,
    sourcemapExcludeSources: js.UndefOr[Boolean] = js.undefined,
    sourcemapFile: String = null,
    sourcemapPathTransform: /* sourcePath */ String => String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): OnGenerateOptions = {
    val __obj = js.Dynamic.literal(bundle = bundle)
    if (amd != null) __obj.updateDynamic("amd")(amd)
    if (assetFileNames != null) __obj.updateDynamic("assetFileNames")(assetFileNames)
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (chunkFileNames != null) __obj.updateDynamic("chunkFileNames")(chunkFileNames)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (dynamicImportFunction != null) __obj.updateDynamic("dynamicImportFunction")(dynamicImportFunction)
    if (entryFileNames != null) __obj.updateDynamic("entryFileNames")(entryFileNames)
    if (!js.isUndefined(esModule)) __obj.updateDynamic("esModule")(esModule)
    if (exports != null) __obj.updateDynamic("exports")(exports.asInstanceOf[js.Any])
    if (!js.isUndefined(extend)) __obj.updateDynamic("extend")(extend)
    if (!js.isUndefined(externalLiveBindings)) __obj.updateDynamic("externalLiveBindings")(externalLiveBindings)
    if (file != null) __obj.updateDynamic("file")(file)
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(freeze)) __obj.updateDynamic("freeze")(freeze)
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (importMetaUrl != null) __obj.updateDynamic("importMetaUrl")(js.Any.fromFunction2(importMetaUrl))
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent)
    if (!js.isUndefined(interop)) __obj.updateDynamic("interop")(interop)
    if (intro != null) __obj.updateDynamic("intro")(intro.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(namespaceToStringTag)) __obj.updateDynamic("namespaceToStringTag")(namespaceToStringTag)
    if (!js.isUndefined(noConflict)) __obj.updateDynamic("noConflict")(noConflict)
    if (outro != null) __obj.updateDynamic("outro")(outro.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(preferConst)) __obj.updateDynamic("preferConst")(preferConst)
    if (sourcemap != null) __obj.updateDynamic("sourcemap")(sourcemap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemapExcludeSources)) __obj.updateDynamic("sourcemapExcludeSources")(sourcemapExcludeSources)
    if (sourcemapFile != null) __obj.updateDynamic("sourcemapFile")(sourcemapFile)
    if (sourcemapPathTransform != null) __obj.updateDynamic("sourcemapPathTransform")(js.Any.fromFunction1(sourcemapPathTransform))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[OnGenerateOptions]
  }
}

