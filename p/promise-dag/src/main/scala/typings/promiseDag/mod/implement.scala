package typings.promiseDag.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-dag", "implement")
@js.native
object implement extends js.Object {
  def apply[P /* <: js.Thenable[_] */](implementation: PromiseImplementation[P]): Run_[P] = js.native
}

