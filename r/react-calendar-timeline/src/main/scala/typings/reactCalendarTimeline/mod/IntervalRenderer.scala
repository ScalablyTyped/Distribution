package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.RequiredGetIntervalPropsk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalRenderer[Data] extends js.Object {
  
  var data: js.UndefOr[Data] = js.native
  
  def getIntervalProps(): RequiredGetIntervalPropsk = js.native
  def getIntervalProps(props: GetIntervalProps): RequiredGetIntervalPropsk = js.native
  
  var intervalContext: IntervalContext = js.native
}
