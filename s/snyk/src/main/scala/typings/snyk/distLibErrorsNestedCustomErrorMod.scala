package typings.snyk

import typings.snyk.distLibErrorsCustomErrorMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsNestedCustomErrorMod {
  
  @JSImport("snyk/dist/lib/errors/nested-custom-error", "NestedCustomError")
  @js.native
  open class NestedCustomError protected () extends CustomError {
    def this(message: String) = this()
    def this(message: String, innerError: Any) = this()
    
    def nestedCode: js.UndefOr[Double] = js.native
    
    def nestedMessage: String = js.native
    
    def nestedName: String = js.native
    
    def nestedStack: js.UndefOr[String] = js.native
    
    def nestedStrCode: js.UndefOr[String] = js.native
    
    def nestedUserMessage: js.UndefOr[String] = js.native
  }
}
