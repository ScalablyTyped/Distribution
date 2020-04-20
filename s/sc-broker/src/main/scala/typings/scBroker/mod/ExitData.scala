package typings.scBroker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitData extends js.Object {
  var code: Double
  var id: String
  var pid: Double
  var signal: String
}

object ExitData {
  @scala.inline
  def apply(code: Double, id: String, pid: Double, signal: String): ExitData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitData]
  }
}

