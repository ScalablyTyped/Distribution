package typings.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform[HSS, ESS, S, RS] extends js.Object {
  var in: TransformInbound[HSS, ESS, S]
  var out: TransformOutbound[ESS, HSS, RS]
}

object Transform {
  @scala.inline
  def apply[HSS, ESS, S, RS](in: (HSS, /* key */ String, S) => ESS, out: (ESS, /* key */ String, RS) => HSS): Transform[HSS, ESS, S, RS] = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction3(in), out = js.Any.fromFunction3(out))
  
    __obj.asInstanceOf[Transform[HSS, ESS, S, RS]]
  }
}

