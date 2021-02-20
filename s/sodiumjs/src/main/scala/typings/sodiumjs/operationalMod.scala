package typings.sodiumjs

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationalMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/Operational", "Operational")
  @js.native
  class Operational () extends StObject
  /* static members */
  object Operational {
    
    /**
      * Push each event onto a new transaction guaranteed to come before the next externally
      * initiated transaction. Same as {@link split(Stream)} but it works on a single value.
      */
    @JSImport("sodiumjs/dist/typings/sodium/Operational", "Operational.defer")
    @js.native
    def defer[A](s: Stream[A]): Stream[A] = js.native
    
    /**
      * Push each event in the list onto a newly created transaction guaranteed
      * to come before the next externally initiated transaction. Note that the semantics
      * are such that two different invocations of split() can put events into the same
      * new transaction, so the resulting stream's events could be simultaneous with
      * events output by split() or {@link defer(Stream)} invoked elsewhere in the code.
      */
    @JSImport("sodiumjs/dist/typings/sodium/Operational", "Operational.split")
    @js.native
    def split[A](s: Stream[js.Array[A]]): Stream[A] = js.native
    
    /**
      * A stream that gives the updates/steps for a {@link Cell}.
      * <P>
      * This is an OPERATIONAL primitive, which is not part of the main Sodium
      * API. It breaks the property of non-detectability of cell steps/updates.
      * The rule with this primitive is that you should only use it in functions
      * that do not allow the caller to detect the cell updates.
      */
    @JSImport("sodiumjs/dist/typings/sodium/Operational", "Operational.updates")
    @js.native
    def updates[A](c: Cell[A]): Stream[A] = js.native
    
    /**
      * A stream that is guaranteed to fire once in the transaction where value() is invoked, giving
      * the current value of the cell, and thereafter behaves like {@link updates(Cell)},
      * firing for each update/step of the cell's value.
      * <P>
      * This is an OPERATIONAL primitive, which is not part of the main Sodium
      * API. It breaks the property of non-detectability of cell steps/updates.
      * The rule with this primitive is that you should only use it in functions
      * that do not allow the caller to detect the cell updates.
      */
    @JSImport("sodiumjs/dist/typings/sodium/Operational", "Operational.value")
    @js.native
    def value[A](c: Cell[A]): Stream[A] = js.native
  }
}
