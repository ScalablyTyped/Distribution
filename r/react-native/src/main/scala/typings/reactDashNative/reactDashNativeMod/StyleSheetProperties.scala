package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetProperties extends js.Object {
  var hairlineWidth: Double
  def flatten[T /* <: String */](style: T): T
}

object StyleSheetProperties {
  @scala.inline
  def apply(flatten: js.Any => js.Any, hairlineWidth: Double): StyleSheetProperties = {
    val __obj = js.Dynamic.literal(flatten = js.Any.fromFunction1(flatten), hairlineWidth = hairlineWidth)
  
    __obj.asInstanceOf[StyleSheetProperties]
  }
}

