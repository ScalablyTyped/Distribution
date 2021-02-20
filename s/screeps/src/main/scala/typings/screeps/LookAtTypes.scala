package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<screeps.AllLookAtTypes> */
@js.native
trait LookAtTypes extends StObject {
  
  var constructionSite: js.UndefOr[ConstructionSite[BuildableStructureConstant]] = js.native
  
  var creep: js.UndefOr[Creep] = js.native
  
  var deposit: js.UndefOr[Deposit] = js.native
  
  var energy: js.UndefOr[Resource[RESOURCE_ENERGY]] = js.native
  
  var exit: js.UndefOr[js.Any] = js.native
  
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
}
object LookAtTypes {
  
  @scala.inline
  def apply(): LookAtTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookAtTypes]
  }
  
  @scala.inline
  implicit class LookAtTypesMutableBuilder[Self <: LookAtTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstructionSite(value: ConstructionSite[BuildableStructureConstant]): Self = StObject.set(x, "constructionSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructionSiteUndefined: Self = StObject.set(x, "constructionSite", js.undefined)
    
    @scala.inline
    def setCreep(value: Creep): Self = StObject.set(x, "creep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreepUndefined: Self = StObject.set(x, "creep", js.undefined)
    
    @scala.inline
    def setDeposit(value: Deposit): Self = StObject.set(x, "deposit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepositUndefined: Self = StObject.set(x, "deposit", js.undefined)
    
    @scala.inline
    def setEnergy(value: Resource[RESOURCE_ENERGY]): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnergyUndefined: Self = StObject.set(x, "energy", js.undefined)
    
    @scala.inline
    def setExit(value: js.Any): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    @scala.inline
    def setFlag(value: Flag): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    @scala.inline
    def setMineral(value: Mineral[MineralConstant]): Self = StObject.set(x, "mineral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMineralUndefined: Self = StObject.set(x, "mineral", js.undefined)
    
    @scala.inline
    def setNuke(value: Nuke): Self = StObject.set(x, "nuke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNukeUndefined: Self = StObject.set(x, "nuke", js.undefined)
    
    @scala.inline
    def setPowerCreep(value: PowerCreep): Self = StObject.set(x, "powerCreep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerCreepUndefined: Self = StObject.set(x, "powerCreep", js.undefined)
    
    @scala.inline
    def setResource(value: Resource[ResourceConstant]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setRuin(value: Ruin): Self = StObject.set(x, "ruin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuinUndefined: Self = StObject.set(x, "ruin", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStructure(value: Structure[StructureConstant]): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    @scala.inline
    def setTerrain(value: Terrain): Self = StObject.set(x, "terrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerrainUndefined: Self = StObject.set(x, "terrain", js.undefined)
    
    @scala.inline
    def setTombstone(value: Tombstone): Self = StObject.set(x, "tombstone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTombstoneUndefined: Self = StObject.set(x, "tombstone", js.undefined)
  }
}
