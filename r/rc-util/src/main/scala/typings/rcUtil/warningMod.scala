package typings.rcUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-util/lib/warning", JSImport.Namespace)
@js.native
object warningMod extends js.Object {
  def call(
    method: js.Function2[/* valid */ Boolean, /* message */ String, Unit],
    valid: Boolean,
    message: String
  ): Unit = js.native
  def default(valid: Boolean, message: String): Unit = js.native
  def note(valid: Boolean, message: String): Unit = js.native
  def noteOnce(valid: Boolean, message: String): Unit = js.native
  def resetWarned(): Unit = js.native
  def warning(valid: Boolean, message: String): Unit = js.native
  def warningOnce(valid: Boolean, message: String): Unit = js.native
}

