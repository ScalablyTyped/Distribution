package typings.storybookTheming.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Definitions by: Junyoung Clare Jang <https://github.com/Ailrun>
/** Same as StyledOptions but shouldForwardProp must be a type guard */
trait FilteringStyledOptions[Props, ForwardedProps /* <: /* keyof Props */ String */] extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var shouldForwardProp: js.UndefOr[js.Function1[/* propName */ String, /* is ForwardedProps */ Boolean]] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object FilteringStyledOptions {
  
  inline def apply[Props, ForwardedProps /* <: /* keyof Props */ String */](): FilteringStyledOptions[Props, ForwardedProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringStyledOptions[Props, ForwardedProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilteringStyledOptions[?, ?], Props, ForwardedProps /* <: /* keyof Props */ String */] (val x: Self & (FilteringStyledOptions[Props, ForwardedProps])) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setShouldForwardProp(value: /* propName */ String => /* is ForwardedProps */ Boolean): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction1(value))
    
    inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
