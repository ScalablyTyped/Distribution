package typings.reactMdBadge

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/badge/types/BadgeContainer", JSImport.Namespace)
@js.native
object badgeContainerMod extends js.Object {
  /**
    * This is a really simple component that will just allow you to position a
    * badge relative to another component.
    */
  val default: ForwardRefExoticComponent[BadgeContainerProps with RefAttributes[HTMLSpanElement]] = js.native
  type BadgeContainerProps = HTMLAttributes[HTMLSpanElement]
}

