package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "FutureBuilder5")
@js.native
class FutureBuilder5[A, B, C, D, E, F] protected () extends js.Object {
  def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D], oe: Future[E], of: Future[F]) = this()
  var oa: js.Any = js.native
  var ob: js.Any = js.native
  var oc: js.Any = js.native
  var od: js.Any = js.native
  var oe: js.Any = js.native
  var of: js.Any = js.native
  def run[G](f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G]): Future[G] = js.native
}

