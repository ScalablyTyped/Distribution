package typings
package atReachTooltipLib.atReachTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLDivElement>, 'label'> ]: react.react.HTMLProps<std.HTMLDivElement>[P]} */ trait BaseTooltipProps extends js.Object {
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  var label: reactLib.reactMod.ReactNode
  var position: js.UndefOr[
    js.Function2[/* position1 */ stdLib.DOMRect, /* position2 */ stdLib.DOMRect, stdLib.DOMRect]
  ] = js.undefined
}

object BaseTooltipProps {
  @scala.inline
  def apply(
    label: reactLib.reactMod.ReactNode,
    ariaLabel: java.lang.String = null,
    position: (/* position1 */ stdLib.DOMRect, /* position2 */ stdLib.DOMRect) => stdLib.DOMRect = null
  ): BaseTooltipProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction2(position))
    __obj.asInstanceOf[BaseTooltipProps]
  }
}

