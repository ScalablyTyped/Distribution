package typings
package reactDashPlyrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Size extends js.Object {
  var size: js.UndefOr[java.lang.String] = js.undefined
  var src: java.lang.String
  var `type`: java.lang.String
}

object Anon_Size {
  @scala.inline
  def apply(src: java.lang.String, `type`: java.lang.String, size: java.lang.String = null): Anon_Size = {
    val __obj = js.Dynamic.literal(src = src)
    __obj.updateDynamic("type")(`type`)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Size]
  }
}

