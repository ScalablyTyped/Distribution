package typings.reactNativeZssRichTextEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichTextEditorProps extends js.Object {
  var contentInset: ContentInset
  // Text that will be used as a placeholder when no text is present in the content section.
  var contentPlaceholder: String
  // Any custom CSS styles that you want to inject to the editor.
  var customCSS: RichTextStyles
  // A function that will be called when the editor has been initialized.
  var editorInitializedCallback: FunctionWithZeroArgs
  var enableOnChange: Boolean
  var footerHeight: Double
  // Hide title
  var hiddenTitle: Boolean
  // HTML that will be rendered in the content section on load.
  var initialContentHTML: String
  // HTML that will be rendered in the title section as soon as the component loads.
  var initialTitleHTML: String
  // Text that will be used as a placeholder when no text is present in the title section.
  var titlePlaceholder: String
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
}

