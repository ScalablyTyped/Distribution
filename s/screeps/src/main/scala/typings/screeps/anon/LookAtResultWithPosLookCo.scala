package typings.screeps.anon

import typings.screeps.BuildableStructureConstant
import typings.screeps.ConstructionSite
import typings.screeps.Creep
import typings.screeps.Deposit
import typings.screeps.Flag
import typings.screeps.LookConstant
import typings.screeps.Mineral
import typings.screeps.MineralConstant
import typings.screeps.Nuke
import typings.screeps.PowerCreep
import typings.screeps.RESOURCE_ENERGY
import typings.screeps.Resource
import typings.screeps.ResourceConstant
import typings.screeps.Ruin
import typings.screeps.Source
import typings.screeps.Structure
import typings.screeps.StructureConstant
import typings.screeps.Terrain
import typings.screeps.Tombstone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined screeps.LookAtResultWithPos<screeps.LookConstant> */
@js.native
trait LookAtResultWithPosLookCo extends js.Object {
  var constructionSite: js.UndefOr[ConstructionSite[BuildableStructureConstant]] = js.native
  var creep: js.UndefOr[Creep] = js.native
  var deposit: js.UndefOr[Deposit] = js.native
  var energy: js.UndefOr[Resource[RESOURCE_ENERGY]] = js.native
  var flag: js.UndefOr[Flag] = js.native
  var mineral: js.UndefOr[Mineral[MineralConstant]] = js.native
  var nuke: js.UndefOr[Nuke] = js.native
  var powerCreep: js.UndefOr[PowerCreep] = js.native
  var resource: js.UndefOr[Resource[ResourceConstant]] = js.native
  var ruin: js.UndefOr[Ruin] = js.native
  var source: js.UndefOr[Source] = js.native
  var structure: js.UndefOr[Structure[StructureConstant]] = js.native
  var terrain: js.UndefOr[Terrain] = js.native
  var tombstone: js.UndefOr[Tombstone] = js.native
  var `type`: LookConstant = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object LookAtResultWithPosLookCo {
  @scala.inline
  def apply(`type`: LookConstant, x: Double, y: Double): LookAtResultWithPosLookCo = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookAtResultWithPosLookCo]
  }
  @scala.inline
  implicit class LookAtResultWithPosLookCoOps[Self <: LookAtResultWithPosLookCo] (val x: Self) extends AnyVal {
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
    def setType(value: LookConstant): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstructionSite(value: ConstructionSite[BuildableStructureConstant]): Self = this.set("constructionSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstructionSite: Self = this.set("constructionSite", js.undefined)
    @scala.inline
    def setCreep(value: Creep): Self = this.set("creep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreep: Self = this.set("creep", js.undefined)
    @scala.inline
    def setDeposit(value: Deposit): Self = this.set("deposit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeposit: Self = this.set("deposit", js.undefined)
    @scala.inline
    def setEnergy(value: Resource[RESOURCE_ENERGY]): Self = this.set("energy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnergy: Self = this.set("energy", js.undefined)
    @scala.inline
    def setFlag(value: Flag): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    @scala.inline
    def setMineral(value: Mineral[MineralConstant]): Self = this.set("mineral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMineral: Self = this.set("mineral", js.undefined)
    @scala.inline
    def setNuke(value: Nuke): Self = this.set("nuke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNuke: Self = this.set("nuke", js.undefined)
    @scala.inline
    def setPowerCreep(value: PowerCreep): Self = this.set("powerCreep", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePowerCreep: Self = this.set("powerCreep", js.undefined)
    @scala.inline
    def setResource(value: Resource[ResourceConstant]): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setRuin(value: Ruin): Self = this.set("ruin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuin: Self = this.set("ruin", js.undefined)
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStructure(value: Structure[StructureConstant]): Self = this.set("structure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructure: Self = this.set("structure", js.undefined)
    @scala.inline
    def setTerrain(value: Terrain): Self = this.set("terrain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerrain: Self = this.set("terrain", js.undefined)
    @scala.inline
    def setTombstone(value: Tombstone): Self = this.set("tombstone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTombstone: Self = this.set("tombstone", js.undefined)
  }
  
}

