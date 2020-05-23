package typings.sharepoint.global.CUI.Controls

import typings.sharepoint.CUI.Control
import typings.sharepoint.CUI.ControlProperties
import typings.sharepoint.CUI.IModalController
import typings.sharepoint.CUI.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Controls.DropDown")
@js.native
class DropDown protected ()
  extends Control
     with IModalController {
  def this(root: Root, id: String, properties: ControlProperties, menu: js.Any) = this()
  /* CompleteClass */
  override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def get_enabled(): Boolean = js.native
  /* CompleteClass */
  override def get_id(): String = js.native
  /* CompleteClass */
  override def get_root(): Root = js.native
  /* CompleteClass */
  override def set_enabled(enabled: Boolean): Boolean = js.native
}

