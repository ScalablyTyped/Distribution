package typings.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxSimpleValue extends js.Object {
  /**
    * Numeric value of the attribute expression.
    * This property is set to NaN (Not a Number) if the attribute expression value is not a numeric.
    * Numerical values are not returned as text.
    * Double precision floating point
    */
  var qNum: Double
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    * String
    */
  var qText: String
}

object INxSimpleValue {
  @scala.inline
  def apply(qNum: Double, qText: String): INxSimpleValue = {
    val __obj = js.Dynamic.literal(qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxSimpleValue]
  }
}

