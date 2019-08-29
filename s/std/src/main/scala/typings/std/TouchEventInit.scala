package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchEventInit extends EventModifierInit {
  var changedTouches: js.UndefOr[js.Array[Touch]] = js.undefined
  var targetTouches: js.UndefOr[js.Array[Touch]] = js.undefined
  var touches: js.UndefOr[js.Array[Touch]] = js.undefined
}

object TouchEventInit {
  @scala.inline
  def apply(
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    changedTouches: js.Array[Touch] = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    detail: Int | Double = null,
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
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    targetTouches: js.Array[Touch] = null,
    touches: js.Array[Touch] = null,
    view: Window = null
  ): TouchEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
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
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (targetTouches != null) __obj.updateDynamic("targetTouches")(targetTouches)
    if (touches != null) __obj.updateDynamic("touches")(touches)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[TouchEventInit]
  }
}

