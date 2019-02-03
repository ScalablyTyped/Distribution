package typings
package sharepointLib.SPNs.UINs.ApplicationPagesNs

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
  def firstInstance(): sharepointLib.SPNs.UINs.ApplicationPagesNs.ICalendarController = js.native
  def lookupInstance(instanceId: java.lang.String): sharepointLib.SPNs.UINs.ApplicationPagesNs.ICalendarController = js.native
  def registerInstance(
    instanceId: java.lang.String,
    contoller: sharepointLib.SPNs.UINs.ApplicationPagesNs.ICalendarController
  ): scala.Unit = js.native
}

