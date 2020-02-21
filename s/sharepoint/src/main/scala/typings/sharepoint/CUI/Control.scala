package typings.sharepoint.CUI

import typings.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Control")
@js.native
class Control protected ()
  extends IDisposable
     with IMenuItem {
  def this(root: Root, id: String, properties: ControlProperties) = this()
  def createComponentForDisplayMode(displayMode: String): js.Any = js.native
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def get_enabled(): Boolean = js.native
  def get_id(): String = js.native
  def get_root(): Root = js.native
  def set_enabled(enabled: Boolean): Boolean = js.native
}

