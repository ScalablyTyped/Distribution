package typings.reactNativeCommunityCli

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invalidNameErrorMod {
  
  @JSImport("@react-native-community/cli/build/commands/init/errors/InvalidNameError", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Error {
    def this(name: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  type InvalidNameError = js.Error
}
