package typings.screeps

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindTypes
  extends StObject
     with /* key */ NumberDictionary[
      RoomPosition | AnyCreep | Source | Resource[ResourceConstant] | Structure[StructureConstant] | Flag | ConstructionSite[BuildableStructureConstant] | Mineral[MineralConstant] | Nuke | Tombstone | Deposit | Ruin
    ] {
  
  var `1`: RoomPosition
  
  // FIND_EXIT_LEFT
  var `10`: RoomPosition
  
  // FIND_EXIT
  var `101`: Creep
  
  // FIND_CREEPS
  var `102`: Creep
  
  // FIND_MY_CREEPS
  var `103`: Creep
  
  // FIND_HOSTILE_CREEPS
  var `104`: Source
  
  // FIND_SOURCES_ACTIVE
  var `105`: Source
  
  // FIND_SOURCES
  var `106`: Resource[ResourceConstant]
  
  // FIND_DROPPED_RESOURCES
  var `107`: AnyStructure
  
  // FIND_STRUCTURES
  var `108`: AnyOwnedStructure
  
  // FIND_MY_STRUCTURES
  var `109`: AnyOwnedStructure
  
  // FIND_HOSTILE_STRUCTURES
  var `110`: Flag
  
  // FIND_FLAGS
  var `111`: ConstructionSite[BuildableStructureConstant]
  
  // FIND_CONSTRUCTION_SITES
  var `112`: StructureSpawn
  
  // FIND_MY_SPAWNS
  var `113`: StructureSpawn
  
  // FIND_HOSTILE_SPAWNS
  var `114`: ConstructionSite[BuildableStructureConstant]
  
  // FIND_MY_CONSTRUCTION_SITES
  var `115`: ConstructionSite[BuildableStructureConstant]
  
  // FIND_HOSTILE_CONSTRUCTION_SITES
  var `116`: Mineral[MineralConstant]
  
  // FIND_MINERALS
  var `117`: Nuke
  
  // FIND_NUKES
  var `118`: Tombstone
  
  // FIND_TOMBSTONES
  var `119`: PowerCreep
  
  // FIND_POWER_CREEPS
  var `120`: PowerCreep
  
  // FIND_MY_POWER_CREEPS
  var `121`: PowerCreep
  
  // FIND_HOSTILE_POWER_CREEPS
  var `122`: Deposit
  
  // FIND_DEPOSITS
  var `123`: Ruin
  
  // FIND_EXIT_TOP
  var `3`: RoomPosition
  
  // FIND_EXIT_RIGHT
  var `5`: RoomPosition
  
  // FIND_EXIT_BOTTOM
  var `7`: RoomPosition
}
object FindTypes {
  
  inline def apply(
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
  
  extension [Self <: FindTypes](x: Self) {
    
    inline def set1(value: RoomPosition): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set10(value: RoomPosition): Self = StObject.set(x, "10", value.asInstanceOf[js.Any])
    
    inline def set101(value: Creep): Self = StObject.set(x, "101", value.asInstanceOf[js.Any])
    
    inline def set102(value: Creep): Self = StObject.set(x, "102", value.asInstanceOf[js.Any])
    
    inline def set103(value: Creep): Self = StObject.set(x, "103", value.asInstanceOf[js.Any])
    
    inline def set104(value: Source): Self = StObject.set(x, "104", value.asInstanceOf[js.Any])
    
    inline def set105(value: Source): Self = StObject.set(x, "105", value.asInstanceOf[js.Any])
    
    inline def set106(value: Resource[ResourceConstant]): Self = StObject.set(x, "106", value.asInstanceOf[js.Any])
    
    inline def set107(value: AnyStructure): Self = StObject.set(x, "107", value.asInstanceOf[js.Any])
    
    inline def set108(value: AnyOwnedStructure): Self = StObject.set(x, "108", value.asInstanceOf[js.Any])
    
    inline def set109(value: AnyOwnedStructure): Self = StObject.set(x, "109", value.asInstanceOf[js.Any])
    
    inline def set110(value: Flag): Self = StObject.set(x, "110", value.asInstanceOf[js.Any])
    
    inline def set111(value: ConstructionSite[BuildableStructureConstant]): Self = StObject.set(x, "111", value.asInstanceOf[js.Any])
    
    inline def set112(value: StructureSpawn): Self = StObject.set(x, "112", value.asInstanceOf[js.Any])
    
    inline def set113(value: StructureSpawn): Self = StObject.set(x, "113", value.asInstanceOf[js.Any])
    
    inline def set114(value: ConstructionSite[BuildableStructureConstant]): Self = StObject.set(x, "114", value.asInstanceOf[js.Any])
    
    inline def set115(value: ConstructionSite[BuildableStructureConstant]): Self = StObject.set(x, "115", value.asInstanceOf[js.Any])
    
    inline def set116(value: Mineral[MineralConstant]): Self = StObject.set(x, "116", value.asInstanceOf[js.Any])
    
    inline def set117(value: Nuke): Self = StObject.set(x, "117", value.asInstanceOf[js.Any])
    
    inline def set118(value: Tombstone): Self = StObject.set(x, "118", value.asInstanceOf[js.Any])
    
    inline def set119(value: PowerCreep): Self = StObject.set(x, "119", value.asInstanceOf[js.Any])
    
    inline def set120(value: PowerCreep): Self = StObject.set(x, "120", value.asInstanceOf[js.Any])
    
    inline def set121(value: PowerCreep): Self = StObject.set(x, "121", value.asInstanceOf[js.Any])
    
    inline def set122(value: Deposit): Self = StObject.set(x, "122", value.asInstanceOf[js.Any])
    
    inline def set123(value: Ruin): Self = StObject.set(x, "123", value.asInstanceOf[js.Any])
    
    inline def set3(value: RoomPosition): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    
    inline def set5(value: RoomPosition): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
    
    inline def set7(value: RoomPosition): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
  }
}
