package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNavbarMod {
  type Navbar[T] = reactLib.reactMod.Component[NavbarProps[T], js.Object, js.Any]
  type NavbarProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_CssModuleRole with T
}
