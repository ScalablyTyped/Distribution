package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch extends StObject {
  
  /**
    * Inspect all query arguments.
    */
  var allQueryArguments: js.UndefOr[
    RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments
  ] = js.undefined
  
  /**
    * Inspect the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[
    RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody
  ] = js.undefined
  
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[
    RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod
  ] = js.undefined
  
  /**
    * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[
    RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString
  ] = js.undefined
  
  /**
    * Inspect a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[
    RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader
  ] = js.undefined
  
  /**
    * Inspect a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[
    RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument
  ] = js.undefined
  
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[
    RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath
  ] = js.undefined
}
object RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch {
  
  inline def apply(): RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch]
  }
  
  extension [Self <: RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatch](x: Self) {
    
    inline def setAllQueryArguments(
      value: RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments
    ): Self = StObject.set(x, "allQueryArguments", value.asInstanceOf[js.Any])
    
    inline def setAllQueryArgumentsUndefined: Self = StObject.set(x, "allQueryArguments", js.undefined)
    
    inline def setBody(
      value: RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody
    ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMethod(
      value: RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQueryString(
      value: RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString
    ): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    inline def setSingleHeader(
      value: RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader
    ): Self = StObject.set(x, "singleHeader", value.asInstanceOf[js.Any])
    
    inline def setSingleHeaderUndefined: Self = StObject.set(x, "singleHeader", js.undefined)
    
    inline def setSingleQueryArgument(
      value: RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument
    ): Self = StObject.set(x, "singleQueryArgument", value.asInstanceOf[js.Any])
    
    inline def setSingleQueryArgumentUndefined: Self = StObject.set(x, "singleQueryArgument", js.undefined)
    
    inline def setUriPath(
      value: RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath
    ): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
    
    inline def setUriPathUndefined: Self = StObject.set(x, "uriPath", js.undefined)
  }
}
