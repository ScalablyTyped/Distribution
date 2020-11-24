package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientXDocument extends js.Object {
  
  def get_root(): XElement = js.native
  
  def set_root(value: XElement): Unit = js.native
}
object ClientXDocument {
  
  @scala.inline
  def apply(get_root: () => XElement, set_root: XElement => Unit): ClientXDocument = {
    val __obj = js.Dynamic.literal(get_root = js.Any.fromFunction0(get_root), set_root = js.Any.fromFunction1(set_root))
    __obj.asInstanceOf[ClientXDocument]
  }
  
  @scala.inline
  implicit class ClientXDocumentOps[Self <: ClientXDocument] (val x: Self) extends AnyVal {
    
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
    def setGet_root(value: () => XElement): Self = this.set("get_root", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_root(value: XElement => Unit): Self = this.set("set_root", js.Any.fromFunction1(value))
  }
}
