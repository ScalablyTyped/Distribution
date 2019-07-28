package typings.rcDashMentions.libUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasureIndex extends js.Object {
  var location: Double
  var prefix: String
}

object MeasureIndex {
  @scala.inline
  def apply(location: Double, prefix: String): MeasureIndex = {
    val __obj = js.Dynamic.literal(location = location, prefix = prefix)
  
    __obj.asInstanceOf[MeasureIndex]
  }
}

