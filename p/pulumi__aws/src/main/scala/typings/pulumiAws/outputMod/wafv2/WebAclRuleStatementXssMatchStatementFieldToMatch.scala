package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementXssMatchStatementFieldToMatch extends StObject {
  
  /**
    * Inspect all query arguments.
    */
  var allQueryArguments: js.UndefOr[WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArguments] = js.undefined
  
  /**
    * Inspect the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[WebAclRuleStatementXssMatchStatementFieldToMatchBody] = js.undefined
  
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[WebAclRuleStatementXssMatchStatementFieldToMatchMethod] = js.undefined
  
  /**
    * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[WebAclRuleStatementXssMatchStatementFieldToMatchQueryString] = js.undefined
  
  /**
    * Inspect a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeader] = js.undefined
  
  /**
    * Inspect a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument] = js.undefined
  
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[WebAclRuleStatementXssMatchStatementFieldToMatchUriPath] = js.undefined
}
object WebAclRuleStatementXssMatchStatementFieldToMatch {
  
  @scala.inline
  def apply(): WebAclRuleStatementXssMatchStatementFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementXssMatchStatementFieldToMatch]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementXssMatchStatementFieldToMatchMutableBuilder[Self <: WebAclRuleStatementXssMatchStatementFieldToMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllQueryArguments(value: WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArguments): Self = StObject.set(x, "allQueryArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllQueryArgumentsUndefined: Self = StObject.set(x, "allQueryArguments", js.undefined)
    
    @scala.inline
    def setBody(value: WebAclRuleStatementXssMatchStatementFieldToMatchBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setMethod(value: WebAclRuleStatementXssMatchStatementFieldToMatchMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setQueryString(value: WebAclRuleStatementXssMatchStatementFieldToMatchQueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    @scala.inline
    def setSingleHeader(value: WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeader): Self = StObject.set(x, "singleHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleHeaderUndefined: Self = StObject.set(x, "singleHeader", js.undefined)
    
    @scala.inline
    def setSingleQueryArgument(value: WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgument): Self = StObject.set(x, "singleQueryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleQueryArgumentUndefined: Self = StObject.set(x, "singleQueryArgument", js.undefined)
    
    @scala.inline
    def setUriPath(value: WebAclRuleStatementXssMatchStatementFieldToMatchUriPath): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPathUndefined: Self = StObject.set(x, "uriPath", js.undefined)
  }
}
