package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libModalBodyMod {
  type ModalBody[T] = reactLib.reactMod.Component[ModalBodyProps[T], js.Object, js.Any]
  type ModalBodyProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassName with T
}
