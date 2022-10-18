package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsNoSupportedManifestsFoundMod {
  
  @JSImport("snyk/dist/lib/errors/no-supported-manifests-found", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NoSupportedManifestsFoundError(atLocations: js.Array[String]): CustomError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoSupportedManifestsFoundError")(atLocations.asInstanceOf[js.Any]).asInstanceOf[CustomError]
}
