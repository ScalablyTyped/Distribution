package typings
package requestDashPromiseDashNativeLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformErrorConstructor
  extends nodeLib.Error
     with ScalablyTyped.runtime.Instantiable3[
      /* cause */ js.Any, 
      /* options */ requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options, 
      /* response */ requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse, 
      TransformError
    ] {
  def apply(
    cause: js.Any,
    options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.Options,
    response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.requestPromiseNs.FullResponse
  ): TransformError = js.native
}

