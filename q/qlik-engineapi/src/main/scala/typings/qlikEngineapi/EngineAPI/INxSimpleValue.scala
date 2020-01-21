package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxSimpleValue
  */
trait INxSimpleValue extends js.Object {
  /**
    * Numeric value of the attribute expression.
    * This property is set to NaN (Not a Number) if the attribute expression value is not a numeric.
    * Numerical values are not returned as text.
    */
  var qNum: Double
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    */
  var qText: js.UndefOr[String] = js.undefined
}

object INxSimpleValue {
  @scala.inline
  def apply(qNum: Double, qText: String = null): INxSimpleValue = {
    val __obj = js.Dynamic.literal(qNum = qNum.asInstanceOf[js.Any])
    if (qText != null) __obj.updateDynamic("qText")(qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSimpleValue]
  }
}

