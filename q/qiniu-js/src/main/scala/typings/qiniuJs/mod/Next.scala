package typings.qiniuJs.mod

import typings.qiniuJs.AnonLoaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  var total: AnonLoaded
}

object Next {
  @scala.inline
  def apply(total: AnonLoaded): Next = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
}

