package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal extends ForwardRefExoticComponent[PropsWithoutRef[ModalProps] with RefAttributes[div]] {
  var Card: ModalCard = js.native
  var Content: ForwardRefExoticComponent[PropsWithoutRef[ModalContentProps] with RefAttributes[_]] = js.native
}

@JSImport("react-bulma-components", "Modal")
@js.native
object Modal extends TopLevel[Modal]

