package typings.storybookTheming.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyledOptions[Props] extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var shouldForwardProp: js.UndefOr[js.Function1[/* propName */ String, Boolean]] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object StyledOptions {
  
  inline def apply[Props](): StyledOptions[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledOptions[Props]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyledOptions[?], Props] (val x: Self & StyledOptions[Props]) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setShouldForwardProp(value: /* propName */ String => Boolean): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction1(value))
    
    inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
