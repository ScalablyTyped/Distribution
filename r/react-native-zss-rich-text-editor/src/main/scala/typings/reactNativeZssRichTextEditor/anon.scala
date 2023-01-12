package typings.reactNativeZssRichTextEditor

import typings.react.mod.ReactNode
import typings.reactNativeZssRichTextEditor.mod.ACTIONS
import typings.reactNativeZssRichTextEditor.mod.ContentInset
import typings.reactNativeZssRichTextEditor.mod.ElementStyles
import typings.reactNativeZssRichTextEditor.mod.FunctionWithZeroArgs
import typings.reactNativeZssRichTextEditor.mod.IconsMap
import typings.reactNativeZssRichTextEditor.mod.RichTextEditor
import typings.reactNativeZssRichTextEditor.mod.RichTextStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextEditorProps> */
  trait PartialRichTextEditorProp extends StObject {
    
    var contentInset: js.UndefOr[ContentInset] = js.undefined
    
    var contentPlaceholder: js.UndefOr[String] = js.undefined
    
    var customCSS: js.UndefOr[RichTextStyles] = js.undefined
    
    var editorInitializedCallback: js.UndefOr[FunctionWithZeroArgs] = js.undefined
    
    var enableOnChange: js.UndefOr[Boolean] = js.undefined
    
    var footerHeight: js.UndefOr[Double] = js.undefined
    
    var hiddenTitle: js.UndefOr[Boolean] = js.undefined
    
    var initialContentHTML: js.UndefOr[String] = js.undefined
    
    var initialTitleHTML: js.UndefOr[String] = js.undefined
    
    var titlePlaceholder: js.UndefOr[String] = js.undefined
  }
  object PartialRichTextEditorProp {
    
    inline def apply(): PartialRichTextEditorProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRichTextEditorProp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRichTextEditorProp] (val x: Self) extends AnyVal {
      
      inline def setContentInset(value: ContentInset): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
      
      inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
      
      inline def setContentPlaceholder(value: String): Self = StObject.set(x, "contentPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setContentPlaceholderUndefined: Self = StObject.set(x, "contentPlaceholder", js.undefined)
      
      inline def setCustomCSS(value: RichTextStyles): Self = StObject.set(x, "customCSS", value.asInstanceOf[js.Any])
      
      inline def setCustomCSSUndefined: Self = StObject.set(x, "customCSS", js.undefined)
      
      inline def setEditorInitializedCallback(value: () => Unit): Self = StObject.set(x, "editorInitializedCallback", js.Any.fromFunction0(value))
      
      inline def setEditorInitializedCallbackUndefined: Self = StObject.set(x, "editorInitializedCallback", js.undefined)
      
      inline def setEnableOnChange(value: Boolean): Self = StObject.set(x, "enableOnChange", value.asInstanceOf[js.Any])
      
      inline def setEnableOnChangeUndefined: Self = StObject.set(x, "enableOnChange", js.undefined)
      
      inline def setFooterHeight(value: Double): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
      
      inline def setFooterHeightUndefined: Self = StObject.set(x, "footerHeight", js.undefined)
      
      inline def setHiddenTitle(value: Boolean): Self = StObject.set(x, "hiddenTitle", value.asInstanceOf[js.Any])
      
      inline def setHiddenTitleUndefined: Self = StObject.set(x, "hiddenTitle", js.undefined)
      
      inline def setInitialContentHTML(value: String): Self = StObject.set(x, "initialContentHTML", value.asInstanceOf[js.Any])
      
      inline def setInitialContentHTMLUndefined: Self = StObject.set(x, "initialContentHTML", js.undefined)
      
      inline def setInitialTitleHTML(value: String): Self = StObject.set(x, "initialTitleHTML", value.asInstanceOf[js.Any])
      
      inline def setInitialTitleHTMLUndefined: Self = StObject.set(x, "initialTitleHTML", js.undefined)
      
      inline def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setTitlePlaceholderUndefined: Self = StObject.set(x, "titlePlaceholder", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarProps> */
  trait PartialRichTextToolbarPro extends StObject {
    
    var actions: js.UndefOr[js.Array[ACTIONS]] = js.undefined
    
    var getEditor: js.UndefOr[js.Function0[RichTextEditor]] = js.undefined
    
    var iconMap: js.UndefOr[IconsMap] = js.undefined
    
    var iconTint: js.UndefOr[String] = js.undefined
    
    var onPressAddImage: js.UndefOr[FunctionWithZeroArgs] = js.undefined
    
    var onPressAddLink: js.UndefOr[FunctionWithZeroArgs] = js.undefined
    
    var renderAction: js.UndefOr[js.Function0[ReactNode]] = js.undefined
    
    var selectedButtonStyle: js.UndefOr[ElementStyles] = js.undefined
    
    var selectedIconTint: js.UndefOr[String] = js.undefined
    
    var unselectedButtonStyle: js.UndefOr[ElementStyles] = js.undefined
  }
  object PartialRichTextToolbarPro {
    
    inline def apply(): PartialRichTextToolbarPro = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRichTextToolbarPro]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRichTextToolbarPro] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[ACTIONS]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: ACTIONS*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setGetEditor(value: () => RichTextEditor): Self = StObject.set(x, "getEditor", js.Any.fromFunction0(value))
      
      inline def setGetEditorUndefined: Self = StObject.set(x, "getEditor", js.undefined)
      
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
}
