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
  
  val first: first with java.lang.String = js.native
  val last: last with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val recommendationClick: recommendationClick with java.lang.String = js.native
  val recommendationView: recommendationView with java.lang.String = js.native
  val view: view with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.AnalyticsNs.EventTypeId with java.lang.String] = js.native
}

