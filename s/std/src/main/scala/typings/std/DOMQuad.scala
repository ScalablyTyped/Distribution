package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMQuad extends js.Object {
  val p1: DOMPoint = js.native
  val p2: DOMPoint = js.native
  val p3: DOMPoint = js.native
  val p4: DOMPoint = js.native
  def getBounds(): DOMRect = js.native
  def toJSON(): js.Any = js.native
}

object DOMQuad {
  @scala.inline
  def apply(
    getBounds: () => DOMRect,
    p1: DOMPoint,
    p2: DOMPoint,
    p3: DOMPoint,
    p4: DOMPoint,
    toJSON: () => js.Any
  ): DOMQuad = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any], p4 = p4.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[DOMQuad]
  }
  @scala.inline
  implicit class DOMQuadOps[Self <: DOMQuad] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetBounds(value: () => DOMRect): Self = this.set("getBounds", js.Any.fromFunction0(value))
    @scala.inline
    def setP1(value: DOMPoint): Self = this.set("p1", value.asInstanceOf[js.Any])
    @scala.inline
    def setP2(value: DOMPoint): Self = this.set("p2", value.asInstanceOf[js.Any])
    @scala.inline
    def setP3(value: DOMPoint): Self = this.set("p3", value.asInstanceOf[js.Any])
    @scala.inline
    def setP4(value: DOMPoint): Self = this.set("p4", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

