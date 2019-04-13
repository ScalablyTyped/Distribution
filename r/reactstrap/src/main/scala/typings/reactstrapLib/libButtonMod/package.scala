package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libButtonMod {
  type Button[T] = reactLib.reactMod.Component[ButtonProps[T], js.Object, js.Any]
  type ButtonProps[T] = reactLib.reactMod.ButtonHTMLAttributes[stdLib.HTMLButtonElement] with reactstrapLib.Anon_ActiveBlock with T
}
