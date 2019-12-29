package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsBooleans.`true`
import typings.atStorybookAddonDashKnobs.distComponentsTypesButtonMod.ButtonTypeOnClickProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackDefaultValueGroupId extends js.Object {
  var callback: js.UndefOr[ButtonTypeOnClickProp with js.UndefOr[js.Function0[_]]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
  var hideLabel: js.UndefOr[`true` with js.UndefOr[Boolean]] = js.undefined
  var label: String
  var name: String
  var `type`: js.Any
  var used: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_CallbackDefaultValueGroupId {
  @scala.inline
  def apply(
    label: String,
    name: String,
    `type`: js.Any,
    callback: ButtonTypeOnClickProp with js.UndefOr[js.Function0[_]] = null,
    defaultValue: js.Any = null,
    groupId: String = null,
    hideLabel: `true` with js.UndefOr[Boolean] = null,
    used: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_CallbackDefaultValueGroupId = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (hideLabel != null) __obj.updateDynamic("hideLabel")(hideLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(used)) __obj.updateDynamic("used")(used.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallbackDefaultValueGroupId]
  }
}

