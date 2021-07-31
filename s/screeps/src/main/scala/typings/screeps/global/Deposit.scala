package typings.screeps.global

import typings.screeps.DepositConstant
import typings.screeps.DepositConstructor
import typings.screeps.Id
import typings.screeps.RoomObjectEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Deposit")
@js.native
class Deposit protected ()
  extends StObject
     with typings.screeps.Deposit {
  def this(id: Id[typings.screeps.Deposit]) = this()
  
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  /* CompleteClass */
  var cooldown: Double = js.native
  
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  /* CompleteClass */
  var depositType: DepositConstant = js.native
  
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
    * The cooldown of the last harvest operation on this deposit.
    */
  /* CompleteClass */
  var lastCooldown: Double = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typings.screeps.RoomPosition = js.native
  
  /**
    * The amount of game ticks when this deposit will disappear.
    */
  /* CompleteClass */
  var ticksToDecay: Double = js.native
}
object Deposit {
  
  @scala.inline
  def apply: DepositConstructor = js.Dynamic.global.selectDynamic("Deposit").asInstanceOf[DepositConstructor]
}
