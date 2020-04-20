package typings.reactRnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxSize extends js.Object {
  var maxHeight: Double | String
  var maxWidth: Double | String
}

object MaxSize {
  @scala.inline
  def apply(maxHeight: Double | String, maxWidth: Double | String): MaxSize = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxSize]
  }
}

