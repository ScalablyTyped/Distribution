package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryBuilder4[A, B, C, D, E] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  var od: js.Any
  var oe: js.Any
  def chain[F](of: Try[F]): TryBuilder5[A, B, C, D, E, F]
  def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Try[F]
}

object TryBuilder4 {
  @scala.inline
  def apply[A, B, C, D, E](
    chain: Try[js.Any] => TryBuilder5[A, B, C, D, E, js.Any],
    oa: js.Any,
    ob: js.Any,
    oc: js.Any,
    od: js.Any,
    oe: js.Any,
    run: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, js.Any] => Try[js.Any]
  ): TryBuilder4[A, B, C, D, E] = {
    val __obj = js.Dynamic.literal(chain = js.Any.fromFunction1(chain), oa = oa, ob = ob, oc = oc, od = od, oe = oe, run = js.Any.fromFunction1(run))
  
    __obj.asInstanceOf[TryBuilder4[A, B, C, D, E]]
  }
}

