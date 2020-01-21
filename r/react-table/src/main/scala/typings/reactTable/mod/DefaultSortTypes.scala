package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactTable.reactTableStrings.alphanumeric
  - typings.reactTable.reactTableStrings.datetime
  - typings.reactTable.reactTableStrings.basic
*/
trait DefaultSortTypes extends js.Object

object DefaultSortTypes {
  @scala.inline
  def alphanumeric: typings.reactTable.reactTableStrings.alphanumeric = this.cast("alphanumeric")
  @scala.inline
  def basic: typings.reactTable.reactTableStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def datetime: typings.reactTable.reactTableStrings.datetime = this.cast("datetime")
}

