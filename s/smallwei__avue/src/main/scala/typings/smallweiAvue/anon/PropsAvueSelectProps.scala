package typings.smallweiAvue.anon

import typings.smallweiAvue.selectMod.AvueSelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsAvueSelectProps extends StObject {
  
  @JSName("$props")
  var $props: AvueSelectProps[Any]
}
object PropsAvueSelectProps {
  
  inline def apply($props: AvueSelectProps[Any]): PropsAvueSelectProps = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsAvueSelectProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsAvueSelectProps] (val x: Self) extends AnyVal {
    
    inline def set$props(value: AvueSelectProps[Any]): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
  }
}
