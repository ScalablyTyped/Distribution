package typings.prosemirrorView

import typings.prosemirrorView.prosemirrorViewStrings.selection
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelection extends js.Object {
  var target: Element
  var `type`: selection
}

object AnonSelection {
  @scala.inline
  def apply(target: Element, `type`: selection): AnonSelection = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelection]
  }
}

