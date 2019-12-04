package typings.requestDashPromiseDashNative.errorsMod

import org.scalablytyped.runtime.TopLevel
import typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.FullResponse
import typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.Options
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

