package typings.smartystreetsJavascriptSdk.mod.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client[T] extends ClientInstance {
  
  def send(lookup: T): js.Promise[T] = js.native
}
object Client {
  
  @scala.inline
  def apply[T](send: T => js.Promise[T], sender: js.Any): Client[T] = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client[T]]
  }
  
  @scala.inline
  implicit class ClientOps[Self <: Client[_], T] (val x: Self with Client[T]) extends AnyVal {
    
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
    def setSend(value: T => js.Promise[T]): Self = this.set("send", js.Any.fromFunction1(value))
  }
}
