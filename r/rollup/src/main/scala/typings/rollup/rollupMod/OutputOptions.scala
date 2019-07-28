package typings.rollup.rollupMod

import typings.rollup.Anon_Define
import typings.rollup.rollupStrings.`inline`
import typings.rollup.rollupStrings.auto
import typings.rollup.rollupStrings.default
import typings.rollup.rollupStrings.named
import typings.rollup.rollupStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputOptions extends js.Object {
  var amd: js.UndefOr[Anon_Define] = js.undefined
  var assetFileNames: js.UndefOr[String] = js.undefined
  var banner: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.undefined
  var chunkFileNames: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  // only required for bundle.write
  var dir: js.UndefOr[String] = js.undefined
  var dynamicImportFunction: js.UndefOr[String] = js.undefined
  var entryFileNames: js.UndefOr[String] = js.undefined
  var esModule: js.UndefOr[Boolean] = js.undefined
  var exports: js.UndefOr[default | named | none | auto] = js.undefined
  var extend: js.UndefOr[Boolean] = js.undefined
  // only required for bundle.write
  var file: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.undefined
  // this is optional at the base-level of RollupWatchOptions,
  // which extends from this interface through config merge
  var format: js.UndefOr[ModuleFormat] = js.undefined
  var freeze: js.UndefOr[Boolean] = js.undefined
  var globals: js.UndefOr[GlobalsOption] = js.undefined
  var importMetaUrl: js.UndefOr[js.Function2[/* chunkId */ String, /* moduleId */ String, String]] = js.undefined
  var indent: js.UndefOr[Boolean] = js.undefined
  var interop: js.UndefOr[Boolean] = js.undefined
  var intro: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespaceToStringTag: js.UndefOr[Boolean] = js.undefined
  var noConflict: js.UndefOr[Boolean] = js.undefined
  var outro: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.undefined
  var paths: js.UndefOr[OptionsPaths] = js.undefined
  var preferConst: js.UndefOr[Boolean] = js.undefined
  var sourcemap: js.UndefOr[Boolean | `inline`] = js.undefined
  var sourcemapExcludeSources: js.UndefOr[Boolean] = js.undefined
  var sourcemapFile: js.UndefOr[String] = js.undefined
  var sourcemapPathTransform: js.UndefOr[js.Function1[/* sourcePath */ String, String]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object OutputOptions {
  @scala.inline
  def apply(
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
    sourcemap: Boolean | `inline` = null,
    sourcemapExcludeSources: js.UndefOr[Boolean] = js.undefined,
    sourcemapFile: String = null,
    sourcemapPathTransform: /* sourcePath */ String => String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): OutputOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[OutputOptions]
  }
}

