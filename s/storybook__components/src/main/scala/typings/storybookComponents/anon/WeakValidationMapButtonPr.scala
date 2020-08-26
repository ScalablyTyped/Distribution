package typings.storybookComponents.anon

import typings.react.mod.Key
import typings.react.mod.Ref
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/components.@storybook/components/dist/Button/Button.ButtonProps & react.react.RefAttributes<any>> */
@js.native
trait WeakValidationMapButtonPr extends js.Object {
  var containsIcon: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var inForm: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var isLink: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
  var outline: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var primary: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[_]]]] = js.native
  var secondary: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var small: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var tertiary: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapButtonPr {
  @scala.inline
  def apply(): WeakValidationMapButtonPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapButtonPr]
  }
  @scala.inline
  implicit class WeakValidationMapButtonPrOps[Self <: WeakValidationMapButtonPr] (val x: Self) extends AnyVal {
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
    def setContainsIcon(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("containsIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsIcon: Self = this.set("containsIcon", js.undefined)
    @scala.inline
    def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInForm(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("inForm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInForm: Self = this.set("inForm", js.undefined)
    @scala.inline
    def setIsLink(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("isLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLink: Self = this.set("isLink", js.undefined)
    @scala.inline
    def setKey(value: Validator[js.UndefOr[Key | Null]]): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOutline(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setPrimary(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRef(value: Validator[js.UndefOr[Null | Ref[_]]]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setSecondary(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    @scala.inline
    def setSmall(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    @scala.inline
    def setTertiary(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("tertiary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTertiary: Self = this.set("tertiary", js.undefined)
  }
  
}

