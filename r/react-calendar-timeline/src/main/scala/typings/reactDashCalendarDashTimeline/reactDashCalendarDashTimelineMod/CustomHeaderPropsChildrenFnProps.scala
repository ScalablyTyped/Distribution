package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.moment.momentMod.Moment
import typings.reactDashCalendarDashTimeline.Anon_Key
import typings.reactDashCalendarDashTimeline.Anon_Style
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomHeaderPropsChildrenFnProps[Data] extends js.Object {
  var data: Data = js.native
  var headerContext: HeaderContext = js.native
  var timelineContext: TimelineContext = js.native
  def getIntervalProps(): Required[GetIntervalProps] with Anon_Key = js.native
  def getIntervalProps(props: GetIntervalProps): Required[GetIntervalProps] with Anon_Key = js.native
  def getRootProps(): Anon_Style = js.native
  def getRootProps(propsToOverride: Anon_Style): Anon_Style = js.native
  def showPeriod(startDate: Double, endDate: Double): scala.Unit = js.native
  def showPeriod(startDate: Double, endDate: Moment): scala.Unit = js.native
  def showPeriod(startDate: Moment, endDate: Double): scala.Unit = js.native
  def showPeriod(startDate: Moment, endDate: Moment): scala.Unit = js.native
}

