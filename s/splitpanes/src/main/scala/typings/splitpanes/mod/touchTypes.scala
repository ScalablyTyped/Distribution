package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait touchTypes extends js.Object {
  var activeSplitter: Null | Double
  var dragging: Boolean
  var mouseDown: Boolean
}

object touchTypes {
  @scala.inline
  def apply(dragging: Boolean, mouseDown: Boolean, activeSplitter: Int | Double = null): touchTypes = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], mouseDown = mouseDown.asInstanceOf[js.Any])
    if (activeSplitter != null) __obj.updateDynamic("activeSplitter")(activeSplitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[touchTypes]
  }
}

