package typings.snyk

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsCustomErrorMod {
  
  @JSImport("snyk/dist/lib/errors/custom-error", "CustomError")
  @js.native
  open class CustomError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var code: js.UndefOr[Double] = js.native
    
    var innerError: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var strCode: js.UndefOr[String] = js.native
    
    var userMessage: js.UndefOr[String] = js.native
  }
}
