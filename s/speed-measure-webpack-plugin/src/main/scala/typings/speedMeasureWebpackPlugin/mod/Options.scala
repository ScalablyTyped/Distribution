package typings.speedMeasureWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pass these into the constructor, as an object:
  */
trait Options extends js.Object {
  /**
    * If truthy, this plugin does nothing at all.
    * @default false
    */
  var disable: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, SMP measures loaders in groups.
    * If truthy, this plugin will give per-loader timing information.
    * This flag is experimental. Some loaders will have inaccurate results:
    * loaders using separate processes (e.g. thread-loader)
    * loaders emitting file output (e.g. file-loader)
    * We will find solutions to these issues before removing the (experimental) flag on this option.
    * @default false
    */
  var granularLoaderData: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines in what format this plugin prints its measurements
    * @default 'human'
    */
  var outputFormat: js.UndefOr[OutputFormat] = js.undefined
  var outputTarget: js.UndefOr[OutputTarget] = js.undefined
  /**
    * By default, SMP derives plugin names through plugin.constructor.name.
    * For some plugins this doesn't work (or you may want to override this default).
    * This option takes an object of pluginName: PluginConstructor
    */
  var pluginNames: js.UndefOr[StringDictionary[js.Object]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    disable: js.UndefOr[Boolean] = js.undefined,
    granularLoaderData: js.UndefOr[Boolean] = js.undefined,
    outputFormat: OutputFormat = null,
    outputTarget: OutputTarget = null,
    pluginNames: StringDictionary[js.Object] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(granularLoaderData)) __obj.updateDynamic("granularLoaderData")(granularLoaderData.get.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (outputTarget != null) __obj.updateDynamic("outputTarget")(outputTarget.asInstanceOf[js.Any])
    if (pluginNames != null) __obj.updateDynamic("pluginNames")(pluginNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

