package typings.samchon

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import typings.tstl.containerDequeMod.Deque
import typings.tstl.containerDequeMod.Deque.Iterator
import typings.tstl.containerDequeMod.Deque.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/interfaces/IExternalServerClientArray", JSImport.Namespace)
@js.native
object templatesExternalInterfacesIExternalServerClientArrayMod extends js.Object {
  @js.native
  trait IExternalServerClientArray[System /* <: ExternalSystem */]
    extends ExternalSystemArray[System]
       with IServer {
    /* CompleteClass */
    /* InferMemberOverrides */
    override def addEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def begin(): typings.tstl.baseIteratorIteratorMod.Iterator[System, Deque[System], Iterator[System], ReverseIterator[System], System] = js.native
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
    /* CompleteClass */
    /* InferMemberOverrides */
    override def dispatchEvent(event: CollectionEvent[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Test whether container is empty.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def empty(): Boolean = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def end(): typings.tstl.baseIteratorIteratorMod.Iterator[System, Deque[System], Iterator[System], ReverseIterator[System], System] = js.native
    /* CompleteClass */
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
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
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[System] = js.native
    /* CompleteClass */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[System] = js.native
    /**
      * Number of elements in the container.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def size(): Double = js.native
  }
  
}

