package typings.reactAsync.mod

import typings.std.Error
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-async", "FetchError")
@js.native
open class FetchError protected ()
  extends StObject
     with Error {
  def this(response: Response) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var response: Response = js.native
}
