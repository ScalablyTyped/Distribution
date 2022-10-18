package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.reactNativeElements.anon.PickDialogActionsPropschi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDialogDialogActionsMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/dialog/DialogActions", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickDialogActionsPropschi] | ForwardRefExoticComponent[DialogActionsProps] = js.native
  
  trait DialogActionsProps extends StObject {
    
    var children: js.UndefOr[Any] = js.undefined
  }
  object DialogActionsProps {
    
    inline def apply(): DialogActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogActionsProps]
    }
    
    extension [Self <: DialogActionsProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickDialogActionsPropschi] | ForwardRefExoticComponent[DialogActionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distDialogDialogActionsMod.foo` */
  override def _to: FunctionComponent[PickDialogActionsPropschi] | ForwardRefExoticComponent[DialogActionsProps] = default
}
