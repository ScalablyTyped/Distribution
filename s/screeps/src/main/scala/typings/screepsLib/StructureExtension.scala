package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains energy which can be spent on spawning bigger creeps. Extensions can
  * be placed anywhere in the room, any spawns will be able to use them regardless
  * of distance.
  */
trait StructureExtension
  extends OwnedStructure[STRUCTURE_EXTENSION]
     with AnyOwnedStructure {
  /**
    * The amount of energy containing in the extension.
    */
  var energy: scala.Double
  /**
    * The total amount of energy the extension can contain.
    */
  var energyCapacity: scala.Double
}

object StructureExtension {
  @scala.inline
  def apply(
    destroy: js.Function0[ScreepsReturnCode],
    energy: scala.Double,
    energyCapacity: scala.Double,
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    my: scala.Boolean,
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    owner: Owner,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_EXTENSION
  ): StructureExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("energy")(energy)
    __obj.updateDynamic("energyCapacity")(energyCapacity)
    __obj.updateDynamic("hits")(hits)
    __obj.updateDynamic("hitsMax")(hitsMax)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("my")(my)
    __obj.updateDynamic("notifyWhenAttacked")(notifyWhenAttacked)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("structureType")(structureType)
    __obj.asInstanceOf[StructureExtension]
  }
}

