package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.Container
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.speedDial
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionButtonProps extends StObject {
  
  var actions: js.UndefOr[js.Array[Element | typings.reactNativeMaterialUi.anon.Icon | String]] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var style: js.UndefOr[Container] = js.native
  
  var transition: js.UndefOr[toolbar | speedDial] = js.native
}
object ActionButtonProps {
  
  @scala.inline
  def apply(): ActionButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionButtonProps]
  }
  
  @scala.inline
  implicit class ActionButtonPropsMutableBuilder[Self <: ActionButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[Element | typings.reactNativeMaterialUi.anon.Icon | String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: (Element | typings.reactNativeMaterialUi.anon.Icon | String)*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setStyle(value: Container): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTransition(value: toolbar | speedDial): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
