package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A destroyed structure. This is a walkable object.
  * <ul>
  *     <li>Decay: 500 ticks except some special cases</li>
  * </ul>
  */
@js.native
trait Ruin extends RoomObject {
  /**
    * Time of destruction.
    */
  var destroyTime: Double = js.native
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  /**
    * An object with the ruin contents.
    */
  var store: StoreDefinitionUnlimited = js.native
  /**
    * An object containing the destroyed structure.
    */
  var structure: AnyStructure = js.native
  /**
    * The amount of game ticks before this ruin decays.
    */
  var ticksToDecay: Double = js.native
}

object Ruin {
  @scala.inline
  def apply(
    destroyTime: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Ruin],
    pos: RoomPosition,
    store: StoreDefinitionUnlimited,
    structure: AnyStructure,
    ticksToDecay: Double
  ): Ruin = {
    val __obj = js.Dynamic.literal(destroyTime = destroyTime.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruin]
  }
  @scala.inline
  implicit class RuinOps[Self <: Ruin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroyTime(value: Double): Self = this.set("destroyTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Id[Ruin]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: StoreDefinitionUnlimited): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def setStructure(value: AnyStructure): Self = this.set("structure", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicksToDecay(value: Double): Self = this.set("ticksToDecay", value.asInstanceOf[js.Any])
  }
  
}

