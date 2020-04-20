package typings.rbx.levelLevelMod

import typings.rbx.rbxStrings.desktop
import typings.rbx.rbxStrings.fullhd
import typings.rbx.rbxStrings.mobile
import typings.rbx.rbxStrings.tablet
import typings.rbx.rbxStrings.touch
import typings.rbx.rbxStrings.widescreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelModifierProps extends js.Object {
  var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.undefined
}

object LevelModifierProps {
  @scala.inline
  def apply(breakpoint: mobile | tablet | desktop | widescreen | fullhd | touch = null): LevelModifierProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelModifierProps]
  }
}

