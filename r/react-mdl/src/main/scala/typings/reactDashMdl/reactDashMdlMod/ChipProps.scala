package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipProps
  extends HTMLProps[js.Any] {
  @JSName("onClick")
  var onClick_ChipProps: js.UndefOr[MouseEventHandler[Chip]] = js.undefined
  var onClose: js.UndefOr[MouseEventHandler[Chip]] = js.undefined
}

object ChipProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[js.Any] = null,
    onClick: MouseEventHandler[Chip] = null,
    onClose: MouseEventHandler[Chip] = null
  ): ChipProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    __obj.asInstanceOf[ChipProps]
  }
}

