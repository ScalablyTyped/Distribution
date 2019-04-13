package typings
package requestDashPromiseDashNativeLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodeErrorConstructor
  extends stdLib.Error
     with org.scalablytyped.runtime.Instantiable4[
      /* statusCode */ scala.Double, 
      /* body */ js.Any, 
      /* options */ requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.Options, 
      /* response */ requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.FullResponse, 
      StatusCodeError
    ] {
  def apply(
    statusCode: scala.Double,
    body: js.Any,
    options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.Options,
    response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.FullResponse
  ): StatusCodeError = js.native
}

