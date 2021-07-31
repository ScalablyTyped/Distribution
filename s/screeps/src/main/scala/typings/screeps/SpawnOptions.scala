package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with additional options for the spawning process.
  */
trait SpawnOptions extends StObject {
  
  /**
    * Set desired directions where the creep should move when spawned.
    * An array with the direction constants.
    */
  var directions: js.UndefOr[js.Array[DirectionConstant]] = js.undefined
  
  /**
    * If dryRun is <code>true</code>, the operation will only check if it is possible to create a creep.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of spawns/extensions from which to draw energy for the spawning process.
    * Structures will be used according to the array order.
    */
  var energyStructures: js.UndefOr[js.Array[StructureSpawn | StructureExtension]] = js.undefined
  
  /**
    * Memory of the new creep. If provided, it will be immediately stored into Memory.creeps[name].
    */
  var memory: js.UndefOr[CreepMemory] = js.undefined
}
object SpawnOptions {
  
  @scala.inline
  def apply(): SpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnOptions]
  }
  
  @scala.inline
  implicit class SpawnOptionsMutableBuilder[Self <: SpawnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirections(value: js.Array[DirectionConstant]): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    @scala.inline
    def setDirectionsVarargs(value: DirectionConstant*): Self = StObject.set(x, "directions", js.Array(value :_*))
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setEnergyStructures(value: js.Array[StructureSpawn | StructureExtension]): Self = StObject.set(x, "energyStructures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnergyStructuresUndefined: Self = StObject.set(x, "energyStructures", js.undefined)
    
    @scala.inline
    def setEnergyStructuresVarargs(value: (StructureSpawn | StructureExtension)*): Self = StObject.set(x, "energyStructures", js.Array(value :_*))
    
    @scala.inline
    def setMemory(value: CreepMemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
  }
}
