package typings
package scalikeLib.scalikeMod.scalikeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryBuilder3[A, B, C, D] extends js.Object {
  var oa: js.Any
  var ob: js.Any
  var oc: js.Any
  var od: js.Any
  def chain[E](oe: Try[E]): TryBuilder4[A, B, C, D, E]
  def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Try[E]
}

object TryBuilder3 {
  @scala.inline
  def apply[A, B, C, D](
    chain: js.Function1[Try[js.Any], TryBuilder4[A, B, C, D, js.Any]],
    oa: js.Any,
    ob: js.Any,
    oc: js.Any,
    od: js.Any,
    run: js.Function1[js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, js.Any], Try[js.Any]]
  ): TryBuilder3[A, B, C, D] = {
    val __obj = js.Dynamic.literal(chain = chain, oa = oa, ob = ob, oc = oc, od = od, run = run)
  
    __obj.asInstanceOf[TryBuilder3[A, B, C, D]]
  }
}

