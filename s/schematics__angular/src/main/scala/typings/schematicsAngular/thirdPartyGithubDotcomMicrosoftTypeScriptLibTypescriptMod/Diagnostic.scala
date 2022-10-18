package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagnostic
  extends StObject
     with DiagnosticRelatedInformation {
  
  var relatedInformation: js.UndefOr[js.Array[DiagnosticRelatedInformation]] = js.undefined
  
  var reportsDeprecated: js.UndefOr[js.Object] = js.undefined
  
  /** May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic. */
  var reportsUnnecessary: js.UndefOr[js.Object] = js.undefined
  
  var source: js.UndefOr[java.lang.String] = js.undefined
}
object Diagnostic {
  
  inline def apply(category: DiagnosticCategory, code: Double, messageText: java.lang.String | DiagnosticMessageChain): Diagnostic = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostic]
  }
  
  extension [Self <: Diagnostic](x: Self) {
    
    inline def setRelatedInformation(value: js.Array[DiagnosticRelatedInformation]): Self = StObject.set(x, "relatedInformation", value.asInstanceOf[js.Any])
    
    inline def setRelatedInformationUndefined: Self = StObject.set(x, "relatedInformation", js.undefined)
    
    inline def setRelatedInformationVarargs(value: DiagnosticRelatedInformation*): Self = StObject.set(x, "relatedInformation", js.Array(value*))
    
    inline def setReportsDeprecated(value: js.Object): Self = StObject.set(x, "reportsDeprecated", value.asInstanceOf[js.Any])
    
    inline def setReportsDeprecatedUndefined: Self = StObject.set(x, "reportsDeprecated", js.undefined)
    
    inline def setReportsUnnecessary(value: js.Object): Self = StObject.set(x, "reportsUnnecessary", value.asInstanceOf[js.Any])
    
    inline def setReportsUnnecessaryUndefined: Self = StObject.set(x, "reportsUnnecessary", js.undefined)
    
    inline def setSource(value: java.lang.String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
