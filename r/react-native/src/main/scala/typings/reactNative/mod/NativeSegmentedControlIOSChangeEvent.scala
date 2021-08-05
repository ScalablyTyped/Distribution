package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeSegmentedControlIOSChangeEvent
  extends StObject
     with TargetedEvent {
  
  var selectedSegmentIndex: Double
  
  var value: String
}
object NativeSegmentedControlIOSChangeEvent {
  
  inline def apply(selectedSegmentIndex: Double, target: Double, value: String): NativeSegmentedControlIOSChangeEvent = {
    val __obj = js.Dynamic.literal(selectedSegmentIndex = selectedSegmentIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeSegmentedControlIOSChangeEvent]
  }
  
  extension [Self <: NativeSegmentedControlIOSChangeEvent](x: Self) {
    
    inline def setSelectedSegmentIndex(value: Double): Self = StObject.set(x, "selectedSegmentIndex", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
