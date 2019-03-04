package typings
package reactDashWidgetsLib.libComboboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboBoxMessages extends js.Object {
  /**
    * text to display when the the current filter does not return any results
    */
  var emptyFilter: java.lang.String | (js.Function1[/* props */ ComboBoxProps, java.lang.String])
  /**
    * text to display when the data prop array is empty
    */
  var emptyList: java.lang.String | (js.Function1[/* props */ ComboBoxProps, java.lang.String])
  /**
    * Combobox button text for screen readers
    */
  var open: java.lang.String | (js.Function1[/* props */ ComboBoxProps, java.lang.String])
}

object ComboBoxMessages {
  @scala.inline
  def apply(
    emptyFilter: java.lang.String | (js.Function1[/* props */ ComboBoxProps, java.lang.String]),
    emptyList: java.lang.String | (js.Function1[/* props */ ComboBoxProps, java.lang.String]),
    open: java.lang.String | (js.Function1[/* props */ ComboBoxProps, java.lang.String])
  ): ComboBoxMessages = {
    val __obj = js.Dynamic.literal(emptyFilter = emptyFilter.asInstanceOf[js.Any], emptyList = emptyList.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComboBoxMessages]
  }
}

