package typings.rollup.rollupMod

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.rollupNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupWatchOptions extends InputOptions {
  var output: js.UndefOr[OutputOptions | js.Array[OutputOptions]] = js.undefined
}

object RollupWatchOptions {
  @scala.inline
  def apply(
    acorn: js.Any = null,
    acornInjectPlugins: js.Array[js.Function] = null,
    cache: `false` | RollupCache = null,
    chunkGroupingSize: Int | Double = null,
    context: String = null,
    experimentalCacheExpiry: Int | Double = null,
    experimentalOptimizeChunks: js.UndefOr[Boolean] = js.undefined,
    experimentalTopLevelAwait: js.UndefOr[Boolean] = js.undefined,
    external: ExternalOption = null,
    inlineDynamicImports: js.UndefOr[Boolean] = js.undefined,
    input: InputOption = null,
    manualChunks: ManualChunksOption = null,
    moduleContext: (js.Function1[/* id */ String, String]) | StringDictionary[String] = null,
    onwarn: (/* warning */ String | RollupWarning, /* defaultHandler */ WarningHandler) => Unit = null,
    output: OutputOptions | js.Array[OutputOptions] = null,
    perf: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[Plugin] = null,
    preserveModules: js.UndefOr[Boolean] = js.undefined,
    preserveSymlinks: js.UndefOr[Boolean] = js.undefined,
    shimMissingExports: js.UndefOr[Boolean] = js.undefined,
    strictDeprecations: js.UndefOr[Boolean] = js.undefined,
    treeshake: Boolean | TreeshakingOptions = null,
    watch: WatcherOptions = null
  ): RollupWatchOptions = {
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
    if (onwarn != null) __obj.updateDynamic("onwarn")(js.Any.fromFunction2(onwarn))
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(perf)) __obj.updateDynamic("perf")(perf)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(preserveModules)) __obj.updateDynamic("preserveModules")(preserveModules)
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks)
    if (!js.isUndefined(shimMissingExports)) __obj.updateDynamic("shimMissingExports")(shimMissingExports)
    if (!js.isUndefined(strictDeprecations)) __obj.updateDynamic("strictDeprecations")(strictDeprecations)
    if (treeshake != null) __obj.updateDynamic("treeshake")(treeshake.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[RollupWatchOptions]
  }
}

