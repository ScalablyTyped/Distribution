package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Username extends StObject {
  
  var username: String
}
object Username {
  
  @scala.inline
  def apply(username: String): Username = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Username]
  }
  
  @scala.inline
  implicit class UsernameMutableBuilder[Self <: Username] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
