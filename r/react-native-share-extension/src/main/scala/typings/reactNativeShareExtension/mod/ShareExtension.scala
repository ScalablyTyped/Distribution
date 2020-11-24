package typings.reactNativeShareExtension.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareExtension extends js.Object {
  
  def close(): Unit = js.native
  
  def data(): js.Promise[ShareData] = js.native
  
  def openURL(uri: String): Unit = js.native
}
object ShareExtension {
  
  @scala.inline
  def apply(close: () => Unit, data: () => js.Promise[ShareData], openURL: String => Unit): ShareExtension = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = js.Any.fromFunction0(data), openURL = js.Any.fromFunction1(openURL))
    __obj.asInstanceOf[ShareExtension]
  }
  
  @scala.inline
  implicit class ShareExtensionOps[Self <: ShareExtension] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: () => js.Promise[ShareData]): Self = this.set("data", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenURL(value: String => Unit): Self = this.set("openURL", js.Any.fromFunction1(value))
  }
}
