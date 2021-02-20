package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.RequiredGetIntervalPropsk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalRenderer[Data] extends StObject {
  
  var data: js.UndefOr[Data] = js.native
  
  def getIntervalProps(): RequiredGetIntervalPropsk = js.native
  def getIntervalProps(props: GetIntervalProps): RequiredGetIntervalPropsk = js.native
  
  var intervalContext: IntervalContext = js.native
}
