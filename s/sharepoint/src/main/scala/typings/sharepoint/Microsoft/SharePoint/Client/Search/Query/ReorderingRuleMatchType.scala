package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReorderingRuleMatchType with Double] = js.native
  /* 5 */ @js.native
  object contentTypeIs extends TopLevel[contentTypeIs with Double]
  
  /* 6 */ @js.native
  object fileExtensionMatches extends TopLevel[fileExtensionMatches with Double]
  
  /* 8 */ @js.native
  object manualCondition extends TopLevel[manualCondition with Double]
  
  /* 0 */ @js.native
  object resultContainsKeyword extends TopLevel[resultContainsKeyword with Double]
  
  /* 7 */ @js.native
  object resultHasTag extends TopLevel[resultHasTag with Double]
  
  /* 1 */ @js.native
  object titleContainsKeyword extends TopLevel[titleContainsKeyword with Double]
  
  /* 2 */ @js.native
  object titleMatchesKeyword extends TopLevel[titleMatchesKeyword with Double]
  
  /* 4 */ @js.native
  object urlExactlyMatches extends TopLevel[urlExactlyMatches with Double]
  
  /* 3 */ @js.native
  object urlStartsWith extends TopLevel[urlStartsWith with Double]
  
}

