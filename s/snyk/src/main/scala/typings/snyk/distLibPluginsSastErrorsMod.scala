package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsSastErrorsMod {
  
  @JSImport("snyk/dist/lib/plugins/sast/errors", "FeatureNotSupportedBySnykCodeError")
  @js.native
  open class FeatureNotSupportedBySnykCodeError protected ()
    extends typings.snyk.distLibPluginsSastErrorsUnsupportedFeatureSnykCodeErrorMod.FeatureNotSupportedBySnykCodeError {
    def this(feature: String) = this()
    def this(feature: String, additionalUserHelp: String) = this()
  }
  
  @JSImport("snyk/dist/lib/plugins/sast/errors", "MissingConfigurationError")
  @js.native
  open class MissingConfigurationError protected ()
    extends typings.snyk.distLibPluginsSastErrorsMissingConfigurationErrorMod.MissingConfigurationError {
    def this(action: String) = this()
    def this(action: String, additionalUserHelp: String) = this()
  }
}
