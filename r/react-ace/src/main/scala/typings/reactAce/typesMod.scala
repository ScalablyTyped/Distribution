package typings.reactAce

import org.scalablytyped.runtime.StringDictionary
import typings.aceBuilds.anon.DataString
import typings.aceBuilds.anon.OldSession
import typings.aceBuilds.anon.PartialSearchOptions
import typings.aceBuilds.anon.Text
import typings.aceBuilds.mod.Ace.CommandManager
import typings.aceBuilds.mod.Ace.Completer
import typings.aceBuilds.mod.Ace.Delta
import typings.aceBuilds.mod.Ace.EditSession
import typings.aceBuilds.mod.Ace.Editor
import typings.aceBuilds.mod.Ace.KeyBinding
import typings.aceBuilds.mod.Ace.MarkerRenderer
import typings.aceBuilds.mod.Ace.NewLineMode
import typings.aceBuilds.mod.Ace.Point
import typings.aceBuilds.mod.Ace.Range
import typings.aceBuilds.mod.Ace.Selection
import typings.aceBuilds.mod.Ace.VirtualRenderer
import typings.reactAce.reactAceBooleans.`false`
import typings.reactAce.reactAceBooleans.`true`
import typings.reactAce.reactAceStrings.ace
import typings.reactAce.reactAceStrings.always
import typings.reactAce.reactAceStrings.animatedScroll
import typings.reactAce.reactAceStrings.auto
import typings.reactAce.reactAceStrings.autoScrollEditorIntoView
import typings.reactAce.reactAceStrings.behavioursEnabled
import typings.reactAce.reactAceStrings.blur
import typings.reactAce.reactAceStrings.change
import typings.reactAce.reactAceStrings.changeSelectionStyle
import typings.reactAce.reactAceStrings.changeSession
import typings.reactAce.reactAceStrings.code
import typings.reactAce.reactAceStrings.copy
import typings.reactAce.reactAceStrings.copyWithEmptySelection
import typings.reactAce.reactAceStrings.cursorStyle
import typings.reactAce.reactAceStrings.displayIndentGuides
import typings.reactAce.reactAceStrings.dragDelay
import typings.reactAce.reactAceStrings.dragEnabled
import typings.reactAce.reactAceStrings.enableAutoIndent
import typings.reactAce.reactAceStrings.fadeFoldWidgets
import typings.reactAce.reactAceStrings.firstLineNumber
import typings.reactAce.reactAceStrings.fixedWidthGutter
import typings.reactAce.reactAceStrings.focus
import typings.reactAce.reactAceStrings.focusTimeout
import typings.reactAce.reactAceStrings.foldStyle
import typings.reactAce.reactAceStrings.fontFamily
import typings.reactAce.reactAceStrings.fontSize
import typings.reactAce.reactAceStrings.free
import typings.reactAce.reactAceStrings.fullLine
import typings.reactAce.reactAceStrings.hScrollBarAlwaysVisible
import typings.reactAce.reactAceStrings.hasCssTransforms
import typings.reactAce.reactAceStrings.highlightActiveLine
import typings.reactAce.reactAceStrings.highlightGutterLine
import typings.reactAce.reactAceStrings.highlightSelectedWord
import typings.reactAce.reactAceStrings.indentedSoftWrap
import typings.reactAce.reactAceStrings.input
import typings.reactAce.reactAceStrings.keyboardHandler
import typings.reactAce.reactAceStrings.left
import typings.reactAce.reactAceStrings.line
import typings.reactAce.reactAceStrings.manual
import typings.reactAce.reactAceStrings.markbegin
import typings.reactAce.reactAceStrings.markbeginend
import typings.reactAce.reactAceStrings.maxLines
import typings.reactAce.reactAceStrings.maxPixelHeight
import typings.reactAce.reactAceStrings.mergeUndoDeltas
import typings.reactAce.reactAceStrings.minLines
import typings.reactAce.reactAceStrings.mode
import typings.reactAce.reactAceStrings.navigateWithinSoftTabs
import typings.reactAce.reactAceStrings.newLineMode
import typings.reactAce.reactAceStrings.off
import typings.reactAce.reactAceStrings.overwrite
import typings.reactAce.reactAceStrings.paste
import typings.reactAce.reactAceStrings.placeholder
import typings.reactAce.reactAceStrings.printMargin
import typings.reactAce.reactAceStrings.printMarginColumn
import typings.reactAce.reactAceStrings.printmargin_
import typings.reactAce.reactAceStrings.readOnly
import typings.reactAce.reactAceStrings.right
import typings.reactAce.reactAceStrings.screenLine
import typings.reactAce.reactAceStrings.scrollPastEnd
import typings.reactAce.reactAceStrings.scrollSpeed
import typings.reactAce.reactAceStrings.selectionStyle
import typings.reactAce.reactAceStrings.session
import typings.reactAce.reactAceStrings.showFoldWidgets
import typings.reactAce.reactAceStrings.showGutter
import typings.reactAce.reactAceStrings.showInvisibles
import typings.reactAce.reactAceStrings.showLineNumbers
import typings.reactAce.reactAceStrings.showPrintMargin
import typings.reactAce.reactAceStrings.slim
import typings.reactAce.reactAceStrings.smooth
import typings.reactAce.reactAceStrings.tabSize
import typings.reactAce.reactAceStrings.text
import typings.reactAce.reactAceStrings.theme
import typings.reactAce.reactAceStrings.tooltipFollowsMouse
import typings.reactAce.reactAceStrings.useSoftTabs
import typings.reactAce.reactAceStrings.useWorker
import typings.reactAce.reactAceStrings.vScrollBarAlwaysVisible
import typings.reactAce.reactAceStrings.value
import typings.reactAce.reactAceStrings.wide
import typings.reactAce.reactAceStrings.wrap
import typings.reactAce.reactAceStrings.wrapBehavioursEnabled
import typings.reactAce.reactAceStrings.wrapMethod
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Inlined ace-builds.ace-builds.Ace.Editor & {  renderer :react-ace.react-ace/lib/types.IRenderer, [index: string] : any} */
  @js.native
  trait IAceEditor
    extends /* index */ StringDictionary[js.Any] {
    
    def addEventListener(name: String, callback: js.Function): Unit = js.native
    def addEventListener(name: String, callback: js.Function, capturing: Boolean): Unit = js.native
    
    def blockIndent(): Unit = js.native
    
    def blockOutdent(): Unit = js.native
    
    def blur(): Unit = js.native
    
    def centerSelection(): Unit = js.native
    
    def clearSelection(): Unit = js.native
    
    var commands: CommandManager = js.native
    
    var completers: js.Array[Completer] = js.native
    
    var container: HTMLElement = js.native
    
    def copyLinesDown(): Unit = js.native
    
    def copyLinesUp(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def duplicateSelection(): Unit = js.native
    
    def execCommand(command: String): Boolean = js.native
    def execCommand(command: String, args: js.Any): Boolean = js.native
    def execCommand(command: js.Array[String]): Boolean = js.native
    def execCommand(command: js.Array[String], args: js.Any): Boolean = js.native
    
    def find(needle: String): Unit = js.native
    def find(needle: String, options: js.UndefOr[scala.Nothing], animate: Boolean): Unit = js.native
    def find(needle: String, options: PartialSearchOptions): Unit = js.native
    def find(needle: String, options: PartialSearchOptions, animate: Boolean): Unit = js.native
    
    def findNext(): Unit = js.native
    def findNext(options: js.UndefOr[scala.Nothing], animate: Boolean): Unit = js.native
    def findNext(options: PartialSearchOptions): Unit = js.native
    def findNext(options: PartialSearchOptions, animate: Boolean): Unit = js.native
    
    def findPrevious(): Unit = js.native
    def findPrevious(options: js.UndefOr[scala.Nothing], animate: Boolean): Unit = js.native
    def findPrevious(options: PartialSearchOptions): Unit = js.native
    def findPrevious(options: PartialSearchOptions, animate: Boolean): Unit = js.native
    
    def focus(): Unit = js.native
    
    def getAnimatedScroll(): Boolean = js.native
    
    def getBehavioursEnabled(): Boolean = js.native
    
    def getCopyText(): String = js.native
    
    def getCursorPosition(): Point = js.native
    
    def getCursorPositionScreen(): Point = js.native
    
    def getDisplayIndentGuides(): Boolean = js.native
    
    def getDragDelay(): Double = js.native
    
    def getFadeFoldWidgets(): Boolean = js.native
    
    def getFirstVisibleRow(): Double = js.native
    
    def getFontSize(): String = js.native
    
    def getHighlightActiveLine(): Boolean = js.native
    
    def getHighlightGutterLine(): Boolean = js.native
    
    def getHighlightSelectedWord(): Boolean = js.native
    
    def getKeyboardHandler(): String = js.native
    
    def getLastSearchOptions(): PartialSearchOptions = js.native
    
    def getLastVisibleRow(): Double = js.native
    
    def getOption(name: String): js.Any = js.native
    @JSName("getOption")
    def getOption_animatedScroll(name: animatedScroll): Boolean = js.native
    @JSName("getOption")
    def getOption_autoScrollEditorIntoView(name: autoScrollEditorIntoView): Boolean = js.native
    @JSName("getOption")
    def getOption_behavioursEnabled(name: behavioursEnabled): Boolean = js.native
    @JSName("getOption")
    def getOption_copyWithEmptySelection(name: copyWithEmptySelection): Boolean = js.native
    @JSName("getOption")
    def getOption_cursorStyle(name: cursorStyle): ace | slim | smooth | wide = js.native
    @JSName("getOption")
    def getOption_displayIndentGuides(name: displayIndentGuides): Boolean = js.native
    @JSName("getOption")
    def getOption_dragDelay(name: dragDelay): Double = js.native
    @JSName("getOption")
    def getOption_dragEnabled(name: dragEnabled): Boolean = js.native
    @JSName("getOption")
    def getOption_enableAutoIndent(name: enableAutoIndent): Boolean = js.native
    @JSName("getOption")
    def getOption_fadeFoldWidgets(name: fadeFoldWidgets): Boolean = js.native
    @JSName("getOption")
    def getOption_firstLineNumber(name: firstLineNumber): Double = js.native
    @JSName("getOption")
    def getOption_fixedWidthGutter(name: fixedWidthGutter): Boolean = js.native
    @JSName("getOption")
    def getOption_focusTimeout(name: focusTimeout): Double = js.native
    @JSName("getOption")
    def getOption_foldStyle(name: foldStyle): markbegin | markbeginend | manual = js.native
    @JSName("getOption")
    def getOption_fontFamily(name: fontFamily): String = js.native
    @JSName("getOption")
    def getOption_fontSize(name: fontSize): Double = js.native
    @JSName("getOption")
    def getOption_hScrollBarAlwaysVisible(name: hScrollBarAlwaysVisible): Boolean = js.native
    @JSName("getOption")
    def getOption_hasCssTransforms(name: hasCssTransforms): Boolean = js.native
    @JSName("getOption")
    def getOption_highlightActiveLine(name: highlightActiveLine): Boolean = js.native
    @JSName("getOption")
    def getOption_highlightGutterLine(name: highlightGutterLine): Boolean = js.native
    @JSName("getOption")
    def getOption_highlightSelectedWord(name: highlightSelectedWord): Boolean = js.native
    @JSName("getOption")
    def getOption_indentedSoftWrap(name: indentedSoftWrap): Boolean = js.native
    @JSName("getOption")
    def getOption_keyboardHandler(name: keyboardHandler): String = js.native
    @JSName("getOption")
    def getOption_maxLines(name: maxLines): Double = js.native
    @JSName("getOption")
    def getOption_maxPixelHeight(name: maxPixelHeight): Double = js.native
    @JSName("getOption")
    def getOption_mergeUndoDeltas(name: mergeUndoDeltas): `true` | `false` | always = js.native
    @JSName("getOption")
    def getOption_minLines(name: minLines): Double = js.native
    @JSName("getOption")
    def getOption_mode(name: mode): String = js.native
    @JSName("getOption")
    def getOption_navigateWithinSoftTabs(name: navigateWithinSoftTabs): Boolean = js.native
    @JSName("getOption")
    def getOption_newLineMode(name: newLineMode): NewLineMode = js.native
    @JSName("getOption")
    def getOption_overwrite(name: overwrite): Boolean = js.native
    @JSName("getOption")
    def getOption_placeholder(name: placeholder): String = js.native
    @JSName("getOption")
    def getOption_printMargin(name: printMargin): Boolean | Double = js.native
    @JSName("getOption")
    def getOption_printMarginColumn(name: printMarginColumn): Double = js.native
    @JSName("getOption")
    def getOption_readOnly(name: readOnly): Boolean = js.native
    @JSName("getOption")
    def getOption_scrollPastEnd(name: scrollPastEnd): Boolean = js.native
    @JSName("getOption")
    def getOption_scrollSpeed(name: scrollSpeed): Double = js.native
    @JSName("getOption")
    def getOption_selectionStyle(name: selectionStyle): String = js.native
    @JSName("getOption")
    def getOption_session(name: session): EditSession = js.native
    @JSName("getOption")
    def getOption_showFoldWidgets(name: showFoldWidgets): Boolean = js.native
    @JSName("getOption")
    def getOption_showGutter(name: showGutter): Boolean = js.native
    @JSName("getOption")
    def getOption_showInvisibles(name: showInvisibles): Boolean = js.native
    @JSName("getOption")
    def getOption_showLineNumbers(name: showLineNumbers): Boolean = js.native
    @JSName("getOption")
    def getOption_showPrintMargin(name: showPrintMargin): Boolean = js.native
    @JSName("getOption")
    def getOption_tabSize(name: tabSize): Double = js.native
    @JSName("getOption")
    def getOption_theme(name: theme): String = js.native
    @JSName("getOption")
    def getOption_tooltipFollowsMouse(name: tooltipFollowsMouse): Boolean = js.native
    @JSName("getOption")
    def getOption_useSoftTabs(name: useSoftTabs): Boolean = js.native
    @JSName("getOption")
    def getOption_useWorker(name: useWorker): Boolean = js.native
    @JSName("getOption")
    def getOption_vScrollBarAlwaysVisible(name: vScrollBarAlwaysVisible): Boolean = js.native
    @JSName("getOption")
    def getOption_value(name: value): String = js.native
    @JSName("getOption")
    def getOption_wrap(name: wrap): off | free | printmargin_ | Boolean | Double = js.native
    @JSName("getOption")
    def getOption_wrapBehavioursEnabled(name: wrapBehavioursEnabled): Boolean = js.native
    @JSName("getOption")
    def getOption_wrapMethod(name: wrapMethod): code | text | auto = js.native
    
    def getOptions(): StringDictionary[js.Any] = js.native
    def getOptions(optionNames: js.Array[String]): StringDictionary[js.Any] = js.native
    def getOptions(optionNames: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
    
    def getOverwrite(): Boolean = js.native
    
    def getPrintMarginColumn(): Double = js.native
    
    def getReadOnly(): Boolean = js.native
    
    def getScrollSpeed(): Double = js.native
    
    def getSelectedText(): String = js.native
    
    def getSelection(): Selection = js.native
    
    def getSelectionRange(): Range = js.native
    
    def getSelectionStyle(): String = js.native
    
    def getSession(): EditSession = js.native
    
    def getShowFoldWidgets(): Boolean = js.native
    
    def getShowInvisibles(): Boolean = js.native
    
    def getShowPrintMargin(): Boolean = js.native
    
    def getTheme(): String = js.native
    
    def getValue(): String = js.native
    
    def getWrapBehavioursEnabled(): Boolean = js.native
    
    def gotoLine(lineNumber: Double, column: Double, animate: Boolean): Unit = js.native
    
    def gotoPageDown(): Unit = js.native
    
    def gotoPageUp(): Unit = js.native
    
    var id: String = js.native
    
    def indent(): Unit = js.native
    
    def insert(text: String): Unit = js.native
    def insert(text: String, pasted: Boolean): Unit = js.native
    
    def isFocused(): Boolean = js.native
    
    def isRowFullyVisible(row: Double): Boolean = js.native
    
    def isRowVisible(row: Double): Boolean = js.native
    
    def jumpToMatching(select: Boolean, expand: Boolean): Unit = js.native
    
    var keyBinding: KeyBinding = js.native
    
    def modifyNumber(amount: Double): Unit = js.native
    
    def moveCursorTo(row: Double, column: Double): Unit = js.native
    
    def moveCursorToPosition(pos: Point): Unit = js.native
    
    def moveLinesDown(): Unit = js.native
    
    def moveLinesUp(): Unit = js.native
    
    def moveText(range: Range, toPosition: Point): Range = js.native
    def moveText(range: Range, toPosition: Point, copy: Boolean): Range = js.native
    
    def navigateDown(): Unit = js.native
    
    def navigateFileEnd(): Unit = js.native
    
    def navigateFileStart(): Unit = js.native
    
    def navigateLeft(): Unit = js.native
    
    def navigateLineEnd(): Unit = js.native
    
    def navigateLineStart(): Unit = js.native
    
    def navigateRight(): Unit = js.native
    
    def navigateTo(row: Double, column: Double): Unit = js.native
    
    def navigateUp(): Unit = js.native
    
    def navigateWordLeft(): Unit = js.native
    
    def navigateWordRight(): Unit = js.native
    
    def off(name: String, callback: js.Function): Unit = js.native
    
    def on(name: String, callback: js.Function): Unit = js.native
    def on(name: String, callback: js.Function, capturing: Boolean): Unit = js.native
    @JSName("on")
    def on_blur(name: blur, callback: js.Function1[/* e */ Event, Unit]): js.Function = js.native
    @JSName("on")
    def on_change(name: change, callback: js.Function1[/* delta */ Delta, Unit]): js.Function = js.native
    @JSName("on")
    def on_changeSelectionStyle(name: changeSelectionStyle, callback: js.Function1[/* obj */ DataString, Unit]): js.Function = js.native
    @JSName("on")
    def on_changeSession(name: changeSession, callback: js.Function1[/* obj */ OldSession, Unit]): js.Function = js.native
    @JSName("on")
    def on_copy(name: copy, callback: js.Function1[/* obj */ Text, Unit]): js.Function = js.native
    @JSName("on")
    def on_focus(name: focus, callback: js.Function1[/* e */ Event, Unit]): js.Function = js.native
    @JSName("on")
    def on_input(name: input, callback: js.Function0[Unit]): js.Function = js.native
    @JSName("on")
    def on_paste(name: paste, callback: js.Function1[/* obj */ Text, Unit]): js.Function = js.native
    
    def once(name: String, callback: js.Function): Unit = js.native
    
    def redo(): Unit = js.native
    
    def remove(): Unit = js.native
    
    def removeDefaultHandler(name: String, callback: js.Function): Unit = js.native
    
    def removeEventListener(name: String, callback: js.Function): Unit = js.native
    
    def removeLineToEnd(): Unit = js.native
    
    def removeLines(): Unit = js.native
    
    def removeListener(name: String, callback: js.Function): Unit = js.native
    
    def removeWordLeft(): Unit = js.native
    
    def removeWordRight(): Unit = js.native
    
    @JSName("remove")
    def remove_left(dir: left): Unit = js.native
    @JSName("remove")
    def remove_right(dir: right): Unit = js.native
    
    var renderer: VirtualRenderer with IRenderer = js.native
    
    def replace(replacement: String): Double = js.native
    def replace(replacement: String, options: PartialSearchOptions): Double = js.native
    
    def replaceAll(replacement: String): Double = js.native
    def replaceAll(replacement: String, options: PartialSearchOptions): Double = js.native
    
    def resize(): Unit = js.native
    def resize(force: Boolean): Unit = js.native
    
    def scrollPageDown(): Unit = js.native
    
    def scrollPageUp(): Unit = js.native
    
    def scrollToLine(line: Double, center: Boolean, animate: Boolean, callback: js.Function0[Unit]): Unit = js.native
    
    def scrollToRow(row: Double): Unit = js.native
    
    def selectAll(): Unit = js.native
    
    def selectPageDown(): Unit = js.native
    
    def selectPageUp(): Unit = js.native
    
    var selection: Selection = js.native
    
    var session: EditSession = js.native
    
    def setAnimatedScroll(shouldAnimate: Boolean): Unit = js.native
    
    def setAutoScrollEditorIntoView(enable: Boolean): Unit = js.native
    
    def setBehavioursEnabled(enabled: Boolean): Unit = js.native
    
    def setDefaultHandler(name: String, callback: js.Function): Unit = js.native
    
    def setDisplayIndentGuides(display: Boolean): Unit = js.native
    
    def setDragDelay(dragDelay: Double): Unit = js.native
    
    def setFadeFoldWidgets(fade: Boolean): Unit = js.native
    
    def setFontSize(size: String): Unit = js.native
    
    def setHighlightActiveLine(shouldHighlight: Boolean): Unit = js.native
    
    def setHighlightGutterLine(shouldHighlight: Boolean): Unit = js.native
    
    def setHighlightSelectedWord(shouldHighlight: Boolean): Unit = js.native
    
    def setKeyboardHandler(keyboardHandler: String): Unit = js.native
    def setKeyboardHandler(keyboardHandler: String, callback: js.Function0[Unit]): Unit = js.native
    
    def setOption(name: String, value: js.Any): Unit = js.native
    def setOption(name: cursorStyle, value: ace): Unit = js.native
    def setOption(name: cursorStyle, value: slim): Unit = js.native
    def setOption(name: cursorStyle, value: smooth): Unit = js.native
    def setOption(name: cursorStyle, value: wide): Unit = js.native
    def setOption(name: foldStyle, value: manual): Unit = js.native
    def setOption(name: foldStyle, value: markbegin): Unit = js.native
    def setOption(name: foldStyle, value: markbeginend): Unit = js.native
    def setOption(name: mergeUndoDeltas, value: `false`): Unit = js.native
    def setOption(name: mergeUndoDeltas, value: `true`): Unit = js.native
    def setOption(name: mergeUndoDeltas, value: always): Unit = js.native
    def setOption(name: wrapMethod, value: auto): Unit = js.native
    def setOption(name: wrapMethod, value: code): Unit = js.native
    def setOption(name: wrapMethod, value: text): Unit = js.native
    def setOption(name: wrap, value: free): Unit = js.native
    def setOption(name: wrap, value: off): Unit = js.native
    def setOption(name: wrap, value: printmargin_): Unit = js.native
    @JSName("setOption")
    def setOption_animatedScroll(name: animatedScroll, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_autoScrollEditorIntoView(name: autoScrollEditorIntoView, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_behavioursEnabled(name: behavioursEnabled, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_copyWithEmptySelection(name: copyWithEmptySelection, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_displayIndentGuides(name: displayIndentGuides, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_dragDelay(name: dragDelay, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_dragEnabled(name: dragEnabled, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_enableAutoIndent(name: enableAutoIndent, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_fadeFoldWidgets(name: fadeFoldWidgets, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_firstLineNumber(name: firstLineNumber, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_fixedWidthGutter(name: fixedWidthGutter, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_focusTimeout(name: focusTimeout, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_fontFamily(name: fontFamily, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_fontSize(name: fontSize, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_hScrollBarAlwaysVisible(name: hScrollBarAlwaysVisible, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_hasCssTransforms(name: hasCssTransforms, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_highlightActiveLine(name: highlightActiveLine, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_highlightGutterLine(name: highlightGutterLine, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_highlightSelectedWord(name: highlightSelectedWord, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_indentedSoftWrap(name: indentedSoftWrap, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_keyboardHandler(name: keyboardHandler, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_maxLines(name: maxLines, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_maxPixelHeight(name: maxPixelHeight, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_minLines(name: minLines, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_mode(name: mode, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_navigateWithinSoftTabs(name: navigateWithinSoftTabs, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_newLineMode(name: newLineMode, value: NewLineMode): Unit = js.native
    @JSName("setOption")
    def setOption_overwrite(name: overwrite, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_placeholder(name: placeholder, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_printMargin(name: printMargin, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_printMargin(name: printMargin, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_printMarginColumn(name: printMarginColumn, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_readOnly(name: readOnly, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_scrollPastEnd(name: scrollPastEnd, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_scrollSpeed(name: scrollSpeed, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_selectionStyle(name: selectionStyle, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_session(name: session, value: EditSession): Unit = js.native
    @JSName("setOption")
    def setOption_showFoldWidgets(name: showFoldWidgets, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showGutter(name: showGutter, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showInvisibles(name: showInvisibles, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showLineNumbers(name: showLineNumbers, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_showPrintMargin(name: showPrintMargin, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_tabSize(name: tabSize, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_theme(name: theme, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_tooltipFollowsMouse(name: tooltipFollowsMouse, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_useSoftTabs(name: useSoftTabs, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_useWorker(name: useWorker, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_vScrollBarAlwaysVisible(name: vScrollBarAlwaysVisible, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_value(name: value, value: String): Unit = js.native
    @JSName("setOption")
    def setOption_wrap(name: wrap, value: Boolean): Unit = js.native
    @JSName("setOption")
    def setOption_wrap(name: wrap, value: Double): Unit = js.native
    @JSName("setOption")
    def setOption_wrapBehavioursEnabled(name: wrapBehavioursEnabled, value: Boolean): Unit = js.native
    
    def setOptions(optList: StringDictionary[js.Any]): Unit = js.native
    
    def setOverwrite(overwrite: Boolean): Unit = js.native
    
    def setPrintMarginColumn(showPrintMargin: Double): Unit = js.native
    
    def setReadOnly(readOnly: Boolean): Unit = js.native
    
    def setScrollSpeed(speed: Double): Unit = js.native
    
    def setSelectionStyle(`val`: String): Unit = js.native
    
    def setSession(session: EditSession): Unit = js.native
    
    def setShowFoldWidgets(show: Boolean): Unit = js.native
    
    def setShowInvisibles(showInvisibles: Boolean): Unit = js.native
    
    def setShowPrintMargin(showPrintMargin: Boolean): Unit = js.native
    
    def setStyle(style: String): Unit = js.native
    
    def setTheme(theme: String): Unit = js.native
    def setTheme(theme: String, callback: js.Function0[Unit]): Unit = js.native
    
    def setValue(`val`: String): String = js.native
    def setValue(`val`: String, cursorPos: Double): String = js.native
    
    def setWrapBehavioursEnabled(enabled: Boolean): Unit = js.native
    
    def sortLines(): Unit = js.native
    
    def splitLine(): Unit = js.native
    
    def toLowerCase(): Unit = js.native
    
    def toUpperCase(): Unit = js.native
    
    def toggleBlockComment(): Unit = js.native
    
    def toggleCommentLines(): Unit = js.native
    
    def toggleOverwrite(): Unit = js.native
    
    def transposeLetters(): Unit = js.native
    
    def undo(): Unit = js.native
    
    def unsetStyle(style: String): Unit = js.native
  }
  
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
  
  @js.native
  trait IAnnotation extends StObject {
    
    var column: Double = js.native
    
    var row: Double = js.native
    
    var text: String = js.native
    
    var `type`: String = js.native
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
  
  @js.native
  trait ICommand extends StObject {
    
    var bindKey: ICommandBindKey = js.native
    
    var exec: String | ICommandExecFunction = js.native
    
    var name: String = js.native
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
  
  @js.native
  trait ICommandBindKey extends StObject {
    
    var mac: String = js.native
    
    var win: String = js.native
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
  
  @js.native
  trait ICommandManager extends StObject {
    
    def addCommand(command: js.Any): Unit = js.native
    
    def addCommands(commands: js.Array[_]): Unit = js.native
    
    var bindKey: js.UndefOr[js.Function2[/* bindKey */ js.Any, /* command */ js.Any, Unit]] = js.native
    
    var byName: js.Any = js.native
    
    var commands: js.Any = js.native
    
    def exec(name: String, editor: js.Any, args: js.Any): Unit = js.native
    
    var platform: String = js.native
  }
  object ICommandManager {
    
    @scala.inline
    def apply(
      addCommand: js.Any => Unit,
      addCommands: js.Array[_] => Unit,
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
      def setAddCommands(value: js.Array[_] => Unit): Self = StObject.set(x, "addCommands", js.Any.fromFunction1(value))
      
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
  
  @js.native
  trait IEditorProps
    extends /* index */ StringDictionary[js.Any] {
    
    @JSName("$blockScrolling")
    var $blockScrolling: js.UndefOr[Double | Boolean] = js.native
    
    @JSName("$blockSelectEnabled")
    var $blockSelectEnabled: js.UndefOr[Boolean] = js.native
    
    @JSName("$enableBlockSelect")
    var $enableBlockSelect: js.UndefOr[Boolean] = js.native
    
    @JSName("$enableMultiselect")
    var $enableMultiselect: js.UndefOr[Boolean] = js.native
    
    @JSName("$highlightPending")
    var $highlightPending: js.UndefOr[Boolean] = js.native
    
    @JSName("$highlightTagPending")
    var $highlightTagPending: js.UndefOr[Boolean] = js.native
    
    @JSName("$multiselectOnSessionChange")
    var $multiselectOnSessionChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onAddRange")
    var $onAddRange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onChangeAnnotation")
    var $onChangeAnnotation: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onChangeBackMarker")
    var $onChangeBackMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onChangeBreakpoint")
    var $onChangeBreakpoint: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onChangeFold")
    var $onChangeFold: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onChangeFrontMarker")
    var $onChangeFrontMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onChangeMode")
    var $onChangeMode: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onChangeTabSize")
    var $onChangeTabSize: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onChangeWrapLimit")
    var $onChangeWrapLimit: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onChangeWrapMode")
    var $onChangeWrapMode: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onCursorChange")
    var $onCursorChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onDocumentChange")
    var $onDocumentChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onMultiSelect")
    var $onMultiSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onRemoveRange")
    var $onRemoveRange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onScrollLeftChange")
    var $onScrollLeftChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onScrollTopChange")
    var $onScrollTopChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onSelectionChange")
    var $onSelectionChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onSingleSelect")
    var $onSingleSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    @JSName("$onTokenizerUpdate")
    var $onTokenizerUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
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
      def set$multiselectOnSessionChange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$multiselectOnSessionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$multiselectOnSessionChangeUndefined: Self = StObject.set(x, "$multiselectOnSessionChange", js.undefined)
      
      @scala.inline
      def set$onAddRange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onAddRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onAddRangeUndefined: Self = StObject.set(x, "$onAddRange", js.undefined)
      
      @scala.inline
      def set$onChangeAnnotation(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onChangeAnnotation", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeAnnotationUndefined: Self = StObject.set(x, "$onChangeAnnotation", js.undefined)
      
      @scala.inline
      def set$onChangeBackMarker(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onChangeBackMarker", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeBackMarkerUndefined: Self = StObject.set(x, "$onChangeBackMarker", js.undefined)
      
      @scala.inline
      def set$onChangeBreakpoint(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onChangeBreakpoint", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeBreakpointUndefined: Self = StObject.set(x, "$onChangeBreakpoint", js.undefined)
      
      @scala.inline
      def set$onChangeFold(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onChangeFold", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeFoldUndefined: Self = StObject.set(x, "$onChangeFold", js.undefined)
      
      @scala.inline
      def set$onChangeFrontMarker(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onChangeFrontMarker", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeFrontMarkerUndefined: Self = StObject.set(x, "$onChangeFrontMarker", js.undefined)
      
      @scala.inline
      def set$onChangeMode(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onChangeMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeModeUndefined: Self = StObject.set(x, "$onChangeMode", js.undefined)
      
      @scala.inline
      def set$onChangeTabSize(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onChangeTabSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeTabSizeUndefined: Self = StObject.set(x, "$onChangeTabSize", js.undefined)
      
      @scala.inline
      def set$onChangeWrapLimit(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onChangeWrapLimit", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeWrapLimitUndefined: Self = StObject.set(x, "$onChangeWrapLimit", js.undefined)
      
      @scala.inline
      def set$onChangeWrapMode(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onChangeWrapMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onChangeWrapModeUndefined: Self = StObject.set(x, "$onChangeWrapMode", js.undefined)
      
      @scala.inline
      def set$onCursorChange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onCursorChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onCursorChangeUndefined: Self = StObject.set(x, "$onCursorChange", js.undefined)
      
      @scala.inline
      def set$onDocumentChange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onDocumentChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onDocumentChangeUndefined: Self = StObject.set(x, "$onDocumentChange", js.undefined)
      
      @scala.inline
      def set$onMultiSelect(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onMultiSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onMultiSelectUndefined: Self = StObject.set(x, "$onMultiSelect", js.undefined)
      
      @scala.inline
      def set$onRemoveRange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onRemoveRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onRemoveRangeUndefined: Self = StObject.set(x, "$onRemoveRange", js.undefined)
      
      @scala.inline
      def set$onScrollLeftChange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onScrollLeftChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onScrollLeftChangeUndefined: Self = StObject.set(x, "$onScrollLeftChange", js.undefined)
      
      @scala.inline
      def set$onScrollTopChange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onScrollTopChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onScrollTopChangeUndefined: Self = StObject.set(x, "$onScrollTopChange", js.undefined)
      
      @scala.inline
      def set$onSelectionChange(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onSelectionChangeUndefined: Self = StObject.set(x, "$onSelectionChange", js.undefined)
      
      @scala.inline
      def set$onSingleSelect(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onSingleSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onSingleSelectUndefined: Self = StObject.set(x, "$onSingleSelect", js.undefined)
      
      @scala.inline
      def set$onTokenizerUpdate(value: /* repeated */ js.Any => _): Self = StObject.set(x, "$onTokenizerUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$onTokenizerUpdateUndefined: Self = StObject.set(x, "$onTokenizerUpdate", js.undefined)
    }
  }
  
  @js.native
  trait IMarker extends StObject {
    
    var className: String = js.native
    
    var endCol: Double = js.native
    
    var endRow: Double = js.native
    
    var inFront: js.UndefOr[Boolean] = js.native
    
    var startCol: Double = js.native
    
    var startRow: Double = js.native
    
    var `type`: fullLine | screenLine | text | MarkerRenderer = js.native
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
  trait IRenderer extends VirtualRenderer {
    
    var placeholderNode: js.UndefOr[HTMLDivElement] = js.native
    
    var scroller: js.UndefOr[HTMLDivElement] = js.native
  }
}
