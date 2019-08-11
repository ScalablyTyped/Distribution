package typings.atStorybookComponents

import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typings.atStorybookComponents.distFormFieldFieldMod.FieldProps
import typings.atStorybookTheming.distTypesMod.Theme
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  var Button: js.Any
  var Field: FunctionComponent[FieldProps]
  var Input: StyledComponent[DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], _, Theme]
  var Select: js.Any
  var Textarea: js.Any
}

object Anon_Button {
  @scala.inline
  def apply(
    Button: js.Any,
    Field: FunctionComponent[FieldProps],
    Input: StyledComponent[DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], _, Theme],
    Select: js.Any,
    Textarea: js.Any
  ): Anon_Button = {
    val __obj = js.Dynamic.literal(Button = Button, Field = Field, Input = Input, Select = Select, Textarea = Textarea)
  
    __obj.asInstanceOf[Anon_Button]
  }
}

