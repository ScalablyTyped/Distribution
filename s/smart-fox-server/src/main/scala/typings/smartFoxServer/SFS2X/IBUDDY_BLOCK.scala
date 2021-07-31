package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBUDDY_BLOCK extends StObject {
  
  var buddy: SFSBuddy
}
object IBUDDY_BLOCK {
  
  @scala.inline
  def apply(buddy: SFSBuddy): IBUDDY_BLOCK = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_BLOCK]
  }
  
  @scala.inline
  implicit class IBUDDY_BLOCKMutableBuilder[Self <: IBUDDY_BLOCK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuddy(value: SFSBuddy): Self = StObject.set(x, "buddy", value.asInstanceOf[js.Any])
  }
}
