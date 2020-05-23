package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityState extends js.Object {
  /**
    *  When present, informs accessible tools if the element is busy
    */
  var busy: js.UndefOr[Boolean] = js.undefined
  /**
    * For items like Checkboxes and Toggle switches, reports their state to accessible tools
    */
  var checked: js.UndefOr[Boolean | mixed] = js.undefined
  /**
    * When true, informs accessible tools if the element is disabled
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    *  When present, informs accessible tools the element is expanded or collapsed
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, informs accessible tools if the element is selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
}

object AccessibilityState {
  @scala.inline
  def apply(
    busy: js.UndefOr[Boolean] = js.undefined,
    checked: Boolean | mixed = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  ): AccessibilityState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(busy)) __obj.updateDynamic("busy")(busy.get.asInstanceOf[js.Any])
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityState]
  }
}

