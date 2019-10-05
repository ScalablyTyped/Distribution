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
    ariaLabel: String = null,
    label: ReactNode = null,
    position: (/* position1 */ DOMRect, /* position2 */ DOMRect) => DOMRect = null
  ): BaseTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction2(position))
    __obj.asInstanceOf[BaseTooltipProps]
  }
}

