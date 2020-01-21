package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.AnonKey
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntervalRenderer[Data] extends js.Object {
  var data: js.UndefOr[Data] = js.native
  var intervalContext: IntervalContext = js.native
  def getIntervalProps(): Required[GetIntervalProps] with AnonKey = js.native
  def getIntervalProps(props: GetIntervalProps): Required[GetIntervalProps] with AnonKey = js.native
}

