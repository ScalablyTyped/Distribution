package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputMod {
  type Input[T] = reactLib.reactMod.Component[InputProps[T], js.Object, js.Any]
  type InputProps[T] = reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement] with reactstrapLib.Anon_Addon with T
  type InputType = reactstrapLib.reactstrapLibStrings.text | reactstrapLib.reactstrapLibStrings.email | reactstrapLib.reactstrapLibStrings.select | reactstrapLib.reactstrapLibStrings.file | reactstrapLib.reactstrapLibStrings.radio | reactstrapLib.reactstrapLibStrings.checkbox | reactstrapLib.reactstrapLibStrings.textarea | reactstrapLib.reactstrapLibStrings.button | reactstrapLib.reactstrapLibStrings.reset | reactstrapLib.reactstrapLibStrings.submit | reactstrapLib.reactstrapLibStrings.date | reactstrapLib.reactstrapLibStrings.`datetime-local` | reactstrapLib.reactstrapLibStrings.hidden | reactstrapLib.reactstrapLibStrings.image | reactstrapLib.reactstrapLibStrings.month | reactstrapLib.reactstrapLibStrings.number | reactstrapLib.reactstrapLibStrings.range | reactstrapLib.reactstrapLibStrings.search | reactstrapLib.reactstrapLibStrings.tel | reactstrapLib.reactstrapLibStrings.url | reactstrapLib.reactstrapLibStrings.week | reactstrapLib.reactstrapLibStrings.password | reactstrapLib.reactstrapLibStrings.datetime | reactstrapLib.reactstrapLibStrings.time | reactstrapLib.reactstrapLibStrings.color
}
