package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type  :any,   groupId ? :string | undefined,   name  :string,   label  :string,   used ? :boolean | undefined,   defaultValue ? :any,   hideLabel ? :boolean | undefined,   callback ? :(): any | undefined} & std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ObjectTypeKnob<any>, 'value'> */
trait typeanygroupIdstringundef extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var groupId: js.UndefOr[String] = js.undefined
  var hideLabel: js.UndefOr[Boolean] = js.undefined
  var label: String
  var name: String
  var `type`: js.Any
  var used: js.UndefOr[Boolean] = js.undefined
  var value: js.Any
}

object typeanygroupIdstringundef {
  @scala.inline
  def apply(
    label: String,
    name: String,
    `type`: js.Any,
    value: js.Any,
    callback: () => _ = null,
    defaultValue: js.Any = null,
    groupId: String = null,
    hideLabel: js.UndefOr[Boolean] = js.undefined,
    used: js.UndefOr[Boolean] = js.undefined
  ): typeanygroupIdstringundef = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLabel)) __obj.updateDynamic("hideLabel")(hideLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(used)) __obj.updateDynamic("used")(used.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeanygroupIdstringundef]
  }
}

