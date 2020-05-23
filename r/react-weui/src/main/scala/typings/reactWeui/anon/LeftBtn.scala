package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftBtn extends js.Object {
  var leftBtn: String
  var rightBtn: String
}

object LeftBtn {
  @scala.inline
  def apply(leftBtn: String, rightBtn: String): LeftBtn = {
    val __obj = js.Dynamic.literal(leftBtn = leftBtn.asInstanceOf[js.Any], rightBtn = rightBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftBtn]
  }
}

