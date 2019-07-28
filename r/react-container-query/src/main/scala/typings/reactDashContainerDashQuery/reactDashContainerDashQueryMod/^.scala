package typings.reactDashContainerDashQuery.reactDashContainerDashQueryMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.reactDashContainerDashQuery.libInterfacesMod.Query
import typings.reactDashContainerDashQuery.libInterfacesMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-container-query", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyContainerQuery[T](Component: Component[T with QueryProps], query: Query): ComponentClass[T, ComponentState] = js.native
  def applyContainerQuery[T](Component: Component[T with QueryProps], query: Query, initialSize: Size): ComponentClass[T, ComponentState] = js.native
}

