package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeSvg.reactNativeSvgStrings.normal
  - typings.reactNativeSvg.reactNativeSvgStrings.italic
  - typings.reactNativeSvg.reactNativeSvgStrings.oblique
*/
trait FontStyle extends js.Object

object FontStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def italic: typings.reactNativeSvg.reactNativeSvgStrings.italic = this.cast("italic")
  @scala.inline
  def normal: typings.reactNativeSvg.reactNativeSvgStrings.normal = this.cast("normal")
  @scala.inline
  def oblique: typings.reactNativeSvg.reactNativeSvgStrings.oblique = this.cast("oblique")
}

