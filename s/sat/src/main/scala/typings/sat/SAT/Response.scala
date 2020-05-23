package typings.sat.SAT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var a: js.Any
  var aInB: Boolean
  var b: js.Any
  var bInA: Boolean
  var overlap: Double
  var overlapN: Vector
  var overlapV: Vector
  def clear(): Response
}

object Response {
  @scala.inline
  def apply(
    a: js.Any,
    aInB: Boolean,
    b: js.Any,
    bInA: Boolean,
    clear: () => Response,
    overlap: Double,
    overlapN: Vector,
    overlapV: Vector
  ): Response = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], aInB = aInB.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], bInA = bInA.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), overlap = overlap.asInstanceOf[js.Any], overlapN = overlapN.asInstanceOf[js.Any], overlapV = overlapV.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

