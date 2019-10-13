package typings.reactDashSortableDashHoc.reactDashSortableDashHocMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-hoc", "SortableElement")
@js.native
object SortableElement extends js.Object {
  def apply[P](wrappedComponent: ComponentType[P]): ComponentClass[P with SortableElementProps, ComponentState] = js.native
  def apply[P](wrappedComponent: ComponentType[P], config: Config): ComponentClass[P with SortableElementProps, ComponentState] = js.native
}

