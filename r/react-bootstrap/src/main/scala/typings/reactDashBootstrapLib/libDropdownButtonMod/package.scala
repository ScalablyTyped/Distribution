package typings
package reactDashBootstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDropdownButtonMod {
  type DropdownButtonProps = DropdownButtonBaseProps with (reactDashBootstrapLib.reactDashBootstrapMod.Omit[
    reactLib.reactMod.HTMLProps[DropdownButton], 
    reactDashBootstrapLib.reactDashBootstrapLibStrings.title
  ])
}
