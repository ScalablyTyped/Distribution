package typings.rmcTrigger.anon

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterPopupVisibleChange extends js.Object {
  
  var afterPopupVisibleChange: js.Function0[Unit] = js.native
  
  var defaultPopupVisible: Boolean = js.native
  
  var destroyPopupOnHide: Boolean = js.native
  
  var getDocument: js.Function0[Document] = js.native
  
  var getPopupClassNameFromAlign: js.Function0[String] = js.native
  
  var mask: Boolean = js.native
  
  var maskClosable: Boolean = js.native
  
  var onPopupAlign: js.Function0[Unit] = js.native
  
  var onPopupVisibleChange: js.Function0[Unit] = js.native
  
  var popupClassName: String = js.native
  
  var prefixCls: String = js.native
}
object AfterPopupVisibleChange {
  
  @scala.inline
  def apply(
    afterPopupVisibleChange: () => Unit,
    defaultPopupVisible: Boolean,
    destroyPopupOnHide: Boolean,
    getDocument: () => Document,
    getPopupClassNameFromAlign: () => String,
    mask: Boolean,
    maskClosable: Boolean,
    onPopupAlign: () => Unit,
    onPopupVisibleChange: () => Unit,
    popupClassName: String,
    prefixCls: String
  ): AfterPopupVisibleChange = {
    val __obj = js.Dynamic.literal(afterPopupVisibleChange = js.Any.fromFunction0(afterPopupVisibleChange), defaultPopupVisible = defaultPopupVisible.asInstanceOf[js.Any], destroyPopupOnHide = destroyPopupOnHide.asInstanceOf[js.Any], getDocument = js.Any.fromFunction0(getDocument), getPopupClassNameFromAlign = js.Any.fromFunction0(getPopupClassNameFromAlign), mask = mask.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onPopupAlign = js.Any.fromFunction0(onPopupAlign), onPopupVisibleChange = js.Any.fromFunction0(onPopupVisibleChange), popupClassName = popupClassName.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterPopupVisibleChange]
  }
  
  @scala.inline
  implicit class AfterPopupVisibleChangeOps[Self <: AfterPopupVisibleChange] (val x: Self) extends AnyVal {
    
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
    def setAfterPopupVisibleChange(value: () => Unit): Self = this.set("afterPopupVisibleChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultPopupVisible(value: Boolean): Self = this.set("defaultPopupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyPopupOnHide(value: Boolean): Self = this.set("destroyPopupOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDocument(value: () => Document): Self = this.set("getDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPopupClassNameFromAlign(value: () => String): Self = this.set("getPopupClassNameFromAlign", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPopupAlign(value: () => Unit): Self = this.set("onPopupAlign", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPopupVisibleChange(value: () => Unit): Self = this.set("onPopupVisibleChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPopupClassName(value: String): Self = this.set("popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
}
