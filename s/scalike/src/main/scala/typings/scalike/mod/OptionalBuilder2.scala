package typings.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "OptionalBuilder2")
@js.native
class OptionalBuilder2[A, B, C] protected () extends js.Object {
  def this(oa: Optional[A], ob: Optional[B], oc: Optional[C]) = this()
  var oa: js.Any = js.native
  var ob: js.Any = js.native
  var oc: js.Any = js.native
  def chain[D](od: Optional[D]): OptionalBuilder3[A, B, C, D] = js.native
  def run[D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): Optional[D] = js.native
}

