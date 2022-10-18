package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsFeatureNotSupportedByPackageManagerErrorMod {
  
  @JSImport("snyk/dist/lib/errors/feature-not-supported-by-package-manager-error", "FeatureNotSupportedByPackageManagerError")
  @js.native
  open class FeatureNotSupportedByPackageManagerError protected () extends CustomError {
    def this(feature: String, packageManager: SupportedPackageManagers) = this()
    def this(feature: String, packageManager: SupportedPackageManagers, additionalUserHelp: String) = this()
    
    val feature: String = js.native
  }
}
