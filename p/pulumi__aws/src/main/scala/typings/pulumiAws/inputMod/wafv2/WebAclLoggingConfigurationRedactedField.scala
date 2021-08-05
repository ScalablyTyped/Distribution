package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclLoggingConfigurationRedactedField extends StObject {
  
  /**
    * Redact all query arguments.
    */
  var allQueryArguments: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldAllQueryArguments]] = js.undefined
  
  /**
    * Redact the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldBody]] = js.undefined
  
  /**
    * Redact the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldMethod]] = js.undefined
  
  /**
    * Redact the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldQueryString]] = js.undefined
  
  /**
    * Redact a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldSingleHeader]] = js.undefined
  
  /**
    * Redact a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldSingleQueryArgument]] = js.undefined
  
  /**
    * Redact the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldUriPath]] = js.undefined
}
object WebAclLoggingConfigurationRedactedField {
  
  inline def apply(): WebAclLoggingConfigurationRedactedField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedField]
  }
  
  extension [Self <: WebAclLoggingConfigurationRedactedField](x: Self) {
    
    inline def setAllQueryArguments(value: Input[WebAclLoggingConfigurationRedactedFieldAllQueryArguments]): Self = StObject.set(x, "allQueryArguments", value.asInstanceOf[js.Any])
    
    inline def setAllQueryArgumentsUndefined: Self = StObject.set(x, "allQueryArguments", js.undefined)
    
    inline def setBody(value: Input[WebAclLoggingConfigurationRedactedFieldBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMethod(value: Input[WebAclLoggingConfigurationRedactedFieldMethod]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQueryString(value: Input[WebAclLoggingConfigurationRedactedFieldQueryString]): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    inline def setSingleHeader(value: Input[WebAclLoggingConfigurationRedactedFieldSingleHeader]): Self = StObject.set(x, "singleHeader", value.asInstanceOf[js.Any])
    
    inline def setSingleHeaderUndefined: Self = StObject.set(x, "singleHeader", js.undefined)
    
    inline def setSingleQueryArgument(value: Input[WebAclLoggingConfigurationRedactedFieldSingleQueryArgument]): Self = StObject.set(x, "singleQueryArgument", value.asInstanceOf[js.Any])
    
    inline def setSingleQueryArgumentUndefined: Self = StObject.set(x, "singleQueryArgument", js.undefined)
    
    inline def setUriPath(value: Input[WebAclLoggingConfigurationRedactedFieldUriPath]): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
    
    inline def setUriPathUndefined: Self = StObject.set(x, "uriPath", js.undefined)
  }
}
