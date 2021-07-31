package typings.standardError

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("standard-error", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with StandardError {
    def this(message: String) = this()
    def this(props: js.Any) = this()
    def this(message: String, props: js.Any) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait StandardError
    extends StObject
       with Error
       with /* key */ StringDictionary[js.Any]
  object StandardError {
    
    @scala.inline
    def apply(message: String, name: String): StandardError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[StandardError]
    }
  }
}
