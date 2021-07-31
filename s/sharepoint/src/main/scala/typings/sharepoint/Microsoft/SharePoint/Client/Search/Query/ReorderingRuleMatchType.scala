package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReorderingRuleMatchType extends StObject
@JSGlobal("Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType")
@js.native
object ReorderingRuleMatchType extends StObject {
  
  @js.native
  sealed trait contentTypeIs
    extends StObject
       with ReorderingRuleMatchType
  
  @js.native
  sealed trait fileExtensionMatches
    extends StObject
       with ReorderingRuleMatchType
  
  @js.native
  sealed trait manualCondition
    extends StObject
       with ReorderingRuleMatchType
  
  @js.native
  sealed trait resultContainsKeyword
    extends StObject
       with ReorderingRuleMatchType
  
  @js.native
  sealed trait resultHasTag
    extends StObject
       with ReorderingRuleMatchType
  
  @js.native
  sealed trait titleContainsKeyword
    extends StObject
       with ReorderingRuleMatchType
  
  @js.native
  sealed trait titleMatchesKeyword
    extends StObject
       with ReorderingRuleMatchType
  
  @js.native
  sealed trait urlExactlyMatches
    extends StObject
       with ReorderingRuleMatchType
  
  @js.native
  sealed trait urlStartsWith
    extends StObject
       with ReorderingRuleMatchType
}
