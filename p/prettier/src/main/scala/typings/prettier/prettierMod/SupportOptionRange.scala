package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportOptionRange extends js.Object {
  var end: Double
  var start: Double
  var step: Double
}

object SupportOptionRange {
  @scala.inline
  def apply(end: Double, start: Double, step: Double): SupportOptionRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SupportOptionRange]
  }
}

