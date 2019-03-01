package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDropdownMod {
  type Dropdown[T] = reactLib.reactMod.Component[DropdownProps[T], js.Object, js.Any]
  type DropdownProps[T] = Props[T]
  type Props[T] = UncontrolledProps[T] with reactstrapLib.Anon_AddonType
  type UncontrolledDropdownProps[T] = UncontrolledProps[T]
  type UncontrolledProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassNameCssModuleInNavbar with T
}
