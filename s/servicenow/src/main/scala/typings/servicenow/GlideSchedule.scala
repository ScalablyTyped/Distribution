package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideSchedule")
@js.native
class GlideSchedule () extends js.Object {
  def this(sysId: String, timeZone: String) = this()
  def add(startDate: GlideDateTime, offset: GlideDuration): GlideDateTime = js.native
  def duration(startDate: GlideDateTime, endDate: GlideDateTime): GlideDuration = js.native
  def getName(): String = js.native
  def isInSchedule(time: GlideDateTime): String = js.native
  def isValid(): Boolean = js.native
  def load(sysId: String, timeZone: String, excludeSpanId: String): Unit = js.native
  def setTimeZone(tz: String): Unit = js.native
  def whenNext(time: GlideDateTime, timeZone: String): Double = js.native
}

