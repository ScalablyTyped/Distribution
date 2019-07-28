package typings.stellarDashSdk.stellarDashSdkMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "NetworkError")
@js.native
class NetworkError protected () extends Error {
  def this(message: String, response: js.Any) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var response: js.Any = js.native
  def getResponse(): js.Any = js.native
}

