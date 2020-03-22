package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card extends ForwardRefExoticComponent[PropsWithoutRef[CardProps] with RefAttributes[_]] {
  var Content: ForwardRefExoticComponent[PropsWithoutRef[CardContentProps] with RefAttributes[_]] = js.native
  var Footer: CardFooter = js.native
  var Header: CardHeader = js.native
  var Image: ForwardRefExoticComponent[PropsWithoutRef[CardImageProps] with RefAttributes[_]] = js.native
}

@JSImport("react-bulma-components", "Card")
@js.native
object Card extends TopLevel[Card]

