package typings.sat.SAT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var a: js.Any = js.native
  var aInB: Boolean = js.native
  var b: js.Any = js.native
  var bInA: Boolean = js.native
  var overlap: Double = js.native
  var overlapN: Vector = js.native
  var overlapV: Vector = js.native
  def clear(): Response = js.native
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
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setA(value: js.Any): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setAInB(value: Boolean): Self = this.set("aInB", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: js.Any): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setBInA(value: Boolean): Self = this.set("bInA", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Response): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setOverlap(value: Double): Self = this.set("overlap", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlapN(value: Vector): Self = this.set("overlapN", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlapV(value: Vector): Self = this.set("overlapV", value.asInstanceOf[js.Any])
  }
  
}

