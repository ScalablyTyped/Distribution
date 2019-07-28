package typings.reactDashNative

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// XMLHttpRequest
//
@js.native
trait ProgressEvent extends Event {
  val lengthComputable: Boolean = js.native
  val loaded: Double = js.native
  val total: Double = js.native
}

