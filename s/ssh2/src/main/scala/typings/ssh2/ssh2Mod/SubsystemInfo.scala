package typings.ssh2.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubsystemInfo extends js.Object {
  /** The name of the subsystem. */
  var name: String
}

object SubsystemInfo {
  @scala.inline
  def apply(name: String): SubsystemInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubsystemInfo]
  }
}

