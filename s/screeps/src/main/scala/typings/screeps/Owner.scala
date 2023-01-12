package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Owner extends StObject {
  
  /**
    * The name of the owner user.
    */
  var username: String
}
object Owner {
  
  inline def apply(username: String): Owner = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Owner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Owner] (val x: Self) extends AnyVal {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
