package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libModalHeaderMod {
  type ModalHeader[T] = reactLib.reactMod.Component[ModalHeaderProps[T], js.Object, js.Any]
  type ModalHeaderProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModuleTagToggle with T
}
