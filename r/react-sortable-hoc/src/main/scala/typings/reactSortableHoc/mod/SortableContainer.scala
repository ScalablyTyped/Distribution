package typings.reactSortableHoc.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sortable-hoc", "SortableContainer")
@js.native
object SortableContainer extends js.Object {
  
  def apply[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P with SortableContainerProps, ComponentState] = js.native
  def apply[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P with SortableContainerProps, ComponentState] = js.native
}
