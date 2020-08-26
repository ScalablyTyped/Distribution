package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllLookAtTypes extends js.Object {
  var constructionSite: ConstructionSite[BuildableStructureConstant] = js.native
  var creep: Creep = js.native
  var deposit: Deposit = js.native
  var energy: Resource[RESOURCE_ENERGY] = js.native
  var exit: js.Any = js.native
   // TODO what type is this?
  var flag: Flag = js.native
  var mineral: Mineral[MineralConstant] = js.native
  var nuke: Nuke = js.native
  var powerCreep: PowerCreep = js.native
  var resource: Resource[ResourceConstant] = js.native
  var ruin: Ruin = js.native
  var source: Source = js.native
  var structure: Structure[StructureConstant] = js.native
  var terrain: Terrain = js.native
  var tombstone: Tombstone = js.native
}

object AllLookAtTypes {
  @scala.inline
  def apply(
    constructionSite: ConstructionSite[BuildableStructureConstant],
    creep: Creep,
    deposit: Deposit,
    energy: Resource[RESOURCE_ENERGY],
    exit: js.Any,
    flag: Flag,
    mineral: Mineral[MineralConstant],
    nuke: Nuke,
    powerCreep: PowerCreep,
    resource: Resource[ResourceConstant],
    ruin: Ruin,
    source: Source,
    structure: Structure[StructureConstant],
    terrain: Terrain,
    tombstone: Tombstone
  ): AllLookAtTypes = {
    val __obj = js.Dynamic.literal(constructionSite = constructionSite.asInstanceOf[js.Any], creep = creep.asInstanceOf[js.Any], deposit = deposit.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], mineral = mineral.asInstanceOf[js.Any], nuke = nuke.asInstanceOf[js.Any], powerCreep = powerCreep.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], ruin = ruin.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], terrain = terrain.asInstanceOf[js.Any], tombstone = tombstone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllLookAtTypes]
  }
  @scala.inline
  implicit class AllLookAtTypesOps[Self <: AllLookAtTypes] (val x: Self) extends AnyVal {
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
    def setConstructionSite(value: ConstructionSite[BuildableStructureConstant]): Self = this.set("constructionSite", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreep(value: Creep): Self = this.set("creep", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeposit(value: Deposit): Self = this.set("deposit", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnergy(value: Resource[RESOURCE_ENERGY]): Self = this.set("energy", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit(value: js.Any): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlag(value: Flag): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def setMineral(value: Mineral[MineralConstant]): Self = this.set("mineral", value.asInstanceOf[js.Any])
    @scala.inline
    def setNuke(value: Nuke): Self = this.set("nuke", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerCreep(value: PowerCreep): Self = this.set("powerCreep", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: Resource[ResourceConstant]): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuin(value: Ruin): Self = this.set("ruin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setStructure(value: Structure[StructureConstant]): Self = this.set("structure", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerrain(value: Terrain): Self = this.set("terrain", value.asInstanceOf[js.Any])
    @scala.inline
    def setTombstone(value: Tombstone): Self = this.set("tombstone", value.asInstanceOf[js.Any])
  }
  
}

