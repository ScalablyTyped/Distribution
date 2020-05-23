package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideSchedule extends js.Object {
  def add(startDate: GlideDateTime, offset: GlideDuration): GlideDateTime
  def duration(startDate: GlideDateTime, endDate: GlideDateTime): GlideDuration
  def getName(): String
  def isInSchedule(time: GlideDateTime): String
  def isValid(): Boolean
  def load(sysId: String, timeZone: String, excludeSpanId: String): Unit
  def setTimeZone(tz: String): Unit
  def whenNext(time: GlideDateTime, timeZone: String): Double
}

object GlideSchedule {
  @scala.inline
  def apply(
    add: (GlideDateTime, GlideDuration) => GlideDateTime,
    duration: (GlideDateTime, GlideDateTime) => GlideDuration,
    getName: () => String,
    isInSchedule: GlideDateTime => String,
    isValid: () => Boolean,
    load: (String, String, String) => Unit,
    setTimeZone: String => Unit,
    whenNext: (GlideDateTime, String) => Double
  ): GlideSchedule = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), duration = js.Any.fromFunction2(duration), getName = js.Any.fromFunction0(getName), isInSchedule = js.Any.fromFunction1(isInSchedule), isValid = js.Any.fromFunction0(isValid), load = js.Any.fromFunction3(load), setTimeZone = js.Any.fromFunction1(setTimeZone), whenNext = js.Any.fromFunction2(whenNext))
    __obj.asInstanceOf[GlideSchedule]
  }
}

