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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAceOptions
  extends /* index */ StringDictionary[js.Any] {
  
  var animatedScroll: js.UndefOr[Boolean] = js.native
  
  /** this is needed if editor is inside scrollable page */
  var autoScrollEditorIntoView: js.UndefOr[Boolean] = js.native
  
  var behavioursEnabled: js.UndefOr[Boolean] = js.native
  
  var cursorStyle: js.UndefOr[ace | slim | smooth | wide] = js.native
  
  var displayIndentGuides: js.UndefOr[Boolean] = js.native
  
  var dragDelay: js.UndefOr[Double] = js.native
  
  var dragEnabled: js.UndefOr[Boolean] = js.native
  
  var enableBasicAutocompletion: js.UndefOr[Boolean] = js.native
  
  var enableEmmet: js.UndefOr[Boolean] = js.native
  
  var enableLiveAutocompletion: js.UndefOr[Boolean] = js.native
  
  /** on by default */
  var enableMultiselect: js.UndefOr[Boolean] = js.native
  
  var enableSnippets: js.UndefOr[Boolean] = js.native
  
  var fadeFoldWidgets: js.UndefOr[Boolean] = js.native
  
  var firstLineNumber: js.UndefOr[Double] = js.native
  
  var fixedWidthGutter: js.UndefOr[Boolean] = js.native
  
  var focusTimout: js.UndefOr[Double] = js.native
  
  var foldStyle: js.UndefOr[Boolean] = js.native
  
  /** css */
  var fontFamily: js.UndefOr[String] = js.native
  
  /** number or css font-size string */
  var fontSize: js.UndefOr[Double | String] = js.native
  
  var hScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.native
  
  var highlightActiveLine: js.UndefOr[Boolean] = js.native
  
  var highlightGutterLine: js.UndefOr[Boolean] = js.native
  
  var highlightSelectedWord: js.UndefOr[Boolean] = js.native
  
  var maxLines: js.UndefOr[Double] = js.native
  
  var mergeUndoDeltas: js.UndefOr[`false` | `true` | always] = js.native
  
  var minLines: js.UndefOr[Double] = js.native
  
  /** path to a mode e.g "ace/mode/text" */
  var mode: js.UndefOr[String] = js.native
  
  var newLineMode: js.UndefOr[Boolean] = js.native
  
  var overwrite: js.UndefOr[Boolean] = js.native
  
  var printMargin: js.UndefOr[Boolean | Double] = js.native
  
  var printMarginColumn: js.UndefOr[Double] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var scrollPastEnd: js.UndefOr[Boolean] = js.native
  
  var scrollSpeed: js.UndefOr[Double] = js.native
  
  var selectionStyle: js.UndefOr[line | text] = js.native
  
  var showFoldWidgets: js.UndefOr[Boolean] = js.native
  
  var showGutter: js.UndefOr[Boolean] = js.native
  
  var showInvisibles: js.UndefOr[Boolean] = js.native
  
  var showLineNumbers: js.UndefOr[Boolean] = js.native
  
  var showPrintMargin: js.UndefOr[Boolean] = js.native
  
  var spellcheck: js.UndefOr[Boolean] = js.native
  
  var tabSize: js.UndefOr[Double] = js.native
  
  /** path to a theme e.g "ace/theme/textmate" */
  var theme: js.UndefOr[String] = js.native
  
  var tooltipFollowsMouse: js.UndefOr[Boolean] = js.native
  
  var useElasticTabstops: js.UndefOr[Boolean] = js.native
  
  var useSoftTabs: js.UndefOr[Boolean] = js.native
  
  var useWorker: js.UndefOr[Boolean] = js.native
  
  var vScrollBarAlwaysVisible: js.UndefOr[Boolean] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
  
  var wrapBehavioursEnabled: js.UndefOr[Boolean] = js.native
}
object IAceOptions {
  
