package typings.reactAce

import org.scalablytyped.runtime.StringDictionary
import typings.aceBuilds.mod.Ace.Editor
import typings.aceBuilds.mod.Ace.MarkerRenderer
import typings.aceBuilds.mod.Ace.Range
import typings.aceBuilds.mod.Ace.VirtualRenderer
import typings.reactAce.reactAceBooleans.`false`
import typings.reactAce.reactAceBooleans.`true`
import typings.reactAce.reactAceStrings.ace
import typings.reactAce.reactAceStrings.always
import typings.reactAce.reactAceStrings.error
import typings.reactAce.reactAceStrings.fullLine
import typings.reactAce.reactAceStrings.info
import typings.reactAce.reactAceStrings.line
import typings.reactAce.reactAceStrings.screenLine
import typings.reactAce.reactAceStrings.slim
import typings.reactAce.reactAceStrings.smooth
import typings.reactAce.reactAceStrings.text
import typings.reactAce.reactAceStrings.warning
import typings.reactAce.reactAceStrings.wide
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @js.native
  trait IAceEditor
    extends StObject
       with Editor
       with /* index */ StringDictionary[Any] {
    
    @JSName("renderer")
    var renderer_IAceEditor: IRenderer = js.native
  }
  
  trait IAceOptions
    extends StObject
       with /* index */ StringDictionary[Any] {
    
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
    
    inline def apply(): IAceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAceOptions]
    }
    
    extension [Self <: IAceOptions](x: Self) {
      
      inline def setAnimatedScroll(value: Boolean): Self = StObject.set(x, "animatedScroll", value.asInstanceOf[js.Any])
      
      inline def setAnimatedScrollUndefined: Self = StObject.set(x, "animatedScroll", js.undefined)
      
      inline def setAutoScrollEditorIntoView(value: Boolean): Self = StObject.set(x, "autoScrollEditorIntoView", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollEditorIntoViewUndefined: Self = StObject.set(x, "autoScrollEditorIntoView", js.undefined)
      
      inline def setBehavioursEnabled(value: Boolean): Self = StObject.set(x, "behavioursEnabled", value.asInstanceOf[js.Any])
      
      inline def setBehavioursEnabledUndefined: Self = StObject.set(x, "behavioursEnabled", js.undefined)
      
      inline def setCursorStyle(value: ace | slim | smooth | wide): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
      
      inline def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
      
      inline def setDisplayIndentGuides(value: Boolean): Self = StObject.set(x, "displayIndentGuides", value.asInstanceOf[js.Any])
      
      inline def setDisplayIndentGuidesUndefined: Self = StObject.set(x, "displayIndentGuides", js.undefined)
      
      inline def setDragDelay(value: Double): Self = StObject.set(x, "dragDelay", value.asInstanceOf[js.Any])
      
      inline def setDragDelayUndefined: Self = StObject.set(x, "dragDelay", js.undefined)
      
      inline def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
      
      inline def setDragEnabledUndefined: Self = StObject.set(x, "dragEnabled", js.undefined)
      
      inline def setEnableBasicAutocompletion(value: Boolean): Self = StObject.set(x, "enableBasicAutocompletion", value.asInstanceOf[js.Any])
      
      inline def setEnableBasicAutocompletionUndefined: Self = StObject.set(x, "enableBasicAutocompletion", js.undefined)
      
      inline def setEnableEmmet(value: Boolean): Self = StObject.set(x, "enableEmmet", value.asInstanceOf[js.Any])
      
      inline def setEnableEmmetUndefined: Self = StObject.set(x, "enableEmmet", js.undefined)
      
      inline def setEnableLiveAutocompletion(value: Boolean): Self = StObject.set(x, "enableLiveAutocompletion", value.asInstanceOf[js.Any])
      
      inline def setEnableLiveAutocompletionUndefined: Self = StObject.set(x, "enableLiveAutocompletion", js.undefined)
      
      inline def setEnableMultiselect(value: Boolean): Self = StObject.set(x, "enableMultiselect", value.asInstanceOf[js.Any])
      
      inline def setEnableMultiselectUndefined: Self = StObject.set(x, "enableMultiselect", js.undefined)
      
      inline def setEnableSnippets(value: Boolean): Self = StObject.set(x, "enableSnippets", value.asInstanceOf[js.Any])
      
      inline def setEnableSnippetsUndefined: Self = StObject.set(x, "enableSnippets", js.undefined)
      
      inline def setFadeFoldWidgets(value: Boolean): Self = StObject.set(x, "fadeFoldWidgets", value.asInstanceOf[js.Any])
      
      inline def setFadeFoldWidgetsUndefined: Self = StObject.set(x, "fadeFoldWidgets", js.undefined)
      
      inline def setFirstLineNumber(value: Double): Self = StObject.set(x, "firstLineNumber", value.asInstanceOf[js.Any])
      
      inline def setFirstLineNumberUndefined: Self = StObject.set(x, "firstLineNumber", js.undefined)
      
      inline def setFixedWidthGutter(value: Boolean): Self = StObject.set(x, "fixedWidthGutter", value.asInstanceOf[js.Any])
      
      inline def setFixedWidthGutterUndefined: Self = StObject.set(x, "fixedWidthGutter", js.undefined)
      
      inline def setFocusTimout(value: Double): Self = StObject.set(x, "focusTimout", value.asInstanceOf[js.Any])
      
      inline def setFocusTimoutUndefined: Self = StObject.set(x, "focusTimout", js.undefined)
      
      inline def setFoldStyle(value: Boolean): Self = StObject.set(x, "foldStyle", value.asInstanceOf[js.Any])
      
      inline def setFoldStyleUndefined: Self = StObject.set(x, "foldStyle", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setHScrollBarAlwaysVisible(value: Boolean): Self = StObject.set(x, "hScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
      
      inline def setHScrollBarAlwaysVisibleUndefined: Self = StObject.set(x, "hScrollBarAlwaysVisible", js.undefined)
      
      inline def setHighlightActiveLine(value: Boolean): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
      
      inline def setHighlightActiveLineUndefined: Self = StObject.set(x, "highlightActiveLine", js.undefined)
      
      inline def setHighlightGutterLine(value: Boolean): Self = StObject.set(x, "highlightGutterLine", value.asInstanceOf[js.Any])
      
      inline def setHighlightGutterLineUndefined: Self = StObject.set(x, "highlightGutterLine", js.undefined)
      
      inline def setHighlightSelectedWord(value: Boolean): Self = StObject.set(x, "highlightSelectedWord", value.asInstanceOf[js.Any])
      
      inline def setHighlightSelectedWordUndefined: Self = StObject.set(x, "highlightSelectedWord", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMergeUndoDeltas(value: `false` | `true` | always): Self = StObject.set(x, "mergeUndoDeltas", value.asInstanceOf[js.Any])
      
      inline def setMergeUndoDeltasUndefined: Self = StObject.set(x, "mergeUndoDeltas", js.undefined)
      
      inline def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      inline def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNewLineMode(value: Boolean): Self = StObject.set(x, "newLineMode", value.asInstanceOf[js.Any])
      
      inline def setNewLineModeUndefined: Self = StObject.set(x, "newLineMode", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPrintMargin(value: Boolean | Double): Self = StObject.set(x, "printMargin", value.asInstanceOf[js.Any])
      
      inline def setPrintMarginColumn(value: Double): Self = StObject.set(x, "printMarginColumn", value.asInstanceOf[js.Any])
      
      inline def setPrintMarginColumnUndefined: Self = StObject.set(x, "printMarginColumn", js.undefined)
      
      inline def setPrintMarginUndefined: Self = StObject.set(x, "printMargin", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setScrollPastEnd(value: Boolean): Self = StObject.set(x, "scrollPastEnd", value.asInstanceOf[js.Any])
      
      inline def setScrollPastEndUndefined: Self = StObject.set(x, "scrollPastEnd", js.undefined)
      
      inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
      
      inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
      
      inline def setSelectionStyle(value: line | text): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
      
      inline def setShowFoldWidgets(value: Boolean): Self = StObject.set(x, "showFoldWidgets", value.asInstanceOf[js.Any])
      
      inline def setShowFoldWidgetsUndefined: Self = StObject.set(x, "showFoldWidgets", js.undefined)
      
      inline def setShowGutter(value: Boolean): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
      
      inline def setShowGutterUndefined: Self = StObject.set(x, "showGutter", js.undefined)
      
      inline def setShowInvisibles(value: Boolean): Self = StObject.set(x, "showInvisibles", value.asInstanceOf[js.Any])
      
      inline def setShowInvisiblesUndefined: Self = StObject.set(x, "showInvisibles", js.undefined)
      
      inline def setShowLineNumbers(value: Boolean): Self = StObject.set(x, "showLineNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowLineNumbersUndefined: Self = StObject.set(x, "showLineNumbers", js.undefined)
      
      inline def setShowPrintMargin(value: Boolean): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
      
      inline def setShowPrintMarginUndefined: Self = StObject.set(x, "showPrintMargin", js.undefined)
      
      inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltipFollowsMouse(value: Boolean): Self = StObject.set(x, "tooltipFollowsMouse", value.asInstanceOf[js.Any])
      
      inline def setTooltipFollowsMouseUndefined: Self = StObject.set(x, "tooltipFollowsMouse", js.undefined)
      
      inline def setUseElasticTabstops(value: Boolean): Self = StObject.set(x, "useElasticTabstops", value.asInstanceOf[js.Any])
      
      inline def setUseElasticTabstopsUndefined: Self = StObject.set(x, "useElasticTabstops", js.undefined)
      
      inline def setUseSoftTabs(value: Boolean): Self = StObject.set(x, "useSoftTabs", value.asInstanceOf[js.Any])
      
      inline def setUseSoftTabsUndefined: Self = StObject.set(x, "useSoftTabs", js.undefined)
      
      inline def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
      
      inline def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
      
      inline def setVScrollBarAlwaysVisible(value: Boolean): Self = StObject.set(x, "vScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
      
      inline def setVScrollBarAlwaysVisibleUndefined: Self = StObject.set(x, "vScrollBarAlwaysVisible", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapBehavioursEnabled(value: Boolean): Self = StObject.set(x, "wrapBehavioursEnabled", value.asInstanceOf[js.Any])
      
      inline def setWrapBehavioursEnabledUndefined: Self = StObject.set(x, "wrapBehavioursEnabled", js.undefined)
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait IAnnotation extends StObject {
    
    var column: Double
    
    var row: Double
    
    var text: String
    
    var `type`: error | info | warning
  }
  object IAnnotation {
    
    inline def apply(column: Double, row: Double, text: String, `type`: error | info | warning): IAnnotation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAnnotation]
    }
    
    extension [Self <: IAnnotation](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: error | info | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICommand extends StObject {
    
    var bindKey: ICommandBindKey
    
    var exec: String | ICommandExecFunction
    
    var name: String
  }
  object ICommand {
    
    inline def apply(bindKey: ICommandBindKey, exec: String | ICommandExecFunction, name: String): ICommand = {
      val __obj = js.Dynamic.literal(bindKey = bindKey.asInstanceOf[js.Any], exec = exec.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommand]
    }
    
    extension [Self <: ICommand](x: Self) {
      
      inline def setBindKey(value: ICommandBindKey): Self = StObject.set(x, "bindKey", value.asInstanceOf[js.Any])
      
      inline def setExec(value: String | ICommandExecFunction): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      inline def setExecFunction2(value: (/* editor */ Editor, /* args */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "exec", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICommandBindKey extends StObject {
    
    var mac: String
    
    var win: String
  }
  object ICommandBindKey {
    
    inline def apply(mac: String, win: String): ICommandBindKey = {
      val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandBindKey]
    }
    
    extension [Self <: ICommandBindKey](x: Self) {
      
      inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setWin(value: String): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
    }
  }
  
  type ICommandExecFunction = js.Function2[/* editor */ Editor, /* args */ js.UndefOr[Any], Any]
  
  trait ICommandManager extends StObject {
    
    def addCommand(command: Any): Unit
    
    def addCommands(commands: js.Array[Any]): Unit
    
    var bindKey: js.UndefOr[js.Function2[/* bindKey */ Any, /* command */ Any, Unit]] = js.undefined
    
    var byName: Any
    
    var commands: Any
    
    def exec(name: String, editor: Any, args: Any): Unit
    
    var platform: String
  }
  object ICommandManager {
    
    inline def apply(
      addCommand: Any => Unit,
      addCommands: js.Array[Any] => Unit,
      byName: Any,
      commands: Any,
      exec: (String, Any, Any) => Unit,
      platform: String
    ): ICommandManager = {
      val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), addCommands = js.Any.fromFunction1(addCommands), byName = byName.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], exec = js.Any.fromFunction3(exec), platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandManager]
    }
    
    extension [Self <: ICommandManager](x: Self) {
      
      inline def setAddCommand(value: Any => Unit): Self = StObject.set(x, "addCommand", js.Any.fromFunction1(value))
      
      inline def setAddCommands(value: js.Array[Any] => Unit): Self = StObject.set(x, "addCommands", js.Any.fromFunction1(value))
      
      inline def setBindKey(value: (/* bindKey */ Any, /* command */ Any) => Unit): Self = StObject.set(x, "bindKey", js.Any.fromFunction2(value))
      
      inline def setBindKeyUndefined: Self = StObject.set(x, "bindKey", js.undefined)
      
      inline def setByName(value: Any): Self = StObject.set(x, "byName", value.asInstanceOf[js.Any])
      
      inline def setCommands(value: Any): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setExec(value: (String, Any, Any) => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction3(value))
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait IEditorProps
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    @JSName("$blockScrolling")
    var $blockScrolling: js.UndefOr[Double | Boolean] = js.undefined
    
    @JSName("$blockSelectEnabled")
    var $blockSelectEnabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$enableBlockSelect")
    var $enableBlockSelect: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$enableMultiselect")
    var $enableMultiselect: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$highlightPending")
    var $highlightPending: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$highlightTagPending")
    var $highlightTagPending: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$multiselectOnSessionChange")
    var $multiselectOnSessionChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onAddRange")
    var $onAddRange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onChangeAnnotation")
    var $onChangeAnnotation: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onChangeBackMarker")
    var $onChangeBackMarker: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onChangeBreakpoint")
    var $onChangeBreakpoint: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onChangeFold")
    var $onChangeFold: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onChangeFrontMarker")
    var $onChangeFrontMarker: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onChangeMode")
    var $onChangeMode: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onChangeTabSize")
    var $onChangeTabSize: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onChangeWrapLimit")
    var $onChangeWrapLimit: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onChangeWrapMode")
    var $onChangeWrapMode: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onCursorChange")
    var $onCursorChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onDocumentChange")
    var $onDocumentChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onMultiSelect")
    var $onMultiSelect: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onRemoveRange")
    var $onRemoveRange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onScrollLeftChange")
    var $onScrollLeftChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onScrollTopChange")
    var $onScrollTopChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onSelectionChange")
    var $onSelectionChange: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onSingleSelect")
    var $onSingleSelect: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    @JSName("$onTokenizerUpdate")
    var $onTokenizerUpdate: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object IEditorProps {
    
    inline def apply(): IEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditorProps]
    }
    
    extension [Self <: IEditorProps](x: Self) {
      
      inline def set$blockScrolling(value: Double | Boolean): Self = StObject.set(x, "$blockScrolling", value.asInstanceOf[js.Any])
      
      inline def set$blockScrollingUndefined: Self = StObject.set(x, "$blockScrolling", js.undefined)
      
      inline def set$blockSelectEnabled(value: Boolean): Self = StObject.set(x, "$blockSelectEnabled", value.asInstanceOf[js.Any])
      
      inline def set$blockSelectEnabledUndefined: Self = StObject.set(x, "$blockSelectEnabled", js.undefined)
      
      inline def set$enableBlockSelect(value: Boolean): Self = StObject.set(x, "$enableBlockSelect", value.asInstanceOf[js.Any])
      
      inline def set$enableBlockSelectUndefined: Self = StObject.set(x, "$enableBlockSelect", js.undefined)
      
      inline def set$enableMultiselect(value: Boolean): Self = StObject.set(x, "$enableMultiselect", value.asInstanceOf[js.Any])
      
      inline def set$enableMultiselectUndefined: Self = StObject.set(x, "$enableMultiselect", js.undefined)
      
      inline def set$highlightPending(value: Boolean): Self = StObject.set(x, "$highlightPending", value.asInstanceOf[js.Any])
      
      inline def set$highlightPendingUndefined: Self = StObject.set(x, "$highlightPending", js.undefined)
      
      inline def set$highlightTagPending(value: Boolean): Self = StObject.set(x, "$highlightTagPending", value.asInstanceOf[js.Any])
      
      inline def set$highlightTagPendingUndefined: Self = StObject.set(x, "$highlightTagPending", js.undefined)
      
      inline def set$multiselectOnSessionChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "$multiselectOnSessionChange", js.Any.fromFunction1(value))
      
      inline def set$multiselectOnSessionChangeUndefined: Self = StObject.set(x, "$multiselectOnSessionChange", js.undefined)
      
      inline def set$onAddRange(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onAddRange", js.Any.fromFunction1(value))
      
      inline def set$onAddRangeUndefined: Self = StObject.set(x, "$onAddRange", js.undefined)
      
      inline def set$onChangeAnnotation(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onChangeAnnotation", js.Any.fromFunction1(value))
      
      inline def set$onChangeAnnotationUndefined: Self = StObject.set(x, "$onChangeAnnotation", js.undefined)
      
      inline def set$onChangeBackMarker(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onChangeBackMarker", js.Any.fromFunction1(value))
      
      inline def set$onChangeBackMarkerUndefined: Self = StObject.set(x, "$onChangeBackMarker", js.undefined)
      
      inline def set$onChangeBreakpoint(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onChangeBreakpoint", js.Any.fromFunction1(value))
      
      inline def set$onChangeBreakpointUndefined: Self = StObject.set(x, "$onChangeBreakpoint", js.undefined)
      
      inline def set$onChangeFold(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onChangeFold", js.Any.fromFunction1(value))
      
      inline def set$onChangeFoldUndefined: Self = StObject.set(x, "$onChangeFold", js.undefined)
      
      inline def set$onChangeFrontMarker(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onChangeFrontMarker", js.Any.fromFunction1(value))
      
      inline def set$onChangeFrontMarkerUndefined: Self = StObject.set(x, "$onChangeFrontMarker", js.undefined)
      
      inline def set$onChangeMode(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onChangeMode", js.Any.fromFunction1(value))
      
      inline def set$onChangeModeUndefined: Self = StObject.set(x, "$onChangeMode", js.undefined)
      
      inline def set$onChangeTabSize(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onChangeTabSize", js.Any.fromFunction1(value))
      
      inline def set$onChangeTabSizeUndefined: Self = StObject.set(x, "$onChangeTabSize", js.undefined)
      
      inline def set$onChangeWrapLimit(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onChangeWrapLimit", js.Any.fromFunction1(value))
      
      inline def set$onChangeWrapLimitUndefined: Self = StObject.set(x, "$onChangeWrapLimit", js.undefined)
      
      inline def set$onChangeWrapMode(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onChangeWrapMode", js.Any.fromFunction1(value))
      
      inline def set$onChangeWrapModeUndefined: Self = StObject.set(x, "$onChangeWrapMode", js.undefined)
      
      inline def set$onCursorChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onCursorChange", js.Any.fromFunction1(value))
      
      inline def set$onCursorChangeUndefined: Self = StObject.set(x, "$onCursorChange", js.undefined)
      
      inline def set$onDocumentChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onDocumentChange", js.Any.fromFunction1(value))
      
      inline def set$onDocumentChangeUndefined: Self = StObject.set(x, "$onDocumentChange", js.undefined)
      
      inline def set$onMultiSelect(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onMultiSelect", js.Any.fromFunction1(value))
      
      inline def set$onMultiSelectUndefined: Self = StObject.set(x, "$onMultiSelect", js.undefined)
      
      inline def set$onRemoveRange(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onRemoveRange", js.Any.fromFunction1(value))
      
      inline def set$onRemoveRangeUndefined: Self = StObject.set(x, "$onRemoveRange", js.undefined)
      
      inline def set$onScrollLeftChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onScrollLeftChange", js.Any.fromFunction1(value))
      
      inline def set$onScrollLeftChangeUndefined: Self = StObject.set(x, "$onScrollLeftChange", js.undefined)
      
      inline def set$onScrollTopChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onScrollTopChange", js.Any.fromFunction1(value))
      
      inline def set$onScrollTopChangeUndefined: Self = StObject.set(x, "$onScrollTopChange", js.undefined)
      
      inline def set$onSelectionChange(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onSelectionChange", js.Any.fromFunction1(value))
      
      inline def set$onSelectionChangeUndefined: Self = StObject.set(x, "$onSelectionChange", js.undefined)
      
      inline def set$onSingleSelect(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onSingleSelect", js.Any.fromFunction1(value))
      
      inline def set$onSingleSelectUndefined: Self = StObject.set(x, "$onSingleSelect", js.undefined)
      
      inline def set$onTokenizerUpdate(value: /* repeated */ Any => Any): Self = StObject.set(x, "$onTokenizerUpdate", js.Any.fromFunction1(value))
      
      inline def set$onTokenizerUpdateUndefined: Self = StObject.set(x, "$onTokenizerUpdate", js.undefined)
    }
  }
  
  trait IMarker extends StObject {
    
    var className: String
    
    var endCol: Double
    
    var endRow: Double
    
    var inFront: js.UndefOr[Boolean] = js.undefined
    
    var startCol: Double
    
    var startRow: Double
    
    var `type`: fullLine | screenLine | text | MarkerRenderer
  }
  object IMarker {
    
    inline def apply(
      className: String,
      endCol: Double,
      endRow: Double,
      startCol: Double,
      startRow: Double,
      `type`: fullLine | screenLine | text | MarkerRenderer
    ): IMarker = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMarker]
    }
    
    extension [Self <: IMarker](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      inline def setInFront(value: Boolean): Self = StObject.set(x, "inFront", value.asInstanceOf[js.Any])
      
      inline def setInFrontUndefined: Self = StObject.set(x, "inFront", js.undefined)
      
      inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
      
      inline def setType(value: fullLine | screenLine | text | MarkerRenderer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction5(
        value: (/* html */ js.Array[String], /* range */ Range, /* left */ Double, /* top */ Double, /* config */ Any) => Unit
      ): Self = StObject.set(x, "type", js.Any.fromFunction5(value))
    }
  }
  
  @js.native
  trait IRenderer
    extends StObject
       with VirtualRenderer {
    
    var placeholderNode: js.UndefOr[HTMLDivElement] = js.native
    
    @JSName("scroller")
    var scroller_IRenderer: js.UndefOr[HTMLDivElement] = js.native
  }
}
