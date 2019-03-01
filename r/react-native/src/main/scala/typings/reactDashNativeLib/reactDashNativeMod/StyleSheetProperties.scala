package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetProperties extends js.Object {
  var hairlineWidth: scala.Double
  def flatten[T /* <: java.lang.String */](style: T): T
}

object StyleSheetProperties {
  @scala.inline
  def apply(flatten: js.Function1[js.Any, js.Any], hairlineWidth: scala.Double): StyleSheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flatten")(flatten)
    __obj.updateDynamic("hairlineWidth")(hairlineWidth)
    __obj.asInstanceOf[StyleSheetProperties]
  }
}

