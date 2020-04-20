package typings.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxSimpleDimValue extends js.Object {
  /**
    * Element number.
    * Integer
    */
  var qElemNo: Double
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    * String
    */
  var qText: String
}

object INxSimpleDimValue {
  @scala.inline
  def apply(qElemNo: Double, qText: String): INxSimpleDimValue = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSimpleDimValue]
  }
}

