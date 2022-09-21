package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borrowers extends StObject {
  
  var isCanceled: Boolean
  
  var isPending: Boolean
  
  var steamid: typings.steamid.mod.^
  
  var timeCreated: js.Date
}
object Borrowers {
  
  inline def apply(isCanceled: Boolean, isPending: Boolean, steamid: typings.steamid.mod.^, timeCreated: js.Date): Borrowers = {
    val __obj = js.Dynamic.literal(isCanceled = isCanceled.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borrowers]
  }
  
  extension [Self <: Borrowers](x: Self) {
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    inline def setIsPending(value: Boolean): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    
    inline def setSteamid(value: typings.steamid.mod.^): Self = StObject.set(x, "steamid", value.asInstanceOf[js.Any])
    
    inline def setTimeCreated(value: js.Date): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
  }
}
