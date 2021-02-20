package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticipantTimelineData extends StObject {
  
  var tenToTwenty: Double = js.native
  
  var thirtyToEnd: Double = js.native
  
  var twentyToThirty: Double = js.native
  
  var zeroToTen: Double = js.native
}
object ParticipantTimelineData {
  
  @scala.inline
  def apply(tenToTwenty: Double, thirtyToEnd: Double, twentyToThirty: Double, zeroToTen: Double): ParticipantTimelineData = {
    val __obj = js.Dynamic.literal(tenToTwenty = tenToTwenty.asInstanceOf[js.Any], thirtyToEnd = thirtyToEnd.asInstanceOf[js.Any], twentyToThirty = twentyToThirty.asInstanceOf[js.Any], zeroToTen = zeroToTen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantTimelineData]
  }
  
  @scala.inline
  implicit class ParticipantTimelineDataMutableBuilder[Self <: ParticipantTimelineData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTenToTwenty(value: Double): Self = StObject.set(x, "tenToTwenty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirtyToEnd(value: Double): Self = StObject.set(x, "thirtyToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwentyToThirty(value: Double): Self = StObject.set(x, "twentyToThirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroToTen(value: Double): Self = StObject.set(x, "zeroToTen", value.asInstanceOf[js.Any])
  }
}
