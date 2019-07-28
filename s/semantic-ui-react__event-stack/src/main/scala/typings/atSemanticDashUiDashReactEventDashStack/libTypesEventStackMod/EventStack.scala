package typings.atSemanticDashUiDashReactEventDashStack.libTypesEventStackMod

import typings.react.reactMod.PureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventStack
  extends PureComponent[EventStackProps, js.Object, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MEventStack(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MEventStack(prevProps: EventStackProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MEventStack(): Unit = js.native
  def subscribe(props: EventStackProps): Unit = js.native
  def unsubscribe(props: EventStackProps): Unit = js.native
}

