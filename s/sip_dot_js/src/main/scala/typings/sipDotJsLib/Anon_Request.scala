package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: sipDotJsLib.libCoreMod.IncomingRequestMessage
}

object Anon_Request {
  @scala.inline
  def apply(request: sipDotJsLib.libCoreMod.IncomingRequestMessage): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[Anon_Request]
  }
}

