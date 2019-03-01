package typings
package reactDashWidgetsLib.libDropdownListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownListMessages extends js.Object {
  /**
    * Text to display for the create option
    * @default: "Create option {text}"
    */
  var createOption: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ DropdownListProps, java.lang.String])
  ] = js.undefined
  /**
    * Text to display when the the current filter does not return any results.
    * @default: "The filter returned no results"
    */
  var emptyFilter: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ DropdownListProps, java.lang.String])
  ] = js.undefined
  /**
    * Text to display when the data prop array is empty.
    * @default: "There are no items in this list"
    */
  var emptyList: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ DropdownListProps, java.lang.String])
  ] = js.undefined
  /**
    * The placeholder text for the filter input.
    */
  var filterPlaceholder: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ DropdownListProps, java.lang.String])
  ] = js.undefined
  /**
    * Dropdown button text for screen readers.
    * @default: "Open Dropdown"
    */
  var open: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ DropdownListProps, java.lang.String])
  ] = js.undefined
}

object DropdownListMessages {
  @scala.inline
  def apply(
    createOption: java.lang.String | (js.Function1[/* props */ DropdownListProps, java.lang.String]) = null,
    emptyFilter: java.lang.String | (js.Function1[/* props */ DropdownListProps, java.lang.String]) = null,
    emptyList: java.lang.String | (js.Function1[/* props */ DropdownListProps, java.lang.String]) = null,
    filterPlaceholder: java.lang.String | (js.Function1[/* props */ DropdownListProps, java.lang.String]) = null,
    open: java.lang.String | (js.Function1[/* props */ DropdownListProps, java.lang.String]) = null
  ): DropdownListMessages = {
    val __obj = js.Dynamic.literal()
    if (createOption != null) __obj.updateDynamic("createOption")(createOption.asInstanceOf[js.Any])
    if (emptyFilter != null) __obj.updateDynamic("emptyFilter")(emptyFilter.asInstanceOf[js.Any])
    if (emptyList != null) __obj.updateDynamic("emptyList")(emptyList.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownListMessages]
  }
}

