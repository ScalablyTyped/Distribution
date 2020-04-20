package typings.sigmajs.SigmaJs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGObject[T] extends js.Object {
  def create(`object`: T, a: js.Any*): Element
  def update(`object`: T, a: js.Any*): Unit
}

object SVGObject {
  @scala.inline
  def apply[T](create: (T, /* repeated */ js.Any) => Element, update: (T, /* repeated */ js.Any) => Unit): SVGObject[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[SVGObject[T]]
  }
}

