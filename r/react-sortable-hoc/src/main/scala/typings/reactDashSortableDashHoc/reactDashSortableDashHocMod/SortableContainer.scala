package typings.reactDashSortableDashHoc.reactDashSortableDashHocMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-hoc", "SortableContainer")
@js.native
object SortableContainer extends js.Object {
  def apply[P](wrappedComponent: ComponentType[P]): ComponentClass[P with SortableContainerProps, ComponentState] = js.native
  def apply[P](wrappedComponent: ComponentType[P], config: Config): ComponentClass[P with SortableContainerProps, ComponentState] = js.native
}

