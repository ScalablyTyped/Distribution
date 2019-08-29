package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEventInit extends EventModifierInit {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var isComposing: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[scala.Boolean] = js.undefined
}

object KeyboardEventInit {
  @scala.inline
  def apply(
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    code: java.lang.String = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    detail: Int | Double = null,
    isComposing: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    location: Int | Double = null,
    metaKey: js.UndefOr[scala.Boolean] = js.undefined,
    modifierAltGraph: js.UndefOr[scala.Boolean] = js.undefined,
    modifierCapsLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierFn: js.UndefOr[scala.Boolean] = js.undefined,
    modifierFnLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierHyper: js.UndefOr[scala.Boolean] = js.undefined,
    modifierNumLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierScrollLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierSuper: js.UndefOr[scala.Boolean] = js.undefined,
    modifierSymbol: js.UndefOr[scala.Boolean] = js.undefined,
    modifierSymbolLock: js.UndefOr[scala.Boolean] = js.undefined,
    repeat: js.UndefOr[scala.Boolean] = js.undefined,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    view: Window = null
  ): KeyboardEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (code != null) __obj.updateDynamic("code")(code)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (!js.isUndefined(isComposing)) __obj.updateDynamic("isComposing")(isComposing)
    if (key != null) __obj.updateDynamic("key")(key)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey)
    if (!js.isUndefined(modifierAltGraph)) __obj.updateDynamic("modifierAltGraph")(modifierAltGraph)
    if (!js.isUndefined(modifierCapsLock)) __obj.updateDynamic("modifierCapsLock")(modifierCapsLock)
    if (!js.isUndefined(modifierFn)) __obj.updateDynamic("modifierFn")(modifierFn)
    if (!js.isUndefined(modifierFnLock)) __obj.updateDynamic("modifierFnLock")(modifierFnLock)
    if (!js.isUndefined(modifierHyper)) __obj.updateDynamic("modifierHyper")(modifierHyper)
    if (!js.isUndefined(modifierNumLock)) __obj.updateDynamic("modifierNumLock")(modifierNumLock)
    if (!js.isUndefined(modifierScrollLock)) __obj.updateDynamic("modifierScrollLock")(modifierScrollLock)
    if (!js.isUndefined(modifierSuper)) __obj.updateDynamic("modifierSuper")(modifierSuper)
    if (!js.isUndefined(modifierSymbol)) __obj.updateDynamic("modifierSymbol")(modifierSymbol)
    if (!js.isUndefined(modifierSymbolLock)) __obj.updateDynamic("modifierSymbolLock")(modifierSymbolLock)
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat)
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[KeyboardEventInit]
  }
}

