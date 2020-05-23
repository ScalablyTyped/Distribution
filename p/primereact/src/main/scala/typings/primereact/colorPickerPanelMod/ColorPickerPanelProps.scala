package typings.primereact.colorPickerPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPickerPanelProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ColorPickerPanelProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    disabled: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onClick: () => Unit = null
  ): ColorPickerPanelProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[ColorPickerPanelProps]
  }
}

