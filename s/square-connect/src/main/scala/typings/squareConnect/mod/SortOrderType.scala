package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.ASC
  - typings.squareConnect.squareConnectStrings.DESC
*/
trait SortOrderType extends js.Object

object SortOrderType {
  @scala.inline
  def ASC: typings.squareConnect.squareConnectStrings.ASC = this.cast("ASC")
  @scala.inline
  def DESC: typings.squareConnect.squareConnectStrings.DESC = this.cast("DESC")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

