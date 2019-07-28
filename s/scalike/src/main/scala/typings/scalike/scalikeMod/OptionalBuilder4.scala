package typings.scalike.scalikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "OptionalBuilder4")
@js.native
class OptionalBuilder4[A, B, C, D, E] protected () extends js.Object {
  def this(oa: Optional[A], ob: Optional[B], oc: Optional[C], od: Optional[D], oe: Optional[E]) = this()
  var oa: js.Any = js.native
  var ob: js.Any = js.native
  var oc: js.Any = js.native
  var od: js.Any = js.native
  var oe: js.Any = js.native
  def chain[F](of: Optional[F]): OptionalBuilder5[A, B, C, D, E, F] = js.native
  def run[F](f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]): Optional[F] = js.native
}

