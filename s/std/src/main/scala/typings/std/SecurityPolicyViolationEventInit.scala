package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPolicyViolationEventInit extends EventInit {
  
  var blockedURI: js.UndefOr[java.lang.String] = js.native
  
  var columnNumber: js.UndefOr[Double] = js.native
  
  var documentURI: js.UndefOr[java.lang.String] = js.native
  
  var effectiveDirective: js.UndefOr[java.lang.String] = js.native
  
  var lineNumber: js.UndefOr[Double] = js.native
  
  var originalPolicy: js.UndefOr[java.lang.String] = js.native
  
  var referrer: js.UndefOr[java.lang.String] = js.native
  
  var sourceFile: js.UndefOr[java.lang.String] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
  
  var violatedDirective: js.UndefOr[java.lang.String] = js.native
}
object SecurityPolicyViolationEventInit {
  
  @scala.inline
  def apply(): SecurityPolicyViolationEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyViolationEventInit]
  }
  
  @scala.inline
  implicit class SecurityPolicyViolationEventInitOps[Self <: SecurityPolicyViolationEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlockedURI(value: java.lang.String): Self = this.set("blockedURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedURI: Self = this.set("blockedURI", js.undefined)
    
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
    
    @scala.inline
    def setDocumentURI(value: java.lang.String): Self = this.set("documentURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentURI: Self = this.set("documentURI", js.undefined)
    
    @scala.inline
    def setEffectiveDirective(value: java.lang.String): Self = this.set("effectiveDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDirective: Self = this.set("effectiveDirective", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    
    @scala.inline
    def setOriginalPolicy(value: java.lang.String): Self = this.set("originalPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalPolicy: Self = this.set("originalPolicy", js.undefined)
    
    @scala.inline
    def setReferrer(value: java.lang.String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    
    @scala.inline
    def setSourceFile(value: java.lang.String): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFile: Self = this.set("sourceFile", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setViolatedDirective(value: java.lang.String): Self = this.set("violatedDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolatedDirective: Self = this.set("violatedDirective", js.undefined)
  }
}
