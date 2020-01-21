package typings.reactBigScheduler.mod

import typings.moment.mod.Moment
import typings.reactBigScheduler.AnonCalendarFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-big-scheduler", "SchedulerData")
@js.native
class SchedulerData protected () extends js.Object {
  def this(
    date: js.UndefOr[String],
    viewType: js.UndefOr[ViewTypes],
    showAgenda: js.UndefOr[Boolean],
    isEventPerspective: js.UndefOr[Boolean],
    newConfig: js.UndefOr[SchedulerDataConfig],
    newBehaviours: js.UndefOr[js.Object],
    localeMoment: js.UndefOr[AnonCalendarFormat]
  ) = this()
  var cellUnit: CellUnits = js.native
  var startDate: String = js.native
  var viewType: ViewTypes = js.native
  def localeMoment(date: String): Moment = js.native
  def next(): Unit = js.native
  def prev(): Unit = js.native
  def setDate(): Unit = js.native
  def setDate(date: String): Unit = js.native
  def setEvents(events: js.Array[Event]): Unit = js.native
  def setResources(resources: js.Array[Resource]): Unit = js.native
  def setViewType(): Unit = js.native
  def setViewType(viewType: ViewTypes): Unit = js.native
  def setViewType(viewType: ViewTypes, showAgenda: Boolean): Unit = js.native
  def setViewType(viewType: ViewTypes, showAgenda: Boolean, isEventPerspective: Boolean): Unit = js.native
}

