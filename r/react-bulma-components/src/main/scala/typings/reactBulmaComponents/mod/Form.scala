package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactBulmaComponents.reactBulmaComponentsStrings.input
import typings.reactBulmaComponents.reactBulmaComponentsStrings.label
import typings.reactBulmaComponents.reactBulmaComponentsStrings.p
import typings.reactBulmaComponents.reactBulmaComponentsStrings.select
import typings.reactBulmaComponents.reactBulmaComponentsStrings.textarea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Form ***/
trait Form extends js.Object {
  var Checkbox: ForwardRefExoticComponent[PropsWithoutRef[CheckboxProps] with RefAttributes[input]]
  var Control: ForwardRefExoticComponent[PropsWithoutRef[ControlProps] with RefAttributes[_]]
  var Field: typings.reactBulmaComponents.mod.Field
  var Help: ForwardRefExoticComponent[PropsWithoutRef[HelpProps] with RefAttributes[p]]
  var Input: ForwardRefExoticComponent[PropsWithoutRef[InputProps] with RefAttributes[input]]
  var InputFile: ForwardRefExoticComponent[PropsWithoutRef[InputFileProps] with RefAttributes[input]]
  var Label: ForwardRefExoticComponent[PropsWithoutRef[LabelProps] with RefAttributes[label]]
  var Radio: ForwardRefExoticComponent[PropsWithoutRef[RadioProps] with RefAttributes[input]]
  var Select: ForwardRefExoticComponent[PropsWithoutRef[SelectProps] with RefAttributes[select]]
  var Textarea: ForwardRefExoticComponent[PropsWithoutRef[TextareaProps] with RefAttributes[textarea]]
}

@JSImport("react-bulma-components", "Form")
@js.native
object Form extends TopLevel[Form]

