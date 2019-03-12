package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputMod {
  type Input[T] = reactLib.reactMod.Component[InputProps[T], js.Object, js.Any]
  type InputProps[T] = reactLib.reactMod.ReactNs.InputHTMLAttributes[stdLib.HTMLInputElement] with reactstrapLib.Anon_Addon with T
}
