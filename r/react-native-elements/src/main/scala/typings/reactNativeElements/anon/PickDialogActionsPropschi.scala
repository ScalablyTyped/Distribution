package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-elements.react-native-elements/dist/dialog/DialogActions.DialogActionsProps, 'children'> */
trait PickDialogActionsPropschi extends StObject {
  
  var children: js.UndefOr[Any] = js.undefined
}
object PickDialogActionsPropschi {
  
  inline def apply(): PickDialogActionsPropschi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDialogActionsPropschi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickDialogActionsPropschi] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
