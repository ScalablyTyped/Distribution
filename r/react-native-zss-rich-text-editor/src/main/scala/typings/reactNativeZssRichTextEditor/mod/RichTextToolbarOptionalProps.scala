package typings.reactNativeZssRichTextEditor.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RichTextToolbarOptionalProps extends js.Object {
  
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
  implicit class RichTextToolbarOptionalPropsOps[Self <: RichTextToolbarOptionalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionsVarargs(value: ACTIONS*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[ACTIONS]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconMap(value: IconsMap): Self = this.set("iconMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTint(value: String): Self = this.set("iconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressAddImage(value: () => Unit): Self = this.set("onPressAddImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressAddLink(value: () => Unit): Self = this.set("onPressAddLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderAction(value: () => ReactNode): Self = this.set("renderAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectedIconTint(value: String): Self = this.set("selectedIconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedButtonStyle(value: ElementStyles): Self = this.set("selectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedButtonStyle: Self = this.set("selectedButtonStyle", js.undefined)
    
    @scala.inline
    def setSelectedButtonStyleNull: Self = this.set("selectedButtonStyle", null)
    
    @scala.inline
    def setUnselectedButtonStyle(value: ElementStyles): Self = this.set("unselectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectedButtonStyle: Self = this.set("unselectedButtonStyle", js.undefined)
    
    @scala.inline
    def setUnselectedButtonStyleNull: Self = this.set("unselectedButtonStyle", null)
  }
}
