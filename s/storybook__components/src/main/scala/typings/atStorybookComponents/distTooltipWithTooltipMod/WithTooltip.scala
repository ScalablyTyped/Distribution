package typings.atStorybookComponents.distTooltipWithTooltipMod

import typings.atStorybookComponents.atStorybookComponentsStrings.children
import typings.atStorybookComponents.atStorybookComponentsStrings.closeOnClick
import typings.atStorybookComponents.atStorybookComponentsStrings.hasChrome
import typings.atStorybookComponents.atStorybookComponentsStrings.modifiers
import typings.atStorybookComponents.atStorybookComponentsStrings.onDoubleClick
import typings.atStorybookComponents.atStorybookComponentsStrings.onVisibilityChange
import typings.atStorybookComponents.atStorybookComponentsStrings.placement
import typings.atStorybookComponents.atStorybookComponentsStrings.svg
import typings.atStorybookComponents.atStorybookComponentsStrings.tooltip
import typings.atStorybookComponents.atStorybookComponentsStrings.tooltipShown
import typings.atStorybookComponents.atStorybookComponentsStrings.trigger
import typings.react.reactMod.Component
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/tooltip/WithTooltip", "WithTooltip")
@js.native
class WithTooltip protected ()
  extends Component[
      Pick[
        WithTooltipPureProps, 
        children | onDoubleClick | tooltip | svg | placement | hasChrome | trigger | closeOnClick | modifiers | tooltipShown | onVisibilityChange
      ], 
      js.Any, 
      js.Any
    ] {
  def this(props: Pick[
        WithTooltipPureProps, 
        children | onDoubleClick | tooltip | svg | placement | hasChrome | trigger | closeOnClick | modifiers | tooltipShown | onVisibilityChange
      ]) = this()
  def this(
    props: Pick[
        WithTooltipPureProps, 
        children | onDoubleClick | tooltip | svg | placement | hasChrome | trigger | closeOnClick | modifiers | tooltipShown | onVisibilityChange
      ],
    context: js.Any
  ) = this()
}

