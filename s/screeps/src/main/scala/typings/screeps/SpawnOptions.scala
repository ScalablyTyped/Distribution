package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with additional options for the spawning process.
  */
@js.native
trait SpawnOptions extends js.Object {
  
  /**
    * Set desired directions where the creep should move when spawned.
    * An array with the direction constants.
    */
  var directions: js.UndefOr[js.Array[DirectionConstant]] = js.native
  
  /**
    * If dryRun is <code>true</code>, the operation will only check if it is possible to create a creep.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of spawns/extensions from which to draw energy for the spawning process.
    * Structures will be used according to the array order.
    */
  var energyStructures: js.UndefOr[js.Array[StructureSpawn | StructureExtension]] = js.native
  
  /**
    * Memory of the new creep. If provided, it will be immediately stored into Memory.creeps[name].
    */
  var memory: js.UndefOr[CreepMemory] = js.native
}
object SpawnOptions {
  
  @scala.inline
  def apply(): SpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnOptions]
  }
  
  @scala.inline
  implicit class SpawnOptionsOps[Self <: SpawnOptions] (val x: Self) extends AnyVal {
    
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
    def setDirectionsVarargs(value: DirectionConstant*): Self = this.set("directions", js.Array(value :_*))
    
    @scala.inline
    def setDirections(value: js.Array[DirectionConstant]): Self = this.set("directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirections: Self = this.set("directions", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setEnergyStructuresVarargs(value: (StructureSpawn | StructureExtension)*): Self = this.set("energyStructures", js.Array(value :_*))
    
    @scala.inline
    def setEnergyStructures(value: js.Array[StructureSpawn | StructureExtension]): Self = this.set("energyStructures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnergyStructures: Self = this.set("energyStructures", js.undefined)
    
    @scala.inline
    def setMemory(value: CreepMemory): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
  }
}
