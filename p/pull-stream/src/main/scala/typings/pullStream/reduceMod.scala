package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceMod {
  
  /**
    * Reduce stream into single value, then callback.
    */
  @JSImport("pull-stream/sinks/reduce", JSImport.Namespace)
  @js.native
  def apply[T, U](
    reducer: js.Function2[/* acc */ U | Null, /* data */ T, U],
    cb: js.Function2[/* err */ EndOrError, /* result */ U, _]
  ): Sink[T] = js.native
  @JSImport("pull-stream/sinks/reduce", JSImport.Namespace)
  @js.native
  def apply[T, U](
    reducer: js.Function2[/* acc */ U, /* data */ T, U],
    initial: U,
    cb: js.Function2[/* err */ EndOrError, /* result */ U, _]
  ): Sink[T] = js.native
}
