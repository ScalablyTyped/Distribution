package typings.atStorybookComponents

import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typings.atStorybookComponents.distFormFieldFieldMod.FieldProps
import typings.atStorybookComponents.distFormInputInputMod.InputStyleProps
import typings.atStorybookTheming.distTypesMod.Theme
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.RefAttributes
import typings.react.reactMod.SelectHTMLAttributes
import typings.reactDashTextareaDashAutosize.reactDashTextareaDashAutosizeMod.TextareaAutosizeProps
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_About extends js.Object {
  var Button: FunctionComponent[_]
  var Field: FunctionComponent[FieldProps]
  var Input: (StyledComponent[
    (Pick[
      (Pick[
        HTMLProps[HTMLInputElement], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 360 */ js.Any
      ]) with InputStyleProps, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 362 */ js.Any
    ]) with RefAttributes[_], 
    InputStyleProps, 
    Theme
  ]) with Anon_DisplayName
  var Select: (StyledComponent[
    (Pick[
      SelectHTMLAttributes[HTMLSelectElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 262 */ js.Any
    ]) with InputStyleProps with RefAttributes[_], 
    (Pick[
      SelectHTMLAttributes[HTMLSelectElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 262 */ js.Any
    ]) with InputStyleProps, 
    Theme
  ]) with Anon_DisplayName
  var Textarea: (StyledComponent[
    (Pick[
      (Pick[
        TextareaAutosizeProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 365 */ js.Any
      ]) with InputStyleProps, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 367 */ js.Any
    ]) with RefAttributes[_], 
    (Pick[
      TextareaAutosizeProps, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 365 */ js.Any
    ]) with InputStyleProps, 
    Theme
  ]) with Anon_DisplayName
}

object Anon_About {
  @scala.inline
  def apply(
    Button: FunctionComponent[_],
    Field: FunctionComponent[FieldProps],
    Input: (StyledComponent[
      (Pick[
        (Pick[
          HTMLProps[HTMLInputElement], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 360 */ js.Any
        ]) with InputStyleProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 362 */ js.Any
      ]) with RefAttributes[_], 
      InputStyleProps, 
      Theme
    ]) with Anon_DisplayName,
    Select: (StyledComponent[
      (Pick[
        SelectHTMLAttributes[HTMLSelectElement], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 262 */ js.Any
      ]) with InputStyleProps with RefAttributes[_], 
      (Pick[
        SelectHTMLAttributes[HTMLSelectElement], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 262 */ js.Any
      ]) with InputStyleProps, 
      Theme
    ]) with Anon_DisplayName,
    Textarea: (StyledComponent[
      (Pick[
        (Pick[
          TextareaAutosizeProps, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 365 */ js.Any
        ]) with InputStyleProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 367 */ js.Any
      ]) with RefAttributes[_], 
      (Pick[
        TextareaAutosizeProps, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 365 */ js.Any
      ]) with InputStyleProps, 
      Theme
    ]) with Anon_DisplayName
  ): Anon_About = {
    val __obj = js.Dynamic.literal(Button = Button, Field = Field, Input = Input, Select = Select, Textarea = Textarea)
  
    __obj.asInstanceOf[Anon_About]
  }
}

