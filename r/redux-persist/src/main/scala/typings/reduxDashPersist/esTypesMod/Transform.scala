package typings.reduxDashPersist.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform[HSS, ESS, S, RS] extends js.Object {
  var in: TransformInbound[HSS, ESS, S]
  var out: TransformOutbound[ESS, HSS, RS]
}

object Transform {
  @scala.inline
  def apply[HSS, ESS, S, RS](in: TransformInbound[HSS, ESS, S], out: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = {
    val __obj = js.Dynamic.literal(in = in, out = out)
  
    __obj.asInstanceOf[Transform[HSS, ESS, S, RS]]
  }
}

