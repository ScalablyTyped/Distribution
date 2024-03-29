package typings.reactNativeZssRichTextEditor.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichTextToolbarOptionalProps extends StObject {
  
  // An array of actions to be provided by this toolbar.
  var actions: js.Array[ACTIONS]
  
  var iconMap: IconsMap
  
  var iconTint: String
  
  var onPressAddImage: FunctionWithZeroArgs
  
  // Functions called when the addLink or addImage actions are tapped.
  var onPressAddLink: FunctionWithZeroArgs
  
  def renderAction(): ReactNode
  
  var selectedButtonStyle: ElementStyles
  
  var selectedIconTint: String
  
  var unselectedButtonStyle: ElementStyles
}
object RichTextToolbarOptionalProps {
  
  inline def apply(
    actions: js.Array[ACTIONS],
    iconMap: IconsMap,
    iconTint: String,
    onPressAddImage: () => Unit,
    onPressAddLink: () => Unit,
    renderAction: () => ReactNode,
    selectedIconTint: String
  ): RichTextToolbarOptionalProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], iconMap = iconMap.asInstanceOf[js.Any], iconTint = iconTint.asInstanceOf[js.Any], onPressAddImage = js.Any.fromFunction0(onPressAddImage), onPressAddLink = js.Any.fromFunction0(onPressAddLink), renderAction = js.Any.fromFunction0(renderAction), selectedIconTint = selectedIconTint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTextToolbarOptionalProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RichTextToolbarOptionalProps] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[ACTIONS]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: ACTIONS*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setIconMap(value: IconsMap): Self = StObject.set(x, "iconMap", value.asInstanceOf[js.Any])
    
    inline def setIconTint(value: String): Self = StObject.set(x, "iconTint", value.asInstanceOf[js.Any])
    
    inline def setOnPressAddImage(value: () => Unit): Self = StObject.set(x, "onPressAddImage", js.Any.fromFunction0(value))
    
    inline def setOnPressAddLink(value: () => Unit): Self = StObject.set(x, "onPressAddLink", js.Any.fromFunction0(value))
    
    inline def setRenderAction(value: () => ReactNode): Self = StObject.set(x, "renderAction", js.Any.fromFunction0(value))
    
    inline def setSelectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "selectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedButtonStyleNull: Self = StObject.set(x, "selectedButtonStyle", null)
    
    inline def setSelectedButtonStyleUndefined: Self = StObject.set(x, "selectedButtonStyle", js.undefined)
    
    inline def setSelectedIconTint(value: String): Self = StObject.set(x, "selectedIconTint", value.asInstanceOf[js.Any])
    
    inline def setUnselectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "unselectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setUnselectedButtonStyleNull: Self = StObject.set(x, "unselectedButtonStyle", null)
    
    inline def setUnselectedButtonStyleUndefined: Self = StObject.set(x, "unselectedButtonStyle", js.undefined)
  }
}
