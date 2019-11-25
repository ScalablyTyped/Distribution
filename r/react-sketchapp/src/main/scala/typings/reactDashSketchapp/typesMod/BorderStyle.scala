package typings.reactDashSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashSketchapp.reactDashSketchappStrings.solid
  - typings.reactDashSketchapp.reactDashSketchappStrings.dotted
  - typings.reactDashSketchapp.reactDashSketchappStrings.dashed
*/
trait BorderStyle extends js.Object

object BorderStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typings.reactDashSketchapp.reactDashSketchappStrings.dashed = this.cast("dashed")
  @scala.inline
  def dotted: typings.reactDashSketchapp.reactDashSketchappStrings.dotted = this.cast("dotted")
  @scala.inline
  def solid: typings.reactDashSketchapp.reactDashSketchappStrings.solid = this.cast("solid")
}

