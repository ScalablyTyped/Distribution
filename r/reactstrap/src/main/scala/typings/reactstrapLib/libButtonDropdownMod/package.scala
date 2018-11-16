package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libButtonDropdownMod {
  type ButtonDropdown[T] = reactLib.reactMod.Component[ButtonDropdownProps[T], js.Object, js.Any]
  type ButtonDropdownProps[T] = reactstrapLib.libDropdownMod.DropdownProps[T]
  type UncontrolledButtonDropdownProps[T] = UncontrolledProps[T]
  type UncontrolledProps[T] = reactstrapLib.libDropdownMod.UncontrolledDropdownProps[T]
}
