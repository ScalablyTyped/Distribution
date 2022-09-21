package typings.sharepoint.CUI

import typings.microsoftAjax.Sys.IDisposable
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component
  extends StObject
     with IMenuItem
     with IDisposable {
  
  var _lastHeightUpdate: Double
  
  var _lastLeftUpdate: Double
  
  var _lastTopUpdate: Double
  
  var _lastWidthUpdate: Double
  
  def addChild(child: Component): scala.Unit
  
  def addChildAtIndex(child: Component, index: Double): Any
  
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
  
  def initRootMember(root: Component): Any
  
  def onEnabledChanged(enabled: Boolean): Any
  
  def onMenuClosed(): scala.Unit
  
  def raiseCommandEvent(commandId: String, `type`: CommandType, properties: Any): Any
  
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
  
  inline def apply(
    _lastHeightUpdate: Double,
    _lastLeftUpdate: Double,
    _lastTopUpdate: Double,
    _lastWidthUpdate: Double,
    addChild: Component => scala.Unit,
    addChildAtIndex: (Component, Double) => Any,
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
    initRootMember: Component => Any,
    onEnabledChanged: Boolean => Any,
    onMenuClosed: () => scala.Unit,
    raiseCommandEvent: (String, CommandType, Any) => Any,
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
  
  extension [Self <: Component](x: Self) {
    
    inline def setAddChild(value: Component => scala.Unit): Self = StObject.set(x, "addChild", js.Any.fromFunction1(value))
    
    inline def setAddChildAtIndex(value: (Component, Double) => Any): Self = StObject.set(x, "addChildAtIndex", js.Any.fromFunction2(value))
    
    inline def setAppendChildrenToElement(value: Element => scala.Unit): Self = StObject.set(x, "appendChildrenToElement", js.Any.fromFunction1(value))
    
    inline def setCreateChildArray(value: () => scala.Unit): Self = StObject.set(x, "createChildArray", js.Any.fromFunction0(value))
    
    inline def setDoDelayedInit(value: () => scala.Unit): Self = StObject.set(x, "doDelayedInit", js.Any.fromFunction0(value))
    
    inline def setEnsureCorrectChildType(value: () => scala.Unit): Self = StObject.set(x, "ensureCorrectChildType", js.Any.fromFunction0(value))
    
    inline def setEnsureDOMElementAndEmpty(value: () => scala.Unit): Self = StObject.set(x, "ensureDOMElementAndEmpty", js.Any.fromFunction0(value))
    
    inline def setGetChild(value: String => Component): Self = StObject.set(x, "getChild", js.Any.fromFunction1(value))
    
    inline def setGetChildByTitle(value: String => Component): Self = StObject.set(x, "getChildByTitle", js.Any.fromFunction1(value))
    
    inline def setGetTextValue(value: () => String): Self = StObject.set(x, "getTextValue", js.Any.fromFunction0(value))
    
    inline def setGet_cssClass(value: () => String): Self = StObject.set(x, "get_cssClass", js.Any.fromFunction0(value))
    
    inline def setGet_description(value: () => String): Self = StObject.set(x, "get_description", js.Any.fromFunction0(value))
    
    inline def setGet_domElementTagName(value: () => String): Self = StObject.set(x, "get_domElementTagName", js.Any.fromFunction0(value))
    
    inline def setGet_enabled(value: () => Boolean): Self = StObject.set(x, "get_enabled", js.Any.fromFunction0(value))
    
    inline def setGet_id(value: () => String): Self = StObject.set(x, "get_id", js.Any.fromFunction0(value))
    
    inline def setGet_needsDelayIniting(value: () => Boolean): Self = StObject.set(x, "get_needsDelayIniting", js.Any.fromFunction0(value))
    
    inline def setGet_parent(value: () => Component): Self = StObject.set(x, "get_parent", js.Any.fromFunction0(value))
    
    inline def setGet_root(value: () => Component): Self = StObject.set(x, "get_root", js.Any.fromFunction0(value))
    
    inline def setGet_title(value: () => String): Self = StObject.set(x, "get_title", js.Any.fromFunction0(value))
    
    inline def setGet_visible(value: () => Boolean): Self = StObject.set(x, "get_visible", js.Any.fromFunction0(value))
    
    inline def setGet_visibleInDOM(value: () => Boolean): Self = StObject.set(x, "get_visibleInDOM", js.Any.fromFunction0(value))
    
    inline def setInitRootMember(value: Component => Any): Self = StObject.set(x, "initRootMember", js.Any.fromFunction1(value))
    
    inline def setOnEnabledChanged(value: Boolean => Any): Self = StObject.set(x, "onEnabledChanged", js.Any.fromFunction1(value))
    
    inline def setOnMenuClosed(value: () => scala.Unit): Self = StObject.set(x, "onMenuClosed", js.Any.fromFunction0(value))
    
    inline def setRaiseCommandEvent(value: (String, CommandType, Any) => Any): Self = StObject.set(x, "raiseCommandEvent", js.Any.fromFunction3(value))
    
    inline def setReceiveFocus(value: () => scala.Unit): Self = StObject.set(x, "receiveFocus", js.Any.fromFunction0(value))
    
    inline def setRemoveChild(value: String => scala.Unit): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    inline def setRemoveChildren(value: () => scala.Unit): Self = StObject.set(x, "removeChildren", js.Any.fromFunction0(value))
    
    inline def setSet_description(value: String => String): Self = StObject.set(x, "set_description", js.Any.fromFunction1(value))
    
    inline def setSet_enabled(value: Boolean => Boolean): Self = StObject.set(x, "set_enabled", js.Any.fromFunction1(value))
    
    inline def setSet_id(value: String => scala.Unit): Self = StObject.set(x, "set_id", js.Any.fromFunction1(value))
    
    inline def setSet_parent(value: Component => Component): Self = StObject.set(x, "set_parent", js.Any.fromFunction1(value))
    
    inline def setSet_title(value: String => String): Self = StObject.set(x, "set_title", js.Any.fromFunction1(value))
    
    inline def setSet_visible(value: Boolean => Boolean): Self = StObject.set(x, "set_visible", js.Any.fromFunction1(value))
    
    inline def setValueIsDirty(value: Double => Boolean): Self = StObject.set(x, "valueIsDirty", js.Any.fromFunction1(value))
    
    inline def set_lastHeightUpdate(value: Double): Self = StObject.set(x, "_lastHeightUpdate", value.asInstanceOf[js.Any])
    
    inline def set_lastLeftUpdate(value: Double): Self = StObject.set(x, "_lastLeftUpdate", value.asInstanceOf[js.Any])
    
    inline def set_lastTopUpdate(value: Double): Self = StObject.set(x, "_lastTopUpdate", value.asInstanceOf[js.Any])
    
    inline def set_lastWidthUpdate(value: Double): Self = StObject.set(x, "_lastWidthUpdate", value.asInstanceOf[js.Any])
  }
}
