package typings.reactMonacoEditor.anon

import typings.monacoEditor.mod.editor.AccessibilitySupport
import typings.monacoEditor.mod.editor.EditorAutoClosingOvertypeStrategy
import typings.monacoEditor.mod.editor.EditorAutoClosingStrategy
import typings.monacoEditor.mod.editor.EditorAutoIndentStrategy
import typings.monacoEditor.mod.editor.EditorAutoSurroundStrategy
import typings.monacoEditor.mod.editor.EditorCommentsOptions
import typings.monacoEditor.mod.editor.EditorFindOptions
import typings.monacoEditor.mod.editor.EditorHoverOptions
import typings.monacoEditor.mod.editor.EditorLayoutInfo
import typings.monacoEditor.mod.editor.EditorLightbulbOptions
import typings.monacoEditor.mod.editor.EditorMinimapOptions
import typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter
import typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter
import typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize
import typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport
import typings.monacoEditor.mod.editor.EditorOption.ariaLabel
import typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets
import typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype
import typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes
import typings.monacoEditor.mod.editor.EditorOption.autoIndent
import typings.monacoEditor.mod.editor.EditorOption.autoSurround
import typings.monacoEditor.mod.editor.EditorOption.automaticLayout
import typings.monacoEditor.mod.editor.EditorOption.codeLens
import typings.monacoEditor.mod.editor.EditorOption.colorDecorators
import typings.monacoEditor.mod.editor.EditorOption.comments
import typings.monacoEditor.mod.editor.EditorOption.contextmenu
import typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting
import typings.monacoEditor.mod.editor.EditorOption.cursorBlinking
import typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation
import typings.monacoEditor.mod.editor.EditorOption.cursorStyle
import typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines
import typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle
import typings.monacoEditor.mod.editor.EditorOption.cursorWidth
import typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting
import typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations
import typings.monacoEditor.mod.editor.EditorOption.dragAndDrop
import typings.monacoEditor.mod.editor.EditorOption.editorClassName
import typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard
import typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName
import typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity
import typings.monacoEditor.mod.editor.EditorOption.find
import typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets
import typings.monacoEditor.mod.editor.EditorOption.folding
import typings.monacoEditor.mod.editor.EditorOption.foldingHighlight
import typings.monacoEditor.mod.editor.EditorOption.foldingStrategy
import typings.monacoEditor.mod.editor.EditorOption.fontFamily
import typings.monacoEditor.mod.editor.EditorOption.fontInfo
import typings.monacoEditor.mod.editor.EditorOption.fontLigatures
import typings.monacoEditor.mod.editor.EditorOption.fontSize
import typings.monacoEditor.mod.editor.EditorOption.fontWeight
import typings.monacoEditor.mod.editor.EditorOption.formatOnPaste
import typings.monacoEditor.mod.editor.EditorOption.formatOnType
import typings.monacoEditor.mod.editor.EditorOption.glyphMargin
import typings.monacoEditor.mod.editor.EditorOption.gotoLocation
import typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler
import typings.monacoEditor.mod.editor.EditorOption.highlightActiveIndentGuide
import typings.monacoEditor.mod.editor.EditorOption.hover
import typings.monacoEditor.mod.editor.EditorOption.inDiffEditor
import typings.monacoEditor.mod.editor.EditorOption.layoutInfo
import typings.monacoEditor.mod.editor.EditorOption.letterSpacing
import typings.monacoEditor.mod.editor.EditorOption.lightbulb
import typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth
import typings.monacoEditor.mod.editor.EditorOption.lineHeight
import typings.monacoEditor.mod.editor.EditorOption.lineNumbers
import typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars
import typings.monacoEditor.mod.editor.EditorOption.links
import typings.monacoEditor.mod.editor.EditorOption.matchBrackets
import typings.monacoEditor.mod.editor.EditorOption.minimap
import typings.monacoEditor.mod.editor.EditorOption.mouseStyle
import typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity
import typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom
import typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping
import typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier
import typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste
import typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight
import typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder
import typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes
import typings.monacoEditor.mod.editor.EditorOption.parameterHints
import typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus
import typings.monacoEditor.mod.editor.EditorOption.pixelRatio
import typings.monacoEditor.mod.editor.EditorOption.quickSuggestions
import typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay
import typings.monacoEditor.mod.editor.EditorOption.readOnly
import typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters
import typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline
import typings.monacoEditor.mod.editor.EditorOption.renderIndentGuides
import typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight
import typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations
import typings.monacoEditor.mod.editor.EditorOption.renderWhitespace
import typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding
import typings.monacoEditor.mod.editor.EditorOption.roundedSelection
import typings.monacoEditor.mod.editor.EditorOption.rulers
import typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn
import typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine
import typings.monacoEditor.mod.editor.EditorOption.scrollbar
import typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers
import typings.monacoEditor.mod.editor.EditorOption.selectionClipboard
import typings.monacoEditor.mod.editor.EditorOption.selectionHighlight
import typings.monacoEditor.mod.editor.EditorOption.showFoldingControls
import typings.monacoEditor.mod.editor.EditorOption.showUnused
import typings.monacoEditor.mod.editor.EditorOption.smoothScrolling
import typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions
import typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter
import typings.monacoEditor.mod.editor.EditorOption.suggest
import typings.monacoEditor.mod.editor.EditorOption.suggestFontSize
import typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight
import typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters
import typings.monacoEditor.mod.editor.EditorOption.suggestSelection
import typings.monacoEditor.mod.editor.EditorOption.tabCompletion
import typings.monacoEditor.mod.editor.EditorOption.tabFocusMode
import typings.monacoEditor.mod.editor.EditorOption.useTabStops
import typings.monacoEditor.mod.editor.EditorOption.wordSeparators
import typings.monacoEditor.mod.editor.EditorOption.wordWrap
import typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters
import typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters
import typings.monacoEditor.mod.editor.EditorOption.wordWrapMinified
import typings.monacoEditor.mod.editor.EditorOption.wrappingIndent
import typings.monacoEditor.mod.editor.EditorOption.wrappingInfo
import typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy
import typings.monacoEditor.mod.editor.EditorWrappingInfo
import typings.monacoEditor.mod.editor.FontInfo
import typings.monacoEditor.mod.editor.GoToLocationOptions
import typings.monacoEditor.mod.editor.IEditorOption
import typings.monacoEditor.mod.editor.InternalEditorRenderLineNumbersOptions
import typings.monacoEditor.mod.editor.InternalEditorScrollbarOptions
import typings.monacoEditor.mod.editor.InternalParameterHintOptions
import typings.monacoEditor.mod.editor.InternalSuggestOptions
import typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle
import typings.monacoEditor.mod.editor.TextEditorCursorStyle
import typings.monacoEditor.mod.editor.ValidQuickSuggestionsOptions
import typings.monacoEditor.mod.editor.WrappingIndent
import typings.reactMonacoEditor.reactMonacoEditorStrings.`inline`
import typings.reactMonacoEditor.reactMonacoEditorStrings.advanced
import typings.reactMonacoEditor.reactMonacoEditorStrings.all
import typings.reactMonacoEditor.reactMonacoEditorStrings.altKey
import typings.reactMonacoEditor.reactMonacoEditorStrings.always
import typings.reactMonacoEditor.reactMonacoEditorStrings.auto
import typings.reactMonacoEditor.reactMonacoEditorStrings.bottom
import typings.reactMonacoEditor.reactMonacoEditorStrings.boundary
import typings.reactMonacoEditor.reactMonacoEditorStrings.bounded
import typings.reactMonacoEditor.reactMonacoEditorStrings.copy
import typings.reactMonacoEditor.reactMonacoEditorStrings.ctrlKey
import typings.reactMonacoEditor.reactMonacoEditorStrings.default
import typings.reactMonacoEditor.reactMonacoEditorStrings.editable
import typings.reactMonacoEditor.reactMonacoEditorStrings.editor
import typings.reactMonacoEditor.reactMonacoEditorStrings.first
import typings.reactMonacoEditor.reactMonacoEditorStrings.full
import typings.reactMonacoEditor.reactMonacoEditorStrings.gutter
import typings.reactMonacoEditor.reactMonacoEditorStrings.indentation
import typings.reactMonacoEditor.reactMonacoEditorStrings.line
import typings.reactMonacoEditor.reactMonacoEditorStrings.metaKey
import typings.reactMonacoEditor.reactMonacoEditorStrings.mouseover
import typings.reactMonacoEditor.reactMonacoEditorStrings.near
import typings.reactMonacoEditor.reactMonacoEditorStrings.never
import typings.reactMonacoEditor.reactMonacoEditorStrings.none
import typings.reactMonacoEditor.reactMonacoEditorStrings.off
import typings.reactMonacoEditor.reactMonacoEditorStrings.on
import typings.reactMonacoEditor.reactMonacoEditorStrings.onlySnippets
import typings.reactMonacoEditor.reactMonacoEditorStrings.recentlyUsed
import typings.reactMonacoEditor.reactMonacoEditorStrings.recentlyUsedByPrefix
import typings.reactMonacoEditor.reactMonacoEditorStrings.selection
import typings.reactMonacoEditor.reactMonacoEditorStrings.simple
import typings.reactMonacoEditor.reactMonacoEditorStrings.smart
import typings.reactMonacoEditor.reactMonacoEditorStrings.spread
import typings.reactMonacoEditor.reactMonacoEditorStrings.text
import typings.reactMonacoEditor.reactMonacoEditorStrings.top
import typings.reactMonacoEditor.reactMonacoEditorStrings.tree
import typings.reactMonacoEditor.reactMonacoEditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptSuggestionOnCommitCharacter extends js.Object {
  var acceptSuggestionOnCommitCharacter: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter, 
    Boolean
  ] = js.native
  var acceptSuggestionOnEnter: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter, 
    on | off | smart
  ] = js.native
  var accessibilityPageSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize, Double] = js.native
  var accessibilitySupport: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport, 
    AccessibilitySupport
  ] = js.native
  var ariaLabel: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.ariaLabel, String] = js.native
  var autoClosingBrackets: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets, 
    EditorAutoClosingStrategy
  ] = js.native
  var autoClosingOvertype: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype, 
    EditorAutoClosingOvertypeStrategy
  ] = js.native
  var autoClosingQuotes: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes, 
    EditorAutoClosingStrategy
  ] = js.native
  var autoIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.autoIndent, EditorAutoIndentStrategy] = js.native
  var autoSurround: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoSurround, 
    EditorAutoSurroundStrategy
  ] = js.native
  var automaticLayout: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.automaticLayout, Boolean] = js.native
  var codeLens: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.codeLens, Boolean] = js.native
  var colorDecorators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.colorDecorators, Boolean] = js.native
  var comments: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.comments, EditorCommentsOptions] = js.native
  var contextmenu: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.contextmenu, Boolean] = js.native
  var copyWithSyntaxHighlighting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting, Boolean] = js.native
  var cursorBlinking: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorBlinking, 
    TextEditorCursorBlinkingStyle
  ] = js.native
  var cursorSmoothCaretAnimation: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation, Boolean] = js.native
  var cursorStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorStyle, TextEditorCursorStyle] = js.native
  var cursorSurroundingLines: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines, Double] = js.native
  var cursorSurroundingLinesStyle: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle, 
    default | all
  ] = js.native
  var cursorWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorWidth, Double] = js.native
  var disableLayerHinting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting, Boolean] = js.native
  var disableMonospaceOptimizations: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations, 
    Boolean
  ] = js.native
  var dragAndDrop: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.dragAndDrop, Boolean] = js.native
  var editorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.editorClassName, String] = js.native
  var emptySelectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard, Boolean] = js.native
  var extraEditorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName, String] = js.native
  var fastScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity, Double] = js.native
  var find: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.find, EditorFindOptions] = js.native
  var fixedOverflowWidgets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets, Boolean] = js.native
  var folding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.folding, Boolean] = js.native
  var foldingHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingHighlight, Boolean] = js.native
  var foldingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingStrategy, auto | indentation] = js.native
  var fontFamily: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontFamily, String] = js.native
  var fontInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontInfo, FontInfo] = js.native
  var fontLigatures2: IEditorOption[fontLigatures, String] = js.native
  var fontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontSize, Double] = js.native
  var fontWeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontWeight, String] = js.native
  var formatOnPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnPaste, Boolean] = js.native
  var formatOnType: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnType, Boolean] = js.native
  var glyphMargin: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.glyphMargin, Boolean] = js.native
  var gotoLocation: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.gotoLocation, GoToLocationOptions] = js.native
  var hideCursorInOverviewRuler: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler, Boolean] = js.native
  var highlightActiveIndentGuide: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.highlightActiveIndentGuide, Boolean] = js.native
  var hover: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hover, EditorHoverOptions] = js.native
  var inDiffEditor: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.inDiffEditor, Boolean] = js.native
  var layoutInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.layoutInfo, EditorLayoutInfo] = js.native
  var letterSpacing: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.letterSpacing, Double] = js.native
  var lightbulb: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lightbulb, EditorLightbulbOptions] = js.native
  var lineDecorationsWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth, String | Double] = js.native
  var lineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineHeight, Double] = js.native
  var lineNumbers: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.lineNumbers, 
    InternalEditorRenderLineNumbersOptions
  ] = js.native
  var lineNumbersMinChars: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars, Double] = js.native
  var links: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.links, Boolean] = js.native
  var matchBrackets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.matchBrackets, always | never | near] = js.native
  var minimap: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.minimap, EditorMinimapOptions] = js.native
  var mouseStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseStyle, default | text | copy] = js.native
  var mouseWheelScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity, Double] = js.native
  var mouseWheelZoom: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom, Boolean] = js.native
  var multiCursorMergeOverlapping: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping, Boolean] = js.native
  var multiCursorModifier: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier, 
    altKey | metaKey | ctrlKey
  ] = js.native
  var multiCursorPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste, spread | full] = js.native
  var occurrencesHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight, Boolean] = js.native
  var overviewRulerBorder: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder, Boolean] = js.native
  var overviewRulerLanes: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes, Double] = js.native
  var parameterHints: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.parameterHints, 
    InternalParameterHintOptions
  ] = js.native
  var peekWidgetDefaultFocus: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus, tree | editor] = js.native
  var pixelRatio: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.pixelRatio, Double] = js.native
  var quickSuggestions: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.quickSuggestions, 
    ValidQuickSuggestionsOptions
  ] = js.native
  var quickSuggestionsDelay: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay, Double] = js.native
  var readOnly: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.readOnly, Boolean] = js.native
  var renderControlCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters, Boolean] = js.native
  var renderFinalNewline: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline, Boolean] = js.native
  var renderIndentGuides: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderIndentGuides, Boolean] = js.native
  var renderLineHighlight: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight, 
    all | line | none | gutter
  ] = js.native
  var renderValidationDecorations: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations, 
    on | off | editable
  ] = js.native
  var renderWhitespace: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderWhitespace, 
    all | none | boundary | selection
  ] = js.native
  var revealHorizontalRightPadding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding, Double] = js.native
  var roundedSelection: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.roundedSelection, Boolean] = js.native
  var rulers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.rulers, js.Object] = js.native
  var scrollBeyondLastColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn, Double] = js.native
  var scrollBeyondLastLine: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine, Boolean] = js.native
  var scrollbar: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.scrollbar, 
    InternalEditorScrollbarOptions
  ] = js.native
  var selectOnLineNumbers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers, Boolean] = js.native
  var selectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionClipboard, Boolean] = js.native
  var selectionHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionHighlight, Boolean] = js.native
  var showFoldingControls: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.showFoldingControls, 
    always | mouseover
  ] = js.native
  var showUnused: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.showUnused, Boolean] = js.native
  var smoothScrolling: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.smoothScrolling, Boolean] = js.native
  var snippetSuggestions: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions, 
    none | top | bottom | `inline`
  ] = js.native
  var stopRenderingLineAfter: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter, Double] = js.native
  var suggest: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggest, InternalSuggestOptions] = js.native
  var suggestFontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestFontSize, Double] = js.native
  var suggestLineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight, Double] = js.native
  var suggestOnTriggerCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters, Boolean] = js.native
  var suggestSelection: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.suggestSelection, 
    first | recentlyUsed | recentlyUsedByPrefix
  ] = js.native
  var tabCompletion: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.tabCompletion, 
    on | off | onlySnippets
  ] = js.native
  var tabFocusMode: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.tabFocusMode, Boolean] = js.native
  var useTabStops: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.useTabStops, Boolean] = js.native
  var wordSeparators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordSeparators, String] = js.native
  var wordWrap: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.wordWrap, 
    on | off | wordWrapColumn | bounded
  ] = js.native
  var wordWrapBreakAfterCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters, String] = js.native
  var wordWrapBreakBeforeCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters, String] = js.native
  var wordWrapColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double] = js.native
  var wordWrapMinified: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapMinified, Boolean] = js.native
  var wrappingIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingIndent, WrappingIndent] = js.native
  var wrappingInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingInfo, EditorWrappingInfo] = js.native
  var wrappingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy, simple | advanced] = js.native
}

