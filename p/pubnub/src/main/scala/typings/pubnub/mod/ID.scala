package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pubnub.mod.UUID
  - typings.pubnub.mod.UserId
*/
trait ID extends StObject
object ID {
  
  inline def UUID(uuid: String): typings.pubnub.mod.UUID = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pubnub.mod.UUID]
  }
  
  inline def UserId(userId: String): typings.pubnub.mod.UserId = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pubnub.mod.UserId]
  }
}
