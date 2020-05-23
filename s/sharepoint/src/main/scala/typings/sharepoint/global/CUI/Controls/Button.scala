package typings.sharepoint.global.CUI.Controls

import typings.sharepoint.CUI.ControlProperties
import typings.sharepoint.CUI.Root
import typings.std.Event
import typings.std.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Controls.Button")
@js.native
class Button protected ()
  extends typings.sharepoint.CUI.Controls.Button {
  def this(root: Root, id: String, properties: ControlProperties) = this()
  /* CompleteClass */
  override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
  /* CompleteClass */
  override def createComponentForDisplayModeInternal(displayMode: String): js.Any = js.native
  /* CompleteClass */
  override def createDOMElementForDisplayMode(displayMode: String): js.Any = js.native
  /* CompleteClass */
  override def deselect(): Unit = js.native
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def focusOnDisplayedComponent(): Unit = js.native
  /* CompleteClass */
  override def getCommandValueId(): String = js.native
  /* CompleteClass */
  override def getDropDownDOMElementForDisplayMode(displayMode: String): Unit = js.native
  /* CompleteClass */
  override def getLabel(): String = js.native
  /* CompleteClass */
  override def getMenuItemId(): String = js.native
  /* CompleteClass */
  override def getTextValue(): String = js.native
  /* CompleteClass */
  override def get_enabled(): Boolean = js.native
  /* CompleteClass */
  override def get_id(): String = js.native
  /* CompleteClass */
  override def get_root(): Root = js.native
  /* CompleteClass */
  override def handleMouseBlur(e: FocusEvent): js.Any = js.native
  /* CompleteClass */
  override def handleMouseFocus(e: FocusEvent): js.Any = js.native
  /* CompleteClass */
  override def handleTabBlur(e: FocusEvent): js.Any = js.native
  /* CompleteClass */
  override def handleTabFocus(e: FocusEvent): js.Any = js.native
  /* CompleteClass */
  override def onClick(e: Event): Unit = js.native
  /* CompleteClass */
  override def onEnabledChanged(enabled: Boolean): js.Any = js.native
  /* CompleteClass */
  override def onMenuClosed(): Unit = js.native
  /* CompleteClass */
  override def receiveFocus(): Unit = js.native
  /* CompleteClass */
  override def set_enabled(enabled: Boolean): Boolean = js.native
}

