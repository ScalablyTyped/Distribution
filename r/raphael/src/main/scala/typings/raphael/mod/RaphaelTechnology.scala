package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.raphael.raphaelStrings._empty
  - typings.raphael.raphaelStrings.SVG
  - typings.raphael.raphaelStrings.VML
*/
trait RaphaelTechnology extends js.Object

object RaphaelTechnology {
  @scala.inline
  def SVG: typings.raphael.raphaelStrings.SVG = this.cast("SVG")
  @scala.inline
  def VML: typings.raphael.raphaelStrings.VML = this.cast("VML")
  @scala.inline
  def _empty: typings.raphael.raphaelStrings._empty = this.cast("")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

