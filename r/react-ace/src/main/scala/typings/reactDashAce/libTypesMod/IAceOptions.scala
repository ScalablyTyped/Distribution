package typings.reactDashAce.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashAce.reactDashAceNumbers.`false`
import typings.reactDashAce.reactDashAceNumbers.`true`
import typings.reactDashAce.reactDashAceStrings.ace
import typings.reactDashAce.reactDashAceStrings.always
import typings.reactDashAce.reactDashAceStrings.line
import typings.reactDashAce.reactDashAceStrings.slim
import typings.reactDashAce.reactDashAceStrings.smooth
import typings.reactDashAce.reactDashAceStrings.text
import typings.reactDashAce.reactDashAceStrings.wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAceOptions
  extends /* index */ StringDictionary[js.Any] {
  var animatedScroll: js.UndefOr[Boolean] = js.undefined
  /** this is needed if editor is inside scrollable page */
  var autoScrollEditorIntoView: js.UndefOr[Boolean] = js.undefined
  var behavioursEnabled: js.UndefOr[Boolean] = js.undefined
  var cursorStyle: js.UndefOr[ace | slim | smooth | wide] = js.undefined
  var displayIndentGuides: js.UndefOr[Boolean] = js.undefined
  var dragDelay: js.UndefOr[Double] = js.undefined
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
  var enableBasicAutocompletion: js.UndefOr[Boolean] = js.undefined
  var enableEmmet: js.UndefOr[Boolean] = js.undefined
  var enableLiveAutocompletion: js.UndefOr[Boolean] = js.undefined
  /** on by default */
  var enableMultiselect: js.UndefOr[Boolean] = js.undefined
  var enableSnippets: js.UndefOr[Boolean] = js.undefined
  var fadeFoldWidgets: js.UndefOr[Boolean] = js.undefined
  var firstLineNumber: js.UndefOr[Double] = js.undefined
  var fixedWidthGutter: js.UndefOr[Boolean] = js.undefined
  var focusTimout: js.UndefOr[Double] = js.undefined
  var foldStyle: js.UndefOr[Boolean] = js.undefined
  /** css */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** number or css font-size string */
  var fontSize: js.UndefOr[Double | String] = js.undefined
  var hScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.undefined
  var highlightActiveLine: js.UndefOr[Boolean] = js.undefined
  var highlightGutterLine: js.UndefOr[Boolean] = js.undefined
  var highlightSelectedWord: js.UndefOr[Boolean] = js.undefined
  var maxLines: js.UndefOr[Double] = js.undefined
  var mergeUndoDeltas: js.UndefOr[`false` | `true` | always] = js.undefined
  var minLines: js.UndefOr[Double] = js.undefined
  /** path to a mode e.g "ace/mode/text" */
  var mode: js.UndefOr[String] = js.undefined
  var newLineMode: js.UndefOr[Boolean] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
  var printMargin: js.UndefOr[Boolean] = js.undefined
  var printMarginColumn: js.UndefOr[Boolean] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var scrollPastEnd: js.UndefOr[Boolean] = js.undefined
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  var selectionStyle: js.UndefOr[line | text] = js.undefined
  var showFoldWidgets: js.UndefOr[Boolean] = js.undefined
  var showGutter: js.UndefOr[Boolean] = js.undefined
  var showInvisibles: js.UndefOr[Boolean] = js.undefined
  var showLineNumbers: js.UndefOr[Boolean] = js.undefined
  var showPrintMargin: js.UndefOr[Boolean] = js.undefined
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  var tabSize: js.UndefOr[Double] = js.undefined
  /** path to a theme e.g "ace/theme/textmate" */
  var theme: js.UndefOr[String] = js.undefined
  var tooltipFollowsMouse: js.UndefOr[Boolean] = js.undefined
  var useElasticTabstops: js.UndefOr[Boolean] = js.undefined
  var useSoftTabs: js.UndefOr[Boolean] = js.undefined
  var useWorker: js.UndefOr[Boolean] = js.undefined
  var vScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
  var wrapBehavioursEnabled: js.UndefOr[Boolean] = js.undefined
}

object IAceOptions {
  @scala.inline
  def apply(
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    animatedScroll: js.UndefOr[Boolean] = js.undefined,
    autoScrollEditorIntoView: js.UndefOr[Boolean] = js.undefined,
    behavioursEnabled: js.UndefOr[Boolean] = js.undefined,
    cursorStyle: ace | slim | smooth | wide = null,
    displayIndentGuides: js.UndefOr[Boolean] = js.undefined,
    dragDelay: Int | Double = null,
    dragEnabled: js.UndefOr[Boolean] = js.undefined,
    enableBasicAutocompletion: js.UndefOr[Boolean] = js.undefined,
    enableEmmet: js.UndefOr[Boolean] = js.undefined,
    enableLiveAutocompletion: js.UndefOr[Boolean] = js.undefined,
    enableMultiselect: js.UndefOr[Boolean] = js.undefined,
    enableSnippets: js.UndefOr[Boolean] = js.undefined,
    fadeFoldWidgets: js.UndefOr[Boolean] = js.undefined,
    firstLineNumber: Int | Double = null,
    fixedWidthGutter: js.UndefOr[Boolean] = js.undefined,
    focusTimout: Int | Double = null,
    foldStyle: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: Double | String = null,
    hScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.undefined,
    highlightActiveLine: js.UndefOr[Boolean] = js.undefined,
    highlightGutterLine: js.UndefOr[Boolean] = js.undefined,
    highlightSelectedWord: js.UndefOr[Boolean] = js.undefined,
    maxLines: Int | Double = null,
    mergeUndoDeltas: `false` | `true` | always = null,
    minLines: Int | Double = null,
    mode: String = null,
    newLineMode: js.UndefOr[Boolean] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    printMargin: js.UndefOr[Boolean] = js.undefined,
    printMarginColumn: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    scrollPastEnd: js.UndefOr[Boolean] = js.undefined,
    scrollSpeed: Int | Double = null,
    selectionStyle: line | text = null,
    showFoldWidgets: js.UndefOr[Boolean] = js.undefined,
    showGutter: js.UndefOr[Boolean] = js.undefined,
    showInvisibles: js.UndefOr[Boolean] = js.undefined,
    showLineNumbers: js.UndefOr[Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[Boolean] = js.undefined,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    tabSize: Int | Double = null,
    theme: String = null,
    tooltipFollowsMouse: js.UndefOr[Boolean] = js.undefined,
    useElasticTabstops: js.UndefOr[Boolean] = js.undefined,
    useSoftTabs: js.UndefOr[Boolean] = js.undefined,
    useWorker: js.UndefOr[Boolean] = js.undefined,
    vScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined,
    wrapBehavioursEnabled: js.UndefOr[Boolean] = js.undefined
  ): IAceOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[IAceOptions]
  }
}

