package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisualizationCommon extends js.Object {
  var footnote: String = js.native
  var qHyperCubeDef: HyperCubeDef = js.native
  var showTitles: Boolean = js.native
  var subtitle: String = js.native
  var title: String = js.native
}

object VisualizationCommon {
  @scala.inline
  def apply(
    footnote: String,
    qHyperCubeDef: HyperCubeDef,
    showTitles: Boolean,
    subtitle: String,
    title: String
  ): VisualizationCommon = {
    val __obj = js.Dynamic.literal(footnote = footnote.asInstanceOf[js.Any], qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any], showTitles = showTitles.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualizationCommon]
  }
  @scala.inline
  implicit class VisualizationCommonOps[Self <: VisualizationCommon] (val x: Self) extends AnyVal {
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
    def setFootnote(value: String): Self = this.set("footnote", value.asInstanceOf[js.Any])
    @scala.inline
    def setQHyperCubeDef(value: HyperCubeDef): Self = this.set("qHyperCubeDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowTitles(value: Boolean): Self = this.set("showTitles", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

