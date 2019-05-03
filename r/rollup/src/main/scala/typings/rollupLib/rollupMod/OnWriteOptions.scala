package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnWriteOptions extends OutputOptions {
  var bundle: RollupBuild
}

object OnWriteOptions {
  @scala.inline
  def apply(
    bundle: RollupBuild,
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
    importMetaUrl: (/* chunkId */ java.lang.String, /* moduleId */ java.lang.String) => java.lang.String = null,
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
  ): OnWriteOptions = {
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
    __obj.asInstanceOf[OnWriteOptions]
  }
}

