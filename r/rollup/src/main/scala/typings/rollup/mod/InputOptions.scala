package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.rollupBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputOptions extends js.Object {
  var acorn: js.UndefOr[js.Any] = js.undefined
  var acornInjectPlugins: js.UndefOr[js.Array[js.Function]] = js.undefined
  var cache: js.UndefOr[`false` | RollupCache] = js.undefined
  var chunkGroupingSize: js.UndefOr[Double] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var experimentalCacheExpiry: js.UndefOr[Double] = js.undefined
  var experimentalOptimizeChunks: js.UndefOr[Boolean] = js.undefined
  var external: js.UndefOr[ExternalOption] = js.undefined
  var inlineDynamicImports: js.UndefOr[Boolean] = js.undefined
  var input: js.UndefOr[InputOption] = js.undefined
  var manualChunks: js.UndefOr[ManualChunksOption] = js.undefined
  var moduleContext: js.UndefOr[(js.Function1[/* id */ String, String]) | StringDictionary[String]] = js.undefined
  var onwarn: js.UndefOr[WarningHandlerWithDefault] = js.undefined
  var perf: js.UndefOr[Boolean] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  var preserveModules: js.UndefOr[Boolean] = js.undefined
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  var shimMissingExports: js.UndefOr[Boolean] = js.undefined
  var strictDeprecations: js.UndefOr[Boolean] = js.undefined
  var treeshake: js.UndefOr[Boolean | TreeshakingOptions] = js.undefined
  var watch: js.UndefOr[WatcherOptions] = js.undefined
}

object InputOptions {
  @scala.inline
  def apply(
    acorn: js.Any = null,
    acornInjectPlugins: js.Array[js.Function] = null,
    cache: `false` | RollupCache = null,
    chunkGroupingSize: js.UndefOr[Double] = js.undefined,
    context: String = null,
    experimentalCacheExpiry: js.UndefOr[Double] = js.undefined,
    experimentalOptimizeChunks: js.UndefOr[Boolean] = js.undefined,
    external: ExternalOption = null,
    inlineDynamicImports: js.UndefOr[Boolean] = js.undefined,
    input: InputOption = null,
    manualChunks: ManualChunksOption = null,
    moduleContext: (js.Function1[/* id */ String, String]) | StringDictionary[String] = null,
    onwarn: (/* warning */ RollupWarning, /* defaultHandler */ WarningHandler) => Unit = null,
    perf: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[Plugin] = null,
    preserveModules: js.UndefOr[Boolean] = js.undefined,
    preserveSymlinks: js.UndefOr[Boolean] = js.undefined,
    shimMissingExports: js.UndefOr[Boolean] = js.undefined,
    strictDeprecations: js.UndefOr[Boolean] = js.undefined,
    treeshake: Boolean | TreeshakingOptions = null,
    watch: WatcherOptions = null
  ): InputOptions = {
    val __obj = js.Dynamic.literal()
    if (acorn != null) __obj.updateDynamic("acorn")(acorn.asInstanceOf[js.Any])
    if (acornInjectPlugins != null) __obj.updateDynamic("acornInjectPlugins")(acornInjectPlugins.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkGroupingSize)) __obj.updateDynamic("chunkGroupingSize")(chunkGroupingSize.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalCacheExpiry)) __obj.updateDynamic("experimentalCacheExpiry")(experimentalCacheExpiry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalOptimizeChunks)) __obj.updateDynamic("experimentalOptimizeChunks")(experimentalOptimizeChunks.get.asInstanceOf[js.Any])
    if (external != null) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineDynamicImports)) __obj.updateDynamic("inlineDynamicImports")(inlineDynamicImports.get.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (manualChunks != null) __obj.updateDynamic("manualChunks")(manualChunks.asInstanceOf[js.Any])
    if (moduleContext != null) __obj.updateDynamic("moduleContext")(moduleContext.asInstanceOf[js.Any])
    if (onwarn != null) __obj.updateDynamic("onwarn")(js.Any.fromFunction2(onwarn))
    if (!js.isUndefined(perf)) __obj.updateDynamic("perf")(perf.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveModules)) __obj.updateDynamic("preserveModules")(preserveModules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shimMissingExports)) __obj.updateDynamic("shimMissingExports")(shimMissingExports.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictDeprecations)) __obj.updateDynamic("strictDeprecations")(strictDeprecations.get.asInstanceOf[js.Any])
    if (treeshake != null) __obj.updateDynamic("treeshake")(treeshake.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputOptions]
  }
}

