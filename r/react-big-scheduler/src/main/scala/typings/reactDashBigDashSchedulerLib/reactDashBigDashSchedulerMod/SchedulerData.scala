package typings
package reactDashBigDashSchedulerLib.reactDashBigDashSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-big-scheduler", "SchedulerData")
@js.native
class SchedulerData protected () extends js.Object {
  def this(date: js.UndefOr[java.lang.String], viewType: js.UndefOr[ViewTypes], showAgenda: js.UndefOr[scala.Boolean], isEventPerspective: js.UndefOr[scala.Boolean], newConfig: js.UndefOr[SchedulerDataConfig], newBehaviours: js.UndefOr[js.Object], localeMoment: js.UndefOr[reactDashBigDashSchedulerLib.Anon_CalendarFormat]) = this()
  var cellUnit: CellUnits = js.native
  var startDate: java.lang.String = js.native
  var viewType: ViewTypes = js.native
  def localeMoment(date: java.lang.String): momentLib.momentMod.Moment = js.native
  def next(): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def setDate(): scala.Unit = js.native
  def setDate(date: java.lang.String): scala.Unit = js.native
  def setEvents(events: js.Array[Event]): scala.Unit = js.native
  def setResources(resources: js.Array[Resource]): scala.Unit = js.native
  def setViewType(): scala.Unit = js.native
  def setViewType(viewType: ViewTypes): scala.Unit = js.native
  def setViewType(viewType: ViewTypes, showAgenda: scala.Boolean): scala.Unit = js.native
  def setViewType(viewType: ViewTypes, showAgenda: scala.Boolean, isEventPerspective: scala.Boolean): scala.Unit = js.native
}

