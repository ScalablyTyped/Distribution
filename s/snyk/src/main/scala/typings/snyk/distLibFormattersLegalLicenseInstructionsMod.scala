package typings.snyk

import typings.snyk.distLibSnykTestLegacyMod.LegalInstruction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersLegalLicenseInstructionsMod {
  
  @JSImport("snyk/dist/lib/formatters/legal-license-instructions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatLegalInstructions(legalInstructions: js.Array[LegalInstruction]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLegalInstructions")(legalInstructions.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatLegalInstructions(legalInstructions: js.Array[LegalInstruction], paddingLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLegalInstructions")(legalInstructions.asInstanceOf[js.Any], paddingLength.asInstanceOf[js.Any])).asInstanceOf[String]
}
