package typings
package reactDashBootstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNavDropdownMod {
  type NavDropdownProps = NavDropdownBaseProps with (reactDashBootstrapLib.reactDashBootstrapMod.Omit[
    reactLib.reactMod.HTMLProps[NavDropdown], 
    reactDashBootstrapLib.reactDashBootstrapLibStrings.title
  ])
}