  @scala.inline
  def apply(): IAceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAceOptions]
  }
  
  @scala.inline
  implicit class IAceOptionsOps[Self <: IAceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimatedScroll(value: Boolean): Self = this.set("animatedScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimatedScroll: Self = this.set("animatedScroll", js.undefined)
    
    @scala.inline
    def setAutoScrollEditorIntoView(value: Boolean): Self = this.set("autoScrollEditorIntoView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScrollEditorIntoView: Self = this.set("autoScrollEditorIntoView", js.undefined)
    
    @scala.inline
    def setBehavioursEnabled(value: Boolean): Self = this.set("behavioursEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehavioursEnabled: Self = this.set("behavioursEnabled", js.undefined)
    
    @scala.inline
    def setCursorStyle(value: ace | slim | smooth | wide): Self = this.set("cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorStyle: Self = this.set("cursorStyle", js.undefined)
    
    @scala.inline
    def setDisplayIndentGuides(value: Boolean): Self = this.set("displayIndentGuides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayIndentGuides: Self = this.set("displayIndentGuides", js.undefined)
    
    @scala.inline
    def setDragDelay(value: Double): Self = this.set("dragDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDelay: Self = this.set("dragDelay", js.undefined)
    
    @scala.inline
    def setDragEnabled(value: Boolean): Self = this.set("dragEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragEnabled: Self = this.set("dragEnabled", js.undefined)
    
    @scala.inline
    def setEnableBasicAutocompletion(value: Boolean): Self = this.set("enableBasicAutocompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBasicAutocompletion: Self = this.set("enableBasicAutocompletion", js.undefined)
    
    @scala.inline
    def setEnableEmmet(value: Boolean): Self = this.set("enableEmmet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEmmet: Self = this.set("enableEmmet", js.undefined)
    
    @scala.inline
    def setEnableLiveAutocompletion(value: Boolean): Self = this.set("enableLiveAutocompletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLiveAutocompletion: Self = this.set("enableLiveAutocompletion", js.undefined)
    
    @scala.inline
    def setEnableMultiselect(value: Boolean): Self = this.set("enableMultiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMultiselect: Self = this.set("enableMultiselect", js.undefined)
    
    @scala.inline
    def setEnableSnippets(value: Boolean): Self = this.set("enableSnippets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSnippets: Self = this.set("enableSnippets", js.undefined)
    
    @scala.inline
    def setFadeFoldWidgets(value: Boolean): Self = this.set("fadeFoldWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeFoldWidgets: Self = this.set("fadeFoldWidgets", js.undefined)
    
    @scala.inline
    def setFirstLineNumber(value: Double): Self = this.set("firstLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLineNumber: Self = this.set("firstLineNumber", js.undefined)
    
    @scala.inline
    def setFixedWidthGutter(value: Boolean): Self = this.set("fixedWidthGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedWidthGutter: Self = this.set("fixedWidthGutter", js.undefined)
    
    @scala.inline
    def setFocusTimout(value: Double): Self = this.set("focusTimout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusTimout: Self = this.set("focusTimout", js.undefined)
    
    @scala.inline
    def setFoldStyle(value: Boolean): Self = this.set("foldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldStyle: Self = this.set("foldStyle", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double | String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHScrollBarAlwaysVisible(value: Boolean): Self = this.set("hScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHScrollBarAlwaysVisible: Self = this.set("hScrollBarAlwaysVisible", js.undefined)
    
    @scala.inline
    def setHighlightActiveLine(value: Boolean): Self = this.set("highlightActiveLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightActiveLine: Self = this.set("highlightActiveLine", js.undefined)
    
    @scala.inline
    def setHighlightGutterLine(value: Boolean): Self = this.set("highlightGutterLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightGutterLine: Self = this.set("highlightGutterLine", js.undefined)
    
    @scala.inline
    def setHighlightSelectedWord(value: Boolean): Self = this.set("highlightSelectedWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightSelectedWord: Self = this.set("highlightSelectedWord", js.undefined)
    
    @scala.inline
    def setMaxLines(value: Double): Self = this.set("maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLines: Self = this.set("maxLines", js.undefined)
    
    @scala.inline
    def setMergeUndoDeltas(value: `false` | `true` | always): Self = this.set("mergeUndoDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeUndoDeltas: Self = this.set("mergeUndoDeltas", js.undefined)
    
    @scala.inline
    def setMinLines(value: Double): Self = this.set("minLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLines: Self = this.set("minLines", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNewLineMode(value: Boolean): Self = this.set("newLineMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewLineMode: Self = this.set("newLineMode", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    
    @scala.inline
    def setPrintMargin(value: Boolean | Double): Self = this.set("printMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintMargin: Self = this.set("printMargin", js.undefined)
    
    @scala.inline
    def setPrintMarginColumn(value: Double): Self = this.set("printMarginColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintMarginColumn: Self = this.set("printMarginColumn", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setScrollPastEnd(value: Boolean): Self = this.set("scrollPastEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPastEnd: Self = this.set("scrollPastEnd", js.undefined)
    
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: line | text): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
    
    @scala.inline
    def setShowFoldWidgets(value: Boolean): Self = this.set("showFoldWidgets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFoldWidgets: Self = this.set("showFoldWidgets", js.undefined)
    
    @scala.inline
    def setShowGutter(value: Boolean): Self = this.set("showGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGutter: Self = this.set("showGutter", js.undefined)
    
    @scala.inline
    def setShowInvisibles(value: Boolean): Self = this.set("showInvisibles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInvisibles: Self = this.set("showInvisibles", js.undefined)
    
    @scala.inline
    def setShowLineNumbers(value: Boolean): Self = this.set("showLineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLineNumbers: Self = this.set("showLineNumbers", js.undefined)
    
    @scala.inline
    def setShowPrintMargin(value: Boolean): Self = this.set("showPrintMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPrintMargin: Self = this.set("showPrintMargin", js.undefined)
    
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltipFollowsMouse(value: Boolean): Self = this.set("tooltipFollowsMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipFollowsMouse: Self = this.set("tooltipFollowsMouse", js.undefined)
    
    @scala.inline
    def setUseElasticTabstops(value: Boolean): Self = this.set("useElasticTabstops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseElasticTabstops: Self = this.set("useElasticTabstops", js.undefined)
    
    @scala.inline
    def setUseSoftTabs(value: Boolean): Self = this.set("useSoftTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSoftTabs: Self = this.set("useSoftTabs", js.undefined)
    
    @scala.inline
    def setUseWorker(value: Boolean): Self = this.set("useWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWorker: Self = this.set("useWorker", js.undefined)
    
    @scala.inline
    def setVScrollBarAlwaysVisible(value: Boolean): Self = this.set("vScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVScrollBarAlwaysVisible: Self = this.set("vScrollBarAlwaysVisible", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
    
    @scala.inline
    def setWrapBehavioursEnabled(value: Boolean): Self = this.set("wrapBehavioursEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapBehavioursEnabled: Self = this.set("wrapBehavioursEnabled", js.undefined)
  }
}
