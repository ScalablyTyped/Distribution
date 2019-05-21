package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputOptions extends js.Object {
  var acorn: js.UndefOr[js.Any] = js.undefined
  var acornInjectPlugins: js.UndefOr[js.Array[js.Function]] = js.undefined
  var cache: js.UndefOr[rollupLib.rollupLibNumbers.`false` | RollupCache] = js.undefined
  var chunkGroupingSize: js.UndefOr[scala.Double] = js.undefined
  var context: js.UndefOr[java.lang.String] = js.undefined
  var experimentalCacheExpiry: js.UndefOr[scala.Double] = js.undefined
  var experimentalOptimizeChunks: js.UndefOr[scala.Boolean] = js.undefined
  var experimentalTopLevelAwait: js.UndefOr[scala.Boolean] = js.undefined
  var external: js.UndefOr[ExternalOption] = js.undefined
  var inlineDynamicImports: js.UndefOr[scala.Boolean] = js.undefined
  var input: js.UndefOr[InputOption] = js.undefined
  var manualChunks: js.UndefOr[ManualChunksOption] = js.undefined
  var moduleContext: js.UndefOr[
    (js.Function1[/* id */ java.lang.String, java.lang.String]) | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  var onwarn: js.UndefOr[WarningHandlerWithDefault] = js.undefined
  var perf: js.UndefOr[scala.Boolean] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  var preserveModules: js.UndefOr[scala.Boolean] = js.undefined
  var preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  var shimMissingExports: js.UndefOr[scala.Boolean] = js.undefined
  var treeshake: js.UndefOr[scala.Boolean | TreeshakingOptions] = js.undefined
  var watch: js.UndefOr[WatcherOptions] = js.undefined
}

object InputOptions {
  @scala.inline
  def apply(
    acorn: js.Any = null,
    acornInjectPlugins: js.Array[js.Function] = null,
    cache: rollupLib.rollupLibNumbers.`false` | RollupCache = null,
    chunkGroupingSize: scala.Int | scala.Double = null,
    context: java.lang.String = null,
    experimentalCacheExpiry: scala.Int | scala.Double = null,
    experimentalOptimizeChunks: js.UndefOr[scala.Boolean] = js.undefined,
    experimentalTopLevelAwait: js.UndefOr[scala.Boolean] = js.undefined,
    external: ExternalOption = null,
    inlineDynamicImports: js.UndefOr[scala.Boolean] = js.undefined,
    input: InputOption = null,
    manualChunks: ManualChunksOption = null,
    moduleContext: (js.Function1[/* id */ java.lang.String, java.lang.String]) | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    onwarn: WarningHandlerWithDefault = null,
    perf: js.UndefOr[scala.Boolean] = js.undefined,
    plugins: js.Array[Plugin] = null,
    preserveModules: js.UndefOr[scala.Boolean] = js.undefined,
    preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    shimMissingExports: js.UndefOr[scala.Boolean] = js.undefined,
    treeshake: scala.Boolean | TreeshakingOptions = null,
    watch: WatcherOptions = null
  ): InputOptions = {
    val __obj = js.Dynamic.literal()
    if (acorn != null) __obj.updateDynamic("acorn")(acorn)
    if (acornInjectPlugins != null) __obj.updateDynamic("acornInjectPlugins")(acornInjectPlugins)
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (chunkGroupingSize != null) __obj.updateDynamic("chunkGroupingSize")(chunkGroupingSize.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (experimentalCacheExpiry != null) __obj.updateDynamic("experimentalCacheExpiry")(experimentalCacheExpiry.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalOptimizeChunks)) __obj.updateDynamic("experimentalOptimizeChunks")(experimentalOptimizeChunks)
    if (!js.isUndefined(experimentalTopLevelAwait)) __obj.updateDynamic("experimentalTopLevelAwait")(experimentalTopLevelAwait)
    if (external != null) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineDynamicImports)) __obj.updateDynamic("inlineDynamicImports")(inlineDynamicImports)
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (manualChunks != null) __obj.updateDynamic("manualChunks")(manualChunks.asInstanceOf[js.Any])
    if (moduleContext != null) __obj.updateDynamic("moduleContext")(moduleContext.asInstanceOf[js.Any])
    if (onwarn != null) __obj.updateDynamic("onwarn")(onwarn)
    if (!js.isUndefined(perf)) __obj.updateDynamic("perf")(perf)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(preserveModules)) __obj.updateDynamic("preserveModules")(preserveModules)
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks)
    if (!js.isUndefined(shimMissingExports)) __obj.updateDynamic("shimMissingExports")(shimMissingExports)
    if (treeshake != null) __obj.updateDynamic("treeshake")(treeshake.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[InputOptions]
  }
}

