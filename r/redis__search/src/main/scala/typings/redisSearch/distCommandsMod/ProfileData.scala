package typings.redisSearch.distCommandsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileData extends StObject {
  
  var iteratorsProfile: IteratorsProfile
  
  var parsingTime: String
  
  var pipelineCreationTime: String
  
  var totalProfileTime: String
}
object ProfileData {
  
  inline def apply(
    iteratorsProfile: IteratorsProfile,
    parsingTime: String,
    pipelineCreationTime: String,
    totalProfileTime: String
  ): ProfileData = {
    val __obj = js.Dynamic.literal(iteratorsProfile = iteratorsProfile.asInstanceOf[js.Any], parsingTime = parsingTime.asInstanceOf[js.Any], pipelineCreationTime = pipelineCreationTime.asInstanceOf[js.Any], totalProfileTime = totalProfileTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfileData] (val x: Self) extends AnyVal {
    
    inline def setIteratorsProfile(value: IteratorsProfile): Self = StObject.set(x, "iteratorsProfile", value.asInstanceOf[js.Any])
    
    inline def setParsingTime(value: String): Self = StObject.set(x, "parsingTime", value.asInstanceOf[js.Any])
    
    inline def setPipelineCreationTime(value: String): Self = StObject.set(x, "pipelineCreationTime", value.asInstanceOf[js.Any])
    
    inline def setTotalProfileTime(value: String): Self = StObject.set(x, "totalProfileTime", value.asInstanceOf[js.Any])
  }
}
