package typings.reactCollapse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseCallbackArgs extends js.Object {
  /** current pixel height of Collapse container (changes until reaches `contentHeight`) */
  var containerHeight: Double
  /** determined height of supplied Content */
  var contentHeight: Double
  /** `true` only when Collapse is fully closed and height is zero */
  var isFullyClosed: Boolean
  /** `true` only when Collapse reached final height */
  var isFullyOpened: Boolean
  /** `true` if Collapse has any non-zero height */
  var isOpened: Boolean
}

object CollapseCallbackArgs {
  @scala.inline
  def apply(
    containerHeight: Double,
    contentHeight: Double,
    isFullyClosed: Boolean,
    isFullyOpened: Boolean,
    isOpened: Boolean
  ): CollapseCallbackArgs = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], contentHeight = contentHeight.asInstanceOf[js.Any], isFullyClosed = isFullyClosed.asInstanceOf[js.Any], isFullyOpened = isFullyOpened.asInstanceOf[js.Any], isOpened = isOpened.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollapseCallbackArgs]
  }
}

