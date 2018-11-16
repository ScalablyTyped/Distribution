package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libModalMod {
  type Modal[T] = reactLib.reactMod.Component[ModalProps[T], js.Object, js.Any]
  type ModalProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ContentClassName with T
}
