package typings
package requestDashPromiseDashNativeLib.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformErrorConstructor
  extends stdLib.Error
     with org.scalablytyped.runtime.Instantiable3[
      /* cause */ js.Any, 
      /* options */ requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.Options, 
      /* response */ requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.FullResponse, 
      TransformError
    ] {
  def apply(
    cause: js.Any,
    options: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.Options,
    response: requestDashPromiseDashNativeLib.requestDashPromiseDashNativeMod.FullResponse
  ): TransformError = js.native
}

