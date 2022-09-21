package typings.screeps.global

import typings.screeps.Id
import typings.screeps.MineralConstant
import typings.screeps.MineralConstructor
import typings.screeps.RoomObjectEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Mineral")
@js.native
open class Mineral protected ()
  extends StObject
     with typings.screeps.Mineral[MineralConstant] {
  def this(id: Id[typings.screeps.Mineral[MineralConstant]]) = this()
  
  /**
    * The density of this mineral deposit, one of the `DENSITY_*` constants.
    */
  /* CompleteClass */
  var density: Double = js.native
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  /* CompleteClass */
  var id: Id[this.type] = js.native
  
  /**
    * The remaining amount of resources.
    */
  /* CompleteClass */
  var mineralAmount: Double = js.native
  
  /**
    * The resource type, one of the `RESOURCE_*` constants.
    */
  /* CompleteClass */
  var mineralType: MineralConstant = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typings.screeps.RoomPosition = js.native
}
object Mineral {
  
  inline def apply: MineralConstructor = js.Dynamic.global.selectDynamic("Mineral").asInstanceOf[MineralConstructor]
}
