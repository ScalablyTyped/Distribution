package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.ReorderingRule")
@js.native
class ReorderingRule () extends ClientValueObject {
  def get_boost(): Double = js.native
  def get_matchType(): ReorderingRuleMatchType = js.native
  def get_matchValue(): String = js.native
  def set_boost(value: Double): Unit = js.native
  def set_matchType(value: ReorderingRuleMatchType): Unit = js.native
  def set_matchValue(value: String): Unit = js.native
}

