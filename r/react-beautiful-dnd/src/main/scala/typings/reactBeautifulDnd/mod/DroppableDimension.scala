package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableDimension extends js.Object {
  var axis: Axis
  // relative to the current viewport
  var client: BoxModel
  var descriptor: DroppableDescriptor
  // The container of the droppable
  var frame: js.UndefOr[Scrollable] = js.undefined
  var isCombineEnabled: Boolean
  var isEnabled: Boolean
  // relative to the whole page
  var isFixedOnPage: Boolean
  // relative to the page
  var page: BoxModel
  // what is visible through the frame
  var subject: DroppableSubject
}

object DroppableDimension {
  @scala.inline
  def apply(
    axis: Axis,
    client: BoxModel,
    descriptor: DroppableDescriptor,
    isCombineEnabled: Boolean,
    isEnabled: Boolean,
    isFixedOnPage: Boolean,
    page: BoxModel,
    subject: DroppableSubject,
    frame: Scrollable = null
  ): DroppableDimension = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], isCombineEnabled = isCombineEnabled.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isFixedOnPage = isFixedOnPage.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableDimension]
  }
}

