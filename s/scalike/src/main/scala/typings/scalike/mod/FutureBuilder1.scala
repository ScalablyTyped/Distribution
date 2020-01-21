package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "FutureBuilder1")
@js.native
class FutureBuilder1[A, B] protected () extends js.Object {
  def this(oa: Future[A], ob: Future[B]) = this()
  var oa: js.Any = js.native
  var ob: js.Any = js.native
  def chain[C](oc: Future[C]): FutureBuilder2[A, B, C] = js.native
  def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Future[C] = js.native
}

