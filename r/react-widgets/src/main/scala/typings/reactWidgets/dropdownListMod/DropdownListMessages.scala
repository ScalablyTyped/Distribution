package typings.reactWidgets.dropdownListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownListMessages extends js.Object {
  /**
    * Text to display for the create option
    * @default: "Create option {text}"
    */
  var createOption: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
  /**
    * Text to display when the the current filter does not return any results.
    * @default: "The filter returned no results"
    */
  var emptyFilter: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
  /**
    * Text to display when the data prop array is empty.
    * @default: "There are no items in this list"
    */
  var emptyList: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
  /**
    * The placeholder text for the filter input.
    */
  var filterPlaceholder: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
  /**
    * Dropdown button text for screen readers.
    * @default: "Open Dropdown"
    */
  var open: js.UndefOr[String | (js.Function1[/* props */ DropdownListProps, String])] = js.native
}

object DropdownListMessages {
  @scala.inline
  def apply(): DropdownListMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownListMessages]
  }
  @scala.inline
  implicit class DropdownListMessagesOps[Self <: DropdownListMessages] (val x: Self) extends AnyVal {
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
    def setCreateOptionFunction1(value: /* props */ DropdownListProps => String): Self = this.set("createOption", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateOption(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = this.set("createOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateOption: Self = this.set("createOption", js.undefined)
    @scala.inline
    def setEmptyFilterFunction1(value: /* props */ DropdownListProps => String): Self = this.set("emptyFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setEmptyFilter(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = this.set("emptyFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyFilter: Self = this.set("emptyFilter", js.undefined)
    @scala.inline
    def setEmptyListFunction1(value: /* props */ DropdownListProps => String): Self = this.set("emptyList", js.Any.fromFunction1(value))
    @scala.inline
    def setEmptyList(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = this.set("emptyList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyList: Self = this.set("emptyList", js.undefined)
    @scala.inline
    def setFilterPlaceholderFunction1(value: /* props */ DropdownListProps => String): Self = this.set("filterPlaceholder", js.Any.fromFunction1(value))
    @scala.inline
    def setFilterPlaceholder(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = this.set("filterPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPlaceholder: Self = this.set("filterPlaceholder", js.undefined)
    @scala.inline
    def setOpenFunction1(value: /* props */ DropdownListProps => String): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: String | (js.Function1[/* props */ DropdownListProps, String])): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
  
}

