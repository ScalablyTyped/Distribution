package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclLoggingConfigurationRedactedField extends StObject {
  
  /**
    * Redact all query arguments.
    */
  var allQueryArguments: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldAllQueryArguments]] = js.native
  
  /**
    * Redact the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldBody]] = js.native
  
  /**
    * Redact the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldMethod]] = js.native
  
  /**
    * Redact the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldQueryString]] = js.native
  
  /**
    * Redact a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldSingleHeader]] = js.native
  
  /**
    * Redact a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldSingleQueryArgument]] = js.native
  
  /**
    * Redact the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFieldUriPath]] = js.native
}
object WebAclLoggingConfigurationRedactedField {
  
  @scala.inline
  def apply(): WebAclLoggingConfigurationRedactedField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedField]
  }
  
  @scala.inline
  implicit class WebAclLoggingConfigurationRedactedFieldMutableBuilder[Self <: WebAclLoggingConfigurationRedactedField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllQueryArguments(value: Input[WebAclLoggingConfigurationRedactedFieldAllQueryArguments]): Self = StObject.set(x, "allQueryArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllQueryArgumentsUndefined: Self = StObject.set(x, "allQueryArguments", js.undefined)
    
    @scala.inline
    def setBody(value: Input[WebAclLoggingConfigurationRedactedFieldBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setMethod(value: Input[WebAclLoggingConfigurationRedactedFieldMethod]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setQueryString(value: Input[WebAclLoggingConfigurationRedactedFieldQueryString]): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    @scala.inline
    def setSingleHeader(value: Input[WebAclLoggingConfigurationRedactedFieldSingleHeader]): Self = StObject.set(x, "singleHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleHeaderUndefined: Self = StObject.set(x, "singleHeader", js.undefined)
    
    @scala.inline
    def setSingleQueryArgument(value: Input[WebAclLoggingConfigurationRedactedFieldSingleQueryArgument]): Self = StObject.set(x, "singleQueryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleQueryArgumentUndefined: Self = StObject.set(x, "singleQueryArgument", js.undefined)
    
    @scala.inline
    def setUriPath(value: Input[WebAclLoggingConfigurationRedactedFieldUriPath]): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPathUndefined: Self = StObject.set(x, "uriPath", js.undefined)
  }
}
