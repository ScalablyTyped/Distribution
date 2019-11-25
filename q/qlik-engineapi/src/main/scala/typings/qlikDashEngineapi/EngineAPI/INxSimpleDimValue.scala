package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxSimpleDimValue..
  */
trait INxSimpleDimValue extends js.Object {
  /**
    * Element number.
    */
  var qElemNo: Double
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    */
  var qText: js.UndefOr[String] = js.undefined
}

object INxSimpleDimValue {
  @scala.inline
  def apply(qElemNo: Double, qText: String = null): INxSimpleDimValue = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any])
    if (qText != null) __obj.updateDynamic("qText")(qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSimpleDimValue]
  }
}

