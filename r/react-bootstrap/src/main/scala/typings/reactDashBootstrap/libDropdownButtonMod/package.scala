package typings.reactDashBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDropdownButtonMod {
  import typings.react.reactMod.HTMLProps
  import typings.reactDashBootstrap.reactDashBootstrapMod.Omit
  import typings.reactDashBootstrap.reactDashBootstrapStrings.title

  type DropdownButtonProps = DropdownButtonBaseProps with (Omit[HTMLProps[DropdownButton], title])
}
