package typings.atStorybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distFormInputInputMod {
  import typings.atStorybookComponents.atStorybookComponentsStrings.align
  import typings.atStorybookComponents.atStorybookComponentsStrings.size
  import typings.atStorybookComponents.atStorybookComponentsStrings.valid
  import typings.react.reactMod.HTMLProps
  import typings.react.reactMod.SelectHTMLAttributes
  import typings.reactDashTextareaDashAutosize.reactDashTextareaDashAutosizeMod.TextareaAutosizeProps
  import typings.std.HTMLInputElement
  import typings.std.HTMLSelectElement
  import typings.std.Omit

  type InputProps = (Omit[HTMLProps[HTMLInputElement], size | align | valid]) with InputStyleProps
  type SelectProps = (Omit[SelectHTMLAttributes[HTMLSelectElement], size | align | valid]) with InputStyleProps
  type TextareaProps = (Omit[TextareaAutosizeProps, size | align | valid]) with InputStyleProps
}
