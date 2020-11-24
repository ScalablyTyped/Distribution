package typings.reactMdCard

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdCard.cardActionsMod.CardActionsProps
import typings.reactMdCard.cardContentMod.CardContentProps
import typings.reactMdCard.cardHeaderMod.CardHeaderProps
import typings.reactMdCard.cardMod.CardProps
import typings.reactMdCard.cardSubtitleMod.CardSubtitleProps
import typings.reactMdCard.cardTitleMod.CardTitleProps
import typings.std.HTMLDivElement
import typings.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/card", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Card: ForwardRefExoticComponent[CardProps with RefAttributes[HTMLDivElement]] = js.native
  
  val CardActions: ForwardRefExoticComponent[CardActionsProps with RefAttributes[HTMLDivElement]] = js.native
  
  val CardContent: ForwardRefExoticComponent[CardContentProps with RefAttributes[HTMLDivElement]] = js.native
  
  val CardHeader: ForwardRefExoticComponent[CardHeaderProps with RefAttributes[HTMLDivElement]] = js.native
  
  val CardSubtitle: ForwardRefExoticComponent[CardSubtitleProps with RefAttributes[HTMLHeadingElement]] = js.native
  
  val CardTitle: ForwardRefExoticComponent[CardTitleProps with RefAttributes[HTMLHeadingElement]] = js.native
}
