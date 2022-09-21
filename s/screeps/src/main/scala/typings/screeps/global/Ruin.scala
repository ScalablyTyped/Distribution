package typings.screeps.global

import typings.screeps.AnyStructure
import typings.screeps.Id
import typings.screeps.RoomObjectEffect
import typings.screeps.RuinConstructor
import typings.screeps.StoreDefinitionUnlimited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Ruin")
@js.native
open class Ruin protected ()
  extends StObject
     with typings.screeps.Ruin {
  def this(id: Id[typings.screeps.Ruin]) = this()
  
  /**
    * Time of destruction.
    */
  /* CompleteClass */
  var destroyTime: Double = js.native
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  var id: Id[this.type] = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typings.screeps.RoomPosition = js.native
  
  /**
    * An object with the ruin contents.
    */
  /* CompleteClass */
  var store: StoreDefinitionUnlimited = js.native
  
  /**
    * An object containing the destroyed structure.
    */
  /* CompleteClass */
  var structure: AnyStructure = js.native
  
  /**
    * The amount of game ticks before this ruin decays.
    */
  /* CompleteClass */
  var ticksToDecay: Double = js.native
}
object Ruin {
  
  inline def apply: RuinConstructor = js.Dynamic.global.selectDynamic("Ruin").asInstanceOf[RuinConstructor]
}
