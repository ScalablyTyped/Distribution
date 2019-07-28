package typings.ssh2.ssh2Mod

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
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[SignalInfo]
  }
}

