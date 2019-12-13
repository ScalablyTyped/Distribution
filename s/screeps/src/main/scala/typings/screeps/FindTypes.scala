package typings.screeps

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindTypes extends /* key */ NumberDictionary[
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
    `7`: RoomPosition,
    NumberDictionary: /* key */ NumberDictionary[
      RoomPosition | AnyCreep | Source | Resource[ResourceConstant] | Structure[StructureConstant] | Flag | ConstructionSite[BuildableStructureConstant] | Mineral[MineralConstant] | Nuke | Tombstone | Deposit | Ruin
    ] = null
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
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FindTypes]
  }
}

