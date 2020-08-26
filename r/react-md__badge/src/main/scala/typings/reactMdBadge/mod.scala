package typings.reactMdBadge

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdBadge.badgeContainerMod.BadgeContainerProps
import typings.reactMdBadge.badgeMod.BadgeProps
import typings.reactMdBadge.badgedButtonMod.BadgedButtonProps
import typings.std.HTMLButtonElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/badge", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * This component is generally used for displaying notifications with a count
    * relative to another element with the `BadgeContainer` component. However, it
    * can be used by itself to display any subpplementary content if needed.
    */
  val Badge: ForwardRefExoticComponent[BadgeProps with RefAttributes[HTMLSpanElement]] = js.native
  /**
    * This is a really simple component that will just allow you to position a
    * badge relative to another component.
    */
  val BadgeContainer: ForwardRefExoticComponent[BadgeContainerProps with RefAttributes[HTMLSpanElement]] = js.native
  /**
    * This is a small wrapper for the `Button` component that will automatically
    * apply the `aria-describedby` attribute when it has been "badged". It also
    * adds some reasonable defaults for the most common use-case for badges:
    * notifications.
    */
  val BadgedButton: ForwardRefExoticComponent[BadgedButtonProps with RefAttributes[HTMLButtonElement]] = js.native
}

