package typings
package reactDashBootstrapLib.libRadioMod.RadioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libRadioMod.Radio] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var inputRef: js.UndefOr[js.Function1[/* instance */ reactLib.HTMLInputElement, scala.Unit]] = js.undefined
  var validationState: js.UndefOr[
    reactDashBootstrapLib.reactDashBootstrapLibStrings.success | reactDashBootstrapLib.reactDashBootstrapLibStrings.warning | reactDashBootstrapLib.reactDashBootstrapLibStrings.error
  ] = js.undefined
}

object RadioProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libRadioMod.Radio] = null,
    bsClass: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    inputRef: js.Function1[/* instance */ reactLib.HTMLInputElement, scala.Unit] = null,
    validationState: reactDashBootstrapLib.reactDashBootstrapLibStrings.success | reactDashBootstrapLib.reactDashBootstrapLibStrings.warning | reactDashBootstrapLib.reactDashBootstrapLibStrings.error = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef)
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
}

