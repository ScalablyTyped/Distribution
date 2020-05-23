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
  def apply(
    containsIcon: Validator[js.UndefOr[Boolean | Null]] = null,
    disabled: Validator[js.UndefOr[Boolean | Null]] = null,
    inForm: Validator[js.UndefOr[Boolean | Null]] = null,
    isLink: Validator[js.UndefOr[Boolean | Null]] = null,
    key: Validator[js.UndefOr[Key | Null]] = null,
    outline: Validator[js.UndefOr[Boolean | Null]] = null,
    primary: Validator[js.UndefOr[Boolean | Null]] = null,
    ref: Validator[js.UndefOr[Null | Ref[_]]] = null,
    secondary: Validator[js.UndefOr[Boolean | Null]] = null,
    small: Validator[js.UndefOr[Boolean | Null]] = null,
    tertiary: Validator[js.UndefOr[Boolean | Null]] = null
  ): WeakValidationMapButtonPr = {
    val __obj = js.Dynamic.literal()
    if (containsIcon != null) __obj.updateDynamic("containsIcon")(containsIcon.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inForm != null) __obj.updateDynamic("inForm")(inForm.asInstanceOf[js.Any])
    if (isLink != null) __obj.updateDynamic("isLink")(isLink.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (tertiary != null) __obj.updateDynamic("tertiary")(tertiary.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapButtonPr]
  }
}

