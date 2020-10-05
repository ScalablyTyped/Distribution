package typings.semanticUiReact.formFormMod

import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.formButtonMod.FormButtonProps
import typings.semanticUiReact.formCheckboxMod.FormCheckboxProps
import typings.semanticUiReact.formDropdownMod.FormDropdownProps
import typings.semanticUiReact.formFieldMod.FormFieldProps
import typings.semanticUiReact.formGroupMod.FormGroupProps
import typings.semanticUiReact.formInputMod.FormInputProps
import typings.semanticUiReact.formRadioMod.FormRadioProps
import typings.semanticUiReact.formSelectMod.FormSelectProps
import typings.semanticUiReact.formTextAreaMod.FormTextAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormComponent extends FunctionComponent[FormProps] {
  var Button: StatelessComponent[FormButtonProps] = js.native
  var Checkbox: StatelessComponent[FormCheckboxProps] = js.native
  var Dropdown: StatelessComponent[FormDropdownProps] = js.native
  var Field: StatelessComponent[FormFieldProps] = js.native
  var Group: StatelessComponent[FormGroupProps] = js.native
  var Input: StatelessComponent[FormInputProps] = js.native
  var Radio: StatelessComponent[FormRadioProps] = js.native
  var Select: StatelessComponent[FormSelectProps] = js.native
  var TextArea: StatelessComponent[FormTextAreaProps] = js.native
}

