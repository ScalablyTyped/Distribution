package typings
package reactDashNativeDashZssDashRichDashTextDashEditorLib.reactDashNativeDashZssDashRichDashTextDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarOptionalProps ]:? react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarOptionalProps[P]} */ trait RichTextToolbarProps extends js.Object {
  // Must provide a function that returns a ref to a RichTextEditor component.
  def getEditor(): RichTextEditor
}

object RichTextToolbarProps {
  @scala.inline
  def apply(getEditor: () => RichTextEditor): RichTextToolbarProps = {
    val __obj = js.Dynamic.literal(getEditor = js.Any.fromFunction0(getEditor))
  
    __obj.asInstanceOf[RichTextToolbarProps]
  }
}

