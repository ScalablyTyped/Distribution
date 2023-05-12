package typings.remixRunWebFetch

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsBaseMod {
  
  @JSImport("@remix-run/web-fetch/dist/src/errors/base", "FetchBaseError")
  @js.native
  open class FetchBaseError protected ()
    extends StObject
       with Error {
    /**
      * @param {string} message
      * @param {string} type
      */
    def this(message: String, `type`: String) = this()
    
    var get: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    var `type`: String = js.native
  }
}
