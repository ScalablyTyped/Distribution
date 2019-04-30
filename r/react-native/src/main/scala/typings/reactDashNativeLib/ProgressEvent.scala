package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// XMLHttpRequest
//
@js.native
trait ProgressEvent
  extends stdLib.Event {
  val lengthComputable: scala.Boolean = js.native
  val loaded: scala.Double = js.native
  val total: scala.Double = js.native
}

