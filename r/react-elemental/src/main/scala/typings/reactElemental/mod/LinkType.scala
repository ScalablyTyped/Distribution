package typings.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactElemental.reactElementalStrings.regular
  - typings.reactElemental.reactElementalStrings.plain
  - typings.reactElemental.reactElementalStrings.underline
*/
trait LinkType extends js.Object

object LinkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def plain: typings.reactElemental.reactElementalStrings.plain = this.cast("plain")
  @scala.inline
  def regular: typings.reactElemental.reactElementalStrings.regular = this.cast("regular")
  @scala.inline
  def underline: typings.reactElemental.reactElementalStrings.underline = this.cast("underline")
}

