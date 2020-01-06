package typings.reactDashWidgets.libComboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboboxMessages extends js.Object {
  /**
    * text to display when the the current filter does not return any results
    */
  var emptyFilter: String | (js.Function1[/* props */ ComboboxProps, String])
  /**
    * text to display when the data prop array is empty
    */
  var emptyList: String | (js.Function1[/* props */ ComboboxProps, String])
  /**
    * Combobox button text for screen readers
    */
  var open: String | (js.Function1[/* props */ ComboboxProps, String])
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
}

