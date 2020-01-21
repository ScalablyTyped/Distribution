package typings.rcDrawer

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpenTarget extends js.Object {
  var open: Boolean
  var target: HTMLElement
}

object AnonOpenTarget {
  @scala.inline
  def apply(open: Boolean, target: HTMLElement): AnonOpenTarget = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOpenTarget]
  }
}

