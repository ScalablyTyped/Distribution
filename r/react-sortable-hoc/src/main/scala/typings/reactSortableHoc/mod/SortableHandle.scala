package typings.reactSortableHoc.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sortable-hoc", "SortableHandle")
@js.native
object SortableHandle extends js.Object {
  
  def apply[P](wrappedComponent: WrappedComponent[P]): ComponentClass[P, ComponentState] = js.native
  def apply[P](wrappedComponent: WrappedComponent[P], config: Config): ComponentClass[P, ComponentState] = js.native
}
