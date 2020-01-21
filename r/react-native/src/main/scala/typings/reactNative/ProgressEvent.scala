package typings.reactNative

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// XMLHttpRequest
//
@js.native
trait ProgressEvent extends Event_ {
  val lengthComputable: Boolean = js.native
  val loaded: Double = js.native
  val total: Double = js.native
}

