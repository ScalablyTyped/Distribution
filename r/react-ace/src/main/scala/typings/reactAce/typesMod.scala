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
import typings.reactAce.reactAceStrings.fullLine
import typings.reactAce.reactAceStrings.line
import typings.reactAce.reactAceStrings.screenLine
import typings.reactAce.reactAceStrings.slim
import typings.reactAce.reactAceStrings.smooth
import typings.reactAce.reactAceStrings.text
import typings.reactAce.reactAceStrings.wide
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait IAceEditor
    extends StObject
       with Editor
       with /* index */ StringDictionary[js.Any] {
    
    @JSName("renderer")
    var renderer_IAceEditor: IRenderer = js.native
  }
  
  trait IAceOptions
    extends StObject
       with /* index */ StringDictionary[js.Any] {
    
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
    def apply(): IAceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAceOptions]
    }
    
    @scala.inline
    implicit class IAceOptionsMutableBuilder[Self <: IAceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimatedScroll(value: Boolean): Self = StObject.set(x, "animatedScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedScrollUndefined: Self = StObject.set(x, "animatedScroll", js.undefined)
      
      @scala.inline
      def setAutoScrollEditorIntoView(value: Boolean): Self = StObject.set(x, "autoScrollEditorIntoView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScrollEditorIntoViewUndefined: Self = StObject.set(x, "autoScrollEditorIntoView", js.undefined)
      
      @scala.inline
      def setBehavioursEnabled(value: Boolean): Self = StObject.set(x, "behavioursEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehavioursEnabledUndefined: Self = StObject.set(x, "behavioursEnabled", js.undefined)
      
      @scala.inline
      def setCursorStyle(value: ace | slim | smooth | wide): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
      
      @scala.inline
      def setDisplayIndentGuides(value: Boolean): Self = StObject.set(x, "displayIndentGuides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayIndentGuidesUndefined: Self = StObject.set(x, "displayIndentGuides", js.undefined)
      
      @scala.inline
      def setDragDelay(value: Double): Self = StObject.set(x, "dragDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragDelayUndefined: Self = StObject.set(x, "dragDelay", js.undefined)
      
      @scala.inline
      def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragEnabledUndefined: Self = StObject.set(x, "dragEnabled", js.undefined)
      
      @scala.inline
      def setEnableBasicAutocompletion(value: Boolean): Self = StObject.set(x, "enableBasicAutocompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBasicAutocompletionUndefined: Self = StObject.set(x, "enableBasicAutocompletion", js.undefined)
      
      @scala.inline
      def setEnableEmmet(value: Boolean): Self = StObject.set(x, "enableEmmet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableEmmetUndefined: Self = StObject.set(x, "enableEmmet", js.undefined)
      
      @scala.inline
      def setEnableLiveAutocompletion(value: Boolean): Self = StObject.set(x, "enableLiveAutocompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLiveAutocompletionUndefined: Self = StObject.set(x, "enableLiveAutocompletion", js.undefined)
      
      @scala.inline
      def setEnableMultiselect(value: Boolean): Self = StObject.set(x, "enableMultiselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMultiselectUndefined: Self = StObject.set(x, "enableMultiselect", js.undefined)
      
      @scala.inline
      def setEnableSnippets(value: Boolean): Self = StObject.set(x, "enableSnippets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSnippetsUndefined: Self = StObject.set(x, "enableSnippets", js.undefined)
      
      @scala.inline
      def setFadeFoldWidgets(value: Boolean): Self = StObject.set(x, "fadeFoldWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeFoldWidgetsUndefined: Self = StObject.set(x, "fadeFoldWidgets", js.undefined)
      
      @scala.inline
      def setFirstLineNumber(value: Double): Self = StObject.set(x, "firstLineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstLineNumberUndefined: Self = StObject.set(x, "firstLineNumber", js.undefined)
      
      @scala.inline
      def setFixedWidthGutter(value: Boolean): Self = StObject.set(x, "fixedWidthGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWidthGutterUndefined: Self = StObject.set(x, "fixedWidthGutter", js.undefined)
      
      @scala.inline
      def setFocusTimout(value: Double): Self = StObject.set(x, "focusTimout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusTimoutUndefined: Self = StObject.set(x, "focusTimout", js.undefined)
      
      @scala.inline
      def setFoldStyle(value: Boolean): Self = StObject.set(x, "foldStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoldStyleUndefined: Self = StObject.set(x, "foldStyle", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHScrollBarAlwaysVisible(value: Boolean): Self = StObject.set(x, "hScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHScrollBarAlwaysVisibleUndefined: Self = StObject.set(x, "hScrollBarAlwaysVisible", js.undefined)
      
      @scala.inline
      def setHighlightActiveLine(value: Boolean): Self = StObject.set(x, "highlightActiveLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightActiveLineUndefined: Self = StObject.set(x, "highlightActiveLine", js.undefined)
      
      @scala.inline
      def setHighlightGutterLine(value: Boolean): Self = StObject.set(x, "highlightGutterLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightGutterLineUndefined: Self = StObject.set(x, "highlightGutterLine", js.undefined)
      
      @scala.inline
      def setHighlightSelectedWord(value: Boolean): Self = StObject.set(x, "highlightSelectedWord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightSelectedWordUndefined: Self = StObject.set(x, "highlightSelectedWord", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMergeUndoDeltas(value: `false` | `true` | always): Self = StObject.set(x, "mergeUndoDeltas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeUndoDeltasUndefined: Self = StObject.set(x, "mergeUndoDeltas", js.undefined)
      
      @scala.inline
      def setMinLines(value: Double): Self = StObject.set(x, "minLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLinesUndefined: Self = StObject.set(x, "minLines", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNewLineMode(value: Boolean): Self = StObject.set(x, "newLineMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewLineModeUndefined: Self = StObject.set(x, "newLineMode", js.undefined)
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPrintMargin(value: Boolean | Double): Self = StObject.set(x, "printMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintMarginColumn(value: Double): Self = StObject.set(x, "printMarginColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintMarginColumnUndefined: Self = StObject.set(x, "printMarginColumn", js.undefined)
      
      @scala.inline
      def setPrintMarginUndefined: Self = StObject.set(x, "printMargin", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setScrollPastEnd(value: Boolean): Self = StObject.set(x, "scrollPastEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPastEndUndefined: Self = StObject.set(x, "scrollPastEnd", js.undefined)
      
      @scala.inline
      def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
      
      @scala.inline
      def setSelectionStyle(value: line | text): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
      
      @scala.inline
      def setShowFoldWidgets(value: Boolean): Self = StObject.set(x, "showFoldWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFoldWidgetsUndefined: Self = StObject.set(x, "showFoldWidgets", js.undefined)
      
      @scala.inline
      def setShowGutter(value: Boolean): Self = StObject.set(x, "showGutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowGutterUndefined: Self = StObject.set(x, "showGutter", js.undefined)
      
      @scala.inline
      def setShowInvisibles(value: Boolean): Self = StObject.set(x, "showInvisibles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInvisiblesUndefined: Self = StObject.set(x, "showInvisibles", js.undefined)
      
      @scala.inline
      def setShowLineNumbers(value: Boolean): Self = StObject.set(x, "showLineNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLineNumbersUndefined: Self = StObject.set(x, "showLineNumbers", js.undefined)
      
      @scala.inline
      def setShowPrintMargin(value: Boolean): Self = StObject.set(x, "showPrintMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrintMarginUndefined: Self = StObject.set(x, "showPrintMargin", js.undefined)
      
      @scala.inline
      def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      @scala.inline
      def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTooltipFollowsMouse(value: Boolean): Self = StObject.set(x, "tooltipFollowsMouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipFollowsMouseUndefined: Self = StObject.set(x, "tooltipFollowsMouse", js.undefined)
      
      @scala.inline
      def setUseElasticTabstops(value: Boolean): Self = StObject.set(x, "useElasticTabstops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseElasticTabstopsUndefined: Self = StObject.set(x, "useElasticTabstops", js.undefined)
      
      @scala.inline
      def setUseSoftTabs(value: Boolean): Self = StObject.set(x, "useSoftTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSoftTabsUndefined: Self = StObject.set(x, "useSoftTabs", js.undefined)
      
      @scala.inline
      def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
      
      @scala.inline
      def setVScrollBarAlwaysVisible(value: Boolean): Self = StObject.set(x, "vScrollBarAlwaysVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVScrollBarAlwaysVisibleUndefined: Self = StObject.set(x, "vScrollBarAlwaysVisible", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapBehavioursEnabled(value: Boolean): Self = StObject.set(x, "wrapBehavioursEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapBehavioursEnabledUndefined: Self = StObject.set(x, "wrapBehavioursEnabled", js.undefined)
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait IAnnotation extends StObject {
    
    var column: Double
    
    var row: Double
    
    var text: String
    
    var `type`: String
  }
  object IAnnotation {
    
    @scala.inline
    def apply(column: Double, row: Double, text: String, `type`: String): IAnnotation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAnnotation]
    }
    
    @scala.inline
    implicit class IAnnotationMutableBuilder[Self <: IAnnotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICommand extends StObject {
    
    var bindKey: ICommandBindKey
    
    var exec: String | ICommandExecFunction
    
    var name: String
  }
  object ICommand {
    
    @scala.inline
    def apply(bindKey: ICommandBindKey, exec: String | ICommandExecFunction, name: String): ICommand = {
      val __obj = js.Dynamic.literal(bindKey = bindKey.asInstanceOf[js.Any], exec = exec.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommand]
    }
    
    @scala.inline
    implicit class ICommandMutableBuilder[Self <: ICommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindKey(value: ICommandBindKey): Self = StObject.set(x, "bindKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExec(value: String | ICommandExecFunction): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecFunction2(value: (/* editor */ Editor, /* args */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "exec", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICommandBindKey extends StObject {
    
    var mac: String
    
    var win: String
  }
  object ICommandBindKey {
    
    @scala.inline
    def apply(mac: String, win: String): ICommandBindKey = {
      val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandBindKey]
    }
    
    @scala.inline
    implicit class ICommandBindKeyMutableBuilder[Self <: ICommandBindKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWin(value: String): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
    }
  }
  
  type ICommandExecFunction = js.Function2[/* editor */ Editor, /* args */ js.UndefOr[js.Any], js.Any]
  
  trait ICommandManager extends StObject {
    
    def addCommand(command: js.Any): Unit
    
    def addCommands(commands: js.Array[js.Any]): Unit
    
    var bindKey: js.UndefOr[js.Function2[/* bindKey */ js.Any, /* command */ js.Any, Unit]] = js.undefined
    
    var byName: js.Any
    
    var commands: js.Any
    
    def exec(name: String, editor: js.Any, args: js.Any): Unit
    
    var platform: String
  }
  object ICommandManager {
    
    @scala.inline
    def apply(
      addCommand: js.Any => Unit,
      addCommands: js.Array[js.Any] => Unit,
      byName: js.Any,
      commands: js.Any,
      exec: (String, js.Any, js.Any) => Unit,
      platform: String
    ): ICommandManager = {
      val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), addCommands = js.Any.fromFunction1(addCommands), byName = byName.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], exec = js.Any.fromFunction3(exec), platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandManager]
    }
    
    @scala.inline
    implicit class ICommandManagerMutableBuilder[Self <: ICommandManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCommand(value: js.Any => Unit): Self = StObject.set(x, "addCommand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddCommands(value: js.Array[js.Any] => Unit): Self = StObject.set(x, "addCommands", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBindKey(value: (/* bindKey */ js.Any, /* command */ js.Any) => Unit): Self = StObject.set(x, "bindKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBindKeyUndefined: Self = StObject.set(x, "bindKey", js.undefined)
      
      @scala.inline
      def setByName(value: js.Any): Self = StObject.set(x, "byName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommands(value: js.Any): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExec(value: (String, js.Any, js.Any) => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  trait IEditorProps
    extends StObject
       with /* index */ StringDictionary[js.Any] {
    
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
    var $multiselectOnSessionChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onAddRange")
    var $onAddRange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onChangeAnnotation")
    var $onChangeAnnotation: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onChangeBackMarker")
    var $onChangeBackMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onChangeBreakpoint")
    var $onChangeBreakpoint: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onChangeFold")
    var $onChangeFold: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onChangeFrontMarker")
    var $onChangeFrontMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onChangeMode")
    var $onChangeMode: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onChangeTabSize")
    var $onChangeTabSize: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onChangeWrapLimit")
    var $onChangeWrapLimit: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onChangeWrapMode")
    var $onChangeWrapMode: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onCursorChange")
    var $onCursorChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onDocumentChange")
    var $onDocumentChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onMultiSelect")
    var $onMultiSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onRemoveRange")
    var $onRemoveRange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onScrollLeftChange")
    var $onScrollLeftChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onScrollTopChange")
    var $onScrollTopChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onSelectionChange")
    var $onSelectionChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onSingleSelect")
    var $onSingleSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    @JSName("$onTokenizerUpdate")
    var $onTokenizerUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  }
  object IEditorProps {
    
    @scala.inline
    def apply(): IEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditorProps]
    }
    
    @scala.inline
    implicit class IEditorPropsMutableBuilder[Self <: IEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$blockScrolling(value: Double | Boolean): Self = StObject.set(x, "$blockScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$blockScrollingUndefined: Self = StObject.set(x, "$blockScrolling", js.undefined)
      
      @scala.inline
      def set$blockSelectEnabled(value: Boolean): Self = StObject.set(x, "$blockSelectEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$blockSelectEnabledUndefined: Self = StObject.set(x, "$blockSelectEnabled", js.undefined)
      
      @scala.inline
      def set$enableBlockSelect(value: Boolean): Self = StObject.set(x, "$enableBlockSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$enableBlockSelectUndefined: Self = StObject.set(x, "$enableBlockSelect", js.undefined)
      
      @scala.inline
      def set$enableMultiselect(value: Boolean): Self = StObject.set(x, "$enableMultiselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$enableMultiselectUndefined: Self = StObject.set(x, "$enableMultiselect", js.undefined)
      
      @scala.inline
      def set$highlightPending(value: Boolean): Self = StObject.set(x, "$highlightPending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$highlightPendingUndefined: Self = StObject.set(x, "$highlightPending", js.undefined)
      
      @scala.inline
      def set$highlightTagPending(value: Boolean): Self = StObject.set(x, "$highlightTagPending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$highlightTagPendingUndefined: Self = StObject.set(x, "$highlightTagPending", js.undefined)
      
      @scala.inline
      def set$multiselectOnSessionChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$multiselectOnSessionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$multiselectOnSessionChangeUndefined: Self = StObject.set(x, "$multiselectOnSessionChange", js.undefined)
      
      @scala.inline
      def set$onAddRange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onAddRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onAddRangeUndefined: Self = StObject.set(x, "$onAddRange", js.undefined)
      
      @scala.inline
      def set$onChangeAnnotation(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onChangeAnnotation", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeAnnotationUndefined: Self = StObject.set(x, "$onChangeAnnotation", js.undefined)
      
      @scala.inline
      def set$onChangeBackMarker(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onChangeBackMarker", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeBackMarkerUndefined: Self = StObject.set(x, "$onChangeBackMarker", js.undefined)
      
      @scala.inline
      def set$onChangeBreakpoint(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onChangeBreakpoint", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeBreakpointUndefined: Self = StObject.set(x, "$onChangeBreakpoint", js.undefined)
      
      @scala.inline
      def set$onChangeFold(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onChangeFold", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeFoldUndefined: Self = StObject.set(x, "$onChangeFold", js.undefined)
      
      @scala.inline
      def set$onChangeFrontMarker(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onChangeFrontMarker", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeFrontMarkerUndefined: Self = StObject.set(x, "$onChangeFrontMarker", js.undefined)
      
      @scala.inline
      def set$onChangeMode(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onChangeMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeModeUndefined: Self = StObject.set(x, "$onChangeMode", js.undefined)
      
      @scala.inline
      def set$onChangeTabSize(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onChangeTabSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeTabSizeUndefined: Self = StObject.set(x, "$onChangeTabSize", js.undefined)
      
      @scala.inline
      def set$onChangeWrapLimit(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onChangeWrapLimit", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeWrapLimitUndefined: Self = StObject.set(x, "$onChangeWrapLimit", js.undefined)
      
      @scala.inline
      def set$onChangeWrapMode(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onChangeWrapMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeWrapModeUndefined: Self = StObject.set(x, "$onChangeWrapMode", js.undefined)
      
      @scala.inline
      def set$onCursorChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onCursorChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onCursorChangeUndefined: Self = StObject.set(x, "$onCursorChange", js.undefined)
      
      @scala.inline
      def set$onDocumentChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onDocumentChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onDocumentChangeUndefined: Self = StObject.set(x, "$onDocumentChange", js.undefined)
      
      @scala.inline
      def set$onMultiSelect(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onMultiSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onMultiSelectUndefined: Self = StObject.set(x, "$onMultiSelect", js.undefined)
      
      @scala.inline
      def set$onRemoveRange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onRemoveRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onRemoveRangeUndefined: Self = StObject.set(x, "$onRemoveRange", js.undefined)
      
      @scala.inline
      def set$onScrollLeftChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onScrollLeftChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onScrollLeftChangeUndefined: Self = StObject.set(x, "$onScrollLeftChange", js.undefined)
      
      @scala.inline
      def set$onScrollTopChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onScrollTopChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onScrollTopChangeUndefined: Self = StObject.set(x, "$onScrollTopChange", js.undefined)
      
      @scala.inline
      def set$onSelectionChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onSelectionChangeUndefined: Self = StObject.set(x, "$onSelectionChange", js.undefined)
      
      @scala.inline
      def set$onSingleSelect(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onSingleSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onSingleSelectUndefined: Self = StObject.set(x, "$onSingleSelect", js.undefined)
      
      @scala.inline
      def set$onTokenizerUpdate(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "$onTokenizerUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onTokenizerUpdateUndefined: Self = StObject.set(x, "$onTokenizerUpdate", js.undefined)
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IMarkerMutableBuilder[Self <: IMarker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInFront(value: Boolean): Self = StObject.set(x, "inFront", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInFrontUndefined: Self = StObject.set(x, "inFront", js.undefined)
      
      @scala.inline
      def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: fullLine | screenLine | text | MarkerRenderer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction5(
        value: (/* html */ js.Array[String], /* range */ Range, /* left */ Double, /* top */ Double, /* config */ js.Any) => Unit
      ): Self = StObject.set(x, "type", js.Any.fromFunction5(value))
    }
  }
  
  @js.native
  trait IRenderer
    extends StObject
       with VirtualRenderer {
    
    var placeholderNode: js.UndefOr[HTMLDivElement] = js.native
    
    var scroller: js.UndefOr[HTMLDivElement] = js.native
  }
}
