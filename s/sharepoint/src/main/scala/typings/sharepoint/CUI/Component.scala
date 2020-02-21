package typings.sharepoint.CUI

import typings.microsoftAjax.Sys.IDisposable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Component")
@js.native
class Component protected ()
  extends IMenuItem
     with IDisposable {
  /* tslint:enable:variable-name */
  def this(root: Component, id: String, title: String, description: String) = this()
  var _lastHeightUpdate: Double = js.native
  var _lastLeftUpdate: Double = js.native
  var _lastTopUpdate: Double = js.native
  /* tslint:disable:variable-name */
  var _lastWidthUpdate: Double = js.native
  def addChild(child: Component): scala.Unit = js.native
  def addChildAtIndex(child: Component, index: Double): js.Any = js.native
  def appendChildrenToElement(elm: Element): scala.Unit = js.native
  def createChildArray(): scala.Unit = js.native
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def doDelayedInit(): scala.Unit = js.native
  def ensureCorrectChildType(): scala.Unit = js.native
  def ensureDOMElementAndEmpty(): scala.Unit = js.native
  def getChild(id: String): Component = js.native
  def getChildByTitle(title: String): Component = js.native
  def getTextValue(): String = js.native
  def get_cssClass(): String = js.native
  def get_description(): String = js.native
  def get_domElementTagName(): String = js.native
  def get_enabled(): Boolean = js.native
  def get_id(): String = js.native
  def get_needsDelayIniting(): Boolean = js.native
  def get_parent(): Component = js.native
  def get_root(): Component = js.native
  def get_title(): String = js.native
  def get_visible(): Boolean = js.native
  def get_visibleInDOM(): Boolean = js.native
  def initRootMember(root: Component): js.Any = js.native
  def onEnabledChanged(enabled: Boolean): js.Any = js.native
  def onMenuClosed(): scala.Unit = js.native
  def raiseCommandEvent(commandId: String, `type`: CommandType, properties: js.Any): js.Any = js.native
  def receiveFocus(): scala.Unit = js.native
  def removeChild(id: String): scala.Unit = js.native
  def removeChildren(): scala.Unit = js.native
  def set_description(description: String): String = js.native
  def set_enabled(value: Boolean): Boolean = js.native
  def set_id(id: String): scala.Unit = js.native
  def set_parent(value: Component): Component = js.native
  def set_title(title: String): String = js.native
  def set_visible(value: Boolean): Boolean = js.native
  def valueIsDirty(lastUpdate: Double): Boolean = js.native
}

