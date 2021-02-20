package typings.std

import org.scalablytyped.runtime.StObject
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
  implicit class SecurityPolicyViolationEventInitMutableBuilder[Self <: SecurityPolicyViolationEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockedURI(value: java.lang.String): Self = StObject.set(x, "blockedURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedURIUndefined: Self = StObject.set(x, "blockedURI", js.undefined)
    
    @scala.inline
    def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    @scala.inline
    def setDocumentURI(value: java.lang.String): Self = StObject.set(x, "documentURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentURIUndefined: Self = StObject.set(x, "documentURI", js.undefined)
    
    @scala.inline
    def setEffectiveDirective(value: java.lang.String): Self = StObject.set(x, "effectiveDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDirectiveUndefined: Self = StObject.set(x, "effectiveDirective", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    @scala.inline
    def setOriginalPolicy(value: java.lang.String): Self = StObject.set(x, "originalPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPolicyUndefined: Self = StObject.set(x, "originalPolicy", js.undefined)
    
    @scala.inline
    def setReferrer(value: java.lang.String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setSourceFile(value: java.lang.String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setViolatedDirective(value: java.lang.String): Self = StObject.set(x, "violatedDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolatedDirectiveUndefined: Self = StObject.set(x, "violatedDirective", js.undefined)
  }
}
