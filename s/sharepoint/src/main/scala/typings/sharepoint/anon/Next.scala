package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  var next: Double
  var prev: Double
}

object Next {
  @scala.inline
  def apply(next: Double, prev: Double): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
}

