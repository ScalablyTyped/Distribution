package typings.serialport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cts extends js.Object {
  var cts: Boolean
  var dcd: Boolean
  var dsr: Boolean
}

object Cts {
  @scala.inline
  def apply(cts: Boolean, dcd: Boolean, dsr: Boolean): Cts = {
    val __obj = js.Dynamic.literal(cts = cts.asInstanceOf[js.Any], dcd = dcd.asInstanceOf[js.Any], dsr = dsr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cts]
  }
}

