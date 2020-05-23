package typings.servicenow.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideSchedule")
@js.native
class GlideSchedule ()
  extends typings.servicenow.GlideSchedule {
  def this(sysId: String, timeZone: String) = this()
  /* CompleteClass */
  override def add(startDate: typings.servicenow.GlideDateTime, offset: typings.servicenow.GlideDuration): typings.servicenow.GlideDateTime = js.native
  /* CompleteClass */
  override def duration(startDate: typings.servicenow.GlideDateTime, endDate: typings.servicenow.GlideDateTime): typings.servicenow.GlideDuration = js.native
  /* CompleteClass */
  override def getName(): String = js.native
  /* CompleteClass */
  override def isInSchedule(time: typings.servicenow.GlideDateTime): String = js.native
  /* CompleteClass */
  override def isValid(): Boolean = js.native
  /* CompleteClass */
  override def load(sysId: String, timeZone: String, excludeSpanId: String): Unit = js.native
  /* CompleteClass */
  override def setTimeZone(tz: String): Unit = js.native
  /* CompleteClass */
  override def whenNext(time: typings.servicenow.GlideDateTime, timeZone: String): Double = js.native
}

