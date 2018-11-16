package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReorderingRuleMatchType extends js.Object

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType")
@js.native
object ReorderingRuleMatchType extends js.Object {
  @js.native
  sealed trait contentTypeIs
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType
  
  @js.native
  sealed trait fileExtensionMatches
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType
  
  @js.native
  sealed trait manualCondition
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType
  
  @js.native
  sealed trait resultContainsKeyword
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType
  
  @js.native
  sealed trait resultHasTag
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType
  
  @js.native
  sealed trait titleContainsKeyword
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType
  
  @js.native
  sealed trait titleMatchesKeyword
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType
  
  @js.native
  sealed trait urlExactlyMatches
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType
  
  @js.native
  sealed trait urlStartsWith
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType
  
  val contentTypeIs: contentTypeIs with java.lang.String = js.native
  val fileExtensionMatches: fileExtensionMatches with java.lang.String = js.native
  val manualCondition: manualCondition with java.lang.String = js.native
  val resultContainsKeyword: resultContainsKeyword with java.lang.String = js.native
  val resultHasTag: resultHasTag with java.lang.String = js.native
  val titleContainsKeyword: titleContainsKeyword with java.lang.String = js.native
  val titleMatchesKeyword: titleMatchesKeyword with java.lang.String = js.native
  val urlExactlyMatches: urlExactlyMatches with java.lang.String = js.native
  val urlStartsWith: urlStartsWith with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType with java.lang.String
  ] = js.native
}

