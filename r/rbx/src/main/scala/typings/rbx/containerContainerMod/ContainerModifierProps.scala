package typings.rbx.containerContainerMod

import typings.rbx.rbxStrings.desktop
import typings.rbx.rbxStrings.fullhd
import typings.rbx.rbxStrings.mobile
import typings.rbx.rbxStrings.tablet
import typings.rbx.rbxStrings.touch
import typings.rbx.rbxStrings.widescreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerModifierProps extends js.Object {
  var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.undefined
  var fluid: js.UndefOr[Boolean] = js.undefined
}

object ContainerModifierProps {
  @scala.inline
  def apply(
    breakpoint: mobile | tablet | desktop | widescreen | fullhd | touch = null,
    fluid: js.UndefOr[Boolean] = js.undefined
  ): ContainerModifierProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerModifierProps]
  }
}

