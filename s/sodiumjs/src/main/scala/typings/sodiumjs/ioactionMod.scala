package typings.sodiumjs

import typings.sodiumjs.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioactionMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/IOAction", "IOAction")
  @js.native
  class IOAction () extends StObject
  /* static members */
  object IOAction {
    
    /*!
      * Convert a function that performs asynchronous I/O taking input A
      * and returning a value of type B into an I/O action of type
      * (sa : Stream<A>) => Stream<B>
      */
    @JSImport("sodiumjs/dist/typings/sodium/IOAction", "IOAction.fromAsync")
    @js.native
    def fromAsync[A, B](performIO: js.Function2[/* a */ A, /* result */ js.Function1[/* b */ B, Unit], Unit]): js.Function1[/* sa */ Stream[A], Stream[B]] = js.native
  }
}
