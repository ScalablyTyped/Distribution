package typings.rcDrawer

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var open: Boolean
  var target: HTMLElement
}

object AnonTarget {
  @scala.inline
  def apply(open: Boolean, target: HTMLElement): AnonTarget = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTarget]
  }
}

