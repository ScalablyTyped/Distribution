package typings.reactMdBadge

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdBadge.typesBadgeContainerMod.BadgeContainerProps
import typings.reactMdBadge.typesBadgeMod.BadgeProps
import typings.reactMdBadge.typesBadgedButtonMod.BadgedButtonProps
import typings.std.HTMLButtonElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/badge", "Badge")
  @js.native
  val Badge: ForwardRefExoticComponent[BadgeProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/badge", "BadgeContainer")
  @js.native
  val BadgeContainer: ForwardRefExoticComponent[BadgeContainerProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/badge", "BadgedButton")
  @js.native
  val BadgedButton: ForwardRefExoticComponent[BadgedButtonProps & RefAttributes[HTMLButtonElement]] = js.native
}
