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
import scala.scalajs.js.annotation._

@JSImport("@react-md/card", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * This is the root card component that should be used along side all the other
    * card parts. It adds some general styles and elevation to help show
    * prominence.
    */
  val Card: ForwardRefExoticComponent[CardProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * This component is generally used to hold the main actions for the `Card`.
    * It's a good place to add additional buttons or expansion toggles.
    */
  val CardActions: ForwardRefExoticComponent[CardActionsProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * The main content for the `Card`. This adds some additional padding and removes
    * margin from `<p>` tags by default.
    */
  val CardContent: ForwardRefExoticComponent[CardContentProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * The header for a `Card`. There should only be up to 1 `CardHeader` within a
    * card and normally contains the `CardTitle` and optionally `CardSubtitle`
    * components. There is also additional functionality built in to render items
    * before or after the main children with some additional spacing.
    */
  val CardHeader: ForwardRefExoticComponent[CardHeaderProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * A subtitle for the `Card`. This is usually used with the `CardHeader`
    * component after the `CardTitle`.
    */
  val CardSubtitle: ForwardRefExoticComponent[CardSubtitleProps with RefAttributes[HTMLHeadingElement]] = js.native
  /**
    * The `Cardtitle` component should normally be used within the `CardHeader` to
    * create a nicely styled `<h5>` title for your card. This can also be used
    * along with the `CardSubtitle` component within the `CardHeader` for a main
    * title and a subtitle.
    */
  val CardTitle: ForwardRefExoticComponent[CardTitleProps with RefAttributes[HTMLHeadingElement]] = js.native
}

