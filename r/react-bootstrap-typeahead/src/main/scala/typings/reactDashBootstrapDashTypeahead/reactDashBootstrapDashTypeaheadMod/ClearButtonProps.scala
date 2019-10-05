package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearButtonProps extends HTMLAttributes[button] {
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  @JSName("onClick")
  var onClick_ClearButtonProps: js.UndefOr[MouseEventHandler[button]] = js.undefined
}

object ClearButtonProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[button] = null,
    bsSize: TypeaheadBsSizes = null,
    label: String = null,
    onClick: MouseEvent[button, NativeMouseEvent] => Unit = null
  ): ClearButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ClearButtonProps]
  }
}

