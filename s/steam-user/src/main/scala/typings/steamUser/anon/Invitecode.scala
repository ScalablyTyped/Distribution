package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invitecode extends StObject {
  
  var invite_code: String
  
  var invite_url: String
  
  var seconds_valid: Double
}
object Invitecode {
  
  inline def apply(invite_code: String, invite_url: String, seconds_valid: Double): Invitecode = {
    val __obj = js.Dynamic.literal(invite_code = invite_code.asInstanceOf[js.Any], invite_url = invite_url.asInstanceOf[js.Any], seconds_valid = seconds_valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitecode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Invitecode] (val x: Self) extends AnyVal {
    
    inline def setInvite_code(value: String): Self = StObject.set(x, "invite_code", value.asInstanceOf[js.Any])
    
    inline def setInvite_url(value: String): Self = StObject.set(x, "invite_url", value.asInstanceOf[js.Any])
    
    inline def setSeconds_valid(value: Double): Self = StObject.set(x, "seconds_valid", value.asInstanceOf[js.Any])
  }
}
