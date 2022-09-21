package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutAction extends StObject {
  
  def getDisabledToolTip(): String
  
  def getIsDisabledCallback(action: CalloutAction): Boolean
  
  def getIsMenu(): Boolean
  
  def getIsVisibleCallback(action: CalloutAction): Boolean
  
  def getMenuEntries(): js.Array[CalloutActionMenuEntry]
  
  def getOnClickCallback(event: Any, action: CalloutAction): Any
  
  def getText(): String
  
  def getToolTop(): String
  
  def isEnabled(): Boolean
  
  def isVisible(): Boolean
  
  def render(): Unit
  
  def set(options: CalloutActionOptions): Unit
}
object CalloutAction {
  
  inline def apply(
    getDisabledToolTip: () => String,
    getIsDisabledCallback: CalloutAction => Boolean,
    getIsMenu: () => Boolean,
    getIsVisibleCallback: CalloutAction => Boolean,
    getMenuEntries: () => js.Array[CalloutActionMenuEntry],
    getOnClickCallback: (Any, CalloutAction) => Any,
    getText: () => String,
    getToolTop: () => String,
    isEnabled: () => Boolean,
    isVisible: () => Boolean,
    render: () => Unit,
    set: CalloutActionOptions => Unit
  ): CalloutAction = {
    val __obj = js.Dynamic.literal(getDisabledToolTip = js.Any.fromFunction0(getDisabledToolTip), getIsDisabledCallback = js.Any.fromFunction1(getIsDisabledCallback), getIsMenu = js.Any.fromFunction0(getIsMenu), getIsVisibleCallback = js.Any.fromFunction1(getIsVisibleCallback), getMenuEntries = js.Any.fromFunction0(getMenuEntries), getOnClickCallback = js.Any.fromFunction2(getOnClickCallback), getText = js.Any.fromFunction0(getText), getToolTop = js.Any.fromFunction0(getToolTop), isEnabled = js.Any.fromFunction0(isEnabled), isVisible = js.Any.fromFunction0(isVisible), render = js.Any.fromFunction0(render), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[CalloutAction]
  }
  
  extension [Self <: CalloutAction](x: Self) {
    
    inline def setGetDisabledToolTip(value: () => String): Self = StObject.set(x, "getDisabledToolTip", js.Any.fromFunction0(value))
    
    inline def setGetIsDisabledCallback(value: CalloutAction => Boolean): Self = StObject.set(x, "getIsDisabledCallback", js.Any.fromFunction1(value))
    
    inline def setGetIsMenu(value: () => Boolean): Self = StObject.set(x, "getIsMenu", js.Any.fromFunction0(value))
    
    inline def setGetIsVisibleCallback(value: CalloutAction => Boolean): Self = StObject.set(x, "getIsVisibleCallback", js.Any.fromFunction1(value))
    
    inline def setGetMenuEntries(value: () => js.Array[CalloutActionMenuEntry]): Self = StObject.set(x, "getMenuEntries", js.Any.fromFunction0(value))
    
    inline def setGetOnClickCallback(value: (Any, CalloutAction) => Any): Self = StObject.set(x, "getOnClickCallback", js.Any.fromFunction2(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setGetToolTop(value: () => String): Self = StObject.set(x, "getToolTop", js.Any.fromFunction0(value))
    
    inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setSet(value: CalloutActionOptions => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
