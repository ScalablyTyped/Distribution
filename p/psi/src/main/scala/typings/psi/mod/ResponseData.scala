package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseData extends js.Object {
  var data: Result
}

object ResponseData {
  @scala.inline
  def apply(data: Result): ResponseData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseData]
  }
}

