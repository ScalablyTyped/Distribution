package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsMissingTargetfileErrorMod {
  
  @JSImport("snyk/dist/lib/errors/missing-targetfile-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MissingTargetFileError(path: String): CustomError = ^.asInstanceOf[js.Dynamic].applyDynamic("MissingTargetFileError")(path.asInstanceOf[js.Any]).asInstanceOf[CustomError]
}
