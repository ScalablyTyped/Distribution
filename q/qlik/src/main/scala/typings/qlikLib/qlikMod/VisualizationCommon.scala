package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualizationCommon extends js.Object {
  var footnote: java.lang.String
  var qHyperCubeDef: HyperCubeDef
  var showTitles: scala.Boolean
  var subtitle: java.lang.String
  var title: java.lang.String
}

object VisualizationCommon {
  @scala.inline
  def apply(
    footnote: java.lang.String,
    qHyperCubeDef: HyperCubeDef,
    showTitles: scala.Boolean,
    subtitle: java.lang.String,
    title: java.lang.String
  ): VisualizationCommon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("footnote")(footnote)
    __obj.updateDynamic("qHyperCubeDef")(qHyperCubeDef)
    __obj.updateDynamic("showTitles")(showTitles)
    __obj.updateDynamic("subtitle")(subtitle)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VisualizationCommon]
  }
}

