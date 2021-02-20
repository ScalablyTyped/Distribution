package typings.reactNativeZssRichTextEditor.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RichTextToolbarOptionalProps extends StObject {
  
  // An array of actions to be provided by this toolbar.
  var actions: js.Array[ACTIONS] = js.native
  
  var iconMap: IconsMap = js.native
  
  var iconTint: String = js.native
  
  var onPressAddImage: FunctionWithZeroArgs = js.native
  
  // Functions called when the addLink or addImage actions are tapped.
  var onPressAddLink: FunctionWithZeroArgs = js.native
  
  def renderAction(): ReactNode = js.native
  
  var selectedButtonStyle: ElementStyles = js.native
  
  var selectedIconTint: String = js.native
  
  var unselectedButtonStyle: ElementStyles = js.native
}
object RichTextToolbarOptionalProps {
  
  @scala.inline
  def apply(
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
  implicit class RichTextToolbarOptionalPropsMutableBuilder[Self <: RichTextToolbarOptionalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ACTIONS]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: ACTIONS*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setIconMap(value: IconsMap): Self = StObject.set(x, "iconMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTint(value: String): Self = StObject.set(x, "iconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressAddImage(value: () => Unit): Self = StObject.set(x, "onPressAddImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressAddLink(value: () => Unit): Self = StObject.set(x, "onPressAddLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderAction(value: () => ReactNode): Self = StObject.set(x, "renderAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "selectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedButtonStyleNull: Self = StObject.set(x, "selectedButtonStyle", null)
    
    @scala.inline
    def setSelectedButtonStyleUndefined: Self = StObject.set(x, "selectedButtonStyle", js.undefined)
    
    @scala.inline
    def setSelectedIconTint(value: String): Self = StObject.set(x, "selectedIconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "unselectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedButtonStyleNull: Self = StObject.set(x, "unselectedButtonStyle", null)
    
    @scala.inline
    def setUnselectedButtonStyleUndefined: Self = StObject.set(x, "unselectedButtonStyle", js.undefined)
  }
}
