package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeSegmentedControlIOSChangeEvent extends TargetedEvent {
  var selectedSegmentIndex: Double = js.native
  var value: String = js.native
}

object NativeSegmentedControlIOSChangeEvent {
  @scala.inline
  def apply(selectedSegmentIndex: Double, target: Double, value: String): NativeSegmentedControlIOSChangeEvent = {
    val __obj = js.Dynamic.literal(selectedSegmentIndex = selectedSegmentIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeSegmentedControlIOSChangeEvent]
  }
  @scala.inline
  implicit class NativeSegmentedControlIOSChangeEventOps[Self <: NativeSegmentedControlIOSChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSelectedSegmentIndex(value: Double): Self = this.set("selectedSegmentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

