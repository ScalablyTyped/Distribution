package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.active
import typings.reactBulmaComponents.reactBulmaComponentsStrings.focus
import typings.reactBulmaComponents.reactBulmaComponentsStrings.hover
import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.loading
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Button ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/button/button.js
trait ButtonModifierProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fullwidth: js.UndefOr[Boolean] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var isStatic: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var outlined: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var reset: js.UndefOr[Boolean] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
  var state: js.UndefOr[hover | focus | active | loading] = js.undefined
  var submit: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[Boolean] = js.undefined
}

object ButtonModifierProps {
  @scala.inline
  def apply(
    color: Color = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fullwidth: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    isStatic: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    outlined: js.UndefOr[Boolean] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined,
    reset: js.UndefOr[Boolean] = js.undefined,
    rounded: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null,
    state: hover | focus | active | loading = null,
    submit: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined
  ): ButtonModifierProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fullwidth)) __obj.updateDynamic("fullwidth")(fullwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(outlined)) __obj.updateDynamic("outlined")(outlined.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(submit)) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonModifierProps]
  }
}

