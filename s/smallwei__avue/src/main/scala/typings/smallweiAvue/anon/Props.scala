package typings.smallweiAvue.anon

import typings.smallweiAvue.crudMod.AvueCrudProps
import typings.smallweiAvue.crudMod.AvueCrudSlots
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props extends StObject {
  
  @JSName("$props")
  var $props: AvueCrudProps[Any]
  
  @JSName("$slots")
  var $slots: AvueCrudSlots[Any]
}
object Props {
  
  inline def apply($props: AvueCrudProps[Any], $slots: AvueCrudSlots[Any]): Props = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    inline def set$props(value: AvueCrudProps[Any]): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$slots(value: AvueCrudSlots[Any]): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
  }
}
