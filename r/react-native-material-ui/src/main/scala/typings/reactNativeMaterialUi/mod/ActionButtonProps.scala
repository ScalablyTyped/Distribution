package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.Container
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.speedDial
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionButtonProps extends StObject {
  
  var actions: js.UndefOr[js.Array[Element | typings.reactNativeMaterialUi.anon.Icon | String]] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var style: js.UndefOr[Container] = js.undefined
  
  var transition: js.UndefOr[toolbar | speedDial] = js.undefined
}
object ActionButtonProps {
  
  inline def apply(): ActionButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionButtonProps] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[Element | typings.reactNativeMaterialUi.anon.Icon | String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (Element | typings.reactNativeMaterialUi.anon.Icon | String)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStyle(value: Container): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTransition(value: toolbar | speedDial): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
