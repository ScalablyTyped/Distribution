package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rare resource deposit needed for producing commodities.
  * Can be harvested by creeps with a WORK body part.
  * Each harvest operation triggers a cooldown period, which becomes longer and longer over time.
  */
trait Deposit
  extends StObject
     with RoomObject {
  
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var cooldown: Double
  
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var depositType: DepositConstant
  
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  var id: Id[this.type]
  
  /**
    * The cooldown of the last harvest operation on this deposit.
    */
  var lastCooldown: Double
  
  /**
    * The amount of game ticks when this deposit will disappear.
    */
  var ticksToDecay: Double
}
object Deposit {
  
  @scala.inline
  def apply(
    cooldown: Double,
    depositType: DepositConstant,
    effects: js.Array[RoomObjectEffect],
    id: Id[Deposit],
    lastCooldown: Double,
    pos: RoomPosition,
    ticksToDecay: Double
  ): Deposit = {
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], depositType = depositType.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastCooldown = lastCooldown.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deposit]
  }
  
  @scala.inline
  implicit class DepositMutableBuilder[Self <: Deposit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepositType(value: DepositConstant): Self = StObject.set(x, "depositType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Id[Deposit]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCooldown(value: Double): Self = StObject.set(x, "lastCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksToDecay(value: Double): Self = StObject.set(x, "ticksToDecay", value.asInstanceOf[js.Any])
  }
}
