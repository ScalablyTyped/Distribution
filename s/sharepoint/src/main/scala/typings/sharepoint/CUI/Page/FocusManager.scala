package typings.sharepoint.CUI.Page

import typings.sharepoint.CUI.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Page.FocusManager")
@js.native
class FocusManager ()
  extends CommandDispatcher
     with ICommandHandler {
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  def getFocusedComponents(): js.Array[Component] = js.native
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
  def releaseAllFoci(): Boolean = js.native
  def releaseFocusFromComponent(component: Component): js.Any = js.native
  def requestFocusForComponent(component: Component): js.Any = js.native
}

