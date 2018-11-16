package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNavItemMod {
  type NavItem[T] = reactLib.reactMod.Component[NavItemProps[T], js.Object, js.Any]
  type NavItemProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassNameActive with T
}
