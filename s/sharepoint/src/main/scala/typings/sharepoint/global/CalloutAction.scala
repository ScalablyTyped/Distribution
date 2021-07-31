package typings.sharepoint.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CalloutAction")
@js.native
class CalloutAction protected ()
  extends StObject
     with typings.sharepoint.CalloutAction {
  def this(options: typings.sharepoint.CalloutActionOptions) = this()
  
  /* CompleteClass */
  override def getDisabledToolTip(): String = js.native
  
  /* CompleteClass */
  override def getIsDisabledCallback(action: typings.sharepoint.CalloutAction): Boolean = js.native
  
  /* CompleteClass */
  override def getIsMenu(): Boolean = js.native
  
  /* CompleteClass */
  override def getIsVisibleCallback(action: typings.sharepoint.CalloutAction): Boolean = js.native
  
  /* CompleteClass */
  override def getMenuEntries(): js.Array[typings.sharepoint.CalloutActionMenuEntry] = js.native
  
  /* CompleteClass */
  override def getOnClickCallback(event: js.Any, action: typings.sharepoint.CalloutAction): js.Any = js.native
  
  /* CompleteClass */
  override def getText(): String = js.native
  
  /* CompleteClass */
  override def getToolTop(): String = js.native
  
  /* CompleteClass */
  override def isEnabled(): Boolean = js.native
  
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  
  /* CompleteClass */
  override def render(): Unit = js.native
  
  /* CompleteClass */
  override def set(options: typings.sharepoint.CalloutActionOptions): Unit = js.native
}
