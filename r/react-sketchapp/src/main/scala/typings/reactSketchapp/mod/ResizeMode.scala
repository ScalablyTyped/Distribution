package typings.reactSketchapp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactSketchapp.reactSketchappStrings.contain
  - typings.reactSketchapp.reactSketchappStrings.cover
  - typings.reactSketchapp.reactSketchappStrings.stretch
  - typings.reactSketchapp.reactSketchappStrings.center
  - typings.reactSketchapp.reactSketchappStrings.repeat
  - typings.reactSketchapp.reactSketchappStrings.none
*/
trait ResizeMode extends js.Object

object ResizeMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.reactSketchapp.reactSketchappStrings.center = this.cast("center")
  @scala.inline
  def contain: typings.reactSketchapp.reactSketchappStrings.contain = this.cast("contain")
  @scala.inline
  def cover: typings.reactSketchapp.reactSketchappStrings.cover = this.cast("cover")
  @scala.inline
  def none: typings.reactSketchapp.reactSketchappStrings.none = this.cast("none")
  @scala.inline
  def repeat: typings.reactSketchapp.reactSketchappStrings.repeat = this.cast("repeat")
  @scala.inline
  def stretch: typings.reactSketchapp.reactSketchappStrings.stretch = this.cast("stretch")
}

