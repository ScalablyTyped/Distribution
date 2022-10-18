package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsMissingOptionErrorMod {
  
  @JSImport("snyk/dist/lib/errors/missing-option-error", "MissingOptionError")
  @js.native
  open class MissingOptionError protected () extends CustomError {
    def this(option: String, required: js.Array[String]) = this()
  }
}
