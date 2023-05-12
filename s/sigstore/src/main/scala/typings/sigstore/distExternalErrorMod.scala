package typings.sigstore

import typings.makeFetchHappen.mod.FetchInterface
import typings.std.Awaited
import typings.std.Error
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExternalErrorMod {
  
  @JSImport("sigstore/dist/external/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sigstore/dist/external/error", "HTTPError")
  @js.native
  open class HTTPError protected ()
    extends StObject
       with Error {
    def this(response: Response) = this()
    
    var location: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var response: Response = js.native
    
    var statusCode: Double = js.native
  }
  
  inline def checkStatus(response: Response): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("checkStatus")(response.asInstanceOf[js.Any]).asInstanceOf[Response]
  
  type Response = Awaited[ReturnType[FetchInterface]]
}
