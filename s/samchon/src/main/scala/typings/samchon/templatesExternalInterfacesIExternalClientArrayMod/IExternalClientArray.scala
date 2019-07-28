package typings.samchon.templatesExternalInterfacesIExternalClientArrayMod

import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.containerDequeMod.Deque
import typings.tstl.containerDequeMod.DequeNs.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExternalClientArray[System /* <: ExternalSystem */]
  extends ExternalSystemArray[System]
     with IServer {
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* InferMemberOverrides */
  override def begin(): Iterator[
    System, 
    Deque[System], 
    typings.tstl.containerDequeMod.DequeNs.Iterator[System], 
    ReverseIterator[System], 
    System
  ] = js.native
  /**
    * Test whether container is empty.
    */
  /* InferMemberOverrides */
  override def empty(): Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* InferMemberOverrides */
  override def end(): Iterator[
    System, 
    Deque[System], 
    typings.tstl.containerDequeMod.DequeNs.Iterator[System], 
    ReverseIterator[System], 
    System
  ] = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* InferMemberOverrides */
  override def push(items: System*): Double = js.native
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* InferMemberOverrides */
  override def rbegin(): ReverseIterator[System] = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  /* InferMemberOverrides */
  override def rend(): ReverseIterator[System] = js.native
  /**
    * Number of elements in the container.
    */
  /* InferMemberOverrides */
  override def size(): Double = js.native
}

