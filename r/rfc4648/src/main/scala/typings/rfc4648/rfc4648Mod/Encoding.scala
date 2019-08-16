package typings.rfc4648.rfc4648Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var bits: Double
  var chars: String
}

object Encoding {
  @scala.inline
  def apply(bits: Double, chars: String): Encoding = {
    val __obj = js.Dynamic.literal(bits = bits, chars = chars)
  
    __obj.asInstanceOf[Encoding]
  }
}

