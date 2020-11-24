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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/badge", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Badge: ForwardRefExoticComponent[BadgeProps with RefAttributes[HTMLSpanElement]] = js.native
  
  val BadgeContainer: ForwardRefExoticComponent[BadgeContainerProps with RefAttributes[HTMLSpanElement]] = js.native
  
  val BadgedButton: ForwardRefExoticComponent[BadgedButtonProps with RefAttributes[HTMLButtonElement]] = js.native
}
