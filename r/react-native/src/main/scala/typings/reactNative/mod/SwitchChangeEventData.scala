package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchChangeEventData
  extends StObject
     with TargetedEvent {
  
  var value: Boolean
}
object SwitchChangeEventData {
  
  inline def apply(target: Double, value: Boolean): SwitchChangeEventData = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchChangeEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchChangeEventData] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
