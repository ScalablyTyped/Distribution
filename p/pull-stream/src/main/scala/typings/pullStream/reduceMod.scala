package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceMod {
  
  /**
    * Reduce stream into single value, then callback.
    */
  inline def apply[T, U](
    reducer: js.Function2[/* acc */ U | Null, /* data */ T, U],
    cb: js.Function2[/* err */ EndOrError, /* result */ U, Any]
  ): Sink[T] = (^.asInstanceOf[js.Dynamic].apply(reducer.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  inline def apply[T, U](
    reducer: js.Function2[/* acc */ U, /* data */ T, U],
    initial: U,
    cb: js.Function2[/* err */ EndOrError, /* result */ U, Any]
  ): Sink[T] = (^.asInstanceOf[js.Dynamic].apply(reducer.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Sink[T]]
  
  @JSImport("pull-stream/sinks/reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
