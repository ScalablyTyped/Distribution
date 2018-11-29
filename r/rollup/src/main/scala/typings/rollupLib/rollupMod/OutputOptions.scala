package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OutputOptions extends js.Object {
  var amd: js.UndefOr[rollupLib.Anon_Define] = js.undefined
  var assetFileNames: js.UndefOr[java.lang.String] = js.undefined
  var banner: js.UndefOr[
    java.lang.String | (js.Function0[java.lang.String | stdLib.Promise[java.lang.String]])
  ] = js.undefined
  var chunkFileNames: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  // deprecated
  var dest: js.UndefOr[java.lang.String] = js.undefined
  // only required for bundles.write
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var entryFileNames: js.UndefOr[java.lang.String] = js.undefined
  var esModule: js.UndefOr[scala.Boolean] = js.undefined
  var exports: js.UndefOr[
    rollupLib.rollupLibStrings.default | rollupLib.rollupLibStrings.named | rollupLib.rollupLibStrings.none | rollupLib.rollupLibStrings.auto
  ] = js.undefined
  var extend: js.UndefOr[scala.Boolean] = js.undefined
  // only required for bundle.write
  var file: js.UndefOr[java.lang.String] = js.undefined
  var footer: js.UndefOr[
    java.lang.String | (js.Function0[java.lang.String | stdLib.Promise[java.lang.String]])
  ] = js.undefined
  // this is optional at the base-level of RollupWatchOptions,
  // which extends from this interface through config merge
  var format: js.UndefOr[ModuleFormat] = js.undefined
  var freeze: js.UndefOr[scala.Boolean] = js.undefined
  var globals: js.UndefOr[GlobalsOption] = js.undefined
  var indent: js.UndefOr[scala.Boolean] = js.undefined
  var interop: js.UndefOr[scala.Boolean] = js.undefined
  var intro: js.UndefOr[
    java.lang.String | (js.Function0[java.lang.String | stdLib.Promise[java.lang.String]])
  ] = js.undefined
  var moduleId: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namespaceToStringTag: js.UndefOr[scala.Boolean] = js.undefined
  // undocumented?
  var noConflict: js.UndefOr[scala.Boolean] = js.undefined
  var outro: js.UndefOr[
    java.lang.String | (js.Function0[java.lang.String | stdLib.Promise[java.lang.String]])
  ] = js.undefined
  var paths: js.UndefOr[OptionsPaths] = js.undefined
  var sourcemap: js.UndefOr[scala.Boolean | rollupLib.rollupLibStrings.`inline`] = js.undefined
  var sourcemapExcludeSources: js.UndefOr[scala.Boolean] = js.undefined
  var sourcemapFile: js.UndefOr[java.lang.String] = js.undefined
  var sourcemapPathTransform: js.UndefOr[js.Function1[/* sourcePath */ java.lang.String, java.lang.String]] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

