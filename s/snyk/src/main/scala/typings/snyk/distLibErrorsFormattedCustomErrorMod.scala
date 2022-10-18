package typings.snyk

import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsFormattedCustomErrorMod {
  
  @JSImport("snyk/dist/lib/errors/formatted-custom-error", "FormattedCustomError")
  @js.native
  open class FormattedCustomError protected () extends CustomError {
    def this(message: String, formattedUserMessage: String) = this()
    def this(message: String, formattedUserMessage: String, userMessage: String) = this()
    
    var formattedUserMessage: String = js.native
  }
}
