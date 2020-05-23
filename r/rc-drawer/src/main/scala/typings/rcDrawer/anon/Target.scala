package typings.rcDrawer.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var open: Boolean
  var target: HTMLElement
}

object Target {
  @scala.inline
  def apply(open: Boolean, target: HTMLElement): Target = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

