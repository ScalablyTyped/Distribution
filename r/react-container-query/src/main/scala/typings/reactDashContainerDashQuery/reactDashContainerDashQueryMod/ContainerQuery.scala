package typings.reactDashContainerDashQuery.reactDashContainerDashQueryMod

import typings.reactDashContainerDashQuery.libInterfacesMod.Props
import typings.reactDashContainerDashQuery.libInterfacesMod.Query
import typings.reactDashContainerDashQuery.libInterfacesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-container-query", "ContainerQuery")
@js.native
class ContainerQuery protected ()
  extends typings.react.reactMod.Component[Props, State, js.Any] {
  def this(props: Props) = this()
  var cqCore: js.Any = js.native
  def _startObserving(query: Query): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MContainerQuery(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MContainerQuery(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MContainerQuery(nextProps: Props): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MContainerQuery(): Unit = js.native
}

