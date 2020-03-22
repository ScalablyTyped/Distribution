package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends ForwardRefExoticComponent[PropsWithoutRef[MessageProps] with RefAttributes[_]] {
  var Body: ForwardRefExoticComponent[PropsWithoutRef[MessageBodyProps] with RefAttributes[_]] = js.native
  var Header: ForwardRefExoticComponent[PropsWithoutRef[MessageHeaderProps] with RefAttributes[_]] = js.native
}

@JSImport("react-bulma-components", "Message")
@js.native
object Message extends TopLevel[Message]

