package typings.prex

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("prex/out/lib/stack", "AsyncStack")
  @js.native
  /**
    * Initializes a new instance of the AsyncStack class.
    *
    * @param iterable An optional iterable of values or promises.
    */
  class AsyncStack[T] () extends StObject {
    def this(iterable: Iterable[T | js.Thenable[T]]) = this()
    
    var _available: js.Any = js.native
    
    var _pending: js.Any = js.native
    
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
    
    /**
      * Gets the number of entries in the stack.
      * When positive, indicates the number of entries available to get.
      * When negative, indicates the number of requests waiting to be fulfilled.
      */
    def size: Double = js.native
  }
}
