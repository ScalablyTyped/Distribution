package typings.samchon

import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.protocolInvokeIprotocolMod.IProtocol
import typings.samchon.protocolServerWebServerMod.WebServer
import typings.samchon.templatesServiceUserMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesServiceServerMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/service/Server", "Server")
  @js.native
  /**
    * Default Constructor.
    */
  open class Server ()
    extends WebServer
       with IProtocol {
    
    /**
      * @hidden
      */
    /* private */ var _Erase_user: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var account_map_ : Any = js.native
    
    /**
      * Factory method creating {@link User} object.
      *
      * @return A newly created {@link User} object.
      */
    /* protected */ def createUser(): User = js.native
    
    /**
      * Get an {@link User} object by its *accountID*.
      *
      * @param accountID Account id of {@link User} to get.
      * @return An {@link User} object.
      */
    def get(accountID: String): User = js.native
    
    /**
      * Test wheter an {@link User} exists with the *accountID*.
      *
      * @param accountID Account id of {@link User} to find.
      * @return Exists or not.
      */
    def has(accountID: String): Boolean = js.native
    
    /**
      * Sending message.
      *
      * Sends message to related system or shifts the responsibility to chain.
      *
      * @param invoke Invoke message to send
      */
    /* CompleteClass */
    override def replyData(invoke: Invoke): Unit = js.native
    
    /**
      * Handling replied message.
      *
      * Handles replied message or shifts the responsibility to chain.
      *
      * @param invoke An {@link Invoke} message has received.
      */
    /* CompleteClass */
    override def sendData(invoke: Invoke): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var session_map_ : Any = js.native
  }
}
