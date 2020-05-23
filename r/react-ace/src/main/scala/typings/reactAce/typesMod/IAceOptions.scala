package typings.reactAce.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactAce.reactAceBooleans.`false`
import typings.reactAce.reactAceBooleans.`true`
import typings.reactAce.reactAceStrings.ace
import typings.reactAce.reactAceStrings.always
import typings.reactAce.reactAceStrings.line
import typings.reactAce.reactAceStrings.slim
import typings.reactAce.reactAceStrings.smooth
import typings.reactAce.reactAceStrings.text
import typings.reactAce.reactAceStrings.wide
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
  var printMargin: js.UndefOr[Boolean | Double] = js.undefined
  var printMarginColumn: js.UndefOr[Double] = js.undefined
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    animatedScroll: js.UndefOr[Boolean] = js.undefined,
    autoScrollEditorIntoView: js.UndefOr[Boolean] = js.undefined,
    behavioursEnabled: js.UndefOr[Boolean] = js.undefined,
    cursorStyle: ace | slim | smooth | wide = null,
    displayIndentGuides: js.UndefOr[Boolean] = js.undefined,
    dragDelay: js.UndefOr[Double] = js.undefined,
    dragEnabled: js.UndefOr[Boolean] = js.undefined,
    enableBasicAutocompletion: js.UndefOr[Boolean] = js.undefined,
    enableEmmet: js.UndefOr[Boolean] = js.undefined,
    enableLiveAutocompletion: js.UndefOr[Boolean] = js.undefined,
    enableMultiselect: js.UndefOr[Boolean] = js.undefined,
    enableSnippets: js.UndefOr[Boolean] = js.undefined,
    fadeFoldWidgets: js.UndefOr[Boolean] = js.undefined,
    firstLineNumber: js.UndefOr[Double] = js.undefined,
    fixedWidthGutter: js.UndefOr[Boolean] = js.undefined,
    focusTimout: js.UndefOr[Double] = js.undefined,
    foldStyle: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: Double | String = null,
    hScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.undefined,
    highlightActiveLine: js.UndefOr[Boolean] = js.undefined,
    highlightGutterLine: js.UndefOr[Boolean] = js.undefined,
    highlightSelectedWord: js.UndefOr[Boolean] = js.undefined,
    maxLines: js.UndefOr[Double] = js.undefined,
    mergeUndoDeltas: `false` | `true` | always = null,
    minLines: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    newLineMode: js.UndefOr[Boolean] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    printMargin: Boolean | Double = null,
    printMarginColumn: js.UndefOr[Double] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    scrollPastEnd: js.UndefOr[Boolean] = js.undefined,
    scrollSpeed: js.UndefOr[Double] = js.undefined,
    selectionStyle: line | text = null,
    showFoldWidgets: js.UndefOr[Boolean] = js.undefined,
    showGutter: js.UndefOr[Boolean] = js.undefined,
    showInvisibles: js.UndefOr[Boolean] = js.undefined,
    showLineNumbers: js.UndefOr[Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[Boolean] = js.undefined,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    tabSize: js.UndefOr[Double] = js.undefined,
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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animatedScroll)) __obj.updateDynamic("animatedScroll")(animatedScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoScrollEditorIntoView)) __obj.updateDynamic("autoScrollEditorIntoView")(autoScrollEditorIntoView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(behavioursEnabled)) __obj.updateDynamic("behavioursEnabled")(behavioursEnabled.get.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(displayIndentGuides)) __obj.updateDynamic("displayIndentGuides")(displayIndentGuides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragDelay)) __obj.updateDynamic("dragDelay")(dragDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnabled)) __obj.updateDynamic("dragEnabled")(dragEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBasicAutocompletion)) __obj.updateDynamic("enableBasicAutocompletion")(enableBasicAutocompletion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableEmmet)) __obj.updateDynamic("enableEmmet")(enableEmmet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLiveAutocompletion)) __obj.updateDynamic("enableLiveAutocompletion")(enableLiveAutocompletion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultiselect)) __obj.updateDynamic("enableMultiselect")(enableMultiselect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSnippets)) __obj.updateDynamic("enableSnippets")(enableSnippets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeFoldWidgets)) __obj.updateDynamic("fadeFoldWidgets")(fadeFoldWidgets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstLineNumber)) __obj.updateDynamic("firstLineNumber")(firstLineNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidthGutter)) __obj.updateDynamic("fixedWidthGutter")(fixedWidthGutter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusTimout)) __obj.updateDynamic("focusTimout")(focusTimout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(foldStyle)) __obj.updateDynamic("foldStyle")(foldStyle.get.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hScrollBarAlwaysVisible)) __obj.updateDynamic("hScrollBarAlwaysVisible")(hScrollBarAlwaysVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightActiveLine)) __obj.updateDynamic("highlightActiveLine")(highlightActiveLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightGutterLine)) __obj.updateDynamic("highlightGutterLine")(highlightGutterLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSelectedWord)) __obj.updateDynamic("highlightSelectedWord")(highlightSelectedWord.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLines)) __obj.updateDynamic("maxLines")(maxLines.get.asInstanceOf[js.Any])
    if (mergeUndoDeltas != null) __obj.updateDynamic("mergeUndoDeltas")(mergeUndoDeltas.asInstanceOf[js.Any])
    if (!js.isUndefined(minLines)) __obj.updateDynamic("minLines")(minLines.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(newLineMode)) __obj.updateDynamic("newLineMode")(newLineMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    if (printMargin != null) __obj.updateDynamic("printMargin")(printMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(printMarginColumn)) __obj.updateDynamic("printMarginColumn")(printMarginColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPastEnd)) __obj.updateDynamic("scrollPastEnd")(scrollPastEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSpeed)) __obj.updateDynamic("scrollSpeed")(scrollSpeed.get.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showFoldWidgets)) __obj.updateDynamic("showFoldWidgets")(showFoldWidgets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGutter)) __obj.updateDynamic("showGutter")(showGutter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInvisibles)) __obj.updateDynamic("showInvisibles")(showInvisibles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLineNumbers)) __obj.updateDynamic("showLineNumbers")(showLineNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrintMargin)) __obj.updateDynamic("showPrintMargin")(showPrintMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSize)) __obj.updateDynamic("tabSize")(tabSize.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipFollowsMouse)) __obj.updateDynamic("tooltipFollowsMouse")(tooltipFollowsMouse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useElasticTabstops)) __obj.updateDynamic("useElasticTabstops")(useElasticTabstops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useSoftTabs)) __obj.updateDynamic("useSoftTabs")(useSoftTabs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useWorker)) __obj.updateDynamic("useWorker")(useWorker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vScrollBarAlwaysVisible)) __obj.updateDynamic("vScrollBarAlwaysVisible")(vScrollBarAlwaysVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapBehavioursEnabled)) __obj.updateDynamic("wrapBehavioursEnabled")(wrapBehavioursEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAceOptions]
  }
}

