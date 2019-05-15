package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllLookAtTypes extends js.Object {
  var constructionSite: ConstructionSite[BuildableStructureConstant]
  var creep: Creep
  var energy: Resource[RESOURCE_ENERGY]
  var exit: js.Any
   // TODO what type is this?
  var flag: Flag
  var mineral: Mineral[MineralConstant]
  var nuke: Nuke
  var powerCreep: PowerCreep
  var resource: Resource[ResourceConstant]
  var source: Source
  var structure: Structure[StructureConstant]
  var terrain: Terrain
  var tombstone: Tombstone
}

object AllLookAtTypes {
  @scala.inline
  def apply(
    constructionSite: ConstructionSite[BuildableStructureConstant],
    creep: Creep,
    energy: Resource[RESOURCE_ENERGY],
    exit: js.Any,
    flag: Flag,
    mineral: Mineral[MineralConstant],
    nuke: Nuke,
    powerCreep: PowerCreep,
    resource: Resource[ResourceConstant],
    source: Source,
    structure: Structure[StructureConstant],
    terrain: Terrain,
    tombstone: Tombstone
  ): AllLookAtTypes = {
    val __obj = js.Dynamic.literal(constructionSite = constructionSite, creep = creep, energy = energy, exit = exit, flag = flag, mineral = mineral, nuke = nuke, powerCreep = powerCreep, resource = resource, source = source, structure = structure, terrain = terrain, tombstone = tombstone)
  
    __obj.asInstanceOf[AllLookAtTypes]
  }
}

