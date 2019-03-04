package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalBuilder4[A, B, C, D, E] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  var od: js.Any
  var oe: js.Any
  def chain[F](of: Optional[F]): OptionalBuilder5[A, B, C, D, E, F]
  def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Optional[F]
}

object OptionalBuilder4 {
  @scala.inline
  def apply[A, B, C, D, E](
    chain: js.Function1[Optional[js.Any], OptionalBuilder5[A, B, C, D, E, js.Any]],
    oa: js.Any,
    ob: js.Any,
    oc: js.Any,
    od: js.Any,
    oe: js.Any,
    run: js.Function1[
      js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, js.Any], 
      Optional[js.Any]
    ]
  ): OptionalBuilder4[A, B, C, D, E] = {
    val __obj = js.Dynamic.literal(chain = chain, oa = oa, ob = ob, oc = oc, od = od, oe = oe, run = run)
  
    __obj.asInstanceOf[OptionalBuilder4[A, B, C, D, E]]
  }
}

