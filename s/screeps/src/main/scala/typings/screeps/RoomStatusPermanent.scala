package typings.screeps

import typings.screeps.screepsStrings.closed
import typings.screeps.screepsStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomStatusPermanent extends RoomStatus {
  
  var status: normal | closed = js.native
  
  var timestamp: Null = js.native
}
object RoomStatusPermanent {
  
  @scala.inline
  def apply(status: normal | closed, timestamp: Null): RoomStatusPermanent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomStatusPermanent]
  }
  
  @scala.inline
  implicit class RoomStatusPermanentMutableBuilder[Self <: RoomStatusPermanent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: normal | closed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Null): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
