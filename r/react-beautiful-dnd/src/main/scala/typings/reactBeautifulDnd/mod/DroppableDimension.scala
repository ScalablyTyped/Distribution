package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableDimension extends js.Object {
  var axis: Axis = js.native
  // relative to the current viewport
  var client: BoxModel = js.native
  var descriptor: DroppableDescriptor = js.native
  // The container of the droppable
  var frame: js.UndefOr[Scrollable] = js.native
  var isCombineEnabled: Boolean = js.native
  var isEnabled: Boolean = js.native
  // relative to the whole page
  var isFixedOnPage: Boolean = js.native
  // relative to the page
  var page: BoxModel = js.native
  // what is visible through the frame
  var subject: DroppableSubject = js.native
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
    subject: DroppableSubject
  ): DroppableDimension = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], isCombineEnabled = isCombineEnabled.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isFixedOnPage = isFixedOnPage.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableDimension]
  }
  @scala.inline
  implicit class DroppableDimensionOps[Self <: DroppableDimension] (val x: Self) extends AnyVal {
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
    def setAxis(value: Axis): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient(value: BoxModel): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptor(value: DroppableDescriptor): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCombineEnabled(value: Boolean): Self = this.set("isCombineEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFixedOnPage(value: Boolean): Self = this.set("isFixedOnPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: BoxModel): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: DroppableSubject): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrame(value: Scrollable): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
  }
  
}

