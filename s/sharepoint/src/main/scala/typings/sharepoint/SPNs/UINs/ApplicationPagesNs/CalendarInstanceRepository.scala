package typings.sharepoint.SPNs.UINs.ApplicationPagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages.CalendarInstanceRepository")
@js.native
class CalendarInstanceRepository () extends js.Object

/* static members */
@JSGlobal("SP.UI.ApplicationPages.CalendarInstanceRepository")
@js.native
object CalendarInstanceRepository extends js.Object {
  def firstInstance(): ICalendarController = js.native
  def lookupInstance(instanceId: String): ICalendarController = js.native
  def registerInstance(instanceId: String, contoller: ICalendarController): Unit = js.native
}

