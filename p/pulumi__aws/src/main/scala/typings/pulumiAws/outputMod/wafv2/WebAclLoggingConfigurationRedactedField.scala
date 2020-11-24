package typings.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclLoggingConfigurationRedactedField extends js.Object {
  
  /**
    * Redact all query arguments.
    */
  var allQueryArguments: js.UndefOr[WebAclLoggingConfigurationRedactedFieldAllQueryArguments] = js.native
  
  /**
    * Redact the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[WebAclLoggingConfigurationRedactedFieldBody] = js.native
  
  /**
    * Redact the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[WebAclLoggingConfigurationRedactedFieldMethod] = js.native
  
  /**
    * Redact the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[WebAclLoggingConfigurationRedactedFieldQueryString] = js.native
  
  /**
    * Redact a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[WebAclLoggingConfigurationRedactedFieldSingleHeader] = js.native
  
  /**
    * Redact a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[WebAclLoggingConfigurationRedactedFieldSingleQueryArgument] = js.native
  
  /**
    * Redact the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[WebAclLoggingConfigurationRedactedFieldUriPath] = js.native
}
object WebAclLoggingConfigurationRedactedField {
  
  @scala.inline
  def apply(): WebAclLoggingConfigurationRedactedField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedField]
  }
  
  @scala.inline
  implicit class WebAclLoggingConfigurationRedactedFieldOps[Self <: WebAclLoggingConfigurationRedactedField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllQueryArguments(value: WebAclLoggingConfigurationRedactedFieldAllQueryArguments): Self = this.set("allQueryArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllQueryArguments: Self = this.set("allQueryArguments", js.undefined)
    
    @scala.inline
    def setBody(value: WebAclLoggingConfigurationRedactedFieldBody): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setMethod(value: WebAclLoggingConfigurationRedactedFieldMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setQueryString(value: WebAclLoggingConfigurationRedactedFieldQueryString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
    
    @scala.inline
    def setSingleHeader(value: WebAclLoggingConfigurationRedactedFieldSingleHeader): Self = this.set("singleHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleHeader: Self = this.set("singleHeader", js.undefined)
    
    @scala.inline
    def setSingleQueryArgument(value: WebAclLoggingConfigurationRedactedFieldSingleQueryArgument): Self = this.set("singleQueryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleQueryArgument: Self = this.set("singleQueryArgument", js.undefined)
    
    @scala.inline
    def setUriPath(value: WebAclLoggingConfigurationRedactedFieldUriPath): Self = this.set("uriPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUriPath: Self = this.set("uriPath", js.undefined)
  }
}
