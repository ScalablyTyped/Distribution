package typings.screeps

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
    val __obj = js.Dynamic.literal(constructionSite = constructionSite.asInstanceOf[js.Any], creep = creep.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], mineral = mineral.asInstanceOf[js.Any], nuke = nuke.asInstanceOf[js.Any], powerCreep = powerCreep.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], terrain = terrain.asInstanceOf[js.Any], tombstone = tombstone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllLookAtTypes]
  }
}

