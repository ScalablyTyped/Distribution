package typings.reactstrap

import typings.react.reactMod.Component
import typings.reactstrap.libButtonDropdownMod.ButtonDropdown
import typings.reactstrap.libDropdownMod.DropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reactstrap/lib/ButtonDropdown", JSImport.Namespace)
@js.native
object libButtonDropdownMod extends js.Object {
  @js.native
  class default[T] () extends ButtonDropdown[T]
  
  type ButtonDropdown[T] = Component[DropdownProps, js.Object, js.Any]
}

