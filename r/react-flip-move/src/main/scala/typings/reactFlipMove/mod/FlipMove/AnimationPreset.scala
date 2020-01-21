package typings.reactFlipMove.mod.FlipMove

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactFlipMove.reactFlipMoveStrings.elevator
  - typings.reactFlipMove.reactFlipMoveStrings.fade
  - typings.reactFlipMove.reactFlipMoveStrings.accordionVertical
  - typings.reactFlipMove.reactFlipMoveStrings.accordionHorizontal
  - typings.reactFlipMove.reactFlipMoveStrings.none
*/
trait AnimationPreset extends _AnimationProp

object AnimationPreset {
  @scala.inline
  def accordionHorizontal: typings.reactFlipMove.reactFlipMoveStrings.accordionHorizontal = this.cast("accordionHorizontal")
  @scala.inline
  def accordionVertical: typings.reactFlipMove.reactFlipMoveStrings.accordionVertical = this.cast("accordionVertical")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elevator: typings.reactFlipMove.reactFlipMoveStrings.elevator = this.cast("elevator")
  @scala.inline
  def fade: typings.reactFlipMove.reactFlipMoveStrings.fade = this.cast("fade")
  @scala.inline
  def none: typings.reactFlipMove.reactFlipMoveStrings.none = this.cast("none")
}

