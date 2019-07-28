package typings.scalike.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "TryBuilder1")
@js.native
class TryBuilder1[A, B] protected () extends js.Object {
  def this(oa: Try[A], ob: Try[B]) = this()
  var oa: js.Any = js.native
  var ob: js.Any = js.native
  def chain[C](oc: Try[C]): TryBuilder2[A, B, C] = js.native
  def run[C](f: js.Function2[/* a */ A, /* b */ B, C]): Try[C] = js.native
}

