package typings.reactGoogleLoginComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accesstoken extends StObject {
    
    var access_token: String
  }
  object Accesstoken {
    
    inline def apply(access_token: String): Accesstoken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accesstoken]
    }
    
    extension [Self <: Accesstoken](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    }
  }
}
