package typings.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOnScrollProps extends js.Object {
  var scrollDirection: ScrollDirection
  var scrollOffset: Double
  var scrollUpdateWasRequested: Boolean
}

object ListOnScrollProps {
  @scala.inline
  def apply(scrollDirection: ScrollDirection, scrollOffset: Double, scrollUpdateWasRequested: Boolean): ListOnScrollProps = {
    val __obj = js.Dynamic.literal(scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollUpdateWasRequested = scrollUpdateWasRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOnScrollProps]
  }
}

