package typings.reactstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popoverMod {
  type Popover[T] = typings.react.mod.Component[typings.reactstrap.popoverMod.PopoverProps, js.Object, js.Any]
  type PopoverChildren = (js.Function1[
    /* props */ typings.reactstrap.popoverMod.PopoverChildrenRenderProps, 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
}
