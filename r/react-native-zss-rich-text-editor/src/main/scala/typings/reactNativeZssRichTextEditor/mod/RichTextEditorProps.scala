package typings.reactNativeZssRichTextEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RichTextEditorProps extends StObject {
  
  var contentInset: ContentInset = js.native
  
  // Text that will be used as a placeholder when no text is present in the content section.
  var contentPlaceholder: String = js.native
  
  // Any custom CSS styles that you want to inject to the editor.
  var customCSS: RichTextStyles = js.native
  
  // A function that will be called when the editor has been initialized.
  var editorInitializedCallback: FunctionWithZeroArgs = js.native
  
  var enableOnChange: Boolean = js.native
  
  var footerHeight: Double = js.native
  
  // Hide title
  var hiddenTitle: Boolean = js.native
  
  // HTML that will be rendered in the content section on load.
  var initialContentHTML: String = js.native
  
  // HTML that will be rendered in the title section as soon as the component loads.
  var initialTitleHTML: String = js.native
  
  // Text that will be used as a placeholder when no text is present in the title section.
  var titlePlaceholder: String = js.native
}
object RichTextEditorProps {
  
  @scala.inline
  def apply(
    contentInset: ContentInset,
    contentPlaceholder: String,
    customCSS: RichTextStyles,
    editorInitializedCallback: () => Unit,
    enableOnChange: Boolean,
    footerHeight: Double,
    hiddenTitle: Boolean,
    initialContentHTML: String,
    initialTitleHTML: String,
    titlePlaceholder: String
  ): RichTextEditorProps = {
    val __obj = js.Dynamic.literal(contentInset = contentInset.asInstanceOf[js.Any], contentPlaceholder = contentPlaceholder.asInstanceOf[js.Any], customCSS = customCSS.asInstanceOf[js.Any], editorInitializedCallback = js.Any.fromFunction0(editorInitializedCallback), enableOnChange = enableOnChange.asInstanceOf[js.Any], footerHeight = footerHeight.asInstanceOf[js.Any], hiddenTitle = hiddenTitle.asInstanceOf[js.Any], initialContentHTML = initialContentHTML.asInstanceOf[js.Any], initialTitleHTML = initialTitleHTML.asInstanceOf[js.Any], titlePlaceholder = titlePlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTextEditorProps]
  }
  
  @scala.inline
  implicit class RichTextEditorPropsMutableBuilder[Self <: RichTextEditorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentInset(value: ContentInset): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentPlaceholder(value: String): Self = StObject.set(x, "contentPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCSS(value: RichTextStyles): Self = StObject.set(x, "customCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorInitializedCallback(value: () => Unit): Self = StObject.set(x, "editorInitializedCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableOnChange(value: Boolean): Self = StObject.set(x, "enableOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterHeight(value: Double): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenTitle(value: Boolean): Self = StObject.set(x, "hiddenTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialContentHTML(value: String): Self = StObject.set(x, "initialContentHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTitleHTML(value: String): Self = StObject.set(x, "initialTitleHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
  }
}
