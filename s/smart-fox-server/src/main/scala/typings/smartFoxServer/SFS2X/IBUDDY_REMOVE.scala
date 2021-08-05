package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBUDDY_REMOVE extends StObject {
  
  var buddy: SFSBuddy
}
object IBUDDY_REMOVE {
  
  inline def apply(buddy: SFSBuddy): IBUDDY_REMOVE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_REMOVE]
  }
  
  extension [Self <: IBUDDY_REMOVE](x: Self) {
    
    inline def setBuddy(value: SFSBuddy): Self = StObject.set(x, "buddy", value.asInstanceOf[js.Any])
  }
}
