package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsUnsupportedPackageManagerErrorMod {
  
  @JSImport("snyk/dist/lib/errors/unsupported-package-manager-error", "UnsupportedPackageManagerError")
  @js.native
  open class UnsupportedPackageManagerError protected () extends CustomError {
    def this(packageManager: Any) = this()
  }
  /* static members */
  object UnsupportedPackageManagerError {
    
    @JSImport("snyk/dist/lib/errors/unsupported-package-manager-error", "UnsupportedPackageManagerError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("snyk/dist/lib/errors/unsupported-package-manager-error", "UnsupportedPackageManagerError.ERROR_MESSAGE")
    @js.native
    def ERROR_MESSAGE: Any = js.native
    inline def ERROR_MESSAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR_MESSAGE")(x.asInstanceOf[js.Any])
  }
}
