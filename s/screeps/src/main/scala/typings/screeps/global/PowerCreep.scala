package typings.screeps.global

import typings.screeps.Id
import typings.screeps.PowerCreepConstructor
import typings.screeps.RoomObjectEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PowerCreep")
@js.native
class PowerCreep protected ()
  extends StObject
     with typings.screeps.PowerCreep {
  def this(id: Id[typings.screeps.PowerCreep]) = this()
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typings.screeps.RoomPosition = js.native
}
object PowerCreep {
  
  @scala.inline
  def apply: PowerCreepConstructor = js.Dynamic.global.selectDynamic("PowerCreep").asInstanceOf[PowerCreepConstructor]
}
