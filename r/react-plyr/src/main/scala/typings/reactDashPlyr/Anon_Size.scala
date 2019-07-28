package typings.reactDashPlyr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Size extends js.Object {
  var size: js.UndefOr[String] = js.undefined
  var src: String
  var `type`: String
}

object Anon_Size {
  @scala.inline
  def apply(src: String, `type`: String, size: String = null): Anon_Size = {
    val __obj = js.Dynamic.literal(src = src)
    __obj.updateDynamic("type")(`type`)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Size]
  }
}

