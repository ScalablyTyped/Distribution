package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalBuilder2[A, B, C] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  def chain[D](od: Optional[D]): OptionalBuilder3[A, B, C, D]
  def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Optional[D]
}

object OptionalBuilder2 {
  @scala.inline
  def apply[A, B, C](
    chain: js.Function1[Optional[js.Any], OptionalBuilder3[A, B, C, js.Any]],
    oa: js.Any,
    ob: js.Any,
    oc: js.Any,
    run: js.Function1[js.Function3[/* a */ A, /* b */ B, /* c */ C, js.Any], Optional[js.Any]]
  ): OptionalBuilder2[A, B, C] = {
    val __obj = js.Dynamic.literal(chain = chain, oa = oa, ob = ob, oc = oc, run = run)
  
    __obj.asInstanceOf[OptionalBuilder2[A, B, C]]
  }
}

