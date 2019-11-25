package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.ORDER
  - typings.squareDashConnect.squareDashConnectStrings.LINE_ITEM
  - typings.squareDashConnect.squareDashConnectStrings.OTHER_TAX_SCOPE
*/
trait TaxApplicationScopeType extends js.Object

object TaxApplicationScopeType {
  @scala.inline
  def LINE_ITEM: typings.squareDashConnect.squareDashConnectStrings.LINE_ITEM = this.cast("LINE_ITEM")
  @scala.inline
  def ORDER: typings.squareDashConnect.squareDashConnectStrings.ORDER = this.cast("ORDER")
  @scala.inline
  def OTHER_TAX_SCOPE: typings.squareDashConnect.squareDashConnectStrings.OTHER_TAX_SCOPE = this.cast("OTHER_TAX_SCOPE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

