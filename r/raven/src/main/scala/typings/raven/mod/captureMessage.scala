package typings.raven.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "captureMessage")
@js.native
object captureMessage extends js.Object {
  def apply(message: String): String = js.native
  def apply(message: String, cb: CaptureCallback): String = js.native
  def apply(message: String, options: CaptureOptions): String = js.native
  def apply(message: String, options: CaptureOptions, cb: CaptureCallback): String = js.native
}

