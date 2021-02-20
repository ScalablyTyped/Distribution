package typings.projectOxford.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PersonResponses {
  
  @js.native
  trait Create extends StObject {
    
    var personId: String = js.native
  }
  object Create {
    
    @scala.inline
    def apply(personId: String): Create = {
      val __obj = js.Dynamic.literal(personId = personId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Create]
    }
    
    @scala.inline
    implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Face extends StObject {
    
    var faceId: String = js.native
    
    var userData: String = js.native
  }
  object Face {
    
    @scala.inline
    def apply(faceId: String, userData: String): Face = {
      val __obj = js.Dynamic.literal(faceId = faceId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
      __obj.asInstanceOf[Face]
    }
    
    @scala.inline
    implicit class FaceMutableBuilder[Self <: Face] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFaceId(value: String): Self = StObject.set(x, "faceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Person extends StObject {
    
    var faceIds: js.Array[String] = js.native
    
    var name: String = js.native
    
    var personId: String = js.native
    
    var userData: String = js.native
  }
  object Person {
    
    @scala.inline
    def apply(faceIds: js.Array[String], name: String, personId: String, userData: String): typings.projectOxford.mod.PersonResponses.Person = {
      val __obj = js.Dynamic.literal(faceIds = faceIds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], personId = personId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.projectOxford.mod.PersonResponses.Person]
    }
    
    @scala.inline
    implicit class PersonMutableBuilder[Self <: typings.projectOxford.mod.PersonResponses.Person] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFaceIds(value: js.Array[String]): Self = StObject.set(x, "faceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceIdsVarargs(value: String*): Self = StObject.set(x, "faceIds", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonId(value: String): Self = StObject.set(x, "personId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    }
  }
}
