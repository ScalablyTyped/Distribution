package typings.squareConnect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: String
    
    var `type`: String
  }
  object AccessToken {
    
    inline def apply(accessToken: String, `type`: String): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait In extends StObject {
    
    var in: String
    
    var name: String
    
    var `type`: String
  }
  object In {
    
    inline def apply(in: String, name: String, `type`: String): In = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[In]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: In] (val x: Self) extends AnyVal {
      
      inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Oauth2 extends StObject {
    
    var oauth2: AccessToken
    
    var oauth2ClientSecret: In
  }
  object Oauth2 {
    
    inline def apply(oauth2: AccessToken, oauth2ClientSecret: In): Oauth2 = {
      val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any], oauth2ClientSecret = oauth2ClientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oauth2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Oauth2] (val x: Self) extends AnyVal {
      
      inline def setOauth2(value: AccessToken): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
      
      inline def setOauth2ClientSecret(value: In): Self = StObject.set(x, "oauth2ClientSecret", value.asInstanceOf[js.Any])
    }
  }
}
