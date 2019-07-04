package typings
package splitpanesLib.splitpanesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait touchTypes extends js.Object {
  var activeSplitter: scala.Null | scala.Double
  var dragging: scala.Boolean
  var mouseDown: scala.Boolean
}

object touchTypes {
  @scala.inline
  def apply(dragging: scala.Boolean, mouseDown: scala.Boolean, activeSplitter: scala.Int | scala.Double = null): touchTypes = {
    val __obj = js.Dynamic.literal(dragging = dragging, mouseDown = mouseDown)
    if (activeSplitter != null) __obj.updateDynamic("activeSplitter")(activeSplitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[touchTypes]
  }
}

