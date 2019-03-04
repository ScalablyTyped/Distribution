package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qNum: scala.Double
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    */
  var qText: js.UndefOr[java.lang.String] = js.undefined
}

object INxSimpleValue {
  @scala.inline
  def apply(qNum: scala.Double, qText: java.lang.String = null): INxSimpleValue = {
    val __obj = js.Dynamic.literal(qNum = qNum)
    if (qText != null) __obj.updateDynamic("qText")(qText)
    __obj.asInstanceOf[INxSimpleValue]
  }
}

