package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeFormat extends js.Object {
  var long: String
  var medium: String
  var mediumLong: String
  var short: String
}

object TimeFormat {
  @scala.inline
  def apply(long: String, medium: String, mediumLong: String, short: String): TimeFormat = {
    val __obj = js.Dynamic.literal(long = long, medium = medium, mediumLong = mediumLong, short = short)
  
    __obj.asInstanceOf[TimeFormat]
  }
}

