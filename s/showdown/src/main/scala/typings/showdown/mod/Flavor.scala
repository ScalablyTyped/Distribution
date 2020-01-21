package typings.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Showdown Flavor names.
  */
/* Rewritten from type alias, can be one of: 
  - typings.showdown.showdownStrings.github
  - typings.showdown.showdownStrings.original
  - typings.showdown.showdownStrings.ghost
  - typings.showdown.showdownStrings.vanilla
  - typings.showdown.showdownStrings.allOn
*/
trait Flavor extends js.Object

object Flavor {
  @scala.inline
  def allOn: typings.showdown.showdownStrings.allOn = this.cast("allOn")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ghost: typings.showdown.showdownStrings.ghost = this.cast("ghost")
  @scala.inline
  def github: typings.showdown.showdownStrings.github = this.cast("github")
  @scala.inline
  def original: typings.showdown.showdownStrings.original = this.cast("original")
  @scala.inline
  def vanilla: typings.showdown.showdownStrings.vanilla = this.cast("vanilla")
}

