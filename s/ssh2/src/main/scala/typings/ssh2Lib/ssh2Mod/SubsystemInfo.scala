package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubsystemInfo extends js.Object {
  /** The name of the subsystem. */
  var name: java.lang.String
}

object SubsystemInfo {
  @scala.inline
  def apply(name: java.lang.String): SubsystemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SubsystemInfo]
  }
}

