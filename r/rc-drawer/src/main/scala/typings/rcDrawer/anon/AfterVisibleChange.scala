package typings.rcDrawer.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterVisibleChange extends js.Object {
  
  def afterVisibleChange(): Unit = js.native
  
  var className: String = js.native
  
  var defaultOpen: Boolean = js.native
  
  var duration: String = js.native
  
  var ease: String = js.native
  
  var forceRender: Boolean = js.native
  
  var getContainer: String = js.native
  
  var handler: Element = js.native
  
  var keyboard: Boolean = js.native
  
  var level: String = js.native
  
  var maskClosable: Boolean = js.native
  
  def onChange(): Unit = js.native
  
  var placement: String = js.native
  
  var prefixCls: String = js.native
  
  var showMask: Boolean = js.native
  
  var wrapperClassName: String = js.native
}
object AfterVisibleChange {
  
  @scala.inline
  def apply(
    afterVisibleChange: () => Unit,
    className: String,
    defaultOpen: Boolean,
    duration: String,
    ease: String,
    forceRender: Boolean,
    getContainer: String,
    handler: Element,
    keyboard: Boolean,
    level: String,
    maskClosable: Boolean,
    onChange: () => Unit,
    placement: String,
    prefixCls: String,
    showMask: Boolean,
    wrapperClassName: String
  ): AfterVisibleChange = {
    val __obj = js.Dynamic.literal(afterVisibleChange = js.Any.fromFunction0(afterVisibleChange), className = className.asInstanceOf[js.Any], defaultOpen = defaultOpen.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], forceRender = forceRender.asInstanceOf[js.Any], getContainer = getContainer.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showMask = showMask.asInstanceOf[js.Any], wrapperClassName = wrapperClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterVisibleChange]
  }
  
  @scala.inline
  implicit class AfterVisibleChangeOps[Self <: AfterVisibleChange] (val x: Self) extends AnyVal {
    
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
    def setAfterVisibleChange(value: () => Unit): Self = this.set("afterVisibleChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEase(value: String): Self = this.set("ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContainer(value: String): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: Element): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMask(value: Boolean): Self = this.set("showMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperClassName(value: String): Self = this.set("wrapperClassName", value.asInstanceOf[js.Any])
  }
}
