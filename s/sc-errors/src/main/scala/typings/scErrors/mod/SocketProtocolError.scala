package typings.scErrors.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sc-errors", "SocketProtocolError")
@js.native
class SocketProtocolError protected () extends Error {
  def this(message: String, code: Double) = this()
  
  var code: Double = js.native
}
