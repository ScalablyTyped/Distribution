package typings.serialport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCts extends js.Object {
  var cts: Boolean
  var dcd: Boolean
  var dsr: Boolean
}

object AnonCts {
  @scala.inline
  def apply(cts: Boolean, dcd: Boolean, dsr: Boolean): AnonCts = {
    val __obj = js.Dynamic.literal(cts = cts.asInstanceOf[js.Any], dcd = dcd.asInstanceOf[js.Any], dsr = dsr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCts]
  }
}

