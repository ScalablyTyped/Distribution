package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutAction extends js.Object {
  
  def getDisabledToolTip(): String = js.native
  
  def getIsDisabledCallback(action: CalloutAction): Boolean = js.native
  
  def getIsMenu(): Boolean = js.native
  
  def getIsVisibleCallback(action: CalloutAction): Boolean = js.native
  
  def getMenuEntries(): js.Array[CalloutActionMenuEntry] = js.native
  
  def getOnClickCallback(event: js.Any, action: CalloutAction): js.Any = js.native
  
  def getText(): String = js.native
  
  def getToolTop(): String = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def render(): Unit = js.native
  
  def set(options: CalloutActionOptions): Unit = js.native
}
object CalloutAction {
  
  @scala.inline
  def apply(
    getDisabledToolTip: () => String,
    getIsDisabledCallback: CalloutAction => Boolean,
    getIsMenu: () => Boolean,
    getIsVisibleCallback: CalloutAction => Boolean,
    getMenuEntries: () => js.Array[CalloutActionMenuEntry],
    getOnClickCallback: (js.Any, CalloutAction) => js.Any,
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
  
  @scala.inline
  implicit class CalloutActionOps[Self <: CalloutAction] (val x: Self) extends AnyVal {
    
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
    def setGetDisabledToolTip(value: () => String): Self = this.set("getDisabledToolTip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsDisabledCallback(value: CalloutAction => Boolean): Self = this.set("getIsDisabledCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIsMenu(value: () => Boolean): Self = this.set("getIsMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsVisibleCallback(value: CalloutAction => Boolean): Self = this.set("getIsVisibleCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMenuEntries(value: () => js.Array[CalloutActionMenuEntry]): Self = this.set("getMenuEntries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOnClickCallback(value: (js.Any, CalloutAction) => js.Any): Self = this.set("getOnClickCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetToolTop(value: () => String): Self = this.set("getToolTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: () => Unit): Self = this.set("render", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: CalloutActionOptions => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
}
