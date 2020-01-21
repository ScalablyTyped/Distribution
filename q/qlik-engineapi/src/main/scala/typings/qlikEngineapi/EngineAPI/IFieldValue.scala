package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldValue...
  */
trait IFieldValue extends js.Object {
  /**
    * Is set to true if the value is a numeric.
    * This parameter is optional. Default is false.
    */
  var qIsNumeric: js.UndefOr[Boolean] = js.undefined
  /**
    * Numeric value of the field.
    * This parameter is displayed if qIsNumeric is set to true.
    * This parameter is optional.
    */
  var qNumber: js.UndefOr[Double] = js.undefined
  /**
    * Text related to the field value
    * This parameter is optional.
    */
  var qText: js.UndefOr[String] = js.undefined
}

object IFieldValue {
  @scala.inline
  def apply(qIsNumeric: js.UndefOr[Boolean] = js.undefined, qNumber: Int | Double = null, qText: String = null): IFieldValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(qIsNumeric)) __obj.updateDynamic("qIsNumeric")(qIsNumeric.asInstanceOf[js.Any])
    if (qNumber != null) __obj.updateDynamic("qNumber")(qNumber.asInstanceOf[js.Any])
    if (qText != null) __obj.updateDynamic("qText")(qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldValue]
  }
}

