package typings.reactDashWidgets.libMultiselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiselectMessages extends js.Object {
  /**
    * The text label for creating new tags.
    * @default "(create new tag)"
    */
  var createNew: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
  var createOption: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
  /**
    * Text to display when the the current filter does not return any results.
    * @default "The filter returned no results"
    */
  var emptyFilter: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
  /**
    * Text to display when the data prop array is empty.
    * @default "There are no items in this list"
    */
  var emptyList: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
  var noneSelected: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
  var open: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
  var removeLabel: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
  var selectedItems: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
  var tagsLabel: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.undefined
}

object MultiselectMessages {
  @scala.inline
  def apply(
    createNew: String | (js.Function1[/* props */ MultiselectProps, String]) = null,
    createOption: String | (js.Function1[/* props */ MultiselectProps, String]) = null,
    emptyFilter: String | (js.Function1[/* props */ MultiselectProps, String]) = null,
    emptyList: String | (js.Function1[/* props */ MultiselectProps, String]) = null,
    noneSelected: String | (js.Function1[/* props */ MultiselectProps, String]) = null,
    open: String | (js.Function1[/* props */ MultiselectProps, String]) = null,
    removeLabel: String | (js.Function1[/* props */ MultiselectProps, String]) = null,
    selectedItems: String | (js.Function1[/* props */ MultiselectProps, String]) = null,
    tagsLabel: String | (js.Function1[/* props */ MultiselectProps, String]) = null
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

