package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CalloutActionMenu")
@js.native
open class CalloutActionMenu protected ()
  extends StObject
     with typings.sharepoint.CalloutActionMenu {
  def this(actionsId: Any) = this()
  
  /* CompleteClass */
  override def addAction(action: typings.sharepoint.CalloutAction): Unit = js.native
  
  /* CompleteClass */
  override def calculateActionWidth(): Unit = js.native
  
  /* CompleteClass */
  override def getActions(): js.Array[typings.sharepoint.CalloutAction] = js.native
  
  /* CompleteClass */
  override def refreshActions(): Unit = js.native
  
  /* CompleteClass */
  override def render(): Unit = js.native
}
