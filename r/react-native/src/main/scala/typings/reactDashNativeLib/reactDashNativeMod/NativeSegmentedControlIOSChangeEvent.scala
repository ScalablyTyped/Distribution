package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeSegmentedControlIOSChangeEvent extends TargetedEvent {
  var selectedSegmentIndex: scala.Double
  var value: java.lang.String
}

object NativeSegmentedControlIOSChangeEvent {
  @scala.inline
  def apply(selectedSegmentIndex: scala.Double, target: scala.Double, value: java.lang.String): NativeSegmentedControlIOSChangeEvent = {
    val __obj = js.Dynamic.literal(selectedSegmentIndex = selectedSegmentIndex, target = target, value = value)
  
    __obj.asInstanceOf[NativeSegmentedControlIOSChangeEvent]
  }
}

