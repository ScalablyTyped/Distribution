package typings.samchon

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray
import typings.samchon.templatesParallelParallelSystemMod.ParallelSystem
import typings.tstl.containerDequeMod.Deque
import typings.tstl.containerDequeMod.Deque.Iterator
import typings.tstl.containerDequeMod.Deque.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel/derived/ParallelClientArray", JSImport.Namespace)
@js.native
object templatesParallelDerivedParallelClientArrayMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ParallelClientArray[System /* <: ParallelSystem */] ()
    extends ParallelSystemArray[System]
       with IServer {
    /**
      * @hidden
      */
    var server_base_ : js.Any = js.native
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
    override def addEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Close server.
      *
      * Close opened server. All remote clients, have connected with this server, are also closed and their call back
      * functions, for closed connection, {@link IClientDriver.onClose} are also called.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * Factory method creating {@link ParallelSystem} object.
      *
      * The method {@link createExternalClient createExternalClient()} is a factory method creating a child
      * {@link ParallelSystem} object, that is called whenever a parallel client has connected, by
      * {@link addClient addClient()}.
      *
      * Overrides this {@link createExternalClient} method and creates a type of {@link ParallelSystem} object with
      * the *driver* that communicates with the parallel client. After the creation, returns the {@link ParallelSystem}
      * object. Then whenever a parallel client has connected, matched {@link ParallelSystem} object will be
      * constructed and {@link insert inserted} into this {@link ParallelClientArray} object.
      *
      * @param driver A communicator with the parallel client.
      * @return A newly created {@link ParallelSystem} object.
      */
    /* protected */ def createExternalClient(driver: IClientDriver): System = js.native
    /**
      * Factory method creating {@link IServerBase} object.
      *
      * This method {@link createServerBase createServerBase()} determines which protocol is used in this server,
      * {@link ExternalClientArray}. If the protocol is determined, then {@link ExternalSystem external clients} who
      * may connect to {@link ExternalClientArray this server} must follow the specified protocol.
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
    override def dispatchEvent(event: CollectionEvent[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
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
    override def removeEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
  }
  
}

