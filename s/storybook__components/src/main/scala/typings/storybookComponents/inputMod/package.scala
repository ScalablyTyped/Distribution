package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputMod {
  type InputProps = (typings.std.Omit[
    typings.react.mod.HTMLProps[typings.std.HTMLInputElement], 
    typings.storybookComponents.storybookComponentsStrings.size | typings.storybookComponents.storybookComponentsStrings.align | typings.storybookComponents.storybookComponentsStrings.valid
  ]) with typings.storybookComponents.inputMod.InputStyleProps
  type SelectProps = (typings.std.Omit[
    typings.react.mod.SelectHTMLAttributes[typings.std.HTMLSelectElement], 
    typings.storybookComponents.storybookComponentsStrings.size | typings.storybookComponents.storybookComponentsStrings.align | typings.storybookComponents.storybookComponentsStrings.valid
  ]) with typings.storybookComponents.inputMod.InputStyleProps
  type TextareaProps = (typings.std.Omit[
    typings.reactTextareaAutosize.mod.TextareaAutosizeProps, 
    typings.storybookComponents.storybookComponentsStrings.size | typings.storybookComponents.storybookComponentsStrings.align | typings.storybookComponents.storybookComponentsStrings.valid
  ]) with typings.storybookComponents.inputMod.InputStyleProps
}
