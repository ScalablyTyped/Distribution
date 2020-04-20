package typings.serverless.validateMod

import typings.serverless.AnonHttp
import typings.serverless.AnonMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless/plugins/aws/package/compile/events/apiGateway/lib/validate", "getHttp")
@js.native
object getHttp extends js.Object {
  def apply[T /* <: js.Object */](event: AnonHttp[T], functionName: String): AnonMethod | T = js.native
}

