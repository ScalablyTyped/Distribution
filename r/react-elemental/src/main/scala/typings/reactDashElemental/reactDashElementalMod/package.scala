package typings.reactDashElemental

import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.TextareaHTMLAttributes
import typings.reactDashElemental.Anon_AccentColor
import typings.reactDashElemental.Anon_Error
import typings.reactDashElemental.Anon_ErrorSecondary
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashElementalMod {
  type RadioGroupProps = HTMLAttributes[HTMLDivElement] with Anon_AccentColor
  type TextAreaProps = TextFieldProps with Anon_Error
  type TextFieldProps = TextareaHTMLAttributes[HTMLTextAreaElement] with InputHTMLAttributes[HTMLInputElement] with Anon_ErrorSecondary
}
