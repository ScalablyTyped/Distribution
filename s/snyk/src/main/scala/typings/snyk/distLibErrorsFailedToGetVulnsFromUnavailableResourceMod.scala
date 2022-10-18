package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsFailedToGetVulnsFromUnavailableResourceMod {
  
  @JSImport("snyk/dist/lib/errors/failed-to-get-vulns-from-unavailable-resource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FailedToGetVulnsFromUnavailableResource(root: String, statusCode: Double): CustomError = (^.asInstanceOf[js.Dynamic].applyDynamic("FailedToGetVulnsFromUnavailableResource")(root.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[CustomError]
}
