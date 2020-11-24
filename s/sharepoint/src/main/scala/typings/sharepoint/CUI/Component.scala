package typings.sharepoint.CUI

import typings.microsoftAjax.Sys.IDisposable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component
  extends IMenuItem
     with IDisposable {
  
  var _lastHeightUpdate: Double = js.native
  
  var _lastLeftUpdate: Double = js.native
  
  var _lastTopUpdate: Double = js.native
  
  var _lastWidthUpdate: Double = js.native
  
  def addChild(child: Component): scala.Unit = js.native
  
  def addChildAtIndex(child: Component, index: Double): js.Any = js.native
  
  def appendChildrenToElement(elm: Element): scala.Unit = js.native
  
  def createChildArray(): scala.Unit = js.native
  
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
  
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_lastHeightUpdate(value: Double): Self = this.set("_lastHeightUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastLeftUpdate(value: Double): Self = this.set("_lastLeftUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastTopUpdate(value: Double): Self = this.set("_lastTopUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastWidthUpdate(value: Double): Self = this.set("_lastWidthUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddChild(value: Component => scala.Unit): Self = this.set("addChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddChildAtIndex(value: (Component, Double) => js.Any): Self = this.set("addChildAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppendChildrenToElement(value: Element => scala.Unit): Self = this.set("appendChildrenToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateChildArray(value: () => scala.Unit): Self = this.set("createChildArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoDelayedInit(value: () => scala.Unit): Self = this.set("doDelayedInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnsureCorrectChildType(value: () => scala.Unit): Self = this.set("ensureCorrectChildType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnsureDOMElementAndEmpty(value: () => scala.Unit): Self = this.set("ensureDOMElementAndEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChild(value: String => Component): Self = this.set("getChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildByTitle(value: String => Component): Self = this.set("getChildByTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTextValue(value: () => String): Self = this.set("getTextValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_cssClass(value: () => String): Self = this.set("get_cssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_description(value: () => String): Self = this.set("get_description", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_domElementTagName(value: () => String): Self = this.set("get_domElementTagName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_enabled(value: () => Boolean): Self = this.set("get_enabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_id(value: () => String): Self = this.set("get_id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_needsDelayIniting(value: () => Boolean): Self = this.set("get_needsDelayIniting", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_parent(value: () => Component): Self = this.set("get_parent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_root(value: () => Component): Self = this.set("get_root", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_title(value: () => String): Self = this.set("get_title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_visible(value: () => Boolean): Self = this.set("get_visible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_visibleInDOM(value: () => Boolean): Self = this.set("get_visibleInDOM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitRootMember(value: Component => js.Any): Self = this.set("initRootMember", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEnabledChanged(value: Boolean => js.Any): Self = this.set("onEnabledChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMenuClosed(value: () => scala.Unit): Self = this.set("onMenuClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRaiseCommandEvent(value: (String, CommandType, js.Any) => js.Any): Self = this.set("raiseCommandEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReceiveFocus(value: () => scala.Unit): Self = this.set("receiveFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveChild(value: String => scala.Unit): Self = this.set("removeChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveChildren(value: () => scala.Unit): Self = this.set("removeChildren", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_description(value: String => String): Self = this.set("set_description", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_enabled(value: Boolean => Boolean): Self = this.set("set_enabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_id(value: String => scala.Unit): Self = this.set("set_id", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_parent(value: Component => Component): Self = this.set("set_parent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_title(value: String => String): Self = this.set("set_title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_visible(value: Boolean => Boolean): Self = this.set("set_visible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueIsDirty(value: Double => Boolean): Self = this.set("valueIsDirty", js.Any.fromFunction1(value))
  }
}
