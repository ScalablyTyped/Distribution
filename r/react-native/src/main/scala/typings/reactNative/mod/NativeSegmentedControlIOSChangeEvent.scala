package typings.reactNative.mod

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
    val __obj = js.Dynamic.literal(selectedSegmentIndex = selectedSegmentIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NativeSegmentedControlIOSChangeEvent]
  }
}

