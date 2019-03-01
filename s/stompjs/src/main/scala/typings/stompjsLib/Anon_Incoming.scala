package typings
package stompjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Incoming extends js.Object {
  var incoming: scala.Double
  var outgoing: scala.Double
}

object Anon_Incoming {
  @scala.inline
  def apply(incoming: scala.Double, outgoing: scala.Double): Anon_Incoming = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("incoming")(incoming)
    __obj.updateDynamic("outgoing")(outgoing)
    __obj.asInstanceOf[Anon_Incoming]
  }
}

