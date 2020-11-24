package typings.sharepoint.SP.Ribbon

import typings.sharepoint.CUI.CommandType
import typings.sharepoint.CUI.Component
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ribbon
  extends typings.sharepoint.CUI.Ribbon
object Ribbon {
  
  @scala.inline
  def apply(
    _lastHeightUpdate: Double,
    _lastLeftUpdate: Double,
    _lastTopUpdate: Double,
    _lastWidthUpdate: Double,
    addChild: Component => Unit,
    addChildAtIndex: (js.Any, Double) => Unit,
    addContextualGroup: (String, String, js.Any, String) => js.Any,
    appendChildrenToElement: Element => Unit,
    createChildArray: () => Unit,
    dispose: () => Unit,
    doDelayedInit: () => Unit,
    ensureCorrectChildType: () => Unit,
    ensureDOMElementAndEmpty: () => Unit,
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
    hideContextualGroup: String => Unit,
    initRootMember: Component => js.Any,
    onEnabledChanged: Boolean => js.Any,
    onMenuClosed: () => Unit,
    raiseCommandEvent: (String, CommandType, js.Any) => js.Any,
    receiveFocus: () => Unit,
    refresh: () => Unit,
    removeChild: String => Unit,
    removeChildren: () => Unit,
    removeContextualGroup: String => Unit,
    setFocus: () => Unit,
    setFocusOnCurrentTab: () => Unit,
    setFocusOnRibbon: () => Unit,
    set_description: String => String,
    set_enabled: Boolean => Boolean,
    set_id: String => Unit,
    set_parent: Component => Component,
    set_title: String => String,
    set_visible: Boolean => Boolean,
    showContextualGroup: String => Unit,
    valueIsDirty: Double => Boolean
  ): Ribbon = {
    val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1(addChild), addChildAtIndex = js.Any.fromFunction2(addChildAtIndex), addContextualGroup = js.Any.fromFunction4(addContextualGroup), appendChildrenToElement = js.Any.fromFunction1(appendChildrenToElement), createChildArray = js.Any.fromFunction0(createChildArray), dispose = js.Any.fromFunction0(dispose), doDelayedInit = js.Any.fromFunction0(doDelayedInit), ensureCorrectChildType = js.Any.fromFunction0(ensureCorrectChildType), ensureDOMElementAndEmpty = js.Any.fromFunction0(ensureDOMElementAndEmpty), getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = js.Any.fromFunction0(getTextValue), get_contextualGroupIds = js.Any.fromFunction0(get_contextualGroupIds), get_cssClass = js.Any.fromFunction0(get_cssClass), get_description = js.Any.fromFunction0(get_description), get_domElementTagName = js.Any.fromFunction0(get_domElementTagName), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_needsDelayIniting = js.Any.fromFunction0(get_needsDelayIniting), get_parent = js.Any.fromFunction0(get_parent), get_root = js.Any.fromFunction0(get_root), get_title = js.Any.fromFunction0(get_title), get_visible = js.Any.fromFunction0(get_visible), get_visibleInDOM = js.Any.fromFunction0(get_visibleInDOM), hideContextualGroup = js.Any.fromFunction1(hideContextualGroup), initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = js.Any.fromFunction0(onMenuClosed), raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = js.Any.fromFunction0(receiveFocus), refresh = js.Any.fromFunction0(refresh), removeChild = js.Any.fromFunction1(removeChild), removeChildren = js.Any.fromFunction0(removeChildren), removeContextualGroup = js.Any.fromFunction1(removeContextualGroup), setFocus = js.Any.fromFunction0(setFocus), setFocusOnCurrentTab = js.Any.fromFunction0(setFocusOnCurrentTab), setFocusOnRibbon = js.Any.fromFunction0(setFocusOnRibbon), set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1(set_id), set_parent = js.Any.fromFunction1(set_parent), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), showContextualGroup = js.Any.fromFunction1(showContextualGroup), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
    __obj.asInstanceOf[Ribbon]
  }
}
