package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindTypes
  extends /* key */ org.scalablytyped.runtime.NumberDictionary[
      RoomPosition | Creep | Source | Resource[ResourceConstant] | Structure[StructureConstant] | Flag | ConstructionSite[BuildableStructureConstant] | Mineral[MineralConstant] | Nuke | Tombstone
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
    `3`: RoomPosition,
    `5`: RoomPosition,
    `7`: RoomPosition,
    NumberDictionary: /* key */ org.scalablytyped.runtime.NumberDictionary[
      RoomPosition | Creep | Source | Resource[ResourceConstant] | Structure[StructureConstant] | Flag | ConstructionSite[BuildableStructureConstant] | Mineral[MineralConstant] | Nuke | Tombstone
    ] = null
  ): FindTypes = {
    val __obj = js.Dynamic.literal(`1` = `1`, `10` = `10`, `101` = `101`, `102` = `102`, `103` = `103`, `104` = `104`, `105` = `105`, `106` = `106`, `107` = `107`, `108` = `108`, `109` = `109`, `110` = `110`, `111` = `111`, `112` = `112`, `113` = `113`, `114` = `114`, `115` = `115`, `116` = `116`, `117` = `117`, `118` = `118`, `3` = `3`, `5` = `5`, `7` = `7`)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FindTypes]
  }
}

