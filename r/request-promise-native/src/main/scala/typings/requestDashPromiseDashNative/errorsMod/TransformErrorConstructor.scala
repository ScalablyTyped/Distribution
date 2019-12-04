package typings.requestDashPromiseDashNative.errorsMod

import org.scalablytyped.runtime.Instantiable3
import typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.FullResponse
import typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformErrorConstructor
  extends Error
     with Instantiable3[/* cause */ js.Any, /* options */ Options, /* response */ FullResponse, TransformError] {
  def apply(cause: js.Any, options: Options, response: FullResponse): TransformError = js.native
}

