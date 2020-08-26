package typings.reactstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tooltipMod {
  type Tooltip[T] = typings.react.mod.Component[typings.reactstrap.tooltipMod.TooltipProps, js.Object, js.Any]
  type TooltipChildren = (js.Function1[
    /* props */ typings.reactstrap.tooltipMod.TooltipChildrenRenderProps, 
    typings.react.mod.ReactNode
  ]) | typings.react.mod.ReactNode
}
