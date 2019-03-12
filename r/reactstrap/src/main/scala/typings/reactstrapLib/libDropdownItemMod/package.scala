package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDropdownItemMod {
  type DropdownItem[T] = reactLib.reactMod.Component[DropdownItemProps[T], js.Object, js.Any]
  type DropdownItemProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ActiveClassName with T
}
