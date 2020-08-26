package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scrollable extends js.Object {
  // Used for comparision with dynamic recollecting
  var frameClient: BoxModel = js.native
  // This is the window through which the droppable is observed
  // It does not change during a drag
  var pageMarginBox: Rect = js.native
  var scroll: ScrollDetails = js.native
  var scrollSize: ScrollSize = js.native
  // Whether or not we should clip the subject by the frame
  // Is controlled by the ignoreContainerClipping prop
  var shouldClipSubject: Boolean = js.native
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
  @scala.inline
  implicit class ScrollableOps[Self <: Scrollable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrameClient(value: BoxModel): Self = this.set("frameClient", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageMarginBox(value: Rect): Self = this.set("pageMarginBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setScroll(value: ScrollDetails): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollSize(value: ScrollSize): Self = this.set("scrollSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldClipSubject(value: Boolean): Self = this.set("shouldClipSubject", value.asInstanceOf[js.Any])
  }
  
}

