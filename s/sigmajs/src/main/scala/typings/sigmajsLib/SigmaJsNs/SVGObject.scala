package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGObject[T] extends js.Object {
  def create(`object`: T, a: js.Any*): stdLib.Element
  def update(`object`: T, a: js.Any*): scala.Unit
}

object SVGObject {
  @scala.inline
  def apply[T](
    create: js.Function2[T, /* repeated */ js.Any, stdLib.Element],
    update: js.Function2[T, /* repeated */ js.Any, scala.Unit]
  ): SVGObject[T] = {
    val __obj = js.Dynamic.literal(create = create, update = update)
  
    __obj.asInstanceOf[SVGObject[T]]
  }
}

