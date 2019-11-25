package typings.ptyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Master extends js.Object {
  var master: Double
  var pty: String
  var slave: Double
}

object Anon_Master {
  @scala.inline
  def apply(master: Double, pty: String, slave: Double): Anon_Master = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Master]
  }
}

