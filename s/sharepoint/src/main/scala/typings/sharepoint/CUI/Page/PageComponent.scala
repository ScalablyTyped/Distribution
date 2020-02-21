package typings.sharepoint.CUI.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Page.PageComponent")
@js.native
class PageComponent () extends ICommandHandler {
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  def getFocusedCommands(): js.Array[String] = js.native
  def getGlobalCommands(): js.Array[String] = js.native
  def getId(): String = js.native
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
  def init(): Unit = js.native
  def isFocusable(): Boolean = js.native
  def receiveFocus(): Boolean = js.native
  def yieldFocus(): Boolean = js.native
}

