package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxGroupTail
  */
trait INxGroupTail extends js.Object {
  /**
    * Number of elements that are part of the next tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
    * This parameter is optional. Is not shown if the value is 0.
    */
  var qDown: js.UndefOr[Double] = js.undefined
  /**
    * Number of elements that are part of the previous tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
    * This parameter is optional. Is not shown if the value is 0.
    */
  var qUp: js.UndefOr[Double] = js.undefined
}

object INxGroupTail {
  @scala.inline
  def apply(qDown: Int | Double = null, qUp: Int | Double = null): INxGroupTail = {
    val __obj = js.Dynamic.literal()
    if (qDown != null) __obj.updateDynamic("qDown")(qDown.asInstanceOf[js.Any])
    if (qUp != null) __obj.updateDynamic("qUp")(qUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxGroupTail]
  }
}

