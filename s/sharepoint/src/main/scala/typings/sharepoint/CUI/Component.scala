package typings.sharepoint.CUI

import typings.microsoftAjax.Sys.IDisposable
import typings.std.Element
import org.scalablytyped.runtime.StObject
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
  implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddChild(value: Component => scala.Unit): Self = StObject.set(x, "addChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddChildAtIndex(value: (Component, Double) => js.Any): Self = StObject.set(x, "addChildAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppendChildrenToElement(value: Element => scala.Unit): Self = StObject.set(x, "appendChildrenToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateChildArray(value: () => scala.Unit): Self = StObject.set(x, "createChildArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoDelayedInit(value: () => scala.Unit): Self = StObject.set(x, "doDelayedInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnsureCorrectChildType(value: () => scala.Unit): Self = StObject.set(x, "ensureCorrectChildType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnsureDOMElementAndEmpty(value: () => scala.Unit): Self = StObject.set(x, "ensureDOMElementAndEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChild(value: String => Component): Self = StObject.set(x, "getChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildByTitle(value: String => Component): Self = StObject.set(x, "getChildByTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTextValue(value: () => String): Self = StObject.set(x, "getTextValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_cssClass(value: () => String): Self = StObject.set(x, "get_cssClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_description(value: () => String): Self = StObject.set(x, "get_description", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_domElementTagName(value: () => String): Self = StObject.set(x, "get_domElementTagName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_enabled(value: () => Boolean): Self = StObject.set(x, "get_enabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_id(value: () => String): Self = StObject.set(x, "get_id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_needsDelayIniting(value: () => Boolean): Self = StObject.set(x, "get_needsDelayIniting", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_parent(value: () => Component): Self = StObject.set(x, "get_parent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_root(value: () => Component): Self = StObject.set(x, "get_root", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_title(value: () => String): Self = StObject.set(x, "get_title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_visible(value: () => Boolean): Self = StObject.set(x, "get_visible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_visibleInDOM(value: () => Boolean): Self = StObject.set(x, "get_visibleInDOM", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitRootMember(value: Component => js.Any): Self = StObject.set(x, "initRootMember", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEnabledChanged(value: Boolean => js.Any): Self = StObject.set(x, "onEnabledChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMenuClosed(value: () => scala.Unit): Self = StObject.set(x, "onMenuClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRaiseCommandEvent(value: (String, CommandType, js.Any) => js.Any): Self = StObject.set(x, "raiseCommandEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReceiveFocus(value: () => scala.Unit): Self = StObject.set(x, "receiveFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveChild(value: String => scala.Unit): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveChildren(value: () => scala.Unit): Self = StObject.set(x, "removeChildren", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_description(value: String => String): Self = StObject.set(x, "set_description", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_enabled(value: Boolean => Boolean): Self = StObject.set(x, "set_enabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_id(value: String => scala.Unit): Self = StObject.set(x, "set_id", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_parent(value: Component => Component): Self = StObject.set(x, "set_parent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_title(value: String => String): Self = StObject.set(x, "set_title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_visible(value: Boolean => Boolean): Self = StObject.set(x, "set_visible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueIsDirty(value: Double => Boolean): Self = StObject.set(x, "valueIsDirty", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_lastHeightUpdate(value: Double): Self = StObject.set(x, "_lastHeightUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastLeftUpdate(value: Double): Self = StObject.set(x, "_lastLeftUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastTopUpdate(value: Double): Self = StObject.set(x, "_lastTopUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastWidthUpdate(value: Double): Self = StObject.set(x, "_lastWidthUpdate", value.asInstanceOf[js.Any])
  }
}
