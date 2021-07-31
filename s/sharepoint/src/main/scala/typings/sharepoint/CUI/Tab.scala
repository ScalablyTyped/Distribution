package typings.sharepoint.CUI

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab
  extends StObject
     with RibbonComponent {
  
  def get_command(): String
  
  def get_contextual(): Boolean
  
  def get_contextualGroupId(): String
  
  def get_currentScalingIndex(): Double
  
  def get_scaling(): String
  
  def get_selected(): Boolean
  
  def scaleDown(): scala.Unit
  
  def scaleMax(): scala.Unit
  
  def scaleUp(): scala.Unit
  
  def set_selected(isSelected: Boolean): scala.Unit
}
object Tab {
  
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
    get_command: () => String,
    get_contextual: () => Boolean,
    get_contextualGroupId: () => String,
    get_cssClass: () => String,
    get_currentScalingIndex: () => Double,
    get_description: () => String,
    get_domElementTagName: () => String,
    get_enabled: () => Boolean,
    get_id: () => String,
    get_needsDelayIniting: () => Boolean,
    get_parent: () => Component,
    get_ribbon: () => Ribbon,
    get_root: () => Component,
    get_scaling: () => String,
    get_selected: () => Boolean,
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
    scaleDown: () => scala.Unit,
    scaleMax: () => scala.Unit,
    scaleUp: () => scala.Unit,
    set_description: String => String,
    set_enabled: Boolean => Boolean,
    set_id: String => scala.Unit,
    set_parent: Component => Component,
    set_selected: Boolean => scala.Unit,
    set_title: String => String,
    set_visible: Boolean => Boolean,
    valueIsDirty: Double => Boolean
  ): Tab = {
    val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1(addChild), addChildAtIndex = js.Any.fromFunction2(addChildAtIndex), appendChildrenToElement = js.Any.fromFunction1(appendChildrenToElement), createChildArray = js.Any.fromFunction0(createChildArray), dispose = js.Any.fromFunction0(dispose), doDelayedInit = js.Any.fromFunction0(doDelayedInit), ensureCorrectChildType = js.Any.fromFunction0(ensureCorrectChildType), ensureDOMElementAndEmpty = js.Any.fromFunction0(ensureDOMElementAndEmpty), getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = js.Any.fromFunction0(getTextValue), get_command = js.Any.fromFunction0(get_command), get_contextual = js.Any.fromFunction0(get_contextual), get_contextualGroupId = js.Any.fromFunction0(get_contextualGroupId), get_cssClass = js.Any.fromFunction0(get_cssClass), get_currentScalingIndex = js.Any.fromFunction0(get_currentScalingIndex), get_description = js.Any.fromFunction0(get_description), get_domElementTagName = js.Any.fromFunction0(get_domElementTagName), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_needsDelayIniting = js.Any.fromFunction0(get_needsDelayIniting), get_parent = js.Any.fromFunction0(get_parent), get_ribbon = js.Any.fromFunction0(get_ribbon), get_root = js.Any.fromFunction0(get_root), get_scaling = js.Any.fromFunction0(get_scaling), get_selected = js.Any.fromFunction0(get_selected), get_title = js.Any.fromFunction0(get_title), get_visible = js.Any.fromFunction0(get_visible), get_visibleInDOM = js.Any.fromFunction0(get_visibleInDOM), initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = js.Any.fromFunction0(onMenuClosed), raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = js.Any.fromFunction0(receiveFocus), removeChild = js.Any.fromFunction1(removeChild), removeChildren = js.Any.fromFunction0(removeChildren), scaleDown = js.Any.fromFunction0(scaleDown), scaleMax = js.Any.fromFunction0(scaleMax), scaleUp = js.Any.fromFunction0(scaleUp), set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1(set_id), set_parent = js.Any.fromFunction1(set_parent), set_selected = js.Any.fromFunction1(set_selected), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit class TabMutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_command(value: () => String): Self = StObject.set(x, "get_command", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_contextual(value: () => Boolean): Self = StObject.set(x, "get_contextual", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_contextualGroupId(value: () => String): Self = StObject.set(x, "get_contextualGroupId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_currentScalingIndex(value: () => Double): Self = StObject.set(x, "get_currentScalingIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_scaling(value: () => String): Self = StObject.set(x, "get_scaling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_selected(value: () => Boolean): Self = StObject.set(x, "get_selected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScaleDown(value: () => scala.Unit): Self = StObject.set(x, "scaleDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScaleMax(value: () => scala.Unit): Self = StObject.set(x, "scaleMax", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScaleUp(value: () => scala.Unit): Self = StObject.set(x, "scaleUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_selected(value: Boolean => scala.Unit): Self = StObject.set(x, "set_selected", js.Any.fromFunction1(value))
  }
}
