package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOBJECT_MESSAGE extends StObject {
  
  var message: String = js.native
  
  var sender: SFSUser = js.native
}
object IOBJECT_MESSAGE {
  
  @scala.inline
  def apply(message: String, sender: SFSUser): IOBJECT_MESSAGE = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOBJECT_MESSAGE]
  }
  
  @scala.inline
  implicit class IOBJECT_MESSAGEMutableBuilder[Self <: IOBJECT_MESSAGE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: SFSUser): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
