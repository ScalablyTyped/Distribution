package typings.screeps

import typings.screeps.screepsStrings.closed
import typings.screeps.screepsStrings.normal
import typings.screeps.screepsStrings.novice
import typings.screeps.screepsStrings.respawn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.screeps.RoomStatusPermanent
  - typings.screeps.RoomStatusTemporary
*/
trait RoomStatus extends StObject
object RoomStatus {
  
  inline def RoomStatusPermanent(status: normal | closed, timestamp: Null): typings.screeps.RoomStatusPermanent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.screeps.RoomStatusPermanent]
  }
  
  inline def RoomStatusTemporary(status: novice | respawn, timestamp: Double): typings.screeps.RoomStatusTemporary = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.screeps.RoomStatusTemporary]
  }
}
