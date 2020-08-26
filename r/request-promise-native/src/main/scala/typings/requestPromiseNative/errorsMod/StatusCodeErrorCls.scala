package typings.requestPromiseNative.errorsMod

import typings.requestPromiseNative.mod.FullResponse
import typings.requestPromiseNative.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("request-promise-native/errors", "StatusCodeError")
@js.native
class StatusCodeErrorCls protected () extends StatusCodeError {
  def this(statusCode: Double, body: js.Any, options: Options, response: FullResponse) = this()
}

