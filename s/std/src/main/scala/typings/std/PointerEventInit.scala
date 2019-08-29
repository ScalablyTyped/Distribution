package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerEventInit extends MouseEventInit {
  var height: js.UndefOr[Double] = js.undefined
  var isPrimary: js.UndefOr[scala.Boolean] = js.undefined
  var pointerId: js.UndefOr[Double] = js.undefined
  var pointerType: js.UndefOr[java.lang.String] = js.undefined
  var pressure: js.UndefOr[Double] = js.undefined
  var tangentialPressure: js.UndefOr[Double] = js.undefined
  var tiltX: js.UndefOr[Double] = js.undefined
  var tiltY: js.UndefOr[Double] = js.undefined
  var twist: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PointerEventInit {
  @scala.inline
  def apply(
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    button: Int | Double = null,
    buttons: Int | Double = null,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    clientX: Int | Double = null,
    clientY: Int | Double = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    detail: Int | Double = null,
    height: Int | Double = null,
    isPrimary: js.UndefOr[scala.Boolean] = js.undefined,
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
    movementX: Int | Double = null,
    movementY: Int | Double = null,
    pointerId: Int | Double = null,
    pointerType: java.lang.String = null,
    pressure: Int | Double = null,
    relatedTarget: EventTarget = null,
    screenX: Int | Double = null,
    screenY: Int | Double = null,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    tangentialPressure: Int | Double = null,
    tiltX: Int | Double = null,
    tiltY: Int | Double = null,
    twist: Int | Double = null,
    view: Window = null,
    width: Int | Double = null
  ): PointerEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary)
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
    if (movementX != null) __obj.updateDynamic("movementX")(movementX.asInstanceOf[js.Any])
    if (movementY != null) __obj.updateDynamic("movementY")(movementY.asInstanceOf[js.Any])
    if (pointerId != null) __obj.updateDynamic("pointerId")(pointerId.asInstanceOf[js.Any])
    if (pointerType != null) __obj.updateDynamic("pointerType")(pointerType)
    if (pressure != null) __obj.updateDynamic("pressure")(pressure.asInstanceOf[js.Any])
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget)
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (tangentialPressure != null) __obj.updateDynamic("tangentialPressure")(tangentialPressure.asInstanceOf[js.Any])
    if (tiltX != null) __obj.updateDynamic("tiltX")(tiltX.asInstanceOf[js.Any])
    if (tiltY != null) __obj.updateDynamic("tiltY")(tiltY.asInstanceOf[js.Any])
    if (twist != null) __obj.updateDynamic("twist")(twist.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEventInit]
  }
}

