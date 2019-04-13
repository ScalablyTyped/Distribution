package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearButtonProps
  extends reactLib.reactMod.HTMLAttributes[
      reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.button
    ] {
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object ClearButtonProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[
      reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.button
    ] = null,
    bsSize: TypeaheadBsSizes = null,
    label: java.lang.String = null,
    onClick: reactLib.reactMod.MouseEventHandler[
      reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.button
    ] = null
  ): ClearButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[ClearButtonProps]
  }
}

