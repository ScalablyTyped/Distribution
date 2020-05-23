package typings.ptyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Master extends js.Object {
  var master: Double
  var pty: String
  var slave: Double
}

object Master {
  @scala.inline
  def apply(master: Double, pty: String, slave: Double): Master = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Master]
  }
}

