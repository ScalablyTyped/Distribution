package typings.reactTether.mod.ReactTether

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetherAttachment extends js.Object {
  var left: String
  var top: String
}

object TetherAttachment {
  @scala.inline
  def apply(left: String, top: String): TetherAttachment = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetherAttachment]
  }
}

