package typings.prex

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/stack", JSImport.Namespace)
@js.native
object stackMod extends js.Object {
  @js.native
  /**
    * Initializes a new instance of the AsyncStack class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncStack[T] () extends js.Object {
    def this(iterable: Iterable[T | js.Thenable[T]]) = this()
    var _available: js.Any = js.native
    var _pending: js.Any = js.native
    /**
      * Gets the number of entries in the stack.
      * When positive, indicates the number of entries available to get.
      * When negative, indicates the number of requests waiting to be fulfilled.
      */
    val size: Double = js.native
    /**
      * Removes and returns a Promise for the top value of the stack. If the stack is empty,
      * returns a Promise for the next value to be pushed on to the stack.
      */
    def pop(): js.Promise[T] = js.native
    /**
      * Adds a value to the top of the stack. If the stack is empty but has a pending
      * pop request, the value will be popped and the request fulfilled.
      *
      * @param value A value or promise to add to the stack.
      */
    def push(value: T): Unit = js.native
    def push(value: js.Thenable[T]): Unit = js.native
  }
  
}

