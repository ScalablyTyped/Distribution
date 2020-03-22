package typings.reactCalendarTimeline.mod

import typings.moment.mod.Moment
import typings.reactCalendarTimeline.AnonStyle
import typings.reactCalendarTimeline.RequiredGetIntervalPropsk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomHeaderPropsChildrenFnProps[Data] extends js.Object {
  var data: Data = js.native
  var headerContext: HeaderContext = js.native
  var timelineContext: TimelineContext = js.native
  def getIntervalProps(): RequiredGetIntervalPropsk = js.native
  def getIntervalProps(props: GetIntervalProps): RequiredGetIntervalPropsk = js.native
  def getRootProps(): AnonStyle = js.native
  def getRootProps(propsToOverride: AnonStyle): AnonStyle = js.native
  def showPeriod(startDate: Double, endDate: Double): scala.Unit = js.native
  def showPeriod(startDate: Double, endDate: Moment): scala.Unit = js.native
  def showPeriod(startDate: Moment, endDate: Double): scala.Unit = js.native
  def showPeriod(startDate: Moment, endDate: Moment): scala.Unit = js.native
}

