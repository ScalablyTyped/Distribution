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
    resource: Resource[ResourceConstant],
    source: Source,
    structure: Structure[StructureConstant],
    terrain: Terrain,
    tombstone: Tombstone
  ): AllLookAtTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructionSite")(constructionSite)
    __obj.updateDynamic("creep")(creep)
    __obj.updateDynamic("energy")(energy)
    __obj.updateDynamic("exit")(exit)
    __obj.updateDynamic("flag")(flag)
    __obj.updateDynamic("mineral")(mineral)
    __obj.updateDynamic("nuke")(nuke)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("structure")(structure)
    __obj.updateDynamic("terrain")(terrain)
    __obj.updateDynamic("tombstone")(tombstone)
    __obj.asInstanceOf[AllLookAtTypes]
  }
}

