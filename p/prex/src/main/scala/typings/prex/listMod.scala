package typings.prex

import typings.std.Generator
import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  @js.native
  class LinkedList[T] () extends js.Object {
    def this(iterable: Iterable[T]) = this()
    var _deleteNode: js.Any = js.native
    var _head: js.Any = js.native
    var _insertNode: js.Any = js.native
    var _size: js.Any = js.native
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[T, _, js.UndefOr[scala.Nothing]]] = js.native
    def clear(): Unit = js.native
    def delete(value: T): Boolean = js.native
    def deleteAll(
      predicate: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): Double = js.native
    def deleteAll(
      predicate: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: js.Any
    ): Double = js.native
    def deleteNode(): Boolean = js.native
    def deleteNode(node: LinkedListNode[T]): Boolean = js.native
    def drain(): Generator[js.UndefOr[T], Unit, _] = js.native
    def find(value: T): js.UndefOr[LinkedListNode[T]] = js.native
    def findLast(value: T): js.UndefOr[LinkedListNode[T]] = js.native
    def first: js.UndefOr[LinkedListNode[T]] = js.native
    def forEach(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Unit]
    ): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
    def has(value: T): Boolean = js.native
    def insertAfter(node: LinkedListNode[T], value: T): LinkedListNode[T] = js.native
    def insertBefore(node: LinkedListNode[T], value: T): LinkedListNode[T] = js.native
    def insertNodeAfter(node: LinkedListNode[T], newNode: LinkedListNode[T]): Unit = js.native
    def insertNodeBefore(node: LinkedListNode[T], newNode: LinkedListNode[T]): Unit = js.native
    def last: js.UndefOr[LinkedListNode[T]] = js.native
    def nodes(): Generator[LinkedListNode[T], Unit, _] = js.native
    def pop(): js.UndefOr[T] = js.native
    def popNode(): js.UndefOr[LinkedListNode[T]] = js.native
    def push(): LinkedListNode[T] = js.native
    def push(value: T): LinkedListNode[T] = js.native
    def pushNode(newNode: LinkedListNode[T]): Unit = js.native
    def shift(): js.UndefOr[T] = js.native
    def shiftNode(): js.UndefOr[LinkedListNode[T]] = js.native
    def size: Double = js.native
    def unshift(): LinkedListNode[T] = js.native
    def unshift(value: T): LinkedListNode[T] = js.native
    def unshiftNode(newNode: LinkedListNode[T]): Unit = js.native
    def values(): Generator[js.UndefOr[T], Unit, _] = js.native
  }
  
  @js.native
  class LinkedListNode[T] () extends js.Object {
    def this(value: T) = this()
    var value: js.UndefOr[T] = js.native
    def list: js.UndefOr[LinkedList[T]] = js.native
    def next: js.UndefOr[LinkedListNode[T]] = js.native
    def previous: js.UndefOr[LinkedListNode[T]] = js.native
  }
  
}

