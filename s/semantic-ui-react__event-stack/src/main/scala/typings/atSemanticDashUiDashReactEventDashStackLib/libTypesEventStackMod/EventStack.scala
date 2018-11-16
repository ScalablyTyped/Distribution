package typings
package atSemanticDashUiDashReactEventDashStackLib.libTypesEventStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventStack
  extends reactLib.reactMod.PureComponent[EventStackProps, js.Object, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MEventStack(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MEventStack(prevProps: EventStackProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MEventStack(): scala.Unit = js.native
  def subscribe(props: stdLib.Readonly[EventStackProps]): scala.Unit = js.native
  def unsubscribe(props: stdLib.Readonly[EventStackProps]): scala.Unit = js.native
}

