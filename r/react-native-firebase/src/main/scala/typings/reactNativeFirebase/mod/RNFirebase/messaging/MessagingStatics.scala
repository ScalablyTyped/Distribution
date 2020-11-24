package typings.reactNativeFirebase.mod.RNFirebase.messaging

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingStatics extends js.Object {
  
  var RemoteMessage: Instantiable0[typings.reactNativeFirebase.mod.RNFirebase.messaging.RemoteMessage] = js.native
}
object MessagingStatics {
  
  @scala.inline
  def apply(RemoteMessage: Instantiable0[RemoteMessage]): MessagingStatics = {
    val __obj = js.Dynamic.literal(RemoteMessage = RemoteMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingStatics]
  }
  
  @scala.inline
  implicit class MessagingStaticsOps[Self <: MessagingStatics] (val x: Self) extends AnyVal {
    
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
    def setRemoteMessage(value: Instantiable0[RemoteMessage]): Self = this.set("RemoteMessage", value.asInstanceOf[js.Any])
  }
}
