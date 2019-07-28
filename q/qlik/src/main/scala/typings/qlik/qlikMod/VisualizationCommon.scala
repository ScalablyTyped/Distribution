package typings.qlik.qlikMod

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
    val __obj = js.Dynamic.literal(footnote = footnote, qHyperCubeDef = qHyperCubeDef, showTitles = showTitles, subtitle = subtitle, title = title)
  
    __obj.asInstanceOf[VisualizationCommon]
  }
}

