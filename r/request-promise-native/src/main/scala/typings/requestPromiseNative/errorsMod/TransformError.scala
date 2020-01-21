package typings.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.TopLevel
import typings.requestPromiseNative.mod.FullResponse
import typings.requestPromiseNative.mod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformError extends Error {
  var cause: js.Any
  var error: js.Any
  var options: Options
  var response: FullResponse
}

@JSImport("request-promise-native/errors", "TransformError")
@js.native
object TransformError extends TopLevel[TransformErrorConstructor]

