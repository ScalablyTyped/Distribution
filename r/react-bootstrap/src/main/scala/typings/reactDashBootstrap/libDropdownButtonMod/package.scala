package typings.reactDashBootstrap

import typings.react.reactMod.HTMLProps
import typings.reactDashBootstrap.reactDashBootstrapMod.Omit
import typings.reactDashBootstrap.reactDashBootstrapStrings.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDropdownButtonMod {
  type DropdownButtonProps = DropdownButtonBaseProps with (Omit[HTMLProps[DropdownButton], title])
}
