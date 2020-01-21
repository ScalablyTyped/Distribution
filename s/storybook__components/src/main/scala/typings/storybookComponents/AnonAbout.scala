package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLProps
import typings.react.mod.RefAttributes
import typings.react.mod.SelectHTMLAttributes
import typings.reactTextareaAutosize.mod.TextareaAutosizeProps
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.Pick
import typings.storybookComponents.fieldMod.FieldProps
import typings.storybookComponents.inputMod.InputStyleProps
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbout extends js.Object {
  var Button: FunctionComponent[_]
  var Field: FunctionComponent[FieldProps]
  var Input: (StyledComponent[
    (Pick[
      (Pick[
        HTMLProps[HTMLInputElement], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 361 */ js.Any
      ]) with InputStyleProps, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 363 */ js.Any
    ]) with RefAttributes[_], 
    InputStyleProps, 
    Theme
  ]) with AnonDisplayName
  var Select: (StyledComponent[
    (Pick[
      SelectHTMLAttributes[HTMLSelectElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 263 */ js.Any
    ]) with InputStyleProps with RefAttributes[_], 
    (Pick[
      SelectHTMLAttributes[HTMLSelectElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 263 */ js.Any
    ]) with InputStyleProps, 
    Theme
  ]) with AnonDisplayName
  var Textarea: (StyledComponent[
    (Pick[
      (Pick[
        TextareaAutosizeProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 366 */ js.Any
      ]) with InputStyleProps, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 368 */ js.Any
    ]) with RefAttributes[_], 
    (Pick[
      TextareaAutosizeProps, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 366 */ js.Any
    ]) with InputStyleProps, 
    Theme
  ]) with AnonDisplayName
}

object AnonAbout {
  @scala.inline
  def apply(
    Button: FunctionComponent[_],
    Field: FunctionComponent[FieldProps],
    Input: (StyledComponent[
      (Pick[
        (Pick[
          HTMLProps[HTMLInputElement], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 361 */ js.Any
        ]) with InputStyleProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 363 */ js.Any
      ]) with RefAttributes[_], 
      InputStyleProps, 
      Theme
    ]) with AnonDisplayName,
    Select: (StyledComponent[
      (Pick[
        SelectHTMLAttributes[HTMLSelectElement], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 263 */ js.Any
      ]) with InputStyleProps with RefAttributes[_], 
      (Pick[
        SelectHTMLAttributes[HTMLSelectElement], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 263 */ js.Any
      ]) with InputStyleProps, 
      Theme
    ]) with AnonDisplayName,
    Textarea: (StyledComponent[
      (Pick[
        (Pick[
          TextareaAutosizeProps, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 366 */ js.Any
        ]) with InputStyleProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 368 */ js.Any
      ]) with RefAttributes[_], 
      (Pick[
        TextareaAutosizeProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 366 */ js.Any
      ]) with InputStyleProps, 
      Theme
    ]) with AnonDisplayName
  ): AnonAbout = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any], Textarea = Textarea.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAbout]
  }
}

