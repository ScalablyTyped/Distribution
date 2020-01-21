package typings.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target Types for links
  */
/* Rewritten from type alias, can be one of: 
  - typings.spectacle.spectacleStrings._blank
  - typings.spectacle.spectacleStrings._self
  - typings.spectacle.spectacleStrings._parent
  - typings.spectacle.spectacleStrings._top
*/
trait targetType extends js.Object

object targetType {
  @scala.inline
  def _blank: typings.spectacle.spectacleStrings._blank = this.cast("_blank")
  @scala.inline
  def _parent: typings.spectacle.spectacleStrings._parent = this.cast("_parent")
  @scala.inline
  def _self: typings.spectacle.spectacleStrings._self = this.cast("_self")
  @scala.inline
  def _top: typings.spectacle.spectacleStrings._top = this.cast("_top")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

