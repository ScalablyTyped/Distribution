package typings
package servicenowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideSchedule")
@js.native
class GlideSchedule () extends js.Object {
  def this(sysId: java.lang.String, timeZone: java.lang.String) = this()
  def add(startDate: GlideDateTime, offset: GlideDuration): GlideDateTime = js.native
  def duration(startDate: GlideDateTime, endDate: GlideDateTime): GlideDuration = js.native
  def getName(): java.lang.String = js.native
  def isInSchedule(time: GlideDateTime): java.lang.String = js.native
  def isValid(): scala.Boolean = js.native
  def load(sysId: java.lang.String, timeZone: java.lang.String, excludeSpanId: java.lang.String): scala.Unit = js.native
  def setTimeZone(tz: java.lang.String): scala.Unit = js.native
  def whenNext(time: GlideDateTime, timeZone: java.lang.String): scala.Double = js.native
}

