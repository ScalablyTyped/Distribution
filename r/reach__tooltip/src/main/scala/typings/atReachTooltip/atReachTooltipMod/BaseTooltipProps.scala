package typings.atReachTooltip.atReachTooltipMod

import typings.react.reactMod.ReactNode
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLDivElement>, 'label'> ]: react.react.HTMLProps<std.HTMLDivElement>[P]} */ trait BaseTooltipProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var label: ReactNode
  var position: js.UndefOr[js.Function2[/* position1 */ DOMRect, /* position2 */ DOMRect, DOMRect]] = js.undefined
}

object BaseTooltipProps {
  @scala.inline
  def apply(
    label: ReactNode,
    ariaLabel: String = null,
    position: (/* position1 */ DOMRect, /* position2 */ DOMRect) => DOMRect = null
  ): BaseTooltipProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction2(position))
    __obj.asInstanceOf[BaseTooltipProps]
  }
}

