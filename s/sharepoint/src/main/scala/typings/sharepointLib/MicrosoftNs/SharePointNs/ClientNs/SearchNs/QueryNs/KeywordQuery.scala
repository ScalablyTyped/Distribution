package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**Contains information about a keyword based search query.*/
@JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQuery")
@js.native
class KeywordQuery protected () extends Query {
  def this(context: sharepointLib.SPNs.ClientContext) = this()
  def get_collapseSpecification(): java.lang.String = js.native
  def get_enableSorting(): scala.Boolean = js.native
  def get_hiddenConstraints(): java.lang.String = js.native
  def get_properties(): KeywordQueryProperties = js.native
  def get_refinementFilters(): StringCollection = js.native
  def get_refiners(): java.lang.String = js.native
  def get_reorderingRules(): ReorderingRuleCollection = js.native
  /**Specifies the list of managed properties to be returned for each search result.*/
  def get_selectProperties(): StringCollection = js.native
  def get_sortList(): SortCollection = js.native
  def get_trimDuplicatesIncludeId(): scala.Double = js.native
  def set_collapseSpecification(value: java.lang.String): scala.Unit = js.native
  def set_enableSorting(value: scala.Boolean): scala.Unit = js.native
  def set_hiddenConstraints(value: java.lang.String): scala.Unit = js.native
  def set_refinementFilters(value: StringCollection): scala.Unit = js.native
  def set_refiners(value: java.lang.String): scala.Unit = js.native
  def set_reorderingRules(value: ReorderingRuleCollection): scala.Unit = js.native
  def set_trimDuplicatesIncludeId(value: scala.Double): scala.Unit = js.native
}

