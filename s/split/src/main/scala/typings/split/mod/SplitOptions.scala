package typings.split.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitOptions extends js.Object {
  var maxLength: Double
}

object SplitOptions {
  @scala.inline
  def apply(maxLength: Double): SplitOptions = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SplitOptions]
  }
}

