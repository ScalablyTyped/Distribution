package typings.reactDashNativeDashZssDashRichDashTextDashEditor.reactDashNativeDashZssDashRichDashTextDashEditorMod

import typings.react.reactMod.Component
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-zss-rich-text-editor", "RichTextEditor")
@js.native
class RichTextEditor ()
  extends Component[Partial[RichTextEditorProps], js.Object, js.Any] {
  var alignCenter: FunctionWithZeroArgs = js.native
  var alignFull: FunctionWithZeroArgs = js.native
  var alignLeft: FunctionWithZeroArgs = js.native
  var alignRight: FunctionWithZeroArgs = js.native
  var blurContentEditor: FunctionWithZeroArgs = js.native
  var blurTitleEditor: FunctionWithZeroArgs = js.native
  var focusContent: FunctionWithZeroArgs = js.native
  // To focus or blur sections, use these methods
  var focusTitle: FunctionWithZeroArgs = js.native
  var getContentHtml: ContentGetHandler = js.native
  var getSelectedText: ContentGetHandler = js.native
  // To get the content or title HTML, use these asynchronous methods
  var getTitleHtml: ContentGetHandler = js.native
  var getTitleText: ContentGetHandler = js.native
  var heading1: FunctionWithZeroArgs = js.native
  var heading2: FunctionWithZeroArgs = js.native
  var heading3: FunctionWithZeroArgs = js.native
  var heading4: FunctionWithZeroArgs = js.native
  var heading5: FunctionWithZeroArgs = js.native
  var heading6: FunctionWithZeroArgs = js.native
  var insertBulletsList: FunctionWithZeroArgs = js.native
  var insertImage: ImageHandler = js.native
  var insertLink: LinkHandler = js.native
  var insertOrderedList: FunctionWithZeroArgs = js.native
  // To manage selection
  var prepareInsert: FunctionWithZeroArgs = js.native
  var removeFormat: FunctionWithZeroArgs = js.native
  var restoreSelection: FunctionWithZeroArgs = js.native
  var setBackgroundColor: ColorHandler = js.native
  // RichTextEditor also has methods that can be used on its ref to set styling at the current selection
  // or cursor position:
  var setBold: FunctionWithZeroArgs = js.native
  var setContentFocusHandler: FocusHandler = js.native
  var setContentHTML: ContentSetHandler = js.native
  var setContentPlaceholder: PlaceHolderHandler = js.native
  var setCustomCSS: ContentStylesHandler = js.native
  var setHR: FunctionWithZeroArgs = js.native
  var setIndent: FunctionWithZeroArgs = js.native
  var setItalic: FunctionWithZeroArgs = js.native
  var setOutdent: FunctionWithZeroArgs = js.native
  var setParagraph: FunctionWithZeroArgs = js.native
  var setStrikethrough: FunctionWithZeroArgs = js.native
  var setSubscript: FunctionWithZeroArgs = js.native
  var setSuperscript: FunctionWithZeroArgs = js.native
  var setTextColor: ColorHandler = js.native
  // To know when the title or content are in focus, use the following methods
  var setTitleFocusHandler: FocusHandler = js.native
  var setTitleHTML: ContentSetHandler = js.native
  // To adjust content, placeholders or css, use these methods
  var setTitlePlaceholder: PlaceHolderHandler = js.native
  var setUnderline: FunctionWithZeroArgs = js.native
  // This method shows a dialog for setting a link title and url, that will be inserted at the current cursor location.
  var showLinkDialog: LinkDialogHandler = js.native
  var updateLink: LinkHandler = js.native
  // The callback will be called with an array of actions that are active at the cusor position,
  // allowing a toolbar to respond to changes.
  def registerToolbar(actions: js.Array[ACTIONS]): Unit = js.native
}

