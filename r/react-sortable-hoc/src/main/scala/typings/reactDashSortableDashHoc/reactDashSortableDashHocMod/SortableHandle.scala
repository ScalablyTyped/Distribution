package typings.reactDashSortableDashHoc.reactDashSortableDashHocMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-hoc", "SortableHandle")
@js.native
object SortableHandle extends js.Object {
  def apply[P](wrappedComponent: ComponentType[P]): ComponentClass[P, ComponentState] = js.native
  def apply[P](wrappedComponent: ComponentType[P], config: Config): ComponentClass[P, ComponentState] = js.native
}

