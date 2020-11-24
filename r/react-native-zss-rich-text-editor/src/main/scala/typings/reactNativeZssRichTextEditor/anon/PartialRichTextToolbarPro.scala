package typings.reactNativeZssRichTextEditor.anon

import typings.react.mod.ReactNode
import typings.reactNativeZssRichTextEditor.mod.ACTIONS
import typings.reactNativeZssRichTextEditor.mod.ElementStyles
import typings.reactNativeZssRichTextEditor.mod.FunctionWithZeroArgs
import typings.reactNativeZssRichTextEditor.mod.IconsMap
import typings.reactNativeZssRichTextEditor.mod.RichTextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarProps> */
@js.native
trait PartialRichTextToolbarPro extends js.Object {
  
  var actions: js.UndefOr[js.Array[ACTIONS]] = js.native
  
  var getEditor: js.UndefOr[js.Function0[RichTextEditor]] = js.native
  
  var iconMap: js.UndefOr[IconsMap] = js.native
  
  var iconTint: js.UndefOr[String] = js.native
  
  var onPressAddImage: js.UndefOr[FunctionWithZeroArgs] = js.native
  
  var onPressAddLink: js.UndefOr[FunctionWithZeroArgs] = js.native
  
  var renderAction: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  var selectedButtonStyle: js.UndefOr[ElementStyles] = js.native
  
  var selectedIconTint: js.UndefOr[String] = js.native
  
  var unselectedButtonStyle: js.UndefOr[ElementStyles] = js.native
}
object PartialRichTextToolbarPro {
  
  @scala.inline
  def apply(): PartialRichTextToolbarPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRichTextToolbarPro]
  }
  
  @scala.inline
  implicit class PartialRichTextToolbarProOps[Self <: PartialRichTextToolbarPro] (val x: Self) extends AnyVal {
    
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
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setGetEditor(value: () => RichTextEditor): Self = this.set("getEditor", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEditor: Self = this.set("getEditor", js.undefined)
    
    @scala.inline
    def setIconMap(value: IconsMap): Self = this.set("iconMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconMap: Self = this.set("iconMap", js.undefined)
    
    @scala.inline
    def setIconTint(value: String): Self = this.set("iconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconTint: Self = this.set("iconTint", js.undefined)
    
    @scala.inline
    def setOnPressAddImage(value: () => Unit): Self = this.set("onPressAddImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPressAddImage: Self = this.set("onPressAddImage", js.undefined)
    
    @scala.inline
    def setOnPressAddLink(value: () => Unit): Self = this.set("onPressAddLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPressAddLink: Self = this.set("onPressAddLink", js.undefined)
    
    @scala.inline
    def setRenderAction(value: () => ReactNode): Self = this.set("renderAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderAction: Self = this.set("renderAction", js.undefined)
    
    @scala.inline
    def setSelectedButtonStyle(value: ElementStyles): Self = this.set("selectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedButtonStyle: Self = this.set("selectedButtonStyle", js.undefined)
    
    @scala.inline
    def setSelectedButtonStyleNull: Self = this.set("selectedButtonStyle", null)
    
    @scala.inline
    def setSelectedIconTint(value: String): Self = this.set("selectedIconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIconTint: Self = this.set("selectedIconTint", js.undefined)
    
    @scala.inline
    def setUnselectedButtonStyle(value: ElementStyles): Self = this.set("unselectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectedButtonStyle: Self = this.set("unselectedButtonStyle", js.undefined)
    
    @scala.inline
    def setUnselectedButtonStyleNull: Self = this.set("unselectedButtonStyle", null)
  }
}
