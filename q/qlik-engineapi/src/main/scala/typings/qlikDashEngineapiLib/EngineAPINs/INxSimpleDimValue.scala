package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qElemNo: scala.Double
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    */
  var qText: js.UndefOr[java.lang.String] = js.undefined
}

object INxSimpleDimValue {
  @scala.inline
  def apply(qElemNo: scala.Double, qText: java.lang.String = null): INxSimpleDimValue = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo)
    if (qText != null) __obj.updateDynamic("qText")(qText)
    __obj.asInstanceOf[INxSimpleDimValue]
  }
}

