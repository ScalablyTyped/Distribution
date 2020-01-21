package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "TryBuilder5")
@js.native
class TryBuilder5[A, B, C, D, E, F] protected () extends js.Object {
  def this(oa: Try[A], ob: Try[B], oc: Try[C], od: Try[D], oe: Try[E], of: Try[F]) = this()
  var oa: js.Any = js.native
  var ob: js.Any = js.native
  var oc: js.Any = js.native
  var od: js.Any = js.native
  var oe: js.Any = js.native
  var of: js.Any = js.native
  def run[G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): Try[G] = js.native
}

