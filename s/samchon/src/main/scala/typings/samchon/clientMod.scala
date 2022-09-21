package typings.samchon

import typings.samchon.invokeMod.Invoke
import typings.samchon.iprotocolMod.IProtocol
import typings.samchon.serviceServiceMod.Service
import typings.samchon.userMod.User
import typings.samchon.webClientDriverMod.WebClientDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("samchon/templates/service/Client", "Client")
  @js.native
  abstract class Client protected ()
    extends StObject
       with IProtocol {
    /**
      * Construct from parent {@link User} and communicator.
      *
      * @param user Parent {@link User} object.
      * @param driver Communicator with remote client.
      */
    def this(user: User, driver: WebClientDriver) = this()
    
    /**
      * Change related {@link Service} object.
      *
      * @param path Requested, identifier path.
      */
    /* protected */ def changeService(path: String): Unit = js.native
    /**
      * Change {@link Service} to another.
      *
      * @param service {@link service} object to newly assigned.
      */
    /* protected */ def changeService(service: Service): Unit = js.native
    
    /**
      * Close connection.
      */
    def close(): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var communicator_ : Any = js.native
    
    /**
      * Factory method creating {@link Service} object.
      *
      * @param path Requested path.
      * @return A newly created {@link Service} object or ```null```.
      */
    /* protected */ def createService(path: String): Service = js.native
    
    /**
      * Default Destructor.
      *
      * This {@link destructor destructor()} method is called when the {@link Client} object is destructed and this
      * {@link Client} object is destructed when connection with the remote client is closed or this {@link Client}
      * object is {@link User.erase erased} from its parent {@link User} object.
      *
      * Note that, don't call this {@link destructor destructor()} method by yourself. It must be called automatically
      * by those *destruction* cases. Also, if your derived {@link Client} class has something to do on the
      * *destruction*, then overrides this {@link destructor destructor()} method and defines the something to do.
      * Overriding this {@link destructor destructor()}, don't forget to calling ```super.destructor();``` on tail.
      *
      * ```typescript
      * class MyUser extends service.Client
      * {
      *     protected destructor(): void
      *     {
      *         // DO SOMETHING
      *         this.do_something();
      *
      *         // CALL SUPER.DESTRUCTOR() ON TAIL. DON'T FORGET THIS
      *         super.destructor();
      *     }
      * }
      * ```
      */
    /* protected */ def destructor(): Unit = js.native
    
    /**
      * Get sequence number.
      *
      * Get sequence number of this {@link Client} object in the parent {@link User} object. This sequence number also
      * be a *key* in the parent {@link User} object, who extended the ```std.HashMap<number, Client>```.
      *
      * @return Sequence number.
      */
    def getNo(): Double = js.native
    
    /**
      * Get child {@link Service} object.
      *
      * @return The child {@link Service} object.
      */
    def getService(): Service = js.native
    
    /**
      * Get parent {@link User} object.
      *
      * Get the parent {@link User} object, who is groupping {@link Client} objects with same session id.
      *
      * @return The parent {@link User} object.
      */
    def getUser(): User = js.native
    
    /**
      * @hidden
      */
    /* private */ var no_ : Any = js.native
    
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
    /* private */ var service_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var user_ : Any = js.native
  }
}
