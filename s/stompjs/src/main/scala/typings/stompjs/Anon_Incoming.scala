package typings.stompjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Incoming extends js.Object {
  var incoming: Double
  var outgoing: Double
}

object Anon_Incoming {
  @scala.inline
  def apply(incoming: Double, outgoing: Double): Anon_Incoming = {
    val __obj = js.Dynamic.literal(incoming = incoming, outgoing = outgoing)
  
    __obj.asInstanceOf[Anon_Incoming]
  }
}

