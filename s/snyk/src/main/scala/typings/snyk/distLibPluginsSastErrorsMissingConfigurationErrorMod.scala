package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsSastErrorsMissingConfigurationErrorMod {
  
  @JSImport("snyk/dist/lib/plugins/sast/errors/missing-configuration-error", "MissingConfigurationError")
  @js.native
  open class MissingConfigurationError protected () extends CustomError {
    def this(action: String) = this()
    def this(action: String, additionalUserHelp: String) = this()
    
    val action: String = js.native
  }
}
