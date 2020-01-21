package typings.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactSketchapp.reactSketchappStrings.none
  - typings.reactSketchapp.reactSketchappStrings.underline
  - typings.reactSketchapp.reactSketchappStrings.overline
  - typings.reactSketchapp.reactSketchappStrings.`line-through`
  - typings.reactSketchapp.reactSketchappStrings.blink
*/
trait TextDecoration extends js.Object

object TextDecoration {
  @scala.inline
  def blink: typings.reactSketchapp.reactSketchappStrings.blink = this.cast("blink")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `line-through`: typings.reactSketchapp.reactSketchappStrings.`line-through` = this.cast("line-through")
  @scala.inline
  def none: typings.reactSketchapp.reactSketchappStrings.none = this.cast("none")
  @scala.inline
  def overline: typings.reactSketchapp.reactSketchappStrings.overline = this.cast("overline")
  @scala.inline
  def underline: typings.reactSketchapp.reactSketchappStrings.underline = this.cast("underline")
}

