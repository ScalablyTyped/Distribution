package typings.sidewayAddress.mod.uri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sideway/address", "uri.decode")
@js.native
object decode extends js.Object {
  
  /**
    * Faster version of decodeURIComponent() that does not throw.
    * 
    * @param string - the URL string to decode.
    * 
    * @returns the decoded string or null if invalid.
    */
  def apply(string: String): String | Null = js.native
}
