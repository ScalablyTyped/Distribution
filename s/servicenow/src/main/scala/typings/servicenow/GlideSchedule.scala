package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideSchedule extends js.Object {
  def add(startDate: GlideDateTime, offset: GlideDuration): GlideDateTime = js.native
  def duration(startDate: GlideDateTime, endDate: GlideDateTime): GlideDuration = js.native
  def getName(): String = js.native
  def isInSchedule(time: GlideDateTime): String = js.native
  def isValid(): Boolean = js.native
  def load(sysId: String, timeZone: String, excludeSpanId: String): Unit = js.native
  def setTimeZone(tz: String): Unit = js.native
  def whenNext(time: GlideDateTime, timeZone: String): Double = js.native
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
  @scala.inline
  implicit class GlideScheduleOps[Self <: GlideSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (GlideDateTime, GlideDuration) => GlideDateTime): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setDuration(value: (GlideDateTime, GlideDateTime) => GlideDuration): Self = this.set("duration", js.Any.fromFunction2(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setIsInSchedule(value: GlideDateTime => String): Self = this.set("isInSchedule", js.Any.fromFunction1(value))
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def setLoad(value: (String, String, String) => Unit): Self = this.set("load", js.Any.fromFunction3(value))
    @scala.inline
    def setSetTimeZone(value: String => Unit): Self = this.set("setTimeZone", js.Any.fromFunction1(value))
    @scala.inline
    def setWhenNext(value: (GlideDateTime, String) => Double): Self = this.set("whenNext", js.Any.fromFunction2(value))
  }
  
}

