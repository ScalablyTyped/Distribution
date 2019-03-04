package typings
package splitLib.splitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitOptions extends js.Object {
  var maxLength: scala.Double
}

object SplitOptions {
  @scala.inline
  def apply(maxLength: scala.Double): SplitOptions = {
    val __obj = js.Dynamic.literal(maxLength = maxLength)
  
    __obj.asInstanceOf[SplitOptions]
  }
}

