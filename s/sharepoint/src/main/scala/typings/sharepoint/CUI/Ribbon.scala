package typings.sharepoint.CUI

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ribbon extends Component {
  
  def addChildAtIndex(child: js.Any, index: Double): scala.Unit = js.native
  
  def addContextualGroup(id: String, title: String, color: js.Any, command: String): js.Any = js.native
  
  def get_contextualGroupIds(): js.Array[String] = js.native
  
  def hideContextualGroup(id: String): scala.Unit = js.native
  
  def refresh(): scala.Unit = js.native
  
  def removeContextualGroup(id: String): scala.Unit = js.native
  
  def setFocus(): scala.Unit = js.native
  
  def setFocusOnCurrentTab(): scala.Unit = js.native
  
  def setFocusOnRibbon(): scala.Unit = js.native
  
  def showContextualGroup(id: String): scala.Unit = js.native
}
object Ribbon {
  
  @scala.inline
  def apply(
    _lastHeightUpdate: Double,
    _lastLeftUpdate: Double,
    _lastTopUpdate: Double,
    _lastWidthUpdate: Double,
    addChild: Component => scala.Unit,
    addChildAtIndex: (js.Any, Double) => scala.Unit,
    addContextualGroup: (String, String, js.Any, String) => js.Any,
    appendChildrenToElement: Element => scala.Unit,
    createChildArray: () => scala.Unit,
    dispose: () => scala.Unit,
    doDelayedInit: () => scala.Unit,
    ensureCorrectChildType: () => scala.Unit,
    ensureDOMElementAndEmpty: () => scala.Unit,
    getChild: String => Component,
    getChildByTitle: String => Component,
    getTextValue: () => String,
    get_contextualGroupIds: () => js.Array[String],
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
    hideContextualGroup: String => scala.Unit,
    initRootMember: Component => js.Any,
    onEnabledChanged: Boolean => js.Any,
    onMenuClosed: () => scala.Unit,
    raiseCommandEvent: (String, CommandType, js.Any) => js.Any,
    receiveFocus: () => scala.Unit,
    refresh: () => scala.Unit,
    removeChild: String => scala.Unit,
    removeChildren: () => scala.Unit,
    removeContextualGroup: String => scala.Unit,
    setFocus: () => scala.Unit,
    setFocusOnCurrentTab: () => scala.Unit,
    setFocusOnRibbon: () => scala.Unit,
    set_description: String => String,
    set_enabled: Boolean => Boolean,
    set_id: String => scala.Unit,
    set_parent: Component => Component,
    set_title: String => String,
    set_visible: Boolean => Boolean,
    showContextualGroup: String => scala.Unit,
    valueIsDirty: Double => Boolean
  ): Ribbon = {
    val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1(addChild), addChildAtIndex = js.Any.fromFunction2(addChildAtIndex), addContextualGroup = js.Any.fromFunction4(addContextualGroup), appendChildrenToElement = js.Any.fromFunction1(appendChildrenToElement), createChildArray = js.Any.fromFunction0(createChildArray), dispose = js.Any.fromFunction0(dispose), doDelayedInit = js.Any.fromFunction0(doDelayedInit), ensureCorrectChildType = js.Any.fromFunction0(ensureCorrectChildType), ensureDOMElementAndEmpty = js.Any.fromFunction0(ensureDOMElementAndEmpty), getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = js.Any.fromFunction0(getTextValue), get_contextualGroupIds = js.Any.fromFunction0(get_contextualGroupIds), get_cssClass = js.Any.fromFunction0(get_cssClass), get_description = js.Any.fromFunction0(get_description), get_domElementTagName = js.Any.fromFunction0(get_domElementTagName), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_needsDelayIniting = js.Any.fromFunction0(get_needsDelayIniting), get_parent = js.Any.fromFunction0(get_parent), get_root = js.Any.fromFunction0(get_root), get_title = js.Any.fromFunction0(get_title), get_visible = js.Any.fromFunction0(get_visible), get_visibleInDOM = js.Any.fromFunction0(get_visibleInDOM), hideContextualGroup = js.Any.fromFunction1(hideContextualGroup), initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = js.Any.fromFunction0(onMenuClosed), raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = js.Any.fromFunction0(receiveFocus), refresh = js.Any.fromFunction0(refresh), removeChild = js.Any.fromFunction1(removeChild), removeChildren = js.Any.fromFunction0(removeChildren), removeContextualGroup = js.Any.fromFunction1(removeContextualGroup), setFocus = js.Any.fromFunction0(setFocus), setFocusOnCurrentTab = js.Any.fromFunction0(setFocusOnCurrentTab), setFocusOnRibbon = js.Any.fromFunction0(setFocusOnRibbon), set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1(set_id), set_parent = js.Any.fromFunction1(set_parent), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), showContextualGroup = js.Any.fromFunction1(showContextualGroup), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
    __obj.asInstanceOf[Ribbon]
  }
  
  @scala.inline
  implicit class RibbonOps[Self <: Ribbon] (val x: Self) extends AnyVal {
    
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
    def setAddChildAtIndex(value: (js.Any, Double) => scala.Unit): Self = this.set("addChildAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddContextualGroup(value: (String, String, js.Any, String) => js.Any): Self = this.set("addContextualGroup", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGet_contextualGroupIds(value: () => js.Array[String]): Self = this.set("get_contextualGroupIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideContextualGroup(value: String => scala.Unit): Self = this.set("hideContextualGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefresh(value: () => scala.Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveContextualGroup(value: String => scala.Unit): Self = this.set("removeContextualGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFocus(value: () => scala.Unit): Self = this.set("setFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFocusOnCurrentTab(value: () => scala.Unit): Self = this.set("setFocusOnCurrentTab", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFocusOnRibbon(value: () => scala.Unit): Self = this.set("setFocusOnRibbon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowContextualGroup(value: String => scala.Unit): Self = this.set("showContextualGroup", js.Any.fromFunction1(value))
  }
}
