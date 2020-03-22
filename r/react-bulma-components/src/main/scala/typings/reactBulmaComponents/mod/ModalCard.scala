package typings.reactBulmaComponents.mod

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.reactBulmaComponentsStrings.footer
import typings.reactBulmaComponents.reactBulmaComponentsStrings.header
import typings.reactBulmaComponents.reactBulmaComponentsStrings.p
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalCard extends ForwardRefExoticComponent[PropsWithoutRef[ModalCardProps] with RefAttributes[div]] {
  var Body: ForwardRefExoticComponent[PropsWithoutRef[ModalCardBodyProps] with RefAttributes[_]] = js.native
  var Foot: ForwardRefExoticComponent[PropsWithoutRef[ModalCardFootProps] with RefAttributes[footer]] = js.native
  var Head: ForwardRefExoticComponent[PropsWithoutRef[ModalCardHeadProps] with RefAttributes[header]] = js.native
  var Title: ForwardRefExoticComponent[PropsWithoutRef[ModalCardTitleProps] with RefAttributes[p]] = js.native
}

