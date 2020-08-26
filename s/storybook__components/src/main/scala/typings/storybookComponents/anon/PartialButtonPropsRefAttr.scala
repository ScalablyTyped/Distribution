package typings.storybookComponents.anon

import typings.react.mod.Key
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/components.@storybook/components/dist/Button/Button.ButtonProps & react.react.RefAttributes<any>> */
@js.native
trait PartialButtonPropsRefAttr extends js.Object {
  var containsIcon: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var inForm: js.UndefOr[Boolean] = js.native
  var isLink: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[Key] = js.native
  var outline: js.UndefOr[Boolean] = js.native
  var primary: js.UndefOr[Boolean] = js.native
  var ref: js.UndefOr[Ref[_]] = js.native
  var secondary: js.UndefOr[Boolean] = js.native
  var small: js.UndefOr[Boolean] = js.native
  var tertiary: js.UndefOr[Boolean] = js.native
}

object PartialButtonPropsRefAttr {
  @scala.inline
  def apply(): PartialButtonPropsRefAttr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialButtonPropsRefAttr]
  }
  @scala.inline
  implicit class PartialButtonPropsRefAttrOps[Self <: PartialButtonPropsRefAttr] (val x: Self) extends AnyVal {
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
    def setContainsIcon(value: Boolean): Self = this.set("containsIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsIcon: Self = this.set("containsIcon", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInForm(value: Boolean): Self = this.set("inForm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInForm: Self = this.set("inForm", js.undefined)
    @scala.inline
    def setIsLink(value: Boolean): Self = this.set("isLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLink: Self = this.set("isLink", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    @scala.inline
    def setTertiary(value: Boolean): Self = this.set("tertiary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTertiary: Self = this.set("tertiary", js.undefined)
  }
  
}

