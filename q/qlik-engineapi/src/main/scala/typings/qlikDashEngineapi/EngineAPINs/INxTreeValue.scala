package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxTreeValue extends js.Object {
  /**
    * Attribute dimension values.
    */
  var qAttrDims: js.UndefOr[INxAttributeDimValues] = js.undefined
  /**
    * Attribute expression values.
    */
  var qAttrExps: js.UndefOr[INxAttributeExpressionValues] = js.undefined
  /**
    * The text version of the value, if available.
    */
  var qText: String
  /**
    * Value of the cell.
    * Is set to NaN, if the value is not a number.
    */
  var qValue: Double
}

object INxTreeValue {
  @scala.inline
  def apply(
    qText: String,
    qValue: Double,
    qAttrDims: INxAttributeDimValues = null,
    qAttrExps: INxAttributeExpressionValues = null
  ): INxTreeValue = {
    val __obj = js.Dynamic.literal(qText = qText, qValue = qValue)
    if (qAttrDims != null) __obj.updateDynamic("qAttrDims")(qAttrDims)
    if (qAttrExps != null) __obj.updateDynamic("qAttrExps")(qAttrExps)
    __obj.asInstanceOf[INxTreeValue]
  }
}

