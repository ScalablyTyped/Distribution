package typings.projectOxford.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PersonGroupResponses {
  
  @js.native
  trait PersonGroup extends StObject {
    
    var name: String = js.native
    
    var personGroupId: String = js.native
    
    var userData: String = js.native
  }
  object PersonGroup {
    
    @scala.inline
    def apply(name: String, personGroupId: String, userData: String): typings.projectOxford.mod.PersonGroupResponses.PersonGroup = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.projectOxford.mod.PersonGroupResponses.PersonGroup]
    }
    
    @scala.inline
    implicit class PersonGroupMutableBuilder[Self <: typings.projectOxford.mod.PersonGroupResponses.PersonGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonGroupId(value: String): Self = StObject.set(x, "personGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrainingStatus extends StObject {
    
    var endTime: String = js.native
    
    var personGroupId: String = js.native
    
    var startTime: String = js.native
    
    var status: String = js.native
  }
  object TrainingStatus {
    
    @scala.inline
    def apply(endTime: String, personGroupId: String, startTime: String, status: String): TrainingStatus = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrainingStatus]
    }
    
    @scala.inline
    implicit class TrainingStatusMutableBuilder[Self <: TrainingStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonGroupId(value: String): Self = StObject.set(x, "personGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
