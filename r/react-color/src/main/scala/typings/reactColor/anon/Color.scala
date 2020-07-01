package typings.reactColor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: String
  var title: String
}

object Color {
  @scala.inline
  def apply(color: String, title: String): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

