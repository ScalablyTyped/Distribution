package typings.storybookAddonKnobs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type :any,   groupId :string | undefined,   name :string,   label :string,   used :boolean | undefined,   defaultValue :any | undefined,   hideLabel :boolean | undefined,   callback :(): any | undefined} & std.Pick<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types.ObjectTypeKnob<any>, 'value'> */
@js.native
trait typeanygroupIdstringundef extends js.Object {
  var callback: js.UndefOr[js.Function0[_]] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var groupId: js.UndefOr[String] = js.native
  var hideLabel: js.UndefOr[Boolean] = js.native
  var label: String = js.native
  var name: String = js.native
  var `type`: js.Any = js.native
  var used: js.UndefOr[Boolean] = js.native
  var value: js.Any = js.native
}

object typeanygroupIdstringundef {
  @scala.inline
  def apply(label: String, name: String, `type`: js.Any, value: js.Any): typeanygroupIdstringundef = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeanygroupIdstringundef]
  }
  @scala.inline
  implicit class typeanygroupIdstringundefOps[Self <: typeanygroupIdstringundef] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: () => _): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    @scala.inline
    def setHideLabel(value: Boolean): Self = this.set("hideLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideLabel: Self = this.set("hideLabel", js.undefined)
    @scala.inline
    def setUsed(value: Boolean): Self = this.set("used", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsed: Self = this.set("used", js.undefined)
  }
  
}

