package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch extends StObject {
  
  /**
    * Inspect all query arguments.
    */
  var allQueryArguments: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments
    ]
  ] = js.undefined
  
  /**
    * Inspect the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody
    ]
  ] = js.undefined
  
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod
    ]
  ] = js.undefined
  
  /**
    * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString
    ]
  ] = js.undefined
  
  /**
    * Inspect a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader
    ]
  ] = js.undefined
  
  /**
    * Inspect a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument
    ]
  ] = js.undefined
  
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath
    ]
  ] = js.undefined
}
object WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch {
  
  @scala.inline
  def apply(): WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllQueryArguments(
      value: Input[
          WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments
        ]
    ): Self = StObject.set(x, "allQueryArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllQueryArgumentsUndefined: Self = StObject.set(x, "allQueryArguments", js.undefined)
    
    @scala.inline
    def setBody(
      value: Input[
          WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody
        ]
    ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setMethod(
      value: Input[
          WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod
        ]
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setQueryString(
      value: Input[
          WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString
        ]
    ): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    @scala.inline
    def setSingleHeader(
      value: Input[
          WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader
        ]
    ): Self = StObject.set(x, "singleHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleHeaderUndefined: Self = StObject.set(x, "singleHeader", js.undefined)
    
    @scala.inline
    def setSingleQueryArgument(
      value: Input[
          WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument
        ]
    ): Self = StObject.set(x, "singleQueryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleQueryArgumentUndefined: Self = StObject.set(x, "singleQueryArgument", js.undefined)
    
    @scala.inline
    def setUriPath(
      value: Input[
          WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath
        ]
    ): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPathUndefined: Self = StObject.set(x, "uriPath", js.undefined)
  }
}
