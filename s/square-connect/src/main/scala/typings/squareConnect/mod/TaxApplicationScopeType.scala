package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.ORDER
  - typings.squareConnect.squareConnectStrings.LINE_ITEM
  - typings.squareConnect.squareConnectStrings.OTHER_TAX_SCOPE
*/
trait TaxApplicationScopeType extends js.Object

object TaxApplicationScopeType {
  @scala.inline
  def LINE_ITEM: typings.squareConnect.squareConnectStrings.LINE_ITEM = this.cast("LINE_ITEM")
  @scala.inline
  def ORDER: typings.squareConnect.squareConnectStrings.ORDER = this.cast("ORDER")
  @scala.inline
  def OTHER_TAX_SCOPE: typings.squareConnect.squareConnectStrings.OTHER_TAX_SCOPE = this.cast("OTHER_TAX_SCOPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

