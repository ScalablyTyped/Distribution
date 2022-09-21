package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllLookAtTypes extends StObject {
  
  var constructionSite: ConstructionSite[BuildableStructureConstant]
  
  var creep: Creep
  
  var deposit: Deposit
  
  var energy: Resource[RESOURCE_ENERGY]
  
  var exit: Any
  
  // TODO what type is this?
  var flag: Flag
  
  var mineral: Mineral[MineralConstant]
  
  var nuke: Nuke
  
  var powerCreep: PowerCreep
  
  var resource: Resource[ResourceConstant]
  
  var ruin: Ruin
  
  var source: Source
  
  var structure: Structure[StructureConstant]
  
  var terrain: Terrain
  
  var tombstone: Tombstone
}
object AllLookAtTypes {
  
  inline def apply(
    constructionSite: ConstructionSite[BuildableStructureConstant],
    creep: Creep,
    deposit: Deposit,
    energy: Resource[RESOURCE_ENERGY],
    exit: Any,
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
  
  extension [Self <: AllLookAtTypes](x: Self) {
    
    inline def setConstructionSite(value: ConstructionSite[BuildableStructureConstant]): Self = StObject.set(x, "constructionSite", value.asInstanceOf[js.Any])
    
    inline def setCreep(value: Creep): Self = StObject.set(x, "creep", value.asInstanceOf[js.Any])
    
    inline def setDeposit(value: Deposit): Self = StObject.set(x, "deposit", value.asInstanceOf[js.Any])
    
    inline def setEnergy(value: Resource[RESOURCE_ENERGY]): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    inline def setExit(value: Any): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: Flag): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setMineral(value: Mineral[MineralConstant]): Self = StObject.set(x, "mineral", value.asInstanceOf[js.Any])
    
    inline def setNuke(value: Nuke): Self = StObject.set(x, "nuke", value.asInstanceOf[js.Any])
    
    inline def setPowerCreep(value: PowerCreep): Self = StObject.set(x, "powerCreep", value.asInstanceOf[js.Any])
    
    inline def setResource(value: Resource[ResourceConstant]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setRuin(value: Ruin): Self = StObject.set(x, "ruin", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStructure(value: Structure[StructureConstant]): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    inline def setTerrain(value: Terrain): Self = StObject.set(x, "terrain", value.asInstanceOf[js.Any])
    
    inline def setTombstone(value: Tombstone): Self = StObject.set(x, "tombstone", value.asInstanceOf[js.Any])
  }
}
