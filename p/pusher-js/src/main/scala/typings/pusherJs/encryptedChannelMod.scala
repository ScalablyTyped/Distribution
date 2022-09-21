package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encryptedChannelMod {
  
  @JSImport("pusher-js/types/src/core/channels/encrypted_channel", JSImport.Default)
  @js.native
  open class default protected () extends EncryptedChannel {
    def this(name: String, pusher: typings.pusherJs.pusherMod.default, nacl: typings.tweetnacl.mod.nacl) = this()
  }
  
  @js.native
  trait EncryptedChannel
    extends typings.pusherJs.privateChannelMod.default {
    
    def getDataToEmit(bytes: js.typedarray.Uint8Array): String = js.native
    
    /* private */ var handleEncryptedEvent: Any = js.native
    
    var key: js.typedarray.Uint8Array = js.native
    
    var nacl: typings.tweetnacl.mod.nacl = js.native
  }
}
