package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "OptionalBuilder3")
@js.native
class OptionalBuilder3[A, B, C, D] protected () extends js.Object {
  def this(oa: Optional[A], ob: Optional[B], oc: Optional[C], od: Optional[D]) = this()
  var oa: js.Any = js.native
  var ob: js.Any = js.native
  var oc: js.Any = js.native
  var od: js.Any = js.native
  def chain[E](oe: Optional[E]): OptionalBuilder4[A, B, C, D, E] = js.native
  def run[E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): Optional[E] = js.native
}

