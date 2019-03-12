package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "NetworkError")
@js.native
class NetworkError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String, response: js.Any) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var response: js.Any = js.native
  def getResponse(): js.Any = js.native
}

