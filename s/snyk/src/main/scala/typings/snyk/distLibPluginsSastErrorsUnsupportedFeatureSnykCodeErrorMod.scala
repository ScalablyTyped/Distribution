package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsSastErrorsUnsupportedFeatureSnykCodeErrorMod {
  
  @JSImport("snyk/dist/lib/plugins/sast/errors/unsupported-feature-snyk-code-error", "FeatureNotSupportedBySnykCodeError")
  @js.native
  open class FeatureNotSupportedBySnykCodeError protected () extends CustomError {
    def this(feature: String) = this()
    def this(feature: String, additionalUserHelp: String) = this()
    
    val feature: String = js.native
  }
}
