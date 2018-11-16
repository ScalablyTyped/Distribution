package typings
package reactDashBootstrapLib.libNavDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NavDropdownNs {
  type NavDropdownProps = NavDropdownBaseProps with (reactDashBootstrapLib.reactDashBootstrapMod.Omit[
    reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libNavDropdownMod.NavDropdown], 
    reactDashBootstrapLib.reactDashBootstrapLibStrings.title
  ])
}
