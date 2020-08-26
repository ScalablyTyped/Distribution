package typings.reactAce.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.aceBuilds.anon.DataString
import typings.aceBuilds.anon.OldSession
import typings.aceBuilds.anon.PartialSearchOptions
import typings.aceBuilds.anon.Text
import typings.aceBuilds.mod.Ace.CommandManager
import typings.aceBuilds.mod.Ace.Completer
import typings.aceBuilds.mod.Ace.Delta
import typings.aceBuilds.mod.Ace.EditSession
import typings.aceBuilds.mod.Ace.KeyBinding
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
import typings.reactAce.reactAceStrings.hScrollBarAlwaysVisible
import typings.reactAce.reactAceStrings.hasCssTransforms
import typings.reactAce.reactAceStrings.highlightActiveLine
import typings.reactAce.reactAceStrings.highlightGutterLine
import typings.reactAce.reactAceStrings.highlightSelectedWord
import typings.reactAce.reactAceStrings.indentedSoftWrap
import typings.reactAce.reactAceStrings.input
import typings.reactAce.reactAceStrings.keyboardHandler
import typings.reactAce.reactAceStrings.left
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
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ace-builds.ace-builds.Ace.Editor & {  renderer :react-ace.react-ace/lib/types.IRenderer, [index: string] : any} */
@js.native
trait IAceEditor
  extends /* index */ StringDictionary[js.Any] {
  var commands: CommandManager = js.native
  var completers: js.Array[Completer] = js.native
  var container: HTMLElement = js.native
  var id: String = js.native
  var keyBinding: KeyBinding = js.native
  var renderer: VirtualRenderer with IRenderer = js.native
  var selection: Selection = js.native
  var session: EditSession = js.native
  def addEventListener(name: String, callback: js.Function): Unit = js.native
  def addEventListener(name: String, callback: js.Function, capturing: Boolean): Unit = js.native
  def blockIndent(): Unit = js.native
  def blockOutdent(): Unit = js.native
  def blur(): Unit = js.native
  def centerSelection(): Unit = js.native
  def clearSelection(): Unit = js.native
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
  def indent(): Unit = js.native
  def insert(text: String): Unit = js.native
  def insert(text: String, pasted: Boolean): Unit = js.native
  def isFocused(): Boolean = js.native
  def isRowFullyVisible(row: Double): Boolean = js.native
  def isRowVisible(row: Double): Boolean = js.native
  def jumpToMatching(select: Boolean, expand: Boolean): Unit = js.native
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

