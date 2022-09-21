package typings.standardError

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("standard-error", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StandardError {
    def this(message: String) = this()
    def this(props: Any) = this()
    def this(message: String, props: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait StandardError
    extends StObject
       with Error
       with /* key */ StringDictionary[Any]
  object StandardError {
    
    inline def apply(message: String, name: String): StandardError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StandardError]
    }
  }
}
