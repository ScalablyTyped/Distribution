package typings.rollupPluginVisualizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginVisualizerOptions extends js.Object {
  var bundlesRelative: js.UndefOr[Boolean] = js.native
  var filename: js.UndefOr[String] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var sourcemap: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object PluginVisualizerOptions {
  @scala.inline
  def apply(): PluginVisualizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginVisualizerOptions]
  }
  @scala.inline
  implicit class PluginVisualizerOptionsOps[Self <: PluginVisualizerOptions] (val x: Self) extends AnyVal {
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
    def setBundlesRelative(value: Boolean): Self = this.set("bundlesRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundlesRelative: Self = this.set("bundlesRelative", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setSourcemap(value: Boolean): Self = this.set("sourcemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcemap: Self = this.set("sourcemap", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

