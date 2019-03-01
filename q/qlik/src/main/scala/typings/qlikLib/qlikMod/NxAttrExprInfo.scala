package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxAttrExprInfo extends js.Object {
  var qContinuousAxes: scala.Boolean
  var qFallbackTitle: java.lang.String
  var qIsCyclic: scala.Boolean
  var qMax: scala.Double
  var qMin: scala.Double
}

object NxAttrExprInfo {
  @scala.inline
  def apply(
    qContinuousAxes: scala.Boolean,
    qFallbackTitle: java.lang.String,
    qIsCyclic: scala.Boolean,
    qMax: scala.Double,
    qMin: scala.Double
  ): NxAttrExprInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qContinuousAxes")(qContinuousAxes)
    __obj.updateDynamic("qFallbackTitle")(qFallbackTitle)
    __obj.updateDynamic("qIsCyclic")(qIsCyclic)
    __obj.updateDynamic("qMax")(qMax)
    __obj.updateDynamic("qMin")(qMin)
    __obj.asInstanceOf[NxAttrExprInfo]
  }
}

