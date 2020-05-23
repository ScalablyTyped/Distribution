package typings.reactCalendarTimeline.mod

import typings.moment.mod.Moment
import typings.reactCalendarTimeline.anon.RequiredGetIntervalPropsk
import typings.reactCalendarTimeline.anon.Style
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
  def getRootProps(): Style = js.native
  def getRootProps(propsToOverride: Style): Style = js.native
  def showPeriod(startDate: Double, endDate: Double): scala.Unit = js.native
  def showPeriod(startDate: Double, endDate: Moment): scala.Unit = js.native
  def showPeriod(startDate: Moment, endDate: Double): scala.Unit = js.native
  def showPeriod(startDate: Moment, endDate: Moment): scala.Unit = js.native
}

