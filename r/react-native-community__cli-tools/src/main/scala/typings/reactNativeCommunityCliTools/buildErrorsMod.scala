package typings.reactNativeCommunityCliTools

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildErrorsMod {
  
  @JSImport("@react-native-community/cli-tools/build/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-community/cli-tools/build/errors", "CLIError")
  @js.native
  open class CLIError protected ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    def this(msg: String, originalError: String) = this()
    def this(msg: String, originalError: js.Error) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@react-native-community/cli-tools/build/errors", "UnknownProjectError")
  @js.native
  open class UnknownProjectError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def inlineString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineString")().asInstanceOf[String]
  inline def inlineString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
