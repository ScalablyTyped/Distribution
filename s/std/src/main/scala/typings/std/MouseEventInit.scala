package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEventInit extends EventModifierInit {
  var button: js.UndefOr[Double] = js.undefined
  var buttons: js.UndefOr[Double] = js.undefined
  var clientX: js.UndefOr[Double] = js.undefined
  var clientY: js.UndefOr[Double] = js.undefined
  var movementX: js.UndefOr[Double] = js.undefined
  var movementY: js.UndefOr[Double] = js.undefined
  var relatedTarget: js.UndefOr[EventTarget | Null] = js.undefined
  var screenX: js.UndefOr[Double] = js.undefined
  var screenY: js.UndefOr[Double] = js.undefined
}

object MouseEventInit {
  @scala.inline
  def apply(
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    button: js.UndefOr[Double] = js.undefined,
    buttons: js.UndefOr[Double] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    clientX: js.UndefOr[Double] = js.undefined,
    clientY: js.UndefOr[Double] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    detail: js.UndefOr[Double] = js.undefined,
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
    movementX: js.UndefOr[Double] = js.undefined,
    movementY: js.UndefOr[Double] = js.undefined,
    relatedTarget: js.UndefOr[Null | EventTarget] = js.undefined,
    screenX: js.UndefOr[Double] = js.undefined,
    screenY: js.UndefOr[Double] = js.undefined,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    view: js.UndefOr[Null | Window] = js.undefined
  ): MouseEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientX)) __obj.updateDynamic("clientX")(clientX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientY)) __obj.updateDynamic("clientY")(clientY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(detail)) __obj.updateDynamic("detail")(detail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierAltGraph)) __obj.updateDynamic("modifierAltGraph")(modifierAltGraph.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierCapsLock)) __obj.updateDynamic("modifierCapsLock")(modifierCapsLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierFn)) __obj.updateDynamic("modifierFn")(modifierFn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierFnLock)) __obj.updateDynamic("modifierFnLock")(modifierFnLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierHyper)) __obj.updateDynamic("modifierHyper")(modifierHyper.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierNumLock)) __obj.updateDynamic("modifierNumLock")(modifierNumLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierScrollLock)) __obj.updateDynamic("modifierScrollLock")(modifierScrollLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierSuper)) __obj.updateDynamic("modifierSuper")(modifierSuper.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierSymbol)) __obj.updateDynamic("modifierSymbol")(modifierSymbol.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifierSymbolLock)) __obj.updateDynamic("modifierSymbolLock")(modifierSymbolLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(movementX)) __obj.updateDynamic("movementX")(movementX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(movementY)) __obj.updateDynamic("movementY")(movementY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relatedTarget)) __obj.updateDynamic("relatedTarget")(relatedTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(screenX)) __obj.updateDynamic("screenX")(screenX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenY)) __obj.updateDynamic("screenY")(screenY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(view)) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEventInit]
  }
}

