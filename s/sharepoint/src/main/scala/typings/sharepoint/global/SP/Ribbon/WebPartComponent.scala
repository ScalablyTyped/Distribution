package typings.sharepoint.global.SP.Ribbon

import typings.sharepoint.SP.Ribbon.WebPartComponentInitInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Ribbon.WebPartComponent")
@js.native
class WebPartComponent ()
  extends StObject
     with typings.sharepoint.SP.Ribbon.WebPartComponent {
  
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
  override def receiveFocus(): Boolean = js.native
  
  /* CompleteClass */
  override def selectWebPart(zc: HTMLElement, setNextRibbonTab: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def yieldFocus(): Boolean = js.native
}
object WebPartComponent {
  
  @JSGlobal("SP.Ribbon.WebPartComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getInstance(): typings.sharepoint.SP.Ribbon.WebPartComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("get_instance")().asInstanceOf[typings.sharepoint.SP.Ribbon.WebPartComponent]
  
  /* static member */
  @scala.inline
  def registerWithPageManager(initInfo: WebPartComponentInitInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerWithPageManager")(initInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
