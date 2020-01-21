package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  var next: Double
  var prev: Double
}

object AnonNext {
  @scala.inline
  def apply(next: Double, prev: Double): AnonNext = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNext]
  }
}

