package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayProfiler extends js.Object {
  def attachAggregateHandler(
    name: java.lang.String,
    handler: js.Function2[/* name */ java.lang.String, /* callback */ js.Function0[scala.Unit], scala.Unit]
  ): scala.Unit
  def attachProfileHandler(
    name: java.lang.String,
    handler: js.Function2[
      /* name */ java.lang.String, 
      /* state */ js.UndefOr[js.Any], 
      js.Function0[scala.Unit]
    ]
  ): scala.Unit
}

