package typings.ptyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaster extends js.Object {
  var master: Double
  var pty: String
  var slave: Double
}

object AnonMaster {
  @scala.inline
  def apply(master: Double, pty: String, slave: Double): AnonMaster = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaster]
  }
}

