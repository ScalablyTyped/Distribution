package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalInfo extends js.Object {
  /** The signal name (e.g. SIGUSR1). */
  var name: String
}

object SignalInfo {
  @scala.inline
  def apply(name: String): SignalInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignalInfo]
  }
}

