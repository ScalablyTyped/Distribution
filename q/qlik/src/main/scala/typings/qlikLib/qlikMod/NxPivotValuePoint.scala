package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxPivotValuePoint extends js.Object {
  var qAttrExps: NxAttributeExpressionValues
  var qLabel: js.UndefOr[java.lang.String] = js.undefined
  var qNum: scala.Double
  var qText: java.lang.String
  var qType: qlikLib.qlikLibStrings.V | qlikLib.qlikLibStrings.E | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.U
}

object NxPivotValuePoint {
  @scala.inline
  def apply(
    qAttrExps: NxAttributeExpressionValues,
    qNum: scala.Double,
    qText: java.lang.String,
    qType: qlikLib.qlikLibStrings.V | qlikLib.qlikLibStrings.E | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.R | qlikLib.qlikLibStrings.U,
    qLabel: java.lang.String = null
  ): NxPivotValuePoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAttrExps")(qAttrExps)
    __obj.updateDynamic("qNum")(qNum)
    __obj.updateDynamic("qText")(qText)
    __obj.updateDynamic("qType")(qType.asInstanceOf[js.Any])
    if (qLabel != null) __obj.updateDynamic("qLabel")(qLabel)
    __obj.asInstanceOf[NxPivotValuePoint]
  }
}

