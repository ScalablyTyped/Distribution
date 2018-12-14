package typings
package requestDashPromiseDashNativeLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodeErrorConstructor
  extends nodeLib.Error
     with org.scalablytyped.runtime.Instantiable4[
      /* statusCode */ scala.Double, 
      /* body */ js.Any, 
      /* options */ requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options, 
      /* response */ requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse, 
      StatusCodeError
    ] {
  def apply(
    statusCode: scala.Double,
    body: js.Any,
    options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options,
    response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse
  ): StatusCodeError = js.native
}

