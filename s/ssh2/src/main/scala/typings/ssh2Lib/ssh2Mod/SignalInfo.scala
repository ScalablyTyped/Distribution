package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalInfo extends js.Object {
  /** The signal name (e.g. SIGUSR1). */
  var name: java.lang.String
}

object SignalInfo {
  @scala.inline
  def apply(name: java.lang.String): SignalInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SignalInfo]
  }
}

