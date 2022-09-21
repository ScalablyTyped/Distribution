package typings.reactNativeZssRichTextEditor.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarOptionalProps> */
trait RichTextToolbarProps extends StObject {
  
  var actions: js.UndefOr[js.Array[ACTIONS]] = js.undefined
  
  // Must provide a function that returns a ref to a RichTextEditor component.
  def getEditor(): RichTextEditor
  
  var iconMap: js.UndefOr[IconsMap] = js.undefined
  
  var iconTint: js.UndefOr[String] = js.undefined
  
  var onPressAddImage: js.UndefOr[FunctionWithZeroArgs] = js.undefined
  
  var onPressAddLink: js.UndefOr[FunctionWithZeroArgs] = js.undefined
  
  var renderAction: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  
  var selectedButtonStyle: js.UndefOr[ElementStyles] = js.undefined
  
  var selectedIconTint: js.UndefOr[String] = js.undefined
  
  var unselectedButtonStyle: js.UndefOr[ElementStyles] = js.undefined
}
object RichTextToolbarProps {
  
  inline def apply(getEditor: () => RichTextEditor): RichTextToolbarProps = {
    val __obj = js.Dynamic.literal(getEditor = js.Any.fromFunction0(getEditor))
    __obj.asInstanceOf[RichTextToolbarProps]
  }
  
  extension [Self <: RichTextToolbarProps](x: Self) {
    
    inline def setActions(value: js.Array[ACTIONS]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: ACTIONS*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setGetEditor(value: () => RichTextEditor): Self = StObject.set(x, "getEditor", js.Any.fromFunction0(value))
    
    inline def setIconMap(value: IconsMap): Self = StObject.set(x, "iconMap", value.asInstanceOf[js.Any])
    
    inline def setIconMapUndefined: Self = StObject.set(x, "iconMap", js.undefined)
    
    inline def setIconTint(value: String): Self = StObject.set(x, "iconTint", value.asInstanceOf[js.Any])
    
    inline def setIconTintUndefined: Self = StObject.set(x, "iconTint", js.undefined)
    
    inline def setOnPressAddImage(value: () => Unit): Self = StObject.set(x, "onPressAddImage", js.Any.fromFunction0(value))
    
    inline def setOnPressAddImageUndefined: Self = StObject.set(x, "onPressAddImage", js.undefined)
    
    inline def setOnPressAddLink(value: () => Unit): Self = StObject.set(x, "onPressAddLink", js.Any.fromFunction0(value))
    
    inline def setOnPressAddLinkUndefined: Self = StObject.set(x, "onPressAddLink", js.undefined)
    
    inline def setRenderAction(value: () => ReactNode): Self = StObject.set(x, "renderAction", js.Any.fromFunction0(value))
    
    inline def setRenderActionUndefined: Self = StObject.set(x, "renderAction", js.undefined)
    
    inline def setSelectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "selectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedButtonStyleNull: Self = StObject.set(x, "selectedButtonStyle", null)
    
    inline def setSelectedButtonStyleUndefined: Self = StObject.set(x, "selectedButtonStyle", js.undefined)
    
    inline def setSelectedIconTint(value: String): Self = StObject.set(x, "selectedIconTint", value.asInstanceOf[js.Any])
    
    inline def setSelectedIconTintUndefined: Self = StObject.set(x, "selectedIconTint", js.undefined)
    
    inline def setUnselectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "unselectedButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setUnselectedButtonStyleNull: Self = StObject.set(x, "unselectedButtonStyle", null)
    
    inline def setUnselectedButtonStyleUndefined: Self = StObject.set(x, "unselectedButtonStyle", js.undefined)
  }
}
