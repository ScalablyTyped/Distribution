package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def plain: typings.screeps.screepsStrings.plain = this.cast("plain")
  @scala.inline
  def swamp: typings.screeps.screepsStrings.swamp = this.cast("swamp")
  @scala.inline
  def wall: typings.screeps.screepsStrings.wall = this.cast("wall")
}

