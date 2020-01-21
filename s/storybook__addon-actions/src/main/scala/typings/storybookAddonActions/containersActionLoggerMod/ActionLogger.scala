package typings.storybookAddonActions.containersActionLoggerMod

import typings.react.mod.Component
import typings.storybookAddonActions.actionDisplayMod.ActionDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionLogger
  extends Component[ActionLoggerProps, ActionLoggerState, js.Any] {
  var mounted: js.Any = js.native
  def addAction(action: ActionDisplay): Unit = js.native
  def clearActions(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MActionLogger(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MActionLogger(): Unit = js.native
  def handleStoryChange(): Unit = js.native
}

