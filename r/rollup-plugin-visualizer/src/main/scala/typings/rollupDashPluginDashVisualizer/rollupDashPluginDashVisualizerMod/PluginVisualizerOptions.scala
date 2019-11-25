package typings.rollupDashPluginDashVisualizer.rollupDashPluginDashVisualizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginVisualizerOptions extends js.Object {
  var bundlesRelative: js.UndefOr[Boolean] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var sourcemap: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PluginVisualizerOptions {
  @scala.inline
  def apply(
    bundlesRelative: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    open: js.UndefOr[Boolean] = js.undefined,
    sourcemap: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    title: String = null
  ): PluginVisualizerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bundlesRelative)) __obj.updateDynamic("bundlesRelative")(bundlesRelative.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemap)) __obj.updateDynamic("sourcemap")(sourcemap.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginVisualizerOptions]
  }
}

