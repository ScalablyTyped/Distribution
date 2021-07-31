package typings.reactNativeGoogleSignin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Email extends StObject {
    
    var email: String | Null
    
    var familyName: String | Null
    
    var givenName: String | Null
    
    var id: String | Null
    
    var name: String | Null
    
    var photo: String | Null
  }
  object Email {
    
    @scala.inline
    def apply(): Email = {
      val __obj = js.Dynamic.literal(email = null, familyName = null, givenName = null, id = null, name = null, photo = null)
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailNull: Self = StObject.set(x, "email", null)
      
      @scala.inline
      def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyNameNull: Self = StObject.set(x, "familyName", null)
      
      @scala.inline
      def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGivenNameNull: Self = StObject.set(x, "givenName", null)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setPhoto(value: String): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotoNull: Self = StObject.set(x, "photo", null)
    }
  }
}
