package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalBuilder3[A, B, C, D] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  var od: js.Any
  def chain[E](oe: Optional[E]): OptionalBuilder4[A, B, C, D, E]
  def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Optional[E]
}

object OptionalBuilder3 {
  @scala.inline
  def apply[A, B, C, D](
    chain: Optional[js.Any] => OptionalBuilder4[A, B, C, D, js.Any],
    oa: js.Any,
    ob: js.Any,
    oc: js.Any,
    od: js.Any,
    run: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, js.Any] => Optional[js.Any]
  ): OptionalBuilder3[A, B, C, D] = {
    val __obj = js.Dynamic.literal(chain = js.Any.fromFunction1(chain), oa = oa, ob = ob, oc = oc, od = od, run = js.Any.fromFunction1(run))
  
    __obj.asInstanceOf[OptionalBuilder3[A, B, C, D]]
  }
}

