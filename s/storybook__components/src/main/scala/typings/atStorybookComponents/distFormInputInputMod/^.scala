package typings.atStorybookComponents.distFormInputInputMod

import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typings.atStorybookComponents.Anon_DisplayName
import typings.atStorybookTheming.distTypesMod.Theme
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.RefAttributes
import typings.react.reactMod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/form/input/input", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Button: FunctionComponent[js.Any] = js.native
  val Input: (StyledComponent[
    (Pick[
      InputProps, 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 362 */ js.Any
    ]) with RefAttributes[_], 
    InputStyleProps, 
    Theme
  ]) with Anon_DisplayName = js.native
  val Select: (StyledComponent[
    (Pick[
      SelectHTMLAttributes[HTMLSelectElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 262 */ js.Any
    ]) with InputStyleProps with RefAttributes[_], 
    SelectProps, 
    Theme
  ]) with Anon_DisplayName = js.native
  val Textarea: (StyledComponent[
    (Pick[
      TextareaProps, 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 367 */ js.Any
    ]) with RefAttributes[_], 
    TextareaProps, 
    Theme
  ]) with Anon_DisplayName = js.native
}

