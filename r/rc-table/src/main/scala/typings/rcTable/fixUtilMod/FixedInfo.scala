package typings.rcTable.fixUtilMod

import typings.rcTable.rcTableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedInfo extends js.Object {
  var firstFixRight: Boolean
  var fixLeft: Double | `false`
  var fixRight: Double | `false`
  var lastFixLeft: Boolean
}

object FixedInfo {
  @scala.inline
  def apply(
    firstFixRight: Boolean,
    fixLeft: Double | `false`,
    fixRight: Double | `false`,
    lastFixLeft: Boolean
  ): FixedInfo = {
    val __obj = js.Dynamic.literal(firstFixRight = firstFixRight.asInstanceOf[js.Any], fixLeft = fixLeft.asInstanceOf[js.Any], fixRight = fixRight.asInstanceOf[js.Any], lastFixLeft = lastFixLeft.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FixedInfo]
  }
}

