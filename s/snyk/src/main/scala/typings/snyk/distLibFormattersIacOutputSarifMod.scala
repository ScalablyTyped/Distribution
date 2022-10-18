package typings.snyk

import typings.sarif.mod.Log
import typings.snyk.distLibSnykTestIacTestResultMod.IacTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputSarifMod {
  
  @JSImport("snyk/dist/lib/formatters/iac-output/sarif", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSarifOutputForIac(iacTestResponses: js.Array[IacTestResponse]): Log = ^.asInstanceOf[js.Dynamic].applyDynamic("createSarifOutputForIac")(iacTestResponses.asInstanceOf[js.Any]).asInstanceOf[Log]
}
