package typings.serialport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cts extends js.Object {
  var cts: Boolean
  var dcd: Boolean
  var dsr: Boolean
}

object Anon_Cts {
  @scala.inline
  def apply(cts: Boolean, dcd: Boolean, dsr: Boolean): Anon_Cts = {
    val __obj = js.Dynamic.literal(cts = cts, dcd = dcd, dsr = dsr)
  
    __obj.asInstanceOf[Anon_Cts]
  }
}

