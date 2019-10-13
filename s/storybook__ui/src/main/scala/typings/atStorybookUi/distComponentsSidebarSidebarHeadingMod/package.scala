package typings.atStorybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distComponentsSidebarSidebarHeadingMod {
  import typings.atStorybookComponents.Anon_DefaultProps
  import typings.atStorybookComponents.distButtonButtonMod.ButtonProps
  import typings.atStorybookUi.Anon_Highlighted
  import typings.atStorybookUi.atStorybookUiStrings.button
  import typings.atStorybookUi.atStorybookUiStrings.div
  import typings.react.reactMod.ComponentProps
  import typings.react.reactMod.ForwardRefExoticComponent
  import typings.react.reactMod.RefAttributes

  type BrandAreaProps = ComponentProps[div]
  type MenuButtonProps = (ComponentProps[
    (ForwardRefExoticComponent[ButtonProps with RefAttributes[_]]) with Anon_DefaultProps
  ]) with ComponentProps[button] with Anon_Highlighted
}
