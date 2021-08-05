package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatch extends StObject {
  
  /**
    * Inspect all query arguments.
    */
  var allQueryArguments: js.UndefOr[
    WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments
  ] = js.undefined
  
  /**
    * Inspect the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchBody] = js.undefined
  
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchMethod] = js.undefined
  
  /**
    * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString] = js.undefined
  
  /**
    * Inspect a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader] = js.undefined
  
  /**
    * Inspect a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[
    WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument
  ] = js.undefined
  
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath] = js.undefined
}
object WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatch {
  
  inline def apply(): WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatch]
  }
  
  extension [Self <: WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatch](x: Self) {
    
    inline def setAllQueryArguments(value: WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments): Self = StObject.set(x, "allQueryArguments", value.asInstanceOf[js.Any])
    
    inline def setAllQueryArgumentsUndefined: Self = StObject.set(x, "allQueryArguments", js.undefined)
    
    inline def setBody(value: WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMethod(value: WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQueryString(value: WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    inline def setSingleHeader(value: WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader): Self = StObject.set(x, "singleHeader", value.asInstanceOf[js.Any])
    
    inline def setSingleHeaderUndefined: Self = StObject.set(x, "singleHeader", js.undefined)
    
    inline def setSingleQueryArgument(value: WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument): Self = StObject.set(x, "singleQueryArgument", value.asInstanceOf[js.Any])
    
    inline def setSingleQueryArgumentUndefined: Self = StObject.set(x, "singleQueryArgument", js.undefined)
    
    inline def setUriPath(value: WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
    
    inline def setUriPathUndefined: Self = StObject.set(x, "uriPath", js.undefined)
  }
}
