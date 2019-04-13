package typings
package scalikeLib.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "FutureBuilder3")
@js.native
class FutureBuilder3[A, B, C, D] protected () extends js.Object {
  def this(oa: Future[A], ob: Future[B], oc: Future[C], od: Future[D]) = this()
  var oa: js.Any = js.native
  var ob: js.Any = js.native
  var oc: js.Any = js.native
  var od: js.Any = js.native
  def chain[E](oe: Future[E]): FutureBuilder4[A, B, C, D, E] = js.native
  def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Future[E] = js.native
}

