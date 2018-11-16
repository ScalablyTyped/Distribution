package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InputOptions extends js.Object {
  var acorn: js.UndefOr[js.Object] = js.undefined
  var acornInjectPlugins: js.UndefOr[js.Array[js.Function]] = js.undefined
  var cache: js.UndefOr[rollupLib.rollupLibNumbers.`false` | RollupCache] = js.undefined
  var chunkGroupingSize: js.UndefOr[scala.Double] = js.undefined
  var context: js.UndefOr[java.lang.String] = js.undefined
  /** @deprecated */
  var entry: js.UndefOr[java.lang.String] = js.undefined
  var experimentalCacheExpiry: js.UndefOr[scala.Double] = js.undefined
  var experimentalCodeSplitting: js.UndefOr[scala.Boolean] = js.undefined
  var experimentalDynamicImport: js.UndefOr[scala.Boolean] = js.undefined
  var experimentalPreserveModules: js.UndefOr[scala.Boolean] = js.undefined
  var experimentalTopLevelAwait: js.UndefOr[scala.Boolean] = js.undefined
  var external: js.UndefOr[ExternalOption] = js.undefined
  var inlineDynamicImports: js.UndefOr[scala.Boolean] = js.undefined
  var input: InputOption
  var load: js.UndefOr[LoadHook] = js.undefined
  var manualChunks: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  var moduleContext: js.UndefOr[
    java.lang.String | (js.Function1[/* id */ java.lang.String, java.lang.String]) | ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  var onwarn: js.UndefOr[WarningHandler] = js.undefined
  var optimizeChunks: js.UndefOr[scala.Boolean] = js.undefined
  var perf: js.UndefOr[scala.Boolean] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  var preferConst: js.UndefOr[scala.Boolean] = js.undefined
  var preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  // undocumented?
  var pureExternalModules: js.UndefOr[scala.Boolean] = js.undefined
  var resolveExternal: js.UndefOr[js.Any] = js.undefined
  var resolveId: js.UndefOr[ResolveIdHook] = js.undefined
  var shimMissingExports: js.UndefOr[scala.Boolean] = js.undefined
  var transform: js.UndefOr[TransformHook] = js.undefined
  var treeshake: js.UndefOr[scala.Boolean | TreeshakingOptions] = js.undefined
  var watch: js.UndefOr[WatcherOptions] = js.undefined
}

