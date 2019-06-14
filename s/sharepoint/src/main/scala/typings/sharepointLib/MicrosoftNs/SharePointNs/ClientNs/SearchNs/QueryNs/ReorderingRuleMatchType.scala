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
  
  /* 5 */ val contentTypeIs: contentTypeIs with scala.Double = js.native
  /* 6 */ val fileExtensionMatches: fileExtensionMatches with scala.Double = js.native
  /* 8 */ val manualCondition: manualCondition with scala.Double = js.native
  /* 0 */ val resultContainsKeyword: resultContainsKeyword with scala.Double = js.native
  /* 7 */ val resultHasTag: resultHasTag with scala.Double = js.native
  /* 1 */ val titleContainsKeyword: titleContainsKeyword with scala.Double = js.native
  /* 2 */ val titleMatchesKeyword: titleMatchesKeyword with scala.Double = js.native
  /* 4 */ val urlExactlyMatches: urlExactlyMatches with scala.Double = js.native
  /* 3 */ val urlStartsWith: urlStartsWith with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.ReorderingRuleMatchType with scala.Double
  ] = js.native
}

