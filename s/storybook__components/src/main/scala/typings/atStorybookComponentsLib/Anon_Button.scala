package typings
package atStorybookComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  var Button: js.Any
  var Field: reactLib.reactMod.FunctionComponent[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/components/dist/form/field/field.FieldProps */ _
  ]
  var Input: atEmotionStyledDashBaseLib.atEmotionStyledDashBaseMod.StyledComponent[
    reactLib.reactMod.DetailedHTMLProps[
      reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement], 
      stdLib.HTMLInputElement
    ], 
    _, 
    atStorybookThemingLib.distTypesMod.Theme
  ]
  var Select: js.Any
  var Textarea: js.Any
}

object Anon_Button {
  @scala.inline
  def apply(
    Button: js.Any,
    Field: reactLib.reactMod.FunctionComponent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@storybook/components/dist/form/field/field.FieldProps */ _
    ],
    Input: atEmotionStyledDashBaseLib.atEmotionStyledDashBaseMod.StyledComponent[
      reactLib.reactMod.DetailedHTMLProps[
        reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement], 
        stdLib.HTMLInputElement
      ], 
      _, 
      atStorybookThemingLib.distTypesMod.Theme
    ],
    Select: js.Any,
    Textarea: js.Any
  ): Anon_Button = {
    val __obj = js.Dynamic.literal(Button = Button, Field = Field, Input = Input, Select = Select, Textarea = Textarea)
  
    __obj.asInstanceOf[Anon_Button]
  }
}

