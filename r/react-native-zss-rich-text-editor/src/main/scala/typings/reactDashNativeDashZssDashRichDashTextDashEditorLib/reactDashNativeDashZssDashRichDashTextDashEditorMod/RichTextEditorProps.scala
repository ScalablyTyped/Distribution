package typings
package reactDashNativeDashZssDashRichDashTextDashEditorLib.reactDashNativeDashZssDashRichDashTextDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RichTextEditorProps extends js.Object {
  var contentInset: ContentInset = js.native
  // Text that will be used as a placeholder when no text is present in the content section.
  var contentPlaceholder: java.lang.String = js.native
  // Any custom CSS styles that you want to inject to the editor.
  var customCSS: RichTextStyles = js.native
  // A function that will be called when the editor has been initialized.
  @JSName("editorInitializedCallback")
  var editorInitializedCallback_Original: FunctionWithZeroArgs = js.native
  var enableOnChange: scala.Boolean = js.native
  var footerHeight: scala.Double = js.native
  // Hide title
  var hiddenTitle: scala.Boolean = js.native
  // HTML that will be rendered in the content section on load.
  var initialContentHTML: java.lang.String = js.native
  // HTML that will be rendered in the title section as soon as the component loads.
  var initialTitleHTML: java.lang.String = js.native
  // Text that will be used as a placeholder when no text is present in the title section.
  var titlePlaceholder: java.lang.String = js.native
  // A function that will be called when the editor has been initialized.
  def editorInitializedCallback(): scala.Unit = js.native
}