object AcceptSuggestionOnCommitCharacter {
  @scala.inline
  def apply(
    acceptSuggestionOnCommitCharacter: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean],
    acceptSuggestionOnEnter: IEditorOption[acceptSuggestionOnEnter, on | off | smart],
    accessibilityPageSize: IEditorOption[accessibilityPageSize, Double],
    accessibilitySupport: IEditorOption[accessibilitySupport, AccessibilitySupport],
    ariaLabel: IEditorOption[ariaLabel, String],
    autoClosingBrackets: IEditorOption[autoClosingBrackets, EditorAutoClosingStrategy],
    autoClosingOvertype: IEditorOption[autoClosingOvertype, EditorAutoClosingOvertypeStrategy],
    autoClosingQuotes: IEditorOption[autoClosingQuotes, EditorAutoClosingStrategy],
    autoIndent: IEditorOption[autoIndent, EditorAutoIndentStrategy],
    autoSurround: IEditorOption[autoSurround, EditorAutoSurroundStrategy],
    automaticLayout: IEditorOption[automaticLayout, Boolean],
    codeLens: IEditorOption[codeLens, Boolean],
    colorDecorators: IEditorOption[colorDecorators, Boolean],
    comments: IEditorOption[comments, EditorCommentsOptions],
    contextmenu: IEditorOption[contextmenu, Boolean],
    copyWithSyntaxHighlighting: IEditorOption[copyWithSyntaxHighlighting, Boolean],
    cursorBlinking: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle],
    cursorSmoothCaretAnimation: IEditorOption[cursorSmoothCaretAnimation, Boolean],
    cursorStyle: IEditorOption[cursorStyle, TextEditorCursorStyle],
    cursorSurroundingLines: IEditorOption[cursorSurroundingLines, Double],
    cursorSurroundingLinesStyle: IEditorOption[cursorSurroundingLinesStyle, default | all],
    cursorWidth: IEditorOption[cursorWidth, Double],
    disableLayerHinting: IEditorOption[disableLayerHinting, Boolean],
    disableMonospaceOptimizations: IEditorOption[disableMonospaceOptimizations, Boolean],
    dragAndDrop: IEditorOption[dragAndDrop, Boolean],
    editorClassName: IEditorOption[editorClassName, String],
    emptySelectionClipboard: IEditorOption[emptySelectionClipboard, Boolean],
    extraEditorClassName: IEditorOption[extraEditorClassName, String],
    fastScrollSensitivity: IEditorOption[fastScrollSensitivity, Double],
    find: IEditorOption[find, EditorFindOptions],
    fixedOverflowWidgets: IEditorOption[fixedOverflowWidgets, Boolean],
    folding: IEditorOption[folding, Boolean],
    foldingHighlight: IEditorOption[foldingHighlight, Boolean],
    foldingStrategy: IEditorOption[foldingStrategy, auto | indentation],
    fontFamily: IEditorOption[fontFamily, String],
    fontInfo: IEditorOption[fontInfo, FontInfo],
    fontLigatures2: IEditorOption[fontLigatures, String],
    fontSize: IEditorOption[fontSize, Double],
    fontWeight: IEditorOption[fontWeight, String],
    formatOnPaste: IEditorOption[formatOnPaste, Boolean],
    formatOnType: IEditorOption[formatOnType, Boolean],
    glyphMargin: IEditorOption[glyphMargin, Boolean],
    gotoLocation: IEditorOption[gotoLocation, GoToLocationOptions],
    hideCursorInOverviewRuler: IEditorOption[hideCursorInOverviewRuler, Boolean],
    highlightActiveIndentGuide: IEditorOption[highlightActiveIndentGuide, Boolean],
    hover: IEditorOption[hover, EditorHoverOptions],
    inDiffEditor: IEditorOption[inDiffEditor, Boolean],
    layoutInfo: IEditorOption[layoutInfo, EditorLayoutInfo],
    letterSpacing: IEditorOption[letterSpacing, Double],
    lightbulb: IEditorOption[lightbulb, EditorLightbulbOptions],
    lineDecorationsWidth: IEditorOption[lineDecorationsWidth, String | Double],
    lineHeight: IEditorOption[lineHeight, Double],
    lineNumbers: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions],
    lineNumbersMinChars: IEditorOption[lineNumbersMinChars, Double],
    links: IEditorOption[links, Boolean],
    matchBrackets: IEditorOption[matchBrackets, always | never | near],
    minimap: IEditorOption[minimap, EditorMinimapOptions],
    mouseStyle: IEditorOption[mouseStyle, default | text | copy],
    mouseWheelScrollSensitivity: IEditorOption[mouseWheelScrollSensitivity, Double],
    mouseWheelZoom: IEditorOption[mouseWheelZoom, Boolean],
    multiCursorMergeOverlapping: IEditorOption[multiCursorMergeOverlapping, Boolean],
    multiCursorModifier: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey],
    multiCursorPaste: IEditorOption[multiCursorPaste, spread | full],
    occurrencesHighlight: IEditorOption[occurrencesHighlight, Boolean],
    overviewRulerBorder: IEditorOption[overviewRulerBorder, Boolean],
    overviewRulerLanes: IEditorOption[overviewRulerLanes, Double],
    parameterHints: IEditorOption[parameterHints, InternalParameterHintOptions],
    peekWidgetDefaultFocus: IEditorOption[peekWidgetDefaultFocus, tree | editor],
    pixelRatio: IEditorOption[pixelRatio, Double],
    quickSuggestions: IEditorOption[quickSuggestions, ValidQuickSuggestionsOptions],
    quickSuggestionsDelay: IEditorOption[quickSuggestionsDelay, Double],
    readOnly: IEditorOption[readOnly, Boolean],
    renderControlCharacters: IEditorOption[renderControlCharacters, Boolean],
    renderFinalNewline: IEditorOption[renderFinalNewline, Boolean],
    renderIndentGuides: IEditorOption[renderIndentGuides, Boolean],
    renderLineHighlight: IEditorOption[renderLineHighlight, all | line | none | gutter],
    renderValidationDecorations: IEditorOption[renderValidationDecorations, on | off | editable],
    renderWhitespace: IEditorOption[renderWhitespace, all | none | boundary | selection],
    revealHorizontalRightPadding: IEditorOption[revealHorizontalRightPadding, Double],
    roundedSelection: IEditorOption[roundedSelection, Boolean],
    rulers: IEditorOption[rulers, js.Object],
    scrollBeyondLastColumn: IEditorOption[scrollBeyondLastColumn, Double],
    scrollBeyondLastLine: IEditorOption[scrollBeyondLastLine, Boolean],
    scrollbar: IEditorOption[scrollbar, InternalEditorScrollbarOptions],
    selectOnLineNumbers: IEditorOption[selectOnLineNumbers, Boolean],
    selectionClipboard: IEditorOption[selectionClipboard, Boolean],
    selectionHighlight: IEditorOption[selectionHighlight, Boolean],
    showFoldingControls: IEditorOption[showFoldingControls, always | mouseover],
    showUnused: IEditorOption[showUnused, Boolean],
    smoothScrolling: IEditorOption[smoothScrolling, Boolean],
    snippetSuggestions: IEditorOption[snippetSuggestions, none | top | bottom | `inline`],
    stopRenderingLineAfter: IEditorOption[stopRenderingLineAfter, Double],
    suggest: IEditorOption[suggest, InternalSuggestOptions],
    suggestFontSize: IEditorOption[suggestFontSize, Double],
    suggestLineHeight: IEditorOption[suggestLineHeight, Double],
    suggestOnTriggerCharacters: IEditorOption[suggestOnTriggerCharacters, Boolean],
    suggestSelection: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix],
    tabCompletion: IEditorOption[tabCompletion, on | off | onlySnippets],
    tabFocusMode: IEditorOption[tabFocusMode, Boolean],
    useTabStops: IEditorOption[useTabStops, Boolean],
    wordSeparators: IEditorOption[wordSeparators, String],
    wordWrap: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded],
    wordWrapBreakAfterCharacters: IEditorOption[wordWrapBreakAfterCharacters, String],
    wordWrapBreakBeforeCharacters: IEditorOption[wordWrapBreakBeforeCharacters, String],
    wordWrapColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double],
    wordWrapMinified: IEditorOption[wordWrapMinified, Boolean],
    wrappingIndent: IEditorOption[wrappingIndent, WrappingIndent],
    wrappingInfo: IEditorOption[wrappingInfo, EditorWrappingInfo],
    wrappingStrategy: IEditorOption[wrappingStrategy, simple | advanced]
  ): AcceptSuggestionOnCommitCharacter = {
    val __obj = js.Dynamic.literal(acceptSuggestionOnCommitCharacter = acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any], acceptSuggestionOnEnter = acceptSuggestionOnEnter.asInstanceOf[js.Any], accessibilityPageSize = accessibilityPageSize.asInstanceOf[js.Any], accessibilitySupport = accessibilitySupport.asInstanceOf[js.Any], ariaLabel = ariaLabel.asInstanceOf[js.Any], autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], autoClosingOvertype = autoClosingOvertype.asInstanceOf[js.Any], autoClosingQuotes = autoClosingQuotes.asInstanceOf[js.Any], autoIndent = autoIndent.asInstanceOf[js.Any], autoSurround = autoSurround.asInstanceOf[js.Any], automaticLayout = automaticLayout.asInstanceOf[js.Any], codeLens = codeLens.asInstanceOf[js.Any], colorDecorators = colorDecorators.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copyWithSyntaxHighlighting = copyWithSyntaxHighlighting.asInstanceOf[js.Any], cursorBlinking = cursorBlinking.asInstanceOf[js.Any], cursorSmoothCaretAnimation = cursorSmoothCaretAnimation.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], cursorSurroundingLines = cursorSurroundingLines.asInstanceOf[js.Any], cursorSurroundingLinesStyle = cursorSurroundingLinesStyle.asInstanceOf[js.Any], cursorWidth = cursorWidth.asInstanceOf[js.Any], disableLayerHinting = disableLayerHinting.asInstanceOf[js.Any], disableMonospaceOptimizations = disableMonospaceOptimizations.asInstanceOf[js.Any], dragAndDrop = dragAndDrop.asInstanceOf[js.Any], editorClassName = editorClassName.asInstanceOf[js.Any], emptySelectionClipboard = emptySelectionClipboard.asInstanceOf[js.Any], extraEditorClassName = extraEditorClassName.asInstanceOf[js.Any], fastScrollSensitivity = fastScrollSensitivity.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], fixedOverflowWidgets = fixedOverflowWidgets.asInstanceOf[js.Any], folding = folding.asInstanceOf[js.Any], foldingHighlight = foldingHighlight.asInstanceOf[js.Any], foldingStrategy = foldingStrategy.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontInfo = fontInfo.asInstanceOf[js.Any], fontLigatures2 = fontLigatures2.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], formatOnPaste = formatOnPaste.asInstanceOf[js.Any], formatOnType = formatOnType.asInstanceOf[js.Any], glyphMargin = glyphMargin.asInstanceOf[js.Any], gotoLocation = gotoLocation.asInstanceOf[js.Any], hideCursorInOverviewRuler = hideCursorInOverviewRuler.asInstanceOf[js.Any], highlightActiveIndentGuide = highlightActiveIndentGuide.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], inDiffEditor = inDiffEditor.asInstanceOf[js.Any], layoutInfo = layoutInfo.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lightbulb = lightbulb.asInstanceOf[js.Any], lineDecorationsWidth = lineDecorationsWidth.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineNumbersMinChars = lineNumbersMinChars.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], minimap = minimap.asInstanceOf[js.Any], mouseStyle = mouseStyle.asInstanceOf[js.Any], mouseWheelScrollSensitivity = mouseWheelScrollSensitivity.asInstanceOf[js.Any], mouseWheelZoom = mouseWheelZoom.asInstanceOf[js.Any], multiCursorMergeOverlapping = multiCursorMergeOverlapping.asInstanceOf[js.Any], multiCursorModifier = multiCursorModifier.asInstanceOf[js.Any], multiCursorPaste = multiCursorPaste.asInstanceOf[js.Any], occurrencesHighlight = occurrencesHighlight.asInstanceOf[js.Any], overviewRulerBorder = overviewRulerBorder.asInstanceOf[js.Any], overviewRulerLanes = overviewRulerLanes.asInstanceOf[js.Any], parameterHints = parameterHints.asInstanceOf[js.Any], peekWidgetDefaultFocus = peekWidgetDefaultFocus.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], quickSuggestions = quickSuggestions.asInstanceOf[js.Any], quickSuggestionsDelay = quickSuggestionsDelay.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], renderControlCharacters = renderControlCharacters.asInstanceOf[js.Any], renderFinalNewline = renderFinalNewline.asInstanceOf[js.Any], renderIndentGuides = renderIndentGuides.asInstanceOf[js.Any], renderLineHighlight = renderLineHighlight.asInstanceOf[js.Any], renderValidationDecorations = renderValidationDecorations.asInstanceOf[js.Any], renderWhitespace = renderWhitespace.asInstanceOf[js.Any], revealHorizontalRightPadding = revealHorizontalRightPadding.asInstanceOf[js.Any], roundedSelection = roundedSelection.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], scrollBeyondLastColumn = scrollBeyondLastColumn.asInstanceOf[js.Any], scrollBeyondLastLine = scrollBeyondLastLine.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], selectOnLineNumbers = selectOnLineNumbers.asInstanceOf[js.Any], selectionClipboard = selectionClipboard.asInstanceOf[js.Any], selectionHighlight = selectionHighlight.asInstanceOf[js.Any], showFoldingControls = showFoldingControls.asInstanceOf[js.Any], showUnused = showUnused.asInstanceOf[js.Any], smoothScrolling = smoothScrolling.asInstanceOf[js.Any], snippetSuggestions = snippetSuggestions.asInstanceOf[js.Any], stopRenderingLineAfter = stopRenderingLineAfter.asInstanceOf[js.Any], suggest = suggest.asInstanceOf[js.Any], suggestFontSize = suggestFontSize.asInstanceOf[js.Any], suggestLineHeight = suggestLineHeight.asInstanceOf[js.Any], suggestOnTriggerCharacters = suggestOnTriggerCharacters.asInstanceOf[js.Any], suggestSelection = suggestSelection.asInstanceOf[js.Any], tabCompletion = tabCompletion.asInstanceOf[js.Any], tabFocusMode = tabFocusMode.asInstanceOf[js.Any], useTabStops = useTabStops.asInstanceOf[js.Any], wordSeparators = wordSeparators.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wordWrapBreakAfterCharacters = wordWrapBreakAfterCharacters.asInstanceOf[js.Any], wordWrapBreakBeforeCharacters = wordWrapBreakBeforeCharacters.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any], wordWrapMinified = wordWrapMinified.asInstanceOf[js.Any], wrappingIndent = wrappingIndent.asInstanceOf[js.Any], wrappingInfo = wrappingInfo.asInstanceOf[js.Any], wrappingStrategy = wrappingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptSuggestionOnCommitCharacter]
  }
  @scala.inline
  implicit class AcceptSuggestionOnCommitCharacterOps[Self <: AcceptSuggestionOnCommitCharacter] (val x: Self) extends AnyVal {
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
    def setAcceptSuggestionOnCommitCharacter(value: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean]): Self = this.set("acceptSuggestionOnCommitCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptSuggestionOnEnter(value: IEditorOption[acceptSuggestionOnEnter, on | off | smart]): Self = this.set("acceptSuggestionOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilityPageSize(value: IEditorOption[accessibilityPageSize, Double]): Self = this.set("accessibilityPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilitySupport(value: IEditorOption[accessibilitySupport, AccessibilitySupport]): Self = this.set("accessibilitySupport", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLabel(value: IEditorOption[ariaLabel, String]): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoClosingBrackets(value: IEditorOption[autoClosingBrackets, EditorAutoClosingStrategy]): Self = this.set("autoClosingBrackets", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoClosingOvertype(value: IEditorOption[autoClosingOvertype, EditorAutoClosingOvertypeStrategy]): Self = this.set("autoClosingOvertype", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoClosingQuotes(value: IEditorOption[autoClosingQuotes, EditorAutoClosingStrategy]): Self = this.set("autoClosingQuotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoIndent(value: IEditorOption[autoIndent, EditorAutoIndentStrategy]): Self = this.set("autoIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoSurround(value: IEditorOption[autoSurround, EditorAutoSurroundStrategy]): Self = this.set("autoSurround", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomaticLayout(value: IEditorOption[automaticLayout, Boolean]): Self = this.set("automaticLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeLens(value: IEditorOption[codeLens, Boolean]): Self = this.set("codeLens", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorDecorators(value: IEditorOption[colorDecorators, Boolean]): Self = this.set("colorDecorators", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments(value: IEditorOption[comments, EditorCommentsOptions]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextmenu(value: IEditorOption[contextmenu, Boolean]): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyWithSyntaxHighlighting(value: IEditorOption[copyWithSyntaxHighlighting, Boolean]): Self = this.set("copyWithSyntaxHighlighting", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorBlinking(value: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle]): Self = this.set("cursorBlinking", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorSmoothCaretAnimation(value: IEditorOption[cursorSmoothCaretAnimation, Boolean]): Self = this.set("cursorSmoothCaretAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorStyle(value: IEditorOption[cursorStyle, TextEditorCursorStyle]): Self = this.set("cursorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorSurroundingLines(value: IEditorOption[cursorSurroundingLines, Double]): Self = this.set("cursorSurroundingLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorSurroundingLinesStyle(value: IEditorOption[cursorSurroundingLinesStyle, default | all]): Self = this.set("cursorSurroundingLinesStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorWidth(value: IEditorOption[cursorWidth, Double]): Self = this.set("cursorWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableLayerHinting(value: IEditorOption[disableLayerHinting, Boolean]): Self = this.set("disableLayerHinting", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableMonospaceOptimizations(value: IEditorOption[disableMonospaceOptimizations, Boolean]): Self = this.set("disableMonospaceOptimizations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragAndDrop(value: IEditorOption[dragAndDrop, Boolean]): Self = this.set("dragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditorClassName(value: IEditorOption[editorClassName, String]): Self = this.set("editorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmptySelectionClipboard(value: IEditorOption[emptySelectionClipboard, Boolean]): Self = this.set("emptySelectionClipboard", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraEditorClassName(value: IEditorOption[extraEditorClassName, String]): Self = this.set("extraEditorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFastScrollSensitivity(value: IEditorOption[fastScrollSensitivity, Double]): Self = this.set("fastScrollSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def setFind(value: IEditorOption[find, EditorFindOptions]): Self = this.set("find", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedOverflowWidgets(value: IEditorOption[fixedOverflowWidgets, Boolean]): Self = this.set("fixedOverflowWidgets", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolding(value: IEditorOption[folding, Boolean]): Self = this.set("folding", value.asInstanceOf[js.Any])
    @scala.inline
    def setFoldingHighlight(value: IEditorOption[foldingHighlight, Boolean]): Self = this.set("foldingHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setFoldingStrategy(value: IEditorOption[foldingStrategy, auto | indentation]): Self = this.set("foldingStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: IEditorOption[fontFamily, String]): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontInfo(value: IEditorOption[fontInfo, FontInfo]): Self = this.set("fontInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontLigatures2(value: IEditorOption[fontLigatures, String]): Self = this.set("fontLigatures2", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: IEditorOption[fontSize, Double]): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: IEditorOption[fontWeight, String]): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatOnPaste(value: IEditorOption[formatOnPaste, Boolean]): Self = this.set("formatOnPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatOnType(value: IEditorOption[formatOnType, Boolean]): Self = this.set("formatOnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlyphMargin(value: IEditorOption[glyphMargin, Boolean]): Self = this.set("glyphMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setGotoLocation(value: IEditorOption[gotoLocation, GoToLocationOptions]): Self = this.set("gotoLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideCursorInOverviewRuler(value: IEditorOption[hideCursorInOverviewRuler, Boolean]): Self = this.set("hideCursorInOverviewRuler", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightActiveIndentGuide(value: IEditorOption[highlightActiveIndentGuide, Boolean]): Self = this.set("highlightActiveIndentGuide", value.asInstanceOf[js.Any])
    @scala.inline
    def setHover(value: IEditorOption[hover, EditorHoverOptions]): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def setInDiffEditor(value: IEditorOption[inDiffEditor, Boolean]): Self = this.set("inDiffEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutInfo(value: IEditorOption[layoutInfo, EditorLayoutInfo]): Self = this.set("layoutInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setLetterSpacing(value: IEditorOption[letterSpacing, Double]): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightbulb(value: IEditorOption[lightbulb, EditorLightbulbOptions]): Self = this.set("lightbulb", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineDecorationsWidth(value: IEditorOption[lineDecorationsWidth, String | Double]): Self = this.set("lineDecorationsWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineHeight(value: IEditorOption[lineHeight, Double]): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumbers(value: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions]): Self = this.set("lineNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumbersMinChars(value: IEditorOption[lineNumbersMinChars, Double]): Self = this.set("lineNumbersMinChars", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinks(value: IEditorOption[links, Boolean]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchBrackets(value: IEditorOption[matchBrackets, always | never | near]): Self = this.set("matchBrackets", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimap(value: IEditorOption[minimap, EditorMinimapOptions]): Self = this.set("minimap", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseStyle(value: IEditorOption[mouseStyle, default | text | copy]): Self = this.set("mouseStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseWheelScrollSensitivity(value: IEditorOption[mouseWheelScrollSensitivity, Double]): Self = this.set("mouseWheelScrollSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseWheelZoom(value: IEditorOption[mouseWheelZoom, Boolean]): Self = this.set("mouseWheelZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiCursorMergeOverlapping(value: IEditorOption[multiCursorMergeOverlapping, Boolean]): Self = this.set("multiCursorMergeOverlapping", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiCursorModifier(value: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey]): Self = this.set("multiCursorModifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiCursorPaste(value: IEditorOption[multiCursorPaste, spread | full]): Self = this.set("multiCursorPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def setOccurrencesHighlight(value: IEditorOption[occurrencesHighlight, Boolean]): Self = this.set("occurrencesHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverviewRulerBorder(value: IEditorOption[overviewRulerBorder, Boolean]): Self = this.set("overviewRulerBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverviewRulerLanes(value: IEditorOption[overviewRulerLanes, Double]): Self = this.set("overviewRulerLanes", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterHints(value: IEditorOption[parameterHints, InternalParameterHintOptions]): Self = this.set("parameterHints", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeekWidgetDefaultFocus(value: IEditorOption[peekWidgetDefaultFocus, tree | editor]): Self = this.set("peekWidgetDefaultFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelRatio(value: IEditorOption[pixelRatio, Double]): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuickSuggestions(value: IEditorOption[quickSuggestions, ValidQuickSuggestionsOptions]): Self = this.set("quickSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuickSuggestionsDelay(value: IEditorOption[quickSuggestionsDelay, Double]): Self = this.set("quickSuggestionsDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: IEditorOption[readOnly, Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderControlCharacters(value: IEditorOption[renderControlCharacters, Boolean]): Self = this.set("renderControlCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderFinalNewline(value: IEditorOption[renderFinalNewline, Boolean]): Self = this.set("renderFinalNewline", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderIndentGuides(value: IEditorOption[renderIndentGuides, Boolean]): Self = this.set("renderIndentGuides", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderLineHighlight(value: IEditorOption[renderLineHighlight, all | line | none | gutter]): Self = this.set("renderLineHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderValidationDecorations(value: IEditorOption[renderValidationDecorations, on | off | editable]): Self = this.set("renderValidationDecorations", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderWhitespace(value: IEditorOption[renderWhitespace, all | none | boundary | selection]): Self = this.set("renderWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevealHorizontalRightPadding(value: IEditorOption[revealHorizontalRightPadding, Double]): Self = this.set("revealHorizontalRightPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundedSelection(value: IEditorOption[roundedSelection, Boolean]): Self = this.set("roundedSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulers(value: IEditorOption[rulers, js.Object]): Self = this.set("rulers", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollBeyondLastColumn(value: IEditorOption[scrollBeyondLastColumn, Double]): Self = this.set("scrollBeyondLastColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollBeyondLastLine(value: IEditorOption[scrollBeyondLastLine, Boolean]): Self = this.set("scrollBeyondLastLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollbar(value: IEditorOption[scrollbar, InternalEditorScrollbarOptions]): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectOnLineNumbers(value: IEditorOption[selectOnLineNumbers, Boolean]): Self = this.set("selectOnLineNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionClipboard(value: IEditorOption[selectionClipboard, Boolean]): Self = this.set("selectionClipboard", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionHighlight(value: IEditorOption[selectionHighlight, Boolean]): Self = this.set("selectionHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowFoldingControls(value: IEditorOption[showFoldingControls, always | mouseover]): Self = this.set("showFoldingControls", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowUnused(value: IEditorOption[showUnused, Boolean]): Self = this.set("showUnused", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmoothScrolling(value: IEditorOption[smoothScrolling, Boolean]): Self = this.set("smoothScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnippetSuggestions(value: IEditorOption[snippetSuggestions, none | top | bottom | `inline`]): Self = this.set("snippetSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopRenderingLineAfter(value: IEditorOption[stopRenderingLineAfter, Double]): Self = this.set("stopRenderingLineAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggest(value: IEditorOption[suggest, InternalSuggestOptions]): Self = this.set("suggest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestFontSize(value: IEditorOption[suggestFontSize, Double]): Self = this.set("suggestFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestLineHeight(value: IEditorOption[suggestLineHeight, Double]): Self = this.set("suggestLineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestOnTriggerCharacters(value: IEditorOption[suggestOnTriggerCharacters, Boolean]): Self = this.set("suggestOnTriggerCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestSelection(value: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix]): Self = this.set("suggestSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabCompletion(value: IEditorOption[tabCompletion, on | off | onlySnippets]): Self = this.set("tabCompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabFocusMode(value: IEditorOption[tabFocusMode, Boolean]): Self = this.set("tabFocusMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseTabStops(value: IEditorOption[useTabStops, Boolean]): Self = this.set("useTabStops", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordSeparators(value: IEditorOption[wordSeparators, String]): Self = this.set("wordSeparators", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded]): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrapBreakAfterCharacters(value: IEditorOption[wordWrapBreakAfterCharacters, String]): Self = this.set("wordWrapBreakAfterCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrapBreakBeforeCharacters(value: IEditorOption[wordWrapBreakBeforeCharacters, String]): Self = this.set("wordWrapBreakBeforeCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrapColumn(value: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double]): Self = this.set("wordWrapColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrapMinified(value: IEditorOption[wordWrapMinified, Boolean]): Self = this.set("wordWrapMinified", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrappingIndent(value: IEditorOption[wrappingIndent, WrappingIndent]): Self = this.set("wrappingIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrappingInfo(value: IEditorOption[wrappingInfo, EditorWrappingInfo]): Self = this.set("wrappingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrappingStrategy(value: IEditorOption[wrappingStrategy, simple | advanced]): Self = this.set("wrappingStrategy", value.asInstanceOf[js.Any])
  }
  
}

