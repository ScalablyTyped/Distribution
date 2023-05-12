package typings.smallweiAvue.anon

import typings.smallweiAvue.formMod.AvueFormProps
import typings.smallweiAvue.formMod.AvueFormSlots
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slots extends StObject {
  
  @JSName("$props")
  var $props: AvueFormProps[Any]
  
  @JSName("$slots")
  var $slots: AvueFormSlots[Any]
}
object Slots {
  
  inline def apply($props: AvueFormProps[Any], $slots: AvueFormSlots[Any]): Slots = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slots] (val x: Self) extends AnyVal {
    
    inline def set$props(value: AvueFormProps[Any]): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$slots(value: AvueFormSlots[Any]): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
  }
}
