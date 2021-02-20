package typings.squareConnect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccessToken extends StObject {
    
    var accessToken: String = js.native
    
    var `type`: String = js.native
  }
  object AccessToken {
    
    @scala.inline
    def apply(accessToken: String, `type`: String): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit class AccessTokenMutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait In extends StObject {
    
    var in: String = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object In {
    
    @scala.inline
    def apply(in: String, name: String, `type`: String): In = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[In]
    }
    
    @scala.inline
    implicit class InMutableBuilder[Self <: In] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Oauth2 extends StObject {
    
    var oauth2: AccessToken = js.native
    
    var oauth2ClientSecret: In = js.native
  }
  object Oauth2 {
    
    @scala.inline
    def apply(oauth2: AccessToken, oauth2ClientSecret: In): Oauth2 = {
      val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any], oauth2ClientSecret = oauth2ClientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oauth2]
    }
    
    @scala.inline
    implicit class Oauth2MutableBuilder[Self <: Oauth2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOauth2(value: AccessToken): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth2ClientSecret(value: In): Self = StObject.set(x, "oauth2ClientSecret", value.asInstanceOf[js.Any])
    }
  }
}
