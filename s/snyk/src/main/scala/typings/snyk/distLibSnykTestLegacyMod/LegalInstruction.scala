package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegalInstruction extends StObject {
  
  var legalContent: String
  
  var licenseName: String
}
object LegalInstruction {
  
  inline def apply(legalContent: String, licenseName: String): LegalInstruction = {
    val __obj = js.Dynamic.literal(legalContent = legalContent.asInstanceOf[js.Any], licenseName = licenseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegalInstruction]
  }
  
  extension [Self <: LegalInstruction](x: Self) {
    
    inline def setLegalContent(value: String): Self = StObject.set(x, "legalContent", value.asInstanceOf[js.Any])
    
    inline def setLicenseName(value: String): Self = StObject.set(x, "licenseName", value.asInstanceOf[js.Any])
  }
}
