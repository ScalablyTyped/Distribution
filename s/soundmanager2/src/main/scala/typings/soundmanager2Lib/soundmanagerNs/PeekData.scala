package typings
package soundmanager2Lib.soundmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeekData extends js.Object {
  var left: scala.Double
  var right: scala.Double
}

object PeekData {
  @scala.inline
  def apply(left: scala.Double, right: scala.Double): PeekData = {
    val __obj = js.Dynamic.literal(left = left, right = right)
  
    __obj.asInstanceOf[PeekData]
  }
}

