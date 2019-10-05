package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReorderingRuleMatchType extends js.Object

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType")
@js.native
object ReorderingRuleMatchType extends js.Object {
  @js.native
  sealed trait contentTypeIs extends ReorderingRuleMatchType
  
  @js.native
  sealed trait fileExtensionMatches extends ReorderingRuleMatchType
  
  @js.native
  sealed trait manualCondition extends ReorderingRuleMatchType
  
  @js.native
  sealed trait resultContainsKeyword extends ReorderingRuleMatchType
  
  @js.native
  sealed trait resultHasTag extends ReorderingRuleMatchType
  
  @js.native
  sealed trait titleContainsKeyword extends ReorderingRuleMatchType
  
  @js.native
  sealed trait titleMatchesKeyword extends ReorderingRuleMatchType
  
  @js.native
  sealed trait urlExactlyMatches extends ReorderingRuleMatchType
  
  @js.native
  sealed trait urlStartsWith extends ReorderingRuleMatchType
  
  /* 5 */ val contentTypeIs: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.contentTypeIs with Double = js.native
  /* 6 */ val fileExtensionMatches: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.fileExtensionMatches with Double = js.native
  /* 8 */ val manualCondition: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.manualCondition with Double = js.native
  /* 0 */ val resultContainsKeyword: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.resultContainsKeyword with Double = js.native
  /* 7 */ val resultHasTag: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.resultHasTag with Double = js.native
  /* 1 */ val titleContainsKeyword: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.titleContainsKeyword with Double = js.native
  /* 2 */ val titleMatchesKeyword: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.titleMatchesKeyword with Double = js.native
  /* 4 */ val urlExactlyMatches: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.urlExactlyMatches with Double = js.native
  /* 3 */ val urlStartsWith: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.urlStartsWith with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReorderingRuleMatchType with Double] = js.native
}

