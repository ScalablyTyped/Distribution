package typings
package rxjsLib.internalObservableGenerateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateOptions[T, S] extends GenerateBaseOptions[S] {
  /**
       * Result selection function that accepts state and returns a value to emit.
       */
  @JSName("resultSelector")
  var resultSelector_Original: ResultFunc[S, T] = js.native
  /**
       * Result selection function that accepts state and returns a value to emit.
       */
  def resultSelector(state: S): T = js.native
}

