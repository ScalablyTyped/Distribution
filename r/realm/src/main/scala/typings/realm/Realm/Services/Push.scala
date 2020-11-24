package typings.realm.Realm.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the Push service to enable sending push messages to this user via Firebase Cloud Messaging (FCM).
  */
@js.native
trait Push extends js.Object {
  
  /**
    * Deregister this device with the user, to disable sending messages to this device.
    */
  def deregister(): js.Promise[Unit] = js.native
  
  /**
    * Register this device with the user.
    *
    * @param token A Firebase Cloud Messaging (FCM) token, retrieved via the firebase SDK.
    */
  def register(token: String): js.Promise[Unit] = js.native
}
object Push {
  
  @scala.inline
  def apply(deregister: () => js.Promise[Unit], register: String => js.Promise[Unit]): Push = {
    val __obj = js.Dynamic.literal(deregister = js.Any.fromFunction0(deregister), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[Push]
  }
  
  @scala.inline
  implicit class PushOps[Self <: Push] (val x: Self) extends AnyVal {
    
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
    def setDeregister(value: () => js.Promise[Unit]): Self = this.set("deregister", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: String => js.Promise[Unit]): Self = this.set("register", js.Any.fromFunction1(value))
  }
}
