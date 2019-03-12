package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputOptions extends js.Object {
  var amd: js.UndefOr[rollupLib.Anon_Define] = js.undefined
  var assetFileNames: js.UndefOr[java.lang.String] = js.undefined
  var banner: js.UndefOr[
    java.lang.String | (js.Function0[java.lang.String | js.Promise[java.lang.String]])
  ] = js.undefined
  var chunkFileNames: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  // only required for bundle.write
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var dynamicImportFunction: js.UndefOr[java.lang.String] = js.undefined
  var entryFileNames: js.UndefOr[java.lang.String] = js.undefined
  var esModule: js.UndefOr[scala.Boolean] = js.undefined
  var exports: js.UndefOr[
    rollupLib.rollupLibStrings.default | rollupLib.rollupLibStrings.named | rollupLib.rollupLibStrings.none | rollupLib.rollupLibStrings.auto
  ] = js.undefined
  var extend: js.UndefOr[scala.Boolean] = js.undefined
  // only required for bundle.write
  var file: js.UndefOr[java.lang.String] = js.undefined
  var footer: js.UndefOr[
    java.lang.String | (js.Function0[java.lang.String | js.Promise[java.lang.String]])
  ] = js.undefined
  // this is optional at the base-level of RollupWatchOptions,
  // which extends from this interface through config merge
  var format: js.UndefOr[ModuleFormat] = js.undefined
  var freeze: js.UndefOr[scala.Boolean] = js.undefined
  var globals: js.UndefOr[GlobalsOption] = js.undefined
  var indent: js.UndefOr[scala.Boolean] = js.undefined
  var interop: js.UndefOr[scala.Boolean] = js.undefined
  var intro: js.UndefOr[
    java.lang.String | (js.Function0[java.lang.String | js.Promise[java.lang.String]])
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namespaceToStringTag: js.UndefOr[scala.Boolean] = js.undefined
  var noConflict: js.UndefOr[scala.Boolean] = js.undefined
  var outro: js.UndefOr[
    java.lang.String | (js.Function0[java.lang.String | js.Promise[java.lang.String]])
  ] = js.undefined
  var paths: js.UndefOr[OptionsPaths] = js.undefined
  var preferConst: js.UndefOr[scala.Boolean] = js.undefined
  var sourcemap: js.UndefOr[scala.Boolean | rollupLib.rollupLibStrings.`inline`] = js.undefined
  var sourcemapExcludeSources: js.UndefOr[scala.Boolean] = js.undefined
  var sourcemapFile: js.UndefOr[java.lang.String] = js.undefined
  var sourcemapPathTransform: js.UndefOr[js.Function1[/* sourcePath */ java.lang.String, java.lang.String]] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object OutputOptions {
  @scala.inline
  def apply(
    amd: rollupLib.Anon_Define = null,
    assetFileNames: java.lang.String = null,
    banner: java.lang.String | (js.Function0[java.lang.String | js.Promise[java.lang.String]]) = null,
    chunkFileNames: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    dir: java.lang.String = null,
    dynamicImportFunction: java.lang.String = null,
    entryFileNames: java.lang.String = null,
    esModule: js.UndefOr[scala.Boolean] = js.undefined,
    exports: rollupLib.rollupLibStrings.default | rollupLib.rollupLibStrings.named | rollupLib.rollupLibStrings.none | rollupLib.rollupLibStrings.auto = null,
    extend: js.UndefOr[scala.Boolean] = js.undefined,
    file: java.lang.String = null,
    footer: java.lang.String | (js.Function0[java.lang.String | js.Promise[java.lang.String]]) = null,
    format: ModuleFormat = null,
    freeze: js.UndefOr[scala.Boolean] = js.undefined,
    globals: GlobalsOption = null,
    indent: js.UndefOr[scala.Boolean] = js.undefined,
    interop: js.UndefOr[scala.Boolean] = js.undefined,
    intro: java.lang.String | (js.Function0[java.lang.String | js.Promise[java.lang.String]]) = null,
    name: java.lang.String = null,
    namespaceToStringTag: js.UndefOr[scala.Boolean] = js.undefined,
    noConflict: js.UndefOr[scala.Boolean] = js.undefined,
    outro: java.lang.String | (js.Function0[java.lang.String | js.Promise[java.lang.String]]) = null,
    paths: OptionsPaths = null,
    preferConst: js.UndefOr[scala.Boolean] = js.undefined,
    sourcemap: scala.Boolean | rollupLib.rollupLibStrings.`inline` = null,
    sourcemapExcludeSources: js.UndefOr[scala.Boolean] = js.undefined,
    sourcemapFile: java.lang.String = null,
    sourcemapPathTransform: /* sourcePath */ java.lang.String => java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
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

