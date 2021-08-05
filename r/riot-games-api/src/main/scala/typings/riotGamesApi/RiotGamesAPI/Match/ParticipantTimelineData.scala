package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantTimelineData extends StObject {
  
  var tenToTwenty: Double
  
  var thirtyToEnd: Double
  
  var twentyToThirty: Double
  
  var zeroToTen: Double
}
object ParticipantTimelineData {
  
  inline def apply(tenToTwenty: Double, thirtyToEnd: Double, twentyToThirty: Double, zeroToTen: Double): ParticipantTimelineData = {
    val __obj = js.Dynamic.literal(tenToTwenty = tenToTwenty.asInstanceOf[js.Any], thirtyToEnd = thirtyToEnd.asInstanceOf[js.Any], twentyToThirty = twentyToThirty.asInstanceOf[js.Any], zeroToTen = zeroToTen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantTimelineData]
  }
  
  extension [Self <: ParticipantTimelineData](x: Self) {
    
    inline def setTenToTwenty(value: Double): Self = StObject.set(x, "tenToTwenty", value.asInstanceOf[js.Any])
    
    inline def setThirtyToEnd(value: Double): Self = StObject.set(x, "thirtyToEnd", value.asInstanceOf[js.Any])
    
    inline def setTwentyToThirty(value: Double): Self = StObject.set(x, "twentyToThirty", value.asInstanceOf[js.Any])
    
    inline def setZeroToTen(value: Double): Self = StObject.set(x, "zeroToTen", value.asInstanceOf[js.Any])
  }
}
