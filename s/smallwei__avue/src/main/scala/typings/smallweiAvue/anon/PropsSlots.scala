package typings.smallweiAvue.anon

import typings.smallweiAvue.treeMod.AvueTreeProps
import typings.smallweiAvue.treeMod.AvueTreeSlots
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsSlots extends StObject {
  
  @JSName("$props")
  var $props: AvueTreeProps[Any]
  
  @JSName("$slots")
  var $slots: AvueTreeSlots[Any]
}
object PropsSlots {
  
  inline def apply($props: AvueTreeProps[Any], $slots: AvueTreeSlots[Any]): PropsSlots = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsSlots] (val x: Self) extends AnyVal {
    
    inline def set$props(value: AvueTreeProps[Any]): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$slots(value: AvueTreeSlots[Any]): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
  }
}
