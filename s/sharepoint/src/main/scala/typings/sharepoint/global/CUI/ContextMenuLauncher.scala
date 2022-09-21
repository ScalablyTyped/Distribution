package typings.sharepoint.global.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CUI.ContextMenuLauncher")
@js.native
open class ContextMenuLauncher ()
  extends StObject
     with typings.sharepoint.CUI.MenuLauncher {
  
  /* CompleteClass */
  override def createComponentForDisplayMode(displayMode: String): Any = js.native
  
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  
  /* CompleteClass */
  override def get_enabled(): Boolean = js.native
  
  /* CompleteClass */
  override def get_id(): String = js.native
  
  /* CompleteClass */
  override def get_root(): typings.sharepoint.CUI.Root = js.native
  
  /* CompleteClass */
  override def set_enabled(enabled: Boolean): Boolean = js.native
}
