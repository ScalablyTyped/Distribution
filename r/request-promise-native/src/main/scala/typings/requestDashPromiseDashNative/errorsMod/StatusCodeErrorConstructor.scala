package typings.requestDashPromiseDashNative.errorsMod

import org.scalablytyped.runtime.Instantiable4
import typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.FullResponse
import typings.requestDashPromiseDashNative.requestDashPromiseDashNativeMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodeErrorConstructor
  extends Error
     with Instantiable4[
      /* statusCode */ Double, 
      /* body */ js.Any, 
      /* options */ Options, 
      /* response */ FullResponse, 
      StatusCodeError
    ] {
  def apply(statusCode: Double, body: js.Any, options: Options, response: FullResponse): StatusCodeError = js.native
}

