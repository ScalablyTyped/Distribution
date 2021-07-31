package typings.screeps.global

import typings.screeps.AnyCreep
import typings.screeps.Id
import typings.screeps.RoomObjectEffect
import typings.screeps.StoreDefinitionUnlimited
import typings.screeps.TombstoneConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Tombstone")
@js.native
class Tombstone protected ()
  extends StObject
     with typings.screeps.Tombstone {
  def this(id: Id[typings.screeps.Tombstone]) = this()
  
  /**
    * An object containing the deceased creep.
    */
  /* CompleteClass */
  var creep: AnyCreep = js.native
  
  /**
    * Time of death.
    */
  /* CompleteClass */
  var deathTime: Double = js.native
  
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
    * An object with the tombstone contents.
    * Each object key is one of the RESOURCE_* constants, values are resources amounts.
    * RESOURCE_ENERGY is always defined and equals to 0 when empty,
    * other resources are undefined when empty.
    * You can use lodash.sum to get the total amount of contents.
    */
  /* CompleteClass */
  var store: StoreDefinitionUnlimited = js.native
  
  /**
    * The amount of game ticks before this tombstone decays.
    */
  /* CompleteClass */
  var ticksToDecay: Double = js.native
}
object Tombstone {
  
  @scala.inline
  def apply: TombstoneConstructor = js.Dynamic.global.selectDynamic("Tombstone").asInstanceOf[TombstoneConstructor]
}
