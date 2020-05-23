package typings.sharepoint.global.SP.Ribbon

import typings.sharepoint.SP.Application.UI.DefaultFormsInformation
import typings.sharepoint.SP.Application.UI.ViewSelectorGroups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Ribbon.GroupBoardWebPartPageComponent")
@js.native
class GroupBoardWebPartPageComponent ()
  extends typings.sharepoint.SP.Ribbon.ListViewWebPartPageComponent {
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  /* CompleteClass */
  override def getFocusedCommands(): js.Array[String] = js.native
  /* CompleteClass */
  override def getGlobalCommands(): js.Array[String] = js.native
  /* CompleteClass */
  override def getId(): String = js.native
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
  /* CompleteClass */
  override def init(): Unit = js.native
  /* CompleteClass */
  override def isFocusable(): Boolean = js.native
  /* CompleteClass */
  override def onDefaultFormsInformationRetrieveFailure(): Unit = js.native
  /* CompleteClass */
  override def onDefaultFormsInformationRetrieveSuccess(defaultForms: DefaultFormsInformation): Unit = js.native
  /* CompleteClass */
  override def onViewInformationReturned(viewGroups: ViewSelectorGroups): Unit = js.native
  /* CompleteClass */
  override def receiveFocus(): Boolean = js.native
  /* CompleteClass */
  override def yieldFocus(): Boolean = js.native
}

