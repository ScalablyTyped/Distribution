package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientAction extends js.Object {
  
  def get_id(): Double = js.native
  
  def get_name(): String = js.native
  
  def get_path(): ObjectPath = js.native
}
object ClientAction {
  
  @scala.inline
  def apply(get_id: () => Double, get_name: () => String, get_path: () => ObjectPath): ClientAction = {
    val __obj = js.Dynamic.literal(get_id = js.Any.fromFunction0(get_id), get_name = js.Any.fromFunction0(get_name), get_path = js.Any.fromFunction0(get_path))
    __obj.asInstanceOf[ClientAction]
  }
  
  @scala.inline
  implicit class ClientActionOps[Self <: ClientAction] (val x: Self) extends AnyVal {
    
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
    def setGet_id(value: () => Double): Self = this.set("get_id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_name(value: () => String): Self = this.set("get_name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_path(value: () => ObjectPath): Self = this.set("get_path", js.Any.fromFunction0(value))
  }
}
