package typings.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.TopLevel
import typings.requestPromiseNative.mod.FullResponse
import typings.requestPromiseNative.mod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestError extends Error {
  var cause: js.Any = js.native
  var error: js.Any = js.native
  var options: Options = js.native
  var response: FullResponse = js.native
}

@JSImport("request-promise-native/errors", "RequestError")
@js.native
object RequestError extends TopLevel[RequestErrorConstructor]

