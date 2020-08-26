package typings.speedMeasureWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pass these into the constructor, as an object:
  */
@js.native
trait Options extends js.Object {
  /**
    * If truthy, this plugin does nothing at all.
    * @default false
    */
  var disable: js.UndefOr[Boolean] = js.native
  /**
    * By default, SMP measures loaders in groups.
    * If truthy, this plugin will give per-loader timing information.
    * This flag is experimental. Some loaders will have inaccurate results:
    * loaders using separate processes (e.g. thread-loader)
    * loaders emitting file output (e.g. file-loader)
    * We will find solutions to these issues before removing the (experimental) flag on this option.
    * @default false
    */
  var granularLoaderData: js.UndefOr[Boolean] = js.native
  /**
    * Determines in what format this plugin prints its measurements
    * @default 'human'
    */
  var outputFormat: js.UndefOr[OutputFormat] = js.native
  var outputTarget: js.UndefOr[OutputTarget] = js.native
  /**
    * By default, SMP derives plugin names through plugin.constructor.name.
    * For some plugins this doesn't work (or you may want to override this default).
    * This option takes an object of pluginName: PluginConstructor
    */
  var pluginNames: js.UndefOr[StringDictionary[js.Object]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setGranularLoaderData(value: Boolean): Self = this.set("granularLoaderData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularLoaderData: Self = this.set("granularLoaderData", js.undefined)
    @scala.inline
    def setOutputFormatFunction1(value: /* json */ js.Any => String): Self = this.set("outputFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setOutputFormat(value: OutputFormat): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
    @scala.inline
    def setOutputTargetFunction2(value: (/* output */ String, /* repeated */ js.Any) => Unit): Self = this.set("outputTarget", js.Any.fromFunction2(value))
    @scala.inline
    def setOutputTarget(value: OutputTarget): Self = this.set("outputTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputTarget: Self = this.set("outputTarget", js.undefined)
    @scala.inline
    def setPluginNames(value: StringDictionary[js.Object]): Self = this.set("pluginNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginNames: Self = this.set("pluginNames", js.undefined)
  }
  
}

