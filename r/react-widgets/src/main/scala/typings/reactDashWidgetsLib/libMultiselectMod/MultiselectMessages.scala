package typings
package reactDashWidgetsLib.libMultiselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiselectMessages extends js.Object {
  /**
    * The text label for creating new tags.
    * @default "(create new tag)"
    */
  var createNew: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String])
  ] = js.undefined
  var createOption: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String])
  ] = js.undefined
  /**
    * Text to display when the the current filter does not return any results.
    * @default "The filter returned no results"
    */
  var emptyFilter: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String])
  ] = js.undefined
  /**
    * Text to display when the data prop array is empty.
    * @default "There are no items in this list"
    */
  var emptyList: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String])
  ] = js.undefined
  var noneSelected: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String])
  ] = js.undefined
  var open: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String])
  ] = js.undefined
  var removeLabel: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String])
  ] = js.undefined
  var selectedItems: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String])
  ] = js.undefined
  var tagsLabel: js.UndefOr[
    java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String])
  ] = js.undefined
}

object MultiselectMessages {
  @scala.inline
  def apply(
    createNew: java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String]) = null,
    createOption: java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String]) = null,
    emptyFilter: java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String]) = null,
    emptyList: java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String]) = null,
    noneSelected: java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String]) = null,
    open: java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String]) = null,
    removeLabel: java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String]) = null,
    selectedItems: java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String]) = null,
    tagsLabel: java.lang.String | (js.Function1[/* props */ MultiselectProps, java.lang.String]) = null
  ): MultiselectMessages = {
    val __obj = js.Dynamic.literal()
    if (createNew != null) __obj.updateDynamic("createNew")(createNew.asInstanceOf[js.Any])
    if (createOption != null) __obj.updateDynamic("createOption")(createOption.asInstanceOf[js.Any])
    if (emptyFilter != null) __obj.updateDynamic("emptyFilter")(emptyFilter.asInstanceOf[js.Any])
    if (emptyList != null) __obj.updateDynamic("emptyList")(emptyList.asInstanceOf[js.Any])
    if (noneSelected != null) __obj.updateDynamic("noneSelected")(noneSelected.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (removeLabel != null) __obj.updateDynamic("removeLabel")(removeLabel.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (tagsLabel != null) __obj.updateDynamic("tagsLabel")(tagsLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiselectMessages]
  }
}

