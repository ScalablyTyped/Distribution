package typings
package reactDashAceLib.reactDashAceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceOptions extends js.Object {
  var animatedScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** this is needed if editor is inside scrollable page */
  var autoScrollEditorIntoView: js.UndefOr[scala.Boolean] = js.undefined
  var behavioursEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var cursorStyle: js.UndefOr[
    reactDashAceLib.reactDashAceLibStrings.ace | reactDashAceLib.reactDashAceLibStrings.slim | reactDashAceLib.reactDashAceLibStrings.smooth | reactDashAceLib.reactDashAceLibStrings.wide
  ] = js.undefined
  var displayIndentGuides: js.UndefOr[scala.Boolean] = js.undefined
  var dragDelay: js.UndefOr[scala.Double] = js.undefined
  var dragEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var enableBasicAutocompletion: js.UndefOr[scala.Boolean] = js.undefined
  var enableEmmet: js.UndefOr[scala.Boolean] = js.undefined
  var enableLiveAutocompletion: js.UndefOr[scala.Boolean] = js.undefined
  /** on by default */
  var enableMultiselect: js.UndefOr[scala.Boolean] = js.undefined
  var enableSnippets: js.UndefOr[scala.Boolean] = js.undefined
  var fadeFoldWidgets: js.UndefOr[scala.Boolean] = js.undefined
  var firstLineNumber: js.UndefOr[scala.Double] = js.undefined
  var fixedWidthGutter: js.UndefOr[scala.Boolean] = js.undefined
  var focusTimout: js.UndefOr[scala.Double] = js.undefined
  var foldStyle: js.UndefOr[scala.Boolean] = js.undefined
  /** css */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** number or css font-size string */
  var fontSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var hScrollBarAlwaysVisible: js.UndefOr[scala.Boolean] = js.undefined
  var highlightActiveLine: js.UndefOr[scala.Boolean] = js.undefined
  var highlightGutterLine: js.UndefOr[scala.Boolean] = js.undefined
  var highlightSelectedWord: js.UndefOr[scala.Boolean] = js.undefined
  var maxLines: js.UndefOr[scala.Double] = js.undefined
  var mergeUndoDeltas: js.UndefOr[
    reactDashAceLib.reactDashAceLibNumbers.`false` | reactDashAceLib.reactDashAceLibNumbers.`true` | reactDashAceLib.reactDashAceLibStrings.always
  ] = js.undefined
  var minLines: js.UndefOr[scala.Double] = js.undefined
  /** path to a mode e.g "ace/mode/text" */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var newLineMode: js.UndefOr[scala.Boolean] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  var printMargin: js.UndefOr[scala.Boolean] = js.undefined
  var printMarginColumn: js.UndefOr[scala.Boolean] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var scrollPastEnd: js.UndefOr[scala.Boolean] = js.undefined
  var scrollSpeed: js.UndefOr[scala.Double] = js.undefined
  var selectionStyle: js.UndefOr[
    reactDashAceLib.reactDashAceLibStrings.line | reactDashAceLib.reactDashAceLibStrings.text
  ] = js.undefined
  var showFoldWidgets: js.UndefOr[scala.Boolean] = js.undefined
  var showGutter: js.UndefOr[scala.Boolean] = js.undefined
  var showInvisibles: js.UndefOr[scala.Boolean] = js.undefined
  var showLineNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var showPrintMargin: js.UndefOr[scala.Boolean] = js.undefined
  var spellcheck: js.UndefOr[scala.Boolean] = js.undefined
  var tabSize: js.UndefOr[scala.Double] = js.undefined
  /** path to a theme e.g "ace/theme/textmate" */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var tooltipFollowsMouse: js.UndefOr[scala.Boolean] = js.undefined
  var useElasticTabstops: js.UndefOr[scala.Boolean] = js.undefined
  var useSoftTabs: js.UndefOr[scala.Boolean] = js.undefined
  var useWorker: js.UndefOr[scala.Boolean] = js.undefined
  var vScrollBarAlwaysVisible: js.UndefOr[scala.Boolean] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
  var wrapBehavioursEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object AceOptions {
  @scala.inline
  def apply(
    animatedScroll: js.UndefOr[scala.Boolean] = js.undefined,
    autoScrollEditorIntoView: js.UndefOr[scala.Boolean] = js.undefined,
    behavioursEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    cursorStyle: reactDashAceLib.reactDashAceLibStrings.ace | reactDashAceLib.reactDashAceLibStrings.slim | reactDashAceLib.reactDashAceLibStrings.smooth | reactDashAceLib.reactDashAceLibStrings.wide = null,
    displayIndentGuides: js.UndefOr[scala.Boolean] = js.undefined,
    dragDelay: scala.Int | scala.Double = null,
    dragEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    enableBasicAutocompletion: js.UndefOr[scala.Boolean] = js.undefined,
    enableEmmet: js.UndefOr[scala.Boolean] = js.undefined,
    enableLiveAutocompletion: js.UndefOr[scala.Boolean] = js.undefined,
    enableMultiselect: js.UndefOr[scala.Boolean] = js.undefined,
    enableSnippets: js.UndefOr[scala.Boolean] = js.undefined,
    fadeFoldWidgets: js.UndefOr[scala.Boolean] = js.undefined,
    firstLineNumber: scala.Int | scala.Double = null,
    fixedWidthGutter: js.UndefOr[scala.Boolean] = js.undefined,
    focusTimout: scala.Int | scala.Double = null,
    foldStyle: js.UndefOr[scala.Boolean] = js.undefined,
    fontFamily: java.lang.String = null,
    fontSize: scala.Double | java.lang.String = null,
    hScrollBarAlwaysVisible: js.UndefOr[scala.Boolean] = js.undefined,
    highlightActiveLine: js.UndefOr[scala.Boolean] = js.undefined,
    highlightGutterLine: js.UndefOr[scala.Boolean] = js.undefined,
    highlightSelectedWord: js.UndefOr[scala.Boolean] = js.undefined,
    maxLines: scala.Int | scala.Double = null,
    mergeUndoDeltas: reactDashAceLib.reactDashAceLibNumbers.`false` | reactDashAceLib.reactDashAceLibNumbers.`true` | reactDashAceLib.reactDashAceLibStrings.always = null,
    minLines: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    newLineMode: js.UndefOr[scala.Boolean] = js.undefined,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    printMargin: js.UndefOr[scala.Boolean] = js.undefined,
    printMarginColumn: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    scrollPastEnd: js.UndefOr[scala.Boolean] = js.undefined,
    scrollSpeed: scala.Int | scala.Double = null,
    selectionStyle: reactDashAceLib.reactDashAceLibStrings.line | reactDashAceLib.reactDashAceLibStrings.text = null,
    showFoldWidgets: js.UndefOr[scala.Boolean] = js.undefined,
    showGutter: js.UndefOr[scala.Boolean] = js.undefined,
    showInvisibles: js.UndefOr[scala.Boolean] = js.undefined,
    showLineNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[scala.Boolean] = js.undefined,
    spellcheck: js.UndefOr[scala.Boolean] = js.undefined,
    tabSize: scala.Int | scala.Double = null,
    theme: java.lang.String = null,
    tooltipFollowsMouse: js.UndefOr[scala.Boolean] = js.undefined,
    useElasticTabstops: js.UndefOr[scala.Boolean] = js.undefined,
    useSoftTabs: js.UndefOr[scala.Boolean] = js.undefined,
    useWorker: js.UndefOr[scala.Boolean] = js.undefined,
    vScrollBarAlwaysVisible: js.UndefOr[scala.Boolean] = js.undefined,
    wrap: js.UndefOr[scala.Boolean] = js.undefined,
    wrapBehavioursEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): AceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animatedScroll)) __obj.updateDynamic("animatedScroll")(animatedScroll)
    if (!js.isUndefined(autoScrollEditorIntoView)) __obj.updateDynamic("autoScrollEditorIntoView")(autoScrollEditorIntoView)
    if (!js.isUndefined(behavioursEnabled)) __obj.updateDynamic("behavioursEnabled")(behavioursEnabled)
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(displayIndentGuides)) __obj.updateDynamic("displayIndentGuides")(displayIndentGuides)
    if (dragDelay != null) __obj.updateDynamic("dragDelay")(dragDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnabled)) __obj.updateDynamic("dragEnabled")(dragEnabled)
    if (!js.isUndefined(enableBasicAutocompletion)) __obj.updateDynamic("enableBasicAutocompletion")(enableBasicAutocompletion)
    if (!js.isUndefined(enableEmmet)) __obj.updateDynamic("enableEmmet")(enableEmmet)
    if (!js.isUndefined(enableLiveAutocompletion)) __obj.updateDynamic("enableLiveAutocompletion")(enableLiveAutocompletion)
    if (!js.isUndefined(enableMultiselect)) __obj.updateDynamic("enableMultiselect")(enableMultiselect)
    if (!js.isUndefined(enableSnippets)) __obj.updateDynamic("enableSnippets")(enableSnippets)
    if (!js.isUndefined(fadeFoldWidgets)) __obj.updateDynamic("fadeFoldWidgets")(fadeFoldWidgets)
    if (firstLineNumber != null) __obj.updateDynamic("firstLineNumber")(firstLineNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidthGutter)) __obj.updateDynamic("fixedWidthGutter")(fixedWidthGutter)
    if (focusTimout != null) __obj.updateDynamic("focusTimout")(focusTimout.asInstanceOf[js.Any])
    if (!js.isUndefined(foldStyle)) __obj.updateDynamic("foldStyle")(foldStyle)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hScrollBarAlwaysVisible)) __obj.updateDynamic("hScrollBarAlwaysVisible")(hScrollBarAlwaysVisible)
    if (!js.isUndefined(highlightActiveLine)) __obj.updateDynamic("highlightActiveLine")(highlightActiveLine)
    if (!js.isUndefined(highlightGutterLine)) __obj.updateDynamic("highlightGutterLine")(highlightGutterLine)
    if (!js.isUndefined(highlightSelectedWord)) __obj.updateDynamic("highlightSelectedWord")(highlightSelectedWord)
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (mergeUndoDeltas != null) __obj.updateDynamic("mergeUndoDeltas")(mergeUndoDeltas.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(newLineMode)) __obj.updateDynamic("newLineMode")(newLineMode)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (!js.isUndefined(printMargin)) __obj.updateDynamic("printMargin")(printMargin)
    if (!js.isUndefined(printMarginColumn)) __obj.updateDynamic("printMarginColumn")(printMarginColumn)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(scrollPastEnd)) __obj.updateDynamic("scrollPastEnd")(scrollPastEnd)
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showFoldWidgets)) __obj.updateDynamic("showFoldWidgets")(showFoldWidgets)
    if (!js.isUndefined(showGutter)) __obj.updateDynamic("showGutter")(showGutter)
    if (!js.isUndefined(showInvisibles)) __obj.updateDynamic("showInvisibles")(showInvisibles)
    if (!js.isUndefined(showLineNumbers)) __obj.updateDynamic("showLineNumbers")(showLineNumbers)
    if (!js.isUndefined(showPrintMargin)) __obj.updateDynamic("showPrintMargin")(showPrintMargin)
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(tooltipFollowsMouse)) __obj.updateDynamic("tooltipFollowsMouse")(tooltipFollowsMouse)
    if (!js.isUndefined(useElasticTabstops)) __obj.updateDynamic("useElasticTabstops")(useElasticTabstops)
    if (!js.isUndefined(useSoftTabs)) __obj.updateDynamic("useSoftTabs")(useSoftTabs)
    if (!js.isUndefined(useWorker)) __obj.updateDynamic("useWorker")(useWorker)
    if (!js.isUndefined(vScrollBarAlwaysVisible)) __obj.updateDynamic("vScrollBarAlwaysVisible")(vScrollBarAlwaysVisible)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    if (!js.isUndefined(wrapBehavioursEnabled)) __obj.updateDynamic("wrapBehavioursEnabled")(wrapBehavioursEnabled)
    __obj.asInstanceOf[AceOptions]
  }
}

