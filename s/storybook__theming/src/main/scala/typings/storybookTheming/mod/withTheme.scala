package typings.storybookTheming.mod

import typings.emotionTheming.helperMod.AddOptionalTo
import typings.emotionTheming.helperMod.PropsOf
import typings.react.mod.ComponentType
import typings.react.mod.SFC
import typings.storybookTheming.storybookThemingStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[C /* <: ComponentType[_] */](component: C): SFC[AddOptionalTo[PropsOf[C], theme]] = js.native
}

