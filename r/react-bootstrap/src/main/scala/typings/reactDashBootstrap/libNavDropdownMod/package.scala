package typings.reactDashBootstrap

import typings.react.reactMod.HTMLProps
import typings.reactDashBootstrap.reactDashBootstrapMod.Omit
import typings.reactDashBootstrap.reactDashBootstrapStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNavDropdownMod {
  type NavDropdownProps = NavDropdownBaseProps with (Omit[HTMLProps[NavDropdown], title])
}
