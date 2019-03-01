package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeSegmentedControlIOSChangeEvent extends js.Object {
  var selectedSegmentIndex: scala.Double
  var target: scala.Double
  var value: java.lang.String
}

object NativeSegmentedControlIOSChangeEvent {
  @scala.inline
  def apply(selectedSegmentIndex: scala.Double, target: scala.Double, value: java.lang.String): NativeSegmentedControlIOSChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selectedSegmentIndex")(selectedSegmentIndex)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NativeSegmentedControlIOSChangeEvent]
  }
}

