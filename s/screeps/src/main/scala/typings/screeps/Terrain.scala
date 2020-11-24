package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * This file creates literal versions of many of the constants
  * It should be kept in sync with constants.ts
  */
// Extras
/* Rewritten from type alias, can be one of: 
  - typings.screeps.screepsStrings.plain
  - typings.screeps.screepsStrings.swamp
  - typings.screeps.screepsStrings.wall
*/
trait Terrain extends js.Object
object Terrain {
  
  @scala.inline
  def plain: typings.screeps.screepsStrings.plain = "plain".asInstanceOf[typings.screeps.screepsStrings.plain]
  
  @scala.inline
  def swamp: typings.screeps.screepsStrings.swamp = "swamp".asInstanceOf[typings.screeps.screepsStrings.swamp]
  
  @scala.inline
  def wall: typings.screeps.screepsStrings.wall = "wall".asInstanceOf[typings.screeps.screepsStrings.wall]
}
