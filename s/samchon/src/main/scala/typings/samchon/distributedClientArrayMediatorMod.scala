package typings.samchon

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.distributedSystemMod.DistributedSystem
import typings.samchon.iclientdriverMod.IClientDriver
import typings.samchon.iserverMod.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributedClientArrayMediatorMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ecol.ieventdispatcherMod.IEventDispatcher because Already inherited
  - typings.ecol.icollectionMod.ICollection because Already inherited
  - typings.ecol.dequeCollectionMod.DequeCollection because Already inherited
  - typings.ecol.mod.DequeCollection because Already inherited
  - typings.samchon.iprotocolMod.IProtocol because Already inherited
  - typings.samchon.entityCollectionMod.EntityDequeCollection because Already inherited
  - typings.samchon.externalSystemArrayMod.ExternalSystemArray because Already inherited
  - typings.samchon.iexternalclientarrayMod.IExternalClientArray because var conflicts: _Handle_system_erase, _Notify_erase, _Notify_insert, dispatcher_. Inlined  */ @JSImport("samchon/templates/distributed/derived/DistributedClientArrayMediator", "DistributedClientArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArrayMediator[System /* <: DistributedSystem */] ()
    extends DistributedSystemArrayMediator[System]
       with IServer {
    
    /**
      * Add a newly connected remote client.
      *
      * The {@link addClient addClient()} is an abstract method being called when a remote client is newly connected
      * with {@link IClientDriver} object who communicates with the remote system. Overrides this method and defines
      * what to do with the *driver*, a newly connected remote client.
      *
      * Below methods and example codes may be good for comprehending how to utilize this {@link addClient} method.
      *
      * - https://github.com/samchon/framework-examples/blob/master/calculator/calculator-server.ts
      * - https://github.com/samchon/framework-examples/blob/master/chat-server/server.ts
      * - {@link service.Server.addClient}
      * - {@link external.ExternalClientArray.addClient}
      * - {@link slave.SlaveServer.addClient}
      *
      * @param driver A {@link ICommunicator communicator} with (newly connected) remote client.
      */
    /* CompleteClass */
    override def addClient(driver: IClientDriver): Unit = js.native
    
    /* InferMemberOverrides */
    override def addEventListener(
      `type`: Type,
      listener: Listener[
          System, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ js.Any
        ]
    ): Unit = js.native
    
    /**
      * Close server.
      *
      * Close opened server. All remote clients, have connected with this server, are also closed and their call back
      * functions, for closed connection, {@link IClientDriver.onClose} are also called.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Factory method creating {@link DistributedSystem} object.
      *
      * The method {@link createExternalClient createExternalClient()} is a factory method creating a child
      * {@link DistributedSystem} object, that is called whenever a distributed client has connected, by
      * {@link addClient addClient()}.
      *
      * Overrides this {@link createExternalClient} method and creates a type of {@link DistributedSystem} object with
      * the *driver* that communicates with the distributed client. After the creation, returns the object. Then whenever
      * a distributed client has connected, matched {@link DistributedSystem} object will be constructed and
      * {@link insert inserted} into this {@link DistributedClientArrayMediator} object.
      *
      * @param driver A communicator with the distributed client.
      * @return A newly created {@link DistributedSystem} object.
      */
    /* protected */ def createExternalClient(driver: IClientDriver): System = js.native
    
    /**
      * Factory method creating {@link IServerBase} object.
      *
      * This method {@link createServerBase createServerBase()} determines which protocol is used in this
      * {@link DistributedClientArrayMediator} object as a **master**. If the protocol is determined, then
      * {@link DistributedSystem distributed clients} who may connect to {@link DistributedClientArrayMediator this
      * server} must follow the specified protocol.
      *
      * Overrides the {@link createServerBase createServerBase()} method to create and return one of them:
      *
      * - {@link ServerBase}
      * - {@link WebServerBase}
      * - {@link SharedWorkerServerBase}
      *
      * @return A new {@link IServerBase} object.
      */
    /* protected */ def createServerBase(): IServer = js.native
    
    /* InferMemberOverrides */
    override def dispatchEvent(
      event: CollectionEvent[
          System, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ js.Any
        ]
    ): Unit = js.native
    
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
    
    /**
      * Open server.
      *
      * @param port Port number to open.
      */
    /* CompleteClass */
    override def open(port: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[
          System, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.Iterator<T> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiSet.ReverseIterator<T> */ js.Any
        ]
    ): Unit = js.native
    
    /**
      * A subrogator of {@link IServer server}'s role instead of this {@link ExternalClientArray}.
      */
    var server_base_ : js.Any = js.native
  }
}
