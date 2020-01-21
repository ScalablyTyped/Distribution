package typings.samchon

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.distributedSystemMod.DistributedSystem
import typings.samchon.iclientdriverMod.IClientDriver
import typings.samchon.iserverMod.IServer
import typings.tstl.dequeMod.Deque
import typings.tstl.dequeMod.Deque.Iterator
import typings.tstl.dequeMod.Deque.ReverseIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/derived/DistributedClientArrayMediator", JSImport.Namespace)
@js.native
object distributedClientArrayMediatorMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedClientArrayMediator[System /* <: DistributedSystem */] ()
    extends DistributedSystemArrayMediator[System]
       with IServer {
    /**
      * A subrogator of {@link IServer server}'s role instead of this {@link ExternalClientArray}.
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
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[System, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def begin(): typings.tstl.icontainerMod.IContainer.Iterator[System, Deque[System], Iterator[System], ReverseIterator[System], System] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
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
    override def dispatchEvent(event: CollectionEvent[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Test whether container is empty.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def empty(): Boolean = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def end(): typings.tstl.icontainerMod.IContainer.Iterator[System, Deque[System], Iterator[System], ReverseIterator[System], System] = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def erase(first: Iterator[System], last: Iterator[System]): Iterator[System] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[System]): Iterator[System] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def front(): System = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def front(`val`: System): Unit = js.native
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * Open server.
      *
      * @param port Port number to open.
      */
    /* CompleteClass */
    override def open(port: Double): Unit = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* InferMemberOverrides */
    override def push(items: System*): Double = js.native
    /**
      * Insert an element at the end.
      *
      * @param val Value to insert.
      */
    /* InferMemberOverrides */
    override def push_back(`val`: System): Unit = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[System] = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[System] = js.native
    /**
      * Number of elements in the container.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def size(): Double = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def swap(obj: Deque[System]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[System] = js.native
  }
  
}

