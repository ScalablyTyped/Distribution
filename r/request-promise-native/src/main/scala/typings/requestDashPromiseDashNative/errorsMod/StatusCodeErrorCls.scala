package typings.requestDashPromiseDashNative.errorsMod

import typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.FullResponse
import typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-promise-native/errors", "StatusCodeError")
@js.native
class StatusCodeErrorCls protected () extends StatusCodeError {
  def this(statusCode: Double, body: js.Any, options: Options, response: FullResponse) = this()
  /* CompleteClass */
  override var error: js.Any = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var options: Options = js.native
  /* CompleteClass */
  override var response: FullResponse = js.native
  /* CompleteClass */
  override var statusCode: Double = js.native
}

