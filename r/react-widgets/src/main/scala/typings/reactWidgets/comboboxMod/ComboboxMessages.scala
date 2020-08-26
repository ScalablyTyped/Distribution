package typings.reactWidgets.comboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComboboxMessages extends js.Object {
  /**
    * text to display when the the current filter does not return any results
    */
  var emptyFilter: String | (js.Function1[/* props */ ComboboxProps, String]) = js.native
  /**
    * text to display when the data prop array is empty
    */
  var emptyList: String | (js.Function1[/* props */ ComboboxProps, String]) = js.native
  /**
    * Combobox button text for screen readers
    */
  var open: String | (js.Function1[/* props */ ComboboxProps, String]) = js.native
}

object ComboboxMessages {
  @scala.inline
  def apply(
    emptyFilter: String | (js.Function1[/* props */ ComboboxProps, String]),
    emptyList: String | (js.Function1[/* props */ ComboboxProps, String]),
    open: String | (js.Function1[/* props */ ComboboxProps, String])
  ): ComboboxMessages = {
    val __obj = js.Dynamic.literal(emptyFilter = emptyFilter.asInstanceOf[js.Any], emptyList = emptyList.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboboxMessages]
  }
  @scala.inline
  implicit class ComboboxMessagesOps[Self <: ComboboxMessages] (val x: Self) extends AnyVal {
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
    def setEmptyFilterFunction1(value: /* props */ ComboboxProps => String): Self = this.set("emptyFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setEmptyFilter(value: String | (js.Function1[/* props */ ComboboxProps, String])): Self = this.set("emptyFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmptyListFunction1(value: /* props */ ComboboxProps => String): Self = this.set("emptyList", js.Any.fromFunction1(value))
    @scala.inline
    def setEmptyList(value: String | (js.Function1[/* props */ ComboboxProps, String])): Self = this.set("emptyList", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenFunction1(value: /* props */ ComboboxProps => String): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: String | (js.Function1[/* props */ ComboboxProps, String])): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}

