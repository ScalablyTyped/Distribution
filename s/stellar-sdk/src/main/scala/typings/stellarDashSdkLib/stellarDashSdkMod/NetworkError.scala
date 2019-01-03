package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "NetworkError")
@js.native
class NetworkError protected ()
  extends nodeLib.Error {
  def this(message: java.lang.String, response: js.Any) = this()
  var response: js.Any = js.native
  def getResponse(): js.Any = js.native
}

