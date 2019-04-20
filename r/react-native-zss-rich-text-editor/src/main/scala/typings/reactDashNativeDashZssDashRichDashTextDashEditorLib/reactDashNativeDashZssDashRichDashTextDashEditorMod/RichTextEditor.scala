package typings
package reactDashNativeDashZssDashRichDashTextDashEditorLib.reactDashNativeDashZssDashRichDashTextDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-zss-rich-text-editor", "RichTextEditor")
@js.native
class RichTextEditor ()
  extends reactLib.reactMod.Component[stdLib.Partial[RichTextEditorProps], js.Object, js.Any] {
  @JSName("alignCenter")
  var alignCenter_Original: FunctionWithZeroArgs = js.native
  @JSName("alignFull")
  var alignFull_Original: FunctionWithZeroArgs = js.native
  @JSName("alignLeft")
  var alignLeft_Original: FunctionWithZeroArgs = js.native
  @JSName("alignRight")
  var alignRight_Original: FunctionWithZeroArgs = js.native
  @JSName("blurContentEditor")
  var blurContentEditor_Original: FunctionWithZeroArgs = js.native
  @JSName("blurTitleEditor")
  var blurTitleEditor_Original: FunctionWithZeroArgs = js.native
  @JSName("focusContent")
  var focusContent_Original: FunctionWithZeroArgs = js.native
  // To focus or blur sections, use these methods
  @JSName("focusTitle")
  var focusTitle_Original: FunctionWithZeroArgs = js.native
  @JSName("getContentHtml")
  var getContentHtml_Original: ContentGetHandler = js.native
  @JSName("getSelectedText")
  var getSelectedText_Original: ContentGetHandler = js.native
  // To get the content or title HTML, use these asynchronous methods
  @JSName("getTitleHtml")
  var getTitleHtml_Original: ContentGetHandler = js.native
  @JSName("getTitleText")
  var getTitleText_Original: ContentGetHandler = js.native
  @JSName("heading1")
  var heading1_Original: FunctionWithZeroArgs = js.native
  @JSName("heading2")
  var heading2_Original: FunctionWithZeroArgs = js.native
  @JSName("heading3")
  var heading3_Original: FunctionWithZeroArgs = js.native
  @JSName("heading4")
  var heading4_Original: FunctionWithZeroArgs = js.native
  @JSName("heading5")
  var heading5_Original: FunctionWithZeroArgs = js.native
  @JSName("heading6")
  var heading6_Original: FunctionWithZeroArgs = js.native
  @JSName("insertBulletsList")
  var insertBulletsList_Original: FunctionWithZeroArgs = js.native
  @JSName("insertImage")
  var insertImage_Original: ImageHandler = js.native
  @JSName("insertLink")
  var insertLink_Original: LinkHandler = js.native
  @JSName("insertOrderedList")
  var insertOrderedList_Original: FunctionWithZeroArgs = js.native
  // To manage selection
  @JSName("prepareInsert")
  var prepareInsert_Original: FunctionWithZeroArgs = js.native
  @JSName("removeFormat")
  var removeFormat_Original: FunctionWithZeroArgs = js.native
  @JSName("restoreSelection")
  var restoreSelection_Original: FunctionWithZeroArgs = js.native
  @JSName("setBackgroundColor")
  var setBackgroundColor_Original: ColorHandler = js.native
  // RichTextEditor also has methods that can be used on its ref to set styling at the current selection
  // or cursor position:
  @JSName("setBold")
  var setBold_Original: FunctionWithZeroArgs = js.native
  @JSName("setContentFocusHandler")
  var setContentFocusHandler_Original: FocusHandler = js.native
  @JSName("setContentHTML")
  var setContentHTML_Original: ContentSetHandler = js.native
  @JSName("setContentPlaceholder")
  var setContentPlaceholder_Original: PlaceHolderHandler = js.native
  @JSName("setCustomCSS")
  var setCustomCSS_Original: ContentStylesHandler = js.native
  @JSName("setHR")
  var setHR_Original: FunctionWithZeroArgs = js.native
  @JSName("setIndent")
  var setIndent_Original: FunctionWithZeroArgs = js.native
  @JSName("setItalic")
  var setItalic_Original: FunctionWithZeroArgs = js.native
  @JSName("setOutdent")
  var setOutdent_Original: FunctionWithZeroArgs = js.native
  @JSName("setParagraph")
  var setParagraph_Original: FunctionWithZeroArgs = js.native
  @JSName("setStrikethrough")
  var setStrikethrough_Original: FunctionWithZeroArgs = js.native
  @JSName("setSubscript")
  var setSubscript_Original: FunctionWithZeroArgs = js.native
  @JSName("setSuperscript")
  var setSuperscript_Original: FunctionWithZeroArgs = js.native
  @JSName("setTextColor")
  var setTextColor_Original: ColorHandler = js.native
  // To know when the title or content are in focus, use the following methods
  @JSName("setTitleFocusHandler")
  var setTitleFocusHandler_Original: FocusHandler = js.native
  @JSName("setTitleHTML")
  var setTitleHTML_Original: ContentSetHandler = js.native
  // To adjust content, placeholders or css, use these methods
  @JSName("setTitlePlaceholder")
  var setTitlePlaceholder_Original: PlaceHolderHandler = js.native
  @JSName("setUnderline")
  var setUnderline_Original: FunctionWithZeroArgs = js.native
  // This method shows a dialog for setting a link title and url, that will be inserted at the current cursor location.
  @JSName("showLinkDialog")
  var showLinkDialog_Original: LinkDialogHandler = js.native
  @JSName("updateLink")
  var updateLink_Original: LinkHandler = js.native
  def alignCenter(): scala.Unit = js.native
  def alignFull(): scala.Unit = js.native
  def alignLeft(): scala.Unit = js.native
  def alignRight(): scala.Unit = js.native
  def blurContentEditor(): scala.Unit = js.native
  def blurTitleEditor(): scala.Unit = js.native
  def focusContent(): scala.Unit = js.native
  // To focus or blur sections, use these methods
  def focusTitle(): scala.Unit = js.native
  def getContentHtml(): js.Promise[java.lang.String] = js.native
  def getSelectedText(): js.Promise[java.lang.String] = js.native
  // To get the content or title HTML, use these asynchronous methods
  def getTitleHtml(): js.Promise[java.lang.String] = js.native
  def getTitleText(): js.Promise[java.lang.String] = js.native
  def heading1(): scala.Unit = js.native
  def heading2(): scala.Unit = js.native
  def heading3(): scala.Unit = js.native
  def heading4(): scala.Unit = js.native
  def heading5(): scala.Unit = js.native
  def heading6(): scala.Unit = js.native
  def insertBulletsList(): scala.Unit = js.native
  def insertImage(attributes: reactDashNativeLib.reactDashNativeMod.ImageProps): scala.Unit = js.native
  def insertLink(url: java.lang.String, title: java.lang.String): scala.Unit = js.native
  def insertOrderedList(): scala.Unit = js.native
  // To manage selection
  def prepareInsert(): scala.Unit = js.native
  // The callback will be called with an array of actions that are active at the cusor position,
  // allowing a toolbar to respond to changes.
  def registerToolbar(actions: js.Array[ACTIONS]): scala.Unit = js.native
  def removeFormat(): scala.Unit = js.native
  def restoreSelection(): scala.Unit = js.native
  def setBackgroundColor(color: java.lang.String): scala.Unit = js.native
  // RichTextEditor also has methods that can be used on its ref to set styling at the current selection
  // or cursor position:
  def setBold(): scala.Unit = js.native
  def setContentFocusHandler(callback: FunctionWithZeroArgs): scala.Unit = js.native
  def setContentHTML(html: java.lang.String): scala.Unit = js.native
  def setContentPlaceholder(placeholder: java.lang.String): scala.Unit = js.native
  def setCustomCSS(styles: RichTextStyles): scala.Unit = js.native
  def setHR(): scala.Unit = js.native
  def setIndent(): scala.Unit = js.native
  def setItalic(): scala.Unit = js.native
  def setOutdent(): scala.Unit = js.native
  def setParagraph(): scala.Unit = js.native
  def setStrikethrough(): scala.Unit = js.native
  def setSubscript(): scala.Unit = js.native
  def setSuperscript(): scala.Unit = js.native
  def setTextColor(color: java.lang.String): scala.Unit = js.native
  // To know when the title or content are in focus, use the following methods
  def setTitleFocusHandler(callback: FunctionWithZeroArgs): scala.Unit = js.native
  def setTitleHTML(html: java.lang.String): scala.Unit = js.native
  // To adjust content, placeholders or css, use these methods
  def setTitlePlaceholder(placeholder: java.lang.String): scala.Unit = js.native
  def setUnderline(): scala.Unit = js.native
  // This method shows a dialog for setting a link title and url, that will be inserted at the current cursor location.
  def showLinkDialog(optionalTitle: java.lang.String, optionalUrl: java.lang.String): scala.Unit = js.native
  def updateLink(url: java.lang.String, title: java.lang.String): scala.Unit = js.native
}

