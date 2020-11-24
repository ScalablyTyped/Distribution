package typings.reactNativeWol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-wol", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def send(ipAddress: String, macAddress: String): Unit = js.native
    def send(
      ipAddress: String,
      macAddress: String,
      /** The callback will be passed true if the packet was sent without error. */
    callback: js.Function2[/* result */ Boolean, /* message */ String, Unit]
    ): Unit = js.native
    @JSName("send")
    var send_Original: js.Function3[
        /* ipAddress */ String, 
        /* macAddress */ String, 
        /* callback */ js.UndefOr[js.Function2[/* result */ Boolean, /* message */ String, Unit]], 
        Unit
      ] = js.native
  }
}
