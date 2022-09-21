package typings.sharepoint.global.SP.Ribbon

import typings.sharepoint.CUI.Page.PageComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Ribbon.WebPartPageComponent")
@js.native
open class WebPartPageComponent ()
  extends StObject
     with PageComponent {
  
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  
  /* CompleteClass */
  override def getFocusedCommands(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getGlobalCommands(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getId(): String = js.native
  
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: Any, sequenceNumber: Double): Boolean = js.native
  
  /* CompleteClass */
  override def init(): Unit = js.native
  
  /* CompleteClass */
  override def isFocusable(): Boolean = js.native
  
  /* CompleteClass */
  override def receiveFocus(): Boolean = js.native
  
  /* CompleteClass */
  override def yieldFocus(): Boolean = js.native
}
