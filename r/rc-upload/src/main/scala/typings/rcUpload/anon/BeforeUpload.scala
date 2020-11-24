package typings.rcUpload.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeUpload extends js.Object {
  
  var beforeUpload: js.Any = js.native
  
  var component: String = js.native
  
  var customRequest: js.Any = js.native
  
  var multipart: Boolean = js.native
  
  var multiple: Boolean = js.native
  
  var name: String = js.native
  
  var onError: js.Function0[Unit] = js.native
  
  var onStart: js.Function0[Unit] = js.native
  
  var onSuccess: js.Function0[Unit] = js.native
  
  var openFileDialogOnClick: Boolean = js.native
  
  var prefixCls: String = js.native
  
  var withCredentials: Boolean = js.native
}
object BeforeUpload {
  
  @scala.inline
  def apply(
    beforeUpload: js.Any,
    component: String,
    customRequest: js.Any,
    multipart: Boolean,
    multiple: Boolean,
    name: String,
    onError: () => Unit,
    onStart: () => Unit,
    onSuccess: () => Unit,
    openFileDialogOnClick: Boolean,
    prefixCls: String,
    withCredentials: Boolean
  ): BeforeUpload = {
    val __obj = js.Dynamic.literal(beforeUpload = beforeUpload.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], customRequest = customRequest.asInstanceOf[js.Any], multipart = multipart.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onError = js.Any.fromFunction0(onError), onStart = js.Any.fromFunction0(onStart), onSuccess = js.Any.fromFunction0(onSuccess), openFileDialogOnClick = openFileDialogOnClick.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeUpload]
  }
  
  @scala.inline
  implicit class BeforeUploadOps[Self <: BeforeUpload] (val x: Self) extends AnyVal {
    
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
    def setBeforeUpload(value: js.Any): Self = this.set("beforeUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRequest(value: js.Any): Self = this.set("customRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipart(value: Boolean): Self = this.set("multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnError(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStart(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = this.set("onSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenFileDialogOnClick(value: Boolean): Self = this.set("openFileDialogOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
  }
}
