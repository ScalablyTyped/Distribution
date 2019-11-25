package typings.reactDashElemental.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashElemental.reactDashElementalStrings.regular
  - typings.reactDashElemental.reactDashElementalStrings.plain
  - typings.reactDashElemental.reactDashElementalStrings.underline
*/
trait LinkType extends js.Object

object LinkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def plain: typings.reactDashElemental.reactDashElementalStrings.plain = this.cast("plain")
  @scala.inline
  def regular: typings.reactDashElemental.reactDashElementalStrings.regular = this.cast("regular")
  @scala.inline
  def underline: typings.reactDashElemental.reactDashElementalStrings.underline = this.cast("underline")
}

