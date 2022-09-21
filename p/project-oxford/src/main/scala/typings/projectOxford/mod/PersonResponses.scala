package typings.projectOxford.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PersonResponses {
  
  trait Create extends StObject {
    
    var personId: String
  }
  object Create {
    
    inline def apply(personId: String): Create = {
      val __obj = js.Dynamic.literal(personId = personId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Create]
    }
    
    extension [Self <: Create](x: Self) {
      
      inline def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Face extends StObject {
    
    var faceId: String
    
    var userData: String
  }
  object Face {
    
    inline def apply(faceId: String, userData: String): Face = {
      val __obj = js.Dynamic.literal(faceId = faceId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
      __obj.asInstanceOf[Face]
    }
    
    extension [Self <: Face](x: Self) {
      
      inline def setFaceId(value: String): Self = StObject.set(x, "faceId", value.asInstanceOf[js.Any])
      
      inline def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    }
  }
  
  trait Person extends StObject {
    
    var faceIds: js.Array[String]
    
    var name: String
    
    var personId: String
    
    var userData: String
  }
  object Person {
    
    inline def apply(faceIds: js.Array[String], name: String, personId: String, userData: String): typings.projectOxford.mod.PersonResponses.Person = {
      val __obj = js.Dynamic.literal(faceIds = faceIds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], personId = personId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.projectOxford.mod.PersonResponses.Person]
    }
    
    extension [Self <: typings.projectOxford.mod.PersonResponses.Person](x: Self) {
      
      inline def setFaceIds(value: js.Array[String]): Self = StObject.set(x, "faceIds", value.asInstanceOf[js.Any])
      
      inline def setFaceIdsVarargs(value: String*): Self = StObject.set(x, "faceIds", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
      
      inline def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    }
  }
}
