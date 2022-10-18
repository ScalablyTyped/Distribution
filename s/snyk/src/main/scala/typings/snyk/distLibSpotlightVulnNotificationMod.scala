package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSpotlightVulnNotificationMod {
  
  @JSImport("snyk/dist/lib/spotlight-vuln-notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def containsSpotlightVulnIds(results: js.Array[Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("containsSpotlightVulnIds")(results.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def notificationForSpotlightVulns(foundSpotlightVulnsIds: js.Array[VulnerabilityId]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("notificationForSpotlightVulns")(foundSpotlightVulnsIds.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type VulnerabilityId = String
}
