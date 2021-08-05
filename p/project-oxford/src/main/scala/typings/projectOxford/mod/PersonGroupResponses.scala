package typings.projectOxford.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PersonGroupResponses {
  
  trait PersonGroup extends StObject {
    
    var name: String
    
    var personGroupId: String
    
    var userData: String
  }
  object PersonGroup {
    
    inline def apply(name: String, personGroupId: String, userData: String): typings.projectOxford.mod.PersonGroupResponses.PersonGroup = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.projectOxford.mod.PersonGroupResponses.PersonGroup]
    }
    
    extension [Self <: typings.projectOxford.mod.PersonGroupResponses.PersonGroup](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPersonGroupId(value: String): Self = StObject.set(x, "personGroupId", value.asInstanceOf[js.Any])
      
      inline def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrainingStatus extends StObject {
    
    var endTime: String
    
    var personGroupId: String
    
    var startTime: String
    
    var status: String
  }
  object TrainingStatus {
    
    inline def apply(endTime: String, personGroupId: String, startTime: String, status: String): TrainingStatus = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrainingStatus]
    }
    
    extension [Self <: TrainingStatus](x: Self) {
      
      inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setPersonGroupId(value: String): Self = StObject.set(x, "personGroupId", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
