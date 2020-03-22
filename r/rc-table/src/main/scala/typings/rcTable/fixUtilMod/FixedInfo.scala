package typings.rcTable.fixUtilMod

import typings.rcTable.rcTableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedInfo extends js.Object {
  var firstFixLeft: Boolean
  var firstFixRight: Boolean
  var fixLeft: Double | `false`
  var fixRight: Double | `false`
  var lastFixLeft: Boolean
  var lastFixRight: Boolean
}

object FixedInfo {
  @scala.inline
  def apply(
    firstFixLeft: Boolean,
    firstFixRight: Boolean,
    fixLeft: Double | `false`,
    fixRight: Double | `false`,
    lastFixLeft: Boolean,
    lastFixRight: Boolean
  ): FixedInfo = {
    val __obj = js.Dynamic.literal(firstFixLeft = firstFixLeft.asInstanceOf[js.Any], firstFixRight = firstFixRight.asInstanceOf[js.Any], fixLeft = fixLeft.asInstanceOf[js.Any], fixRight = fixRight.asInstanceOf[js.Any], lastFixLeft = lastFixLeft.asInstanceOf[js.Any], lastFixRight = lastFixRight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FixedInfo]
  }
}

