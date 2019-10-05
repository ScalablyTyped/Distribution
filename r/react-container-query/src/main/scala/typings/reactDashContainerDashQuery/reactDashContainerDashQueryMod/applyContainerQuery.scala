package typings.reactDashContainerDashQuery.reactDashContainerDashQueryMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.reactDashContainerDashQuery.libInterfacesMod.Query
import typings.reactDashContainerDashQuery.libInterfacesMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-container-query", "applyContainerQuery")
@js.native
object applyContainerQuery extends js.Object {
  def apply[T](Component: Component[T with QueryProps], query: Query): ComponentClass[T, ComponentState] = js.native
  def apply[T](Component: Component[T with QueryProps], query: Query, initialSize: Size): ComponentClass[T, ComponentState] = js.native
}

