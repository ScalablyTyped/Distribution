package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A nuke landing position. This object cannot be removed or modified. You can find incoming nukes in the room using the FIND_NUKES constant.
  */
@js.native
trait Nuke extends RoomObject {
  
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  
  /**
    * The name of the room where this nuke has been launched from.
    */
  var launchRoomName: String = js.native
  
  /**
    * The remaining landing time.
    */
  var timeToLand: Double = js.native
}
object Nuke {
  
  @scala.inline
  def apply(
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
  implicit class NukeMutableBuilder[Self <: Nuke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Id[Nuke]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchRoomName(value: String): Self = StObject.set(x, "launchRoomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLand(value: Double): Self = StObject.set(x, "timeToLand", value.asInstanceOf[js.Any])
  }
}
