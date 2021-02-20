package typings.reactAsync.mod

import typings.std.Error
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-async", "FetchError")
@js.native
class FetchError protected () extends Error {
  def this(response: Response) = this()
  
  var response: Response = js.native
}
