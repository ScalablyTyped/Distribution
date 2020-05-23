package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseRejectionEvent extends Event {
  val promise: js.Promise[_] = js.native
  val reason: js.Any = js.native
}

