package typings.reactDashSortableDashHoc.reactDashSortableDashHocMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-hoc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def SortableContainer[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P with SortableContainerProps, ComponentState] = js.native
  def SortableContainer[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P with SortableContainerProps, ComponentState] = js.native
  def SortableElement[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P with SortableElementProps, ComponentState] = js.native
  def SortableElement[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P with SortableElementProps, ComponentState] = js.native
  def SortableHandle[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P, ComponentState] = js.native
  def SortableHandle[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P, ComponentState] = js.native
  def arrayMove[T](collection: js.Array[T], previousIndex: Double, newIndex: Double): js.Array[T] = js.native
}

