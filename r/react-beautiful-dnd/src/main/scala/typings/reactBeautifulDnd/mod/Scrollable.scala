package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scrollable extends js.Object {
  // Used for comparision with dynamic recollecting
  var frameClient: BoxModel
  // This is the window through which the droppable is observed
  // It does not change during a drag
  var pageMarginBox: Rect
  var scroll: ScrollDetails
  var scrollSize: ScrollSize
  // Whether or not we should clip the subject by the frame
  // Is controlled by the ignoreContainerClipping prop
  var shouldClipSubject: Boolean
}

object Scrollable {
  @scala.inline
  def apply(
    frameClient: BoxModel,
    pageMarginBox: Rect,
    scroll: ScrollDetails,
    scrollSize: ScrollSize,
    shouldClipSubject: Boolean
  ): Scrollable = {
    val __obj = js.Dynamic.literal(frameClient = frameClient.asInstanceOf[js.Any], pageMarginBox = pageMarginBox.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollSize = scrollSize.asInstanceOf[js.Any], shouldClipSubject = shouldClipSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scrollable]
  }
}

