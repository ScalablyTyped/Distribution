package typings.reactNativeZssRichTextEditor.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarOptionalProps> */
@js.native
trait RichTextToolbarProps extends StObject {
  
  var actions: js.UndefOr[js.Array[ACTIONS]] = js.native
  
  // Must provide a function that returns a ref to a RichTextEditor component.
  def getEditor(): RichTextEditor = js.native
  
  var iconMap: js.UndefOr[IconsMap] = js.native
  
  var iconTint: js.UndefOr[String] = js.native
  
  var onPressAddImage: js.UndefOr[FunctionWithZeroArgs] = js.native
  
  var onPressAddLink: js.UndefOr[FunctionWithZeroArgs] = js.native
  
  var renderAction: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  var selectedButtonStyle: js.UndefOr[ElementStyles] = js.native
  
  var selectedIconTint: js.UndefOr[String] = js.native
  
  var unselectedButtonStyle: js.UndefOr[ElementStyles] = js.native
}
object RichTextToolbarProps {
  
  @scala.inline
  def apply(getEditor: () => RichTextEditor): RichTextToolbarProps = {
    val __obj = js.Dynamic.literal(getEditor = js.Any.fromFunction0(getEditor))
    __obj.asInstanceOf[RichTextToolbarProps]
  }
  
  @scala.inline
  implicit class RichTextToolbarPropsMutableBuilder[Self <: RichTextToolbarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ACTIONS]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: ACTIONS*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setGetEditor(value: () => RichTextEditor): Self = StObject.set(x, "getEditor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIconMap(value: IconsMap): Self = StObject.set(x, "iconMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconMapUndefined: Self = StObject.set(x, "iconMap", js.undefined)
    
    @scala.inline
    def setIconTint(value: String): Self = StObject.set(x, "iconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconTintUndefined: Self = StObject.set(x, "iconTint", js.undefined)
    
    @scala.inline
    def setOnPressAddImage(value: () => Unit): Self = StObject.set(x, "onPressAddImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressAddImageUndefined: Self = StObject.set(x, "onPressAddImage", js.undefined)
    
    @scala.inline
    def setOnPressAddLink(value: () => Unit): Self = StObject.set(x, "onPressAddLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressAddLinkUndefined: Self = StObject.set(x, "onPressAddLink", js.undefined)
    
    @scala.inline
    def setRenderAction(value: () => ReactNode): Self = StObject.set(x, "renderAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderActionUndefined: Self = StObject.set(x, "renderAction", js.undefined)
    
    @scala.inline
    def setSelectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "selectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedButtonStyleNull: Self = StObject.set(x, "selectedButtonStyle", null)
    
    @scala.inline
    def setSelectedButtonStyleUndefined: Self = StObject.set(x, "selectedButtonStyle", js.undefined)
    
    @scala.inline
    def setSelectedIconTint(value: String): Self = StObject.set(x, "selectedIconTint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIconTintUndefined: Self = StObject.set(x, "selectedIconTint", js.undefined)
    
    @scala.inline
    def setUnselectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "unselectedButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedButtonStyleNull: Self = StObject.set(x, "unselectedButtonStyle", null)
    
    @scala.inline
    def setUnselectedButtonStyleUndefined: Self = StObject.set(x, "unselectedButtonStyle", js.undefined)
  }
}
