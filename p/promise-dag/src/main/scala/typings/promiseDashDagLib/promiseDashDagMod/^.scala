package typings
package promiseDashDagLib.promiseDashDagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-dag", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val run: Run[js.Promise[js.Any]] = js.native
  def implement[P /* <: js.Thenable[_] */](implementation: PromiseImplementation[P]): Run[P] = js.native
}

