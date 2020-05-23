package typings.qiniuJs.mod

import typings.qiniuJs.anon.Loaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  var total: Loaded
}

object Next {
  @scala.inline
  def apply(total: Loaded): Next = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
}

