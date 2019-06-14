package typings
package sharepointLib.SPNs.AnalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventTypeId extends js.Object

@JSGlobal("SP.Analytics.EventTypeId")
@js.native
object EventTypeId extends js.Object {
  @js.native
  sealed trait first
    extends sharepointLib.SPNs.AnalyticsNs.EventTypeId
  
  @js.native
  sealed trait last
    extends sharepointLib.SPNs.AnalyticsNs.EventTypeId
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.AnalyticsNs.EventTypeId
  
  @js.native
  sealed trait recommendationClick
    extends sharepointLib.SPNs.AnalyticsNs.EventTypeId
  
  @js.native
  sealed trait recommendationView
    extends sharepointLib.SPNs.AnalyticsNs.EventTypeId
  
  @js.native
  sealed trait view
    extends sharepointLib.SPNs.AnalyticsNs.EventTypeId
  
  /* 1 */ val first: first with scala.Double = js.native
  /* 5 */ val last: last with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 4 */ val recommendationClick: recommendationClick with scala.Double = js.native
  /* 3 */ val recommendationView: recommendationView with scala.Double = js.native
  /* 2 */ val view: view with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.AnalyticsNs.EventTypeId with scala.Double] = js.native
}

