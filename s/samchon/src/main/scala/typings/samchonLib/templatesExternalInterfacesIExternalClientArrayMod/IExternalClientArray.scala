package typings
package samchonLib.templatesExternalInterfacesIExternalClientArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExternalClientArray[System /* <: samchonLib.templatesExternalExternalSystemMod.ExternalSystem */]
  extends samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[System]
     with samchonLib.protocolServerIServerMod.IServer {
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def begin(): tstlLib.baseIteratorIteratorMod.Iterator[
    System, 
    tstlLib.containerDequeMod.Deque[System], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[System, tstlLib.containerDequeMod.Deque[System]], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[System, tstlLib.containerDequeMod.Deque[System]], 
    System
  ] = js.native
  /**
    * Test whether container is empty.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def empty(): scala.Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def end(): tstlLib.baseIteratorIteratorMod.Iterator[
    System, 
    tstlLib.containerDequeMod.Deque[System], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[System, tstlLib.containerDequeMod.Deque[System]], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[System, tstlLib.containerDequeMod.Deque[System]], 
    System
  ] = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* InferMemberOverrides */
  override def push(items: System*): scala.Double = js.native
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* InferMemberOverrides */
  override def rbegin(): tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[System, tstlLib.containerDequeMod.Deque[System]] = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  /* InferMemberOverrides */
  override def rend(): tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[System, tstlLib.containerDequeMod.Deque[System]] = js.native
  /**
    * Number of elements in the container.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def size(): scala.Double = js.native
}

