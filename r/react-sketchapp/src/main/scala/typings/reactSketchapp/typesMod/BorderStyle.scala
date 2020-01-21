package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactSketchapp.reactSketchappStrings.solid
  - typings.reactSketchapp.reactSketchappStrings.dotted
  - typings.reactSketchapp.reactSketchappStrings.dashed
*/
trait BorderStyle extends js.Object

object BorderStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typings.reactSketchapp.reactSketchappStrings.dashed = this.cast("dashed")
  @scala.inline
  def dotted: typings.reactSketchapp.reactSketchappStrings.dotted = this.cast("dotted")
  @scala.inline
  def solid: typings.reactSketchapp.reactSketchappStrings.solid = this.cast("solid")
}

