package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMQuad extends js.Object {
  val p1: DOMPoint
  val p2: DOMPoint
  val p3: DOMPoint
  val p4: DOMPoint
  def getBounds(): DOMRect
  def toJSON(): js.Any
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
}

