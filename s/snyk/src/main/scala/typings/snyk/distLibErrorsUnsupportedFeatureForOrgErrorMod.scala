package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsUnsupportedFeatureForOrgErrorMod {
  
  @JSImport("snyk/dist/lib/errors/unsupported-feature-for-org-error", "FeatureNotSupportedForOrgError")
  @js.native
  open class FeatureNotSupportedForOrgError protected () extends CustomError {
    def this(org_ : String) = this()
    def this(org_ : String, feature: String) = this()
    def this(org_ : String, feature: String, additionalUserHelp: String) = this()
    def this(org_ : String, feature: Unit, additionalUserHelp: String) = this()
    
    @JSName("org")
    val org_ : String = js.native
  }
}
