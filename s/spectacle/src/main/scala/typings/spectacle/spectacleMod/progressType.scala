package typings.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Progress Types for Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typings.spectacle.spectacleStrings.pacman
  - typings.spectacle.spectacleStrings.bar
  - typings.spectacle.spectacleStrings.number
  - typings.spectacle.spectacleStrings.none
*/
trait progressType extends js.Object

object progressType {
  @scala.inline
  def bar: typings.spectacle.spectacleStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.spectacle.spectacleStrings.none = this.cast("none")
  @scala.inline
  def number: typings.spectacle.spectacleStrings.number = this.cast("number")
  @scala.inline
  def pacman: typings.spectacle.spectacleStrings.pacman = this.cast("pacman")
}

