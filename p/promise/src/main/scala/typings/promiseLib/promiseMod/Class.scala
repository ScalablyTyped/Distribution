package typings
package promiseLib.promiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise", JSImport.Namespace)
@js.native
class Class[T] protected () extends ThenPromise[T] {
  /**
    * Creates a new ThenPromise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  def this(executor: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | Thenable[T]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      _
    ]) = this()
}

