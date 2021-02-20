package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class NativeSegmentedControlIOSChangeEventMutableBuilder[Self <: NativeSegmentedControlIOSChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedSegmentIndex(value: Double): Self = StObject.set(x, "selectedSegmentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
