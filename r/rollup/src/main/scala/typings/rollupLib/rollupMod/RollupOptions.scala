package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupOptions extends InputOptions {
  var output: js.UndefOr[OutputOptions] = js.undefined
}

object RollupOptions {
  @scala.inline
  def apply(
    input: InputOption,
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
    manualChunks: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    moduleContext: (js.Function1[/* id */ java.lang.String, java.lang.String]) | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    onwarn: WarningHandler = null,
    output: OutputOptions = null,
    perf: js.UndefOr[scala.Boolean] = js.undefined,
    plugins: js.Array[Plugin] = null,
    preserveModules: js.UndefOr[scala.Boolean] = js.undefined,
    preserveSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    shimMissingExports: js.UndefOr[scala.Boolean] = js.undefined,
    treeshake: scala.Boolean | TreeshakingOptions = null,
    watch: WatcherOptions = null
  ): RollupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
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
    if (manualChunks != null) __obj.updateDynamic("manualChunks")(manualChunks)
    if (moduleContext != null) __obj.updateDynamic("moduleContext")(moduleContext.asInstanceOf[js.Any])
    if (onwarn != null) __obj.updateDynamic("onwarn")(onwarn)
    if (output != null) __obj.updateDynamic("output")(output)
    if (!js.isUndefined(perf)) __obj.updateDynamic("perf")(perf)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(preserveModules)) __obj.updateDynamic("preserveModules")(preserveModules)
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks)
    if (!js.isUndefined(shimMissingExports)) __obj.updateDynamic("shimMissingExports")(shimMissingExports)
    if (treeshake != null) __obj.updateDynamic("treeshake")(treeshake.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[RollupOptions]
  }
}

