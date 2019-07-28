package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeSegmentedControlIOSChangeEvent extends TargetedEvent {
  var selectedSegmentIndex: Double
  var value: String
}

object NativeSegmentedControlIOSChangeEvent {
  @scala.inline
  def apply(selectedSegmentIndex: Double, target: Double, value: String): NativeSegmentedControlIOSChangeEvent = {
    val __obj = js.Dynamic.literal(selectedSegmentIndex = selectedSegmentIndex, target = target, value = value)
  
    __obj.asInstanceOf[NativeSegmentedControlIOSChangeEvent]
  }
}

