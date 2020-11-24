package typings.screeps

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindTypes extends /* key */ NumberDictionary[
      RoomPosition | AnyCreep | Source | Resource[ResourceConstant] | Structure[StructureConstant] | Flag | ConstructionSite[BuildableStructureConstant] | Mineral[MineralConstant] | Nuke | Tombstone | Deposit | Ruin
    ] {
  
  var `1`: RoomPosition = js.native
  
   // FIND_EXIT_LEFT
  var `10`: RoomPosition = js.native
  
   // FIND_EXIT
  var `101`: Creep = js.native
  
   // FIND_CREEPS
  var `102`: Creep = js.native
  
   // FIND_MY_CREEPS
  var `103`: Creep = js.native
  
   // FIND_HOSTILE_CREEPS
  var `104`: Source = js.native
  
   // FIND_SOURCES_ACTIVE
  var `105`: Source = js.native
  
   // FIND_SOURCES
  var `106`: Resource[ResourceConstant] = js.native
  
   // FIND_DROPPED_RESOURCES
  var `107`: AnyStructure = js.native
  
   // FIND_STRUCTURES
  var `108`: AnyOwnedStructure = js.native
  
   // FIND_MY_STRUCTURES
  var `109`: AnyOwnedStructure = js.native
  
   // FIND_HOSTILE_STRUCTURES
  var `110`: Flag = js.native
  
   // FIND_FLAGS
  var `111`: ConstructionSite[BuildableStructureConstant] = js.native
  
   // FIND_CONSTRUCTION_SITES
  var `112`: StructureSpawn = js.native
  
   // FIND_MY_SPAWNS
  var `113`: StructureSpawn = js.native
  
   // FIND_HOSTILE_SPAWNS
  var `114`: ConstructionSite[BuildableStructureConstant] = js.native
  
   // FIND_MY_CONSTRUCTION_SITES
  var `115`: ConstructionSite[BuildableStructureConstant] = js.native
  
   // FIND_HOSTILE_CONSTRUCTION_SITES
  var `116`: Mineral[MineralConstant] = js.native
  
   // FIND_MINERALS
  var `117`: Nuke = js.native
  
   // FIND_NUKES
  var `118`: Tombstone = js.native
  
   // FIND_TOMBSTONES
  var `119`: PowerCreep = js.native
  
   // FIND_POWER_CREEPS
  var `120`: PowerCreep = js.native
  
   // FIND_MY_POWER_CREEPS
  var `121`: PowerCreep = js.native
  
   // FIND_HOSTILE_POWER_CREEPS
  var `122`: Deposit = js.native
  
   // FIND_DEPOSITS
  var `123`: Ruin = js.native
  
   // FIND_EXIT_TOP
  var `3`: RoomPosition = js.native
  
   // FIND_EXIT_RIGHT
  var `5`: RoomPosition = js.native
  
   // FIND_EXIT_BOTTOM
  var `7`: RoomPosition = js.native
}
object FindTypes {
  
  @scala.inline
  def apply(
    `1`: RoomPosition,
    `10`: RoomPosition,
    `101`: Creep,
    `102`: Creep,
    `103`: Creep,
    `104`: Source,
    `105`: Source,
    `106`: Resource[ResourceConstant],
    `107`: AnyStructure,
    `108`: AnyOwnedStructure,
    `109`: AnyOwnedStructure,
    `110`: Flag,
    `111`: ConstructionSite[BuildableStructureConstant],
    `112`: StructureSpawn,
    `113`: StructureSpawn,
    `114`: ConstructionSite[BuildableStructureConstant],
    `115`: ConstructionSite[BuildableStructureConstant],
    `116`: Mineral[MineralConstant],
    `117`: Nuke,
    `118`: Tombstone,
    `119`: PowerCreep,
    `120`: PowerCreep,
    `121`: PowerCreep,
    `122`: Deposit,
    `123`: Ruin,
    `3`: RoomPosition,
    `5`: RoomPosition,
    `7`: RoomPosition
  ): FindTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("10")(`10`.asInstanceOf[js.Any])
    __obj.updateDynamic("101")(`101`.asInstanceOf[js.Any])
    __obj.updateDynamic("102")(`102`.asInstanceOf[js.Any])
    __obj.updateDynamic("103")(`103`.asInstanceOf[js.Any])
    __obj.updateDynamic("104")(`104`.asInstanceOf[js.Any])
    __obj.updateDynamic("105")(`105`.asInstanceOf[js.Any])
    __obj.updateDynamic("106")(`106`.asInstanceOf[js.Any])
    __obj.updateDynamic("107")(`107`.asInstanceOf[js.Any])
    __obj.updateDynamic("108")(`108`.asInstanceOf[js.Any])
    __obj.updateDynamic("109")(`109`.asInstanceOf[js.Any])
    __obj.updateDynamic("110")(`110`.asInstanceOf[js.Any])
    __obj.updateDynamic("111")(`111`.asInstanceOf[js.Any])
    __obj.updateDynamic("112")(`112`.asInstanceOf[js.Any])
    __obj.updateDynamic("113")(`113`.asInstanceOf[js.Any])
    __obj.updateDynamic("114")(`114`.asInstanceOf[js.Any])
    __obj.updateDynamic("115")(`115`.asInstanceOf[js.Any])
    __obj.updateDynamic("116")(`116`.asInstanceOf[js.Any])
    __obj.updateDynamic("117")(`117`.asInstanceOf[js.Any])
    __obj.updateDynamic("118")(`118`.asInstanceOf[js.Any])
    __obj.updateDynamic("119")(`119`.asInstanceOf[js.Any])
    __obj.updateDynamic("120")(`120`.asInstanceOf[js.Any])
    __obj.updateDynamic("121")(`121`.asInstanceOf[js.Any])
    __obj.updateDynamic("122")(`122`.asInstanceOf[js.Any])
    __obj.updateDynamic("123")(`123`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindTypes]
  }
  
  @scala.inline
  implicit class FindTypesOps[Self <: FindTypes] (val x: Self) extends AnyVal {
    
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
    def set1(value: RoomPosition): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set10(value: RoomPosition): Self = this.set("10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set101(value: Creep): Self = this.set("101", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set102(value: Creep): Self = this.set("102", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set103(value: Creep): Self = this.set("103", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set104(value: Source): Self = this.set("104", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set105(value: Source): Self = this.set("105", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set106(value: Resource[ResourceConstant]): Self = this.set("106", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set107(value: AnyStructure): Self = this.set("107", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set108(value: AnyOwnedStructure): Self = this.set("108", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set109(value: AnyOwnedStructure): Self = this.set("109", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set110(value: Flag): Self = this.set("110", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set111(value: ConstructionSite[BuildableStructureConstant]): Self = this.set("111", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set112(value: StructureSpawn): Self = this.set("112", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set113(value: StructureSpawn): Self = this.set("113", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set114(value: ConstructionSite[BuildableStructureConstant]): Self = this.set("114", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set115(value: ConstructionSite[BuildableStructureConstant]): Self = this.set("115", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set116(value: Mineral[MineralConstant]): Self = this.set("116", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set117(value: Nuke): Self = this.set("117", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set118(value: Tombstone): Self = this.set("118", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set119(value: PowerCreep): Self = this.set("119", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set120(value: PowerCreep): Self = this.set("120", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set121(value: PowerCreep): Self = this.set("121", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set122(value: Deposit): Self = this.set("122", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set123(value: Ruin): Self = this.set("123", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3(value: RoomPosition): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5(value: RoomPosition): Self = this.set("5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set7(value: RoomPosition): Self = this.set("7", value.asInstanceOf[js.Any])
  }
}
