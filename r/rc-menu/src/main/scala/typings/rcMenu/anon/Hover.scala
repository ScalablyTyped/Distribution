package typings.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hover extends js.Object {
  var hover: Boolean
  var key: typings.react.mod.Key
}

object Hover {
  @scala.inline
  def apply(hover: Boolean, key: typings.react.mod.Key): Hover = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
}

