package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
