package typings.promiseDashSequential

import typings.promiseDashSequential.promiseDashSequentialMod.PromiseFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-sequential", JSImport.Namespace)
@js.native
object promiseDashSequentialMod extends js.Object {
  def apply(promises: js.Array[PromiseFunction]): js.Promise[js.Array[_]] = js.native
  type PromiseFunction = js.Function0[js.Promise[js.Any]]
}

