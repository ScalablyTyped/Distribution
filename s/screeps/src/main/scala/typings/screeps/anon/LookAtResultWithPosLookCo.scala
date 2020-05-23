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
trait LookAtResultWithPosLookCo extends js.Object {
  var constructionSite: js.UndefOr[ConstructionSite[BuildableStructureConstant]] = js.undefined
  var creep: js.UndefOr[Creep] = js.undefined
  var deposit: js.UndefOr[Deposit] = js.undefined
  var energy: js.UndefOr[Resource[RESOURCE_ENERGY]] = js.undefined
  var flag: js.UndefOr[Flag] = js.undefined
  var mineral: js.UndefOr[Mineral[MineralConstant]] = js.undefined
  var nuke: js.UndefOr[Nuke] = js.undefined
  var powerCreep: js.UndefOr[PowerCreep] = js.undefined
  var resource: js.UndefOr[Resource[ResourceConstant]] = js.undefined
  var ruin: js.UndefOr[Ruin] = js.undefined
  var source: js.UndefOr[Source] = js.undefined
  var structure: js.UndefOr[Structure[StructureConstant]] = js.undefined
  var terrain: js.UndefOr[Terrain] = js.undefined
  var tombstone: js.UndefOr[Tombstone] = js.undefined
  var `type`: LookConstant
  var x: Double
  var y: Double
}

object LookAtResultWithPosLookCo {
  @scala.inline
  def apply(
    `type`: LookConstant,
    x: Double,
    y: Double,
    constructionSite: ConstructionSite[BuildableStructureConstant] = null,
    creep: Creep = null,
    deposit: Deposit = null,
    energy: Resource[RESOURCE_ENERGY] = null,
    flag: Flag = null,
    mineral: Mineral[MineralConstant] = null,
    nuke: Nuke = null,
    powerCreep: PowerCreep = null,
    resource: Resource[ResourceConstant] = null,
    ruin: Ruin = null,
    source: Source = null,
    structure: Structure[StructureConstant] = null,
    terrain: Terrain = null,
    tombstone: Tombstone = null
  ): LookAtResultWithPosLookCo = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (constructionSite != null) __obj.updateDynamic("constructionSite")(constructionSite.asInstanceOf[js.Any])
    if (creep != null) __obj.updateDynamic("creep")(creep.asInstanceOf[js.Any])
    if (deposit != null) __obj.updateDynamic("deposit")(deposit.asInstanceOf[js.Any])
    if (energy != null) __obj.updateDynamic("energy")(energy.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (mineral != null) __obj.updateDynamic("mineral")(mineral.asInstanceOf[js.Any])
    if (nuke != null) __obj.updateDynamic("nuke")(nuke.asInstanceOf[js.Any])
    if (powerCreep != null) __obj.updateDynamic("powerCreep")(powerCreep.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (ruin != null) __obj.updateDynamic("ruin")(ruin.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (structure != null) __obj.updateDynamic("structure")(structure.asInstanceOf[js.Any])
    if (terrain != null) __obj.updateDynamic("terrain")(terrain.asInstanceOf[js.Any])
    if (tombstone != null) __obj.updateDynamic("tombstone")(tombstone.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookAtResultWithPosLookCo]
  }
}

