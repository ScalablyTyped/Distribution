package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualizationCommon extends js.Object {
  var footnote: String
  var qHyperCubeDef: HyperCubeDef
  var showTitles: Boolean
  var subtitle: String
  var title: String
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
}

