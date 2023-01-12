package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A nuke landing position. This object cannot be removed or modified. You can find incoming nukes in the room using the FIND_NUKES constant.
  */
trait Nuke
  extends StObject
     with RoomObject {
  
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: Id[this.type]
  
  /**
    * The name of the room where this nuke has been launched from.
    */
  var launchRoomName: String
  
  /**
    * The remaining landing time.
    */
  var timeToLand: Double
}
object Nuke {
  
  inline def apply(
    effects: js.Array[RoomObjectEffect],
    id: Id[Nuke],
    launchRoomName: String,
    pos: RoomPosition,
    timeToLand: Double
  ): Nuke = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], launchRoomName = launchRoomName.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], timeToLand = timeToLand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nuke]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nuke] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id[Nuke]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLaunchRoomName(value: String): Self = StObject.set(x, "launchRoomName", value.asInstanceOf[js.Any])
    
    inline def setTimeToLand(value: Double): Self = StObject.set(x, "timeToLand", value.asInstanceOf[js.Any])
  }
}
