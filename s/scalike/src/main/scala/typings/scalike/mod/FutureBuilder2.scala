package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "FutureBuilder2")
@js.native
class FutureBuilder2[A, B, C] protected () extends js.Object {
  def this(oa: Future[A], ob: Future[B], oc: Future[C]) = this()
  var oa: js.Any = js.native
  var ob: js.Any = js.native
  var oc: js.Any = js.native
  def chain[D](od: Future[D]): FutureBuilder3[A, B, C, D] = js.native
  def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Future[D] = js.native
}

