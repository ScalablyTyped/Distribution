package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalBuilder5[A, B, C, D, E, F] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  var od: js.Any
  var oe: js.Any
  var of: js.Any
  def run[G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): Optional[G]
}

object OptionalBuilder5 {
  @scala.inline
  def apply[A, B, C, D, E, F](
    oa: js.Any,
    ob: js.Any,
    oc: js.Any,
    od: js.Any,
    oe: js.Any,
    of: js.Any,
    run: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, js.Any] => Optional[js.Any]
  ): OptionalBuilder5[A, B, C, D, E, F] = {
    val __obj = js.Dynamic.literal(oa = oa, ob = ob, oc = oc, od = od, oe = oe, of = of, run = js.Any.fromFunction1(run))
  
    __obj.asInstanceOf[OptionalBuilder5[A, B, C, D, E, F]]
  }
}

