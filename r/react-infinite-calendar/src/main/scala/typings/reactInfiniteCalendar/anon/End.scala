package typings.reactInfiniteCalendar.anon

import typings.reactInfiniteCalendar.mod.DateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: DateType
  var start: DateType
}

object End {
  @scala.inline
  def apply(end: DateType, start: DateType): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

