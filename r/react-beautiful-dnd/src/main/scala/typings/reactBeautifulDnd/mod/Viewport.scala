package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  // live updates with the latest values
  var frame: Rect
  var scroll: ScrollDetails
}

object Viewport {
  @scala.inline
  def apply(frame: Rect, scroll: ScrollDetails): Viewport = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Viewport]
  }
}

