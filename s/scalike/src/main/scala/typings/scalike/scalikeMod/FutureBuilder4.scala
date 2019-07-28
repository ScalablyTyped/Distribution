package typings.scalike.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "FutureBuilder4")
@js.native
class FutureBuilder4[A, B, C, D, E] protected () extends js.Object {
  def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D], oe: Future[E]) = this()
  var oa: js.Any = js.native
  var ob: js.Any = js.native
  var oc: js.Any = js.native
  var od: js.Any = js.native
  var oe: js.Any = js.native
  def chain[F](of: Future[F]): FutureBuilder5[A, B, C, D, E, F] = js.native
  def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Future[F] = js.native
}

