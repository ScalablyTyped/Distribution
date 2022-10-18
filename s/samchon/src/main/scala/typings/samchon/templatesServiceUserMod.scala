package typings.samchon

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.ecol.mod.HashMapCollection
import typings.samchon.protocolCommunicatorClientDriverWebClientDriverMod.WebClientDriver
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.protocolInvokeIprotocolMod.IProtocol
import typings.samchon.templatesServiceClientMod.Client
import typings.samchon.templatesServiceServerMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesServiceUserMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/service/User", "User")
  @js.native
  open class User protected ()
    extends HashMapCollection[Double, Client]
       with IProtocol {
    /**
      * Construct from its parent {@link Server}.
      *
      * @param server The parent {@link Server} object.
      */
    def this(server: Server) = this()
    
    /**
      * @hidden
      */
    /* private */ var _Handle_erase_client: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var account_id_ : Any = js.native
    
    /* InferMemberOverrides */
    override def addEventListener(
      `type`: Type,
      listener: Listener[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.Iterator<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.ReverseIterator<Key, T> */ Any
        ]
    ): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var authority_ : Any = js.native
    
    /**
      * Factory method creating a {@link Client} object.
      *
      * @param driver A web communicator for remote client.
      * @return A newly created {@link Client} object.
      */
    /* protected */ def createClient(driver: WebClientDriver): Client = js.native
    
    /**
      * Default Destructor.
      *
      * This {@link destructor destructor()} method is called when the {@link User} object is destructed. The
      * {@link User} object is destructed when connections with the remote clients are all closed, that is all the
      * children {@link Client} objects are all removed, and 30 seconds has left. If some remote client connects
      * within the 30 seconds, then the {@link User} object doesn't be destructed.
      *
      * Note that, don't call this {@link destructor destructor()} method by yourself. It must be called automatically
      * by those *destruction* cases. Also, if your derived {@link User} class has something to do on the
      * *destruction*, then overrides this {@link destructor destructor()} method and defines the something to do.
      * Overriding this {@link destructor destructor()}, don't forget to calling ```super.destructor();``` on tail.
      *
      * ```typescript
      * class MyUser extends service.User
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
    
    /* InferMemberOverrides */
    override def dispatchEvent(
      event: CollectionEvent[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.Iterator<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.ReverseIterator<Key, T> */ Any
        ]
    ): Unit = js.native
    
    /**
      * Get account id.
      *
      * @return Account ID.
      */
    def getAccountID(): String = js.native
    
    /**
      * Get authority.
      *
      * @return Authority
      */
    def getAuthority(): Double = js.native
    
    /**
      * Get parent {@lin Server} object.
      *
      * @return Parent {@link Server} object.
      */
    def getServer(): Server = js.native
    
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
    
    /**
      * Log-out.
      *
      * This {@link logout logout()} method configures {@link getAccountID account id} to empty string and
      * {@link getAuthority authority} to zero.
      *
      * The ordinary {@link getAccountID account id} will be also erased from the parent {@link Server} object. You
      * can't access this {@link User} object from {@link Server.has Server.has()} and {@link Server.get Server.get()}
      * with the ordinary {@link getAccountID account id} more.
      */
    def logout(): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.Iterator<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.ReverseIterator<Key, T> */ Any
        ]
    ): Unit = js.native
    
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
    /* private */ var sequence_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var server_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var session_id_ : Any = js.native
    
    /**
      * Set *account id* and *authority*.
      *
      * The {@link setAccount setAccount()} is a method configuring *account id* and *authority* of this {@link User}.
      *
      * After the configuring, the {@link getAccountID account id} is enrolled into the parent {@link Server} as a
      * **key** for this {@link User} object. You can test existence and access this {@link User} object from
      * {@link Server.has Server.has()} and {@link Server.get Server.get()} with the {@link getAccountID account id}.
      * Of course, if ordinary {@link getAccountID account id} had existed, then the ordinary **key** will be
      * replaced.
      *
      * As you suggest, this {@link setAccount setAccount()} is something like a **log-in** function. If what you want
      * is not **logging-in**, but **logging-out**, then configure the *account id* to empty string ``""```` or call
      * the {@link lgout logout()} method.
      *
      * @param id To be account id.
      * @param authority To be authority.
      */
    def setAccount(id: String, authority: Double): Unit = js.native
  }
}
