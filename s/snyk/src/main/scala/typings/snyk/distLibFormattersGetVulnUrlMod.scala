package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersGetVulnUrlMod {
  
  @JSImport("snyk/dist/lib/formatters/get-vuln-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVulnerabilityUrl(vulnerabilityId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVulnerabilityUrl")(vulnerabilityId.asInstanceOf[js.Any]).asInstanceOf[String]
}
