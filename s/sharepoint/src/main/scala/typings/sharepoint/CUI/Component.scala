package typings.sharepoint.CUI

import typings.microsoftAjax.Sys.IDisposable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component
  extends IMenuItem
     with IDisposable {
  var _lastHeightUpdate: Double
  var _lastLeftUpdate: Double
  var _lastTopUpdate: Double
  /* tslint:disable:variable-name */
  var _lastWidthUpdate: Double
  def addChild(child: Component): scala.Unit
  def addChildAtIndex(child: Component, index: Double): js.Any
  def appendChildrenToElement(elm: Element): scala.Unit
  def createChildArray(): scala.Unit
  def doDelayedInit(): scala.Unit
  def ensureCorrectChildType(): scala.Unit
  def ensureDOMElementAndEmpty(): scala.Unit
  def getChild(id: String): Component
  def getChildByTitle(title: String): Component
  def getTextValue(): String
  def get_cssClass(): String
  def get_description(): String
  def get_domElementTagName(): String
  def get_enabled(): Boolean
  def get_id(): String
  def get_needsDelayIniting(): Boolean
  def get_parent(): Component
  def get_root(): Component
  def get_title(): String
  def get_visible(): Boolean
  def get_visibleInDOM(): Boolean
  def initRootMember(root: Component): js.Any
  def onEnabledChanged(enabled: Boolean): js.Any
  def onMenuClosed(): scala.Unit
  def raiseCommandEvent(commandId: String, `type`: CommandType, properties: js.Any): js.Any
  def receiveFocus(): scala.Unit
  def removeChild(id: String): scala.Unit
  def removeChildren(): scala.Unit
  def set_description(description: String): String
  def set_enabled(value: Boolean): Boolean
  def set_id(id: String): scala.Unit
  def set_parent(value: Component): Component
  def set_title(title: String): String
  def set_visible(value: Boolean): Boolean
  def valueIsDirty(lastUpdate: Double): Boolean
}

object Component {
  @scala.inline
  def apply(
    _lastHeightUpdate: Double,
    _lastLeftUpdate: Double,
    _lastTopUpdate: Double,
    _lastWidthUpdate: Double,
    addChild: Component => scala.Unit,
    addChildAtIndex: (Component, Double) => js.Any,
    appendChildrenToElement: Element => scala.Unit,
    createChildArray: () => scala.Unit,
    dispose: () => scala.Unit,
    doDelayedInit: () => scala.Unit,
    ensureCorrectChildType: () => scala.Unit,
    ensureDOMElementAndEmpty: () => scala.Unit,
    getChild: String => Component,
    getChildByTitle: String => Component,
    getTextValue: () => String,
    get_cssClass: () => String,
    get_description: () => String,
    get_domElementTagName: () => String,
    get_enabled: () => Boolean,
    get_id: () => String,
    get_needsDelayIniting: () => Boolean,
    get_parent: () => Component,
    get_root: () => Component,
    get_title: () => String,
    get_visible: () => Boolean,
    get_visibleInDOM: () => Boolean,
    initRootMember: Component => js.Any,
    onEnabledChanged: Boolean => js.Any,
    onMenuClosed: () => scala.Unit,
    raiseCommandEvent: (String, CommandType, js.Any) => js.Any,
    receiveFocus: () => scala.Unit,
    removeChild: String => scala.Unit,
    removeChildren: () => scala.Unit,
    set_description: String => String,
    set_enabled: Boolean => Boolean,
    set_id: String => scala.Unit,
    set_parent: Component => Component,
    set_title: String => String,
    set_visible: Boolean => Boolean,
    valueIsDirty: Double => Boolean
  ): Component = {
    val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1(addChild), addChildAtIndex = js.Any.fromFunction2(addChildAtIndex), appendChildrenToElement = js.Any.fromFunction1(appendChildrenToElement), createChildArray = js.Any.fromFunction0(createChildArray), dispose = js.Any.fromFunction0(dispose), doDelayedInit = js.Any.fromFunction0(doDelayedInit), ensureCorrectChildType = js.Any.fromFunction0(ensureCorrectChildType), ensureDOMElementAndEmpty = js.Any.fromFunction0(ensureDOMElementAndEmpty), getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = js.Any.fromFunction0(getTextValue), get_cssClass = js.Any.fromFunction0(get_cssClass), get_description = js.Any.fromFunction0(get_description), get_domElementTagName = js.Any.fromFunction0(get_domElementTagName), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_needsDelayIniting = js.Any.fromFunction0(get_needsDelayIniting), get_parent = js.Any.fromFunction0(get_parent), get_root = js.Any.fromFunction0(get_root), get_title = js.Any.fromFunction0(get_title), get_visible = js.Any.fromFunction0(get_visible), get_visibleInDOM = js.Any.fromFunction0(get_visibleInDOM), initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = js.Any.fromFunction0(onMenuClosed), raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = js.Any.fromFunction0(receiveFocus), removeChild = js.Any.fromFunction1(removeChild), removeChildren = js.Any.fromFunction0(removeChildren), set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1(set_id), set_parent = js.Any.fromFunction1(set_parent), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
    __obj.asInstanceOf[Component]
  }
}

