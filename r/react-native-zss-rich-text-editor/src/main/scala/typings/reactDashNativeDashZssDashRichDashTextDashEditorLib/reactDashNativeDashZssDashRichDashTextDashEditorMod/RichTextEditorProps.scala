package typings
package reactDashNativeDashZssDashRichDashTextDashEditorLib.reactDashNativeDashZssDashRichDashTextDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichTextEditorProps extends js.Object {
  var contentInset: ContentInset
  // Text that will be used as a placeholder when no text is present in the content section.
  var contentPlaceholder: java.lang.String
  // Any custom CSS styles that you want to inject to the editor.
  var customCSS: RichTextStyles
  // A function that will be called when the editor has been initialized.
  var editorInitializedCallback: FunctionWithZeroArgs
  var enableOnChange: scala.Boolean
  var footerHeight: scala.Double
  // Hide title
  var hiddenTitle: scala.Boolean
  // HTML that will be rendered in the content section on load.
  var initialContentHTML: java.lang.String
  // HTML that will be rendered in the title section as soon as the component loads.
  var initialTitleHTML: java.lang.String
  // Text that will be used as a placeholder when no text is present in the title section.
  var titlePlaceholder: java.lang.String
}

object RichTextEditorProps {
  @scala.inline
  def apply(
    contentInset: ContentInset,
    contentPlaceholder: java.lang.String,
    customCSS: RichTextStyles,
    editorInitializedCallback: FunctionWithZeroArgs,
    enableOnChange: scala.Boolean,
    footerHeight: scala.Double,
    hiddenTitle: scala.Boolean,
    initialContentHTML: java.lang.String,
    initialTitleHTML: java.lang.String,
    titlePlaceholder: java.lang.String
  ): RichTextEditorProps = {
    val __obj = js.Dynamic.literal(contentInset = contentInset, contentPlaceholder = contentPlaceholder, customCSS = customCSS, editorInitializedCallback = editorInitializedCallback, enableOnChange = enableOnChange, footerHeight = footerHeight, hiddenTitle = hiddenTitle, initialContentHTML = initialContentHTML, initialTitleHTML = initialTitleHTML, titlePlaceholder = titlePlaceholder)
  
    __obj.asInstanceOf[RichTextEditorProps]
  }
}

