package typings.reactDashAddDashToDashCalendar.reactDashAddDashToDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddToCalendarProps extends js.Object {
  var buttonClassClosed: js.UndefOr[String] = js.undefined
  var buttonClassOpen: js.UndefOr[String] = js.undefined
  var buttonIconClass: js.UndefOr[String] = js.undefined
  var buttonLabel: js.UndefOr[String] = js.undefined
  var buttonTemplate: js.UndefOr[js.Any] = js.undefined
  var buttonWrapperClass: js.UndefOr[String] = js.undefined
  var displayItemIcons: js.UndefOr[Boolean] = js.undefined
  var dropdownClass: js.UndefOr[String] = js.undefined
  var event: AddToCalendarEvent
  var listItems: js.UndefOr[js.Array[_]] = js.undefined
  var optionsOpen: js.UndefOr[Boolean] = js.undefined
  var rootClass: js.UndefOr[String] = js.undefined
  var useFontAwesomeIcons: js.UndefOr[Boolean] = js.undefined
}

object AddToCalendarProps {
  @scala.inline
  def apply(
    event: AddToCalendarEvent,
    buttonClassClosed: String = null,
    buttonClassOpen: String = null,
    buttonIconClass: String = null,
    buttonLabel: String = null,
    buttonTemplate: js.Any = null,
    buttonWrapperClass: String = null,
    displayItemIcons: js.UndefOr[Boolean] = js.undefined,
    dropdownClass: String = null,
    listItems: js.Array[_] = null,
    optionsOpen: js.UndefOr[Boolean] = js.undefined,
    rootClass: String = null,
    useFontAwesomeIcons: js.UndefOr[Boolean] = js.undefined
  ): AddToCalendarProps = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (buttonClassClosed != null) __obj.updateDynamic("buttonClassClosed")(buttonClassClosed.asInstanceOf[js.Any])
    if (buttonClassOpen != null) __obj.updateDynamic("buttonClassOpen")(buttonClassOpen.asInstanceOf[js.Any])
    if (buttonIconClass != null) __obj.updateDynamic("buttonIconClass")(buttonIconClass.asInstanceOf[js.Any])
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel.asInstanceOf[js.Any])
    if (buttonTemplate != null) __obj.updateDynamic("buttonTemplate")(buttonTemplate.asInstanceOf[js.Any])
    if (buttonWrapperClass != null) __obj.updateDynamic("buttonWrapperClass")(buttonWrapperClass.asInstanceOf[js.Any])
    if (!js.isUndefined(displayItemIcons)) __obj.updateDynamic("displayItemIcons")(displayItemIcons.asInstanceOf[js.Any])
    if (dropdownClass != null) __obj.updateDynamic("dropdownClass")(dropdownClass.asInstanceOf[js.Any])
    if (listItems != null) __obj.updateDynamic("listItems")(listItems.asInstanceOf[js.Any])
    if (!js.isUndefined(optionsOpen)) __obj.updateDynamic("optionsOpen")(optionsOpen.asInstanceOf[js.Any])
    if (rootClass != null) __obj.updateDynamic("rootClass")(rootClass.asInstanceOf[js.Any])
    if (!js.isUndefined(useFontAwesomeIcons)) __obj.updateDynamic("useFontAwesomeIcons")(useFontAwesomeIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToCalendarProps]
  }
}

