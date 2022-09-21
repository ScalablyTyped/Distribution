package typings.pusherChatkitClient

import typings.pusherChatkitClient.chatmanagerMod.ChatManagerConstructor
import typings.pusherChatkitClient.chatmanagerMod.ChatManagerConstructorArgs
import typings.pusherChatkitClient.chatmanagerMod.TokenProviderConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pusher/chatkit-client", "ChatManager")
  @js.native
  val ChatManager: ChatManagerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pusher/chatkit-client", "ChatManager")
  @js.native
  open class ChatManagerCls protected ()
    extends StObject
       with typings.pusherChatkitClient.chatmanagerMod.ChatManager {
    def this(args: ChatManagerConstructorArgs) = this()
  }
  
  @JSImport("@pusher/chatkit-client", "TokenProvider")
  @js.native
  val TokenProvider: TokenProviderConstructor = js.native
}
