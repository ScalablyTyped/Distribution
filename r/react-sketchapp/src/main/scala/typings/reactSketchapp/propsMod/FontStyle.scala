package typings.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactSketchapp.reactSketchappStrings.normal
  - typings.reactSketchapp.reactSketchappStrings.italic
  - typings.reactSketchapp.reactSketchappStrings.oblique
*/
trait FontStyle extends js.Object

object FontStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def italic: typings.reactSketchapp.reactSketchappStrings.italic = this.cast("italic")
  @scala.inline
  def normal: typings.reactSketchapp.reactSketchappStrings.normal = this.cast("normal")
  @scala.inline
  def oblique: typings.reactSketchapp.reactSketchappStrings.oblique = this.cast("oblique")
}

