package typings.reactMonacoEditor

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

trait AnonAcceptSuggestionOnCommitCharacter extends js.Object {
  var acceptSuggestionOnCommitCharacter: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter, 
    Boolean
  ]
  var acceptSuggestionOnEnter: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter, 
    on | off | smart
  ]
  var accessibilityPageSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize, Double]
  var accessibilitySupport: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport, 
    AccessibilitySupport
  ]
  var ariaLabel: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.ariaLabel, String]
  var autoClosingBrackets: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets, 
    EditorAutoClosingStrategy
  ]
  var autoClosingOvertype: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype, 
    EditorAutoClosingOvertypeStrategy
  ]
  var autoClosingQuotes: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes, 
    EditorAutoClosingStrategy
  ]
  var autoIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.autoIndent, EditorAutoIndentStrategy]
  var autoSurround: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.autoSurround, 
    EditorAutoSurroundStrategy
  ]
  var automaticLayout: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.automaticLayout, Boolean]
  var codeLens: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.codeLens, Boolean]
  var colorDecorators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.colorDecorators, Boolean]
  var comments: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.comments, EditorCommentsOptions]
  var contextmenu: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.contextmenu, Boolean]
  var copyWithSyntaxHighlighting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting, Boolean]
  var cursorBlinking: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorBlinking, 
    TextEditorCursorBlinkingStyle
  ]
  var cursorSmoothCaretAnimation: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation, Boolean]
  var cursorStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorStyle, TextEditorCursorStyle]
  var cursorSurroundingLines: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines, Double]
  var cursorSurroundingLinesStyle: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle, 
    default | all
  ]
  var cursorWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorWidth, Double]
  var disableLayerHinting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting, Boolean]
  var disableMonospaceOptimizations: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations, 
    Boolean
  ]
  var dragAndDrop: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.dragAndDrop, Boolean]
  var editorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.editorClassName, String]
  var emptySelectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard, Boolean]
  var extraEditorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName, String]
  var fastScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity, Double]
  var find: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.find, EditorFindOptions]
  var fixedOverflowWidgets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets, Boolean]
  var folding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.folding, Boolean]
  var foldingHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingHighlight, Boolean]
  var foldingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingStrategy, auto | indentation]
  var fontFamily: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontFamily, String]
  var fontInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontInfo, FontInfo]
  var fontLigatures2: IEditorOption[fontLigatures, String]
  var fontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontSize, Double]
  var fontWeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontWeight, String]
  var formatOnPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnPaste, Boolean]
  var formatOnType: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnType, Boolean]
  var glyphMargin: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.glyphMargin, Boolean]
  var gotoLocation: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.gotoLocation, GoToLocationOptions]
  var hideCursorInOverviewRuler: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler, Boolean]
  var highlightActiveIndentGuide: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.highlightActiveIndentGuide, Boolean]
  var hover: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hover, EditorHoverOptions]
  var inDiffEditor: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.inDiffEditor, Boolean]
  var layoutInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.layoutInfo, EditorLayoutInfo]
  var letterSpacing: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.letterSpacing, Double]
  var lightbulb: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lightbulb, EditorLightbulbOptions]
  var lineDecorationsWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth, String | Double]
  var lineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineHeight, Double]
  var lineNumbers: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.lineNumbers, 
    InternalEditorRenderLineNumbersOptions
  ]
  var lineNumbersMinChars: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars, Double]
  var links: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.links, Boolean]
  var matchBrackets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.matchBrackets, always | never | near]
  var minimap: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.minimap, EditorMinimapOptions]
  var mouseStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseStyle, default | text | copy]
  var mouseWheelScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity, Double]
  var mouseWheelZoom: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom, Boolean]
  var multiCursorMergeOverlapping: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping, Boolean]
  var multiCursorModifier: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier, 
    altKey | metaKey | ctrlKey
  ]
  var multiCursorPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste, spread | full]
  var occurrencesHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight, Boolean]
  var overviewRulerBorder: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder, Boolean]
  var overviewRulerLanes: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes, Double]
  var parameterHints: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.parameterHints, 
    InternalParameterHintOptions
  ]
  var peekWidgetDefaultFocus: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus, tree | editor]
  var pixelRatio: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.pixelRatio, Double]
  var quickSuggestions: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.quickSuggestions, 
    ValidQuickSuggestionsOptions
  ]
  var quickSuggestionsDelay: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay, Double]
  var readOnly: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.readOnly, Boolean]
  var renderControlCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters, Boolean]
  var renderFinalNewline: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline, Boolean]
  var renderIndentGuides: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderIndentGuides, Boolean]
  var renderLineHighlight: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight, 
    all | line | none | gutter
  ]
  var renderValidationDecorations: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations, 
    on | off | editable
  ]
  var renderWhitespace: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.renderWhitespace, 
    all | none | boundary | selection
  ]
  var revealHorizontalRightPadding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding, Double]
  var roundedSelection: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.roundedSelection, Boolean]
  var rulers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.rulers, js.Object]
  var scrollBeyondLastColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn, Double]
  var scrollBeyondLastLine: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine, Boolean]
  var scrollbar: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.scrollbar, 
    InternalEditorScrollbarOptions
  ]
  var selectOnLineNumbers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers, Boolean]
  var selectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionClipboard, Boolean]
  var selectionHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionHighlight, Boolean]
  var showFoldingControls: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.showFoldingControls, 
    always | mouseover
  ]
  var showUnused: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.showUnused, Boolean]
  var smoothScrolling: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.smoothScrolling, Boolean]
  var snippetSuggestions: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions, 
    none | top | bottom | `inline`
  ]
  var stopRenderingLineAfter: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter, Double]
  var suggest: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggest, InternalSuggestOptions]
  var suggestFontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestFontSize, Double]
  var suggestLineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight, Double]
  var suggestOnTriggerCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters, Boolean]
  var suggestSelection: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.suggestSelection, 
    first | recentlyUsed | recentlyUsedByPrefix
  ]
  var tabCompletion: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.tabCompletion, 
    on | off | onlySnippets
  ]
  var tabFocusMode: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.tabFocusMode, Boolean]
  var useTabStops: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.useTabStops, Boolean]
  var wordSeparators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordSeparators, String]
  var wordWrap: IEditorOption[
    typings.monacoEditor.mod.editor.EditorOption.wordWrap, 
    on | off | wordWrapColumn | bounded
  ]
  var wordWrapBreakAfterCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters, String]
  var wordWrapBreakBeforeCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters, String]
  var wordWrapColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double]
  var wordWrapMinified: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapMinified, Boolean]
  var wrappingIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingIndent, WrappingIndent]
  var wrappingInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingInfo, EditorWrappingInfo]
  var wrappingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy, simple | advanced]
}

object AnonAcceptSuggestionOnCommitCharacter {
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
  ): AnonAcceptSuggestionOnCommitCharacter = {
    val __obj = js.Dynamic.literal(acceptSuggestionOnCommitCharacter = acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any], acceptSuggestionOnEnter = acceptSuggestionOnEnter.asInstanceOf[js.Any], accessibilityPageSize = accessibilityPageSize.asInstanceOf[js.Any], accessibilitySupport = accessibilitySupport.asInstanceOf[js.Any], ariaLabel = ariaLabel.asInstanceOf[js.Any], autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], autoClosingOvertype = autoClosingOvertype.asInstanceOf[js.Any], autoClosingQuotes = autoClosingQuotes.asInstanceOf[js.Any], autoIndent = autoIndent.asInstanceOf[js.Any], autoSurround = autoSurround.asInstanceOf[js.Any], automaticLayout = automaticLayout.asInstanceOf[js.Any], codeLens = codeLens.asInstanceOf[js.Any], colorDecorators = colorDecorators.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copyWithSyntaxHighlighting = copyWithSyntaxHighlighting.asInstanceOf[js.Any], cursorBlinking = cursorBlinking.asInstanceOf[js.Any], cursorSmoothCaretAnimation = cursorSmoothCaretAnimation.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], cursorSurroundingLines = cursorSurroundingLines.asInstanceOf[js.Any], cursorSurroundingLinesStyle = cursorSurroundingLinesStyle.asInstanceOf[js.Any], cursorWidth = cursorWidth.asInstanceOf[js.Any], disableLayerHinting = disableLayerHinting.asInstanceOf[js.Any], disableMonospaceOptimizations = disableMonospaceOptimizations.asInstanceOf[js.Any], dragAndDrop = dragAndDrop.asInstanceOf[js.Any], editorClassName = editorClassName.asInstanceOf[js.Any], emptySelectionClipboard = emptySelectionClipboard.asInstanceOf[js.Any], extraEditorClassName = extraEditorClassName.asInstanceOf[js.Any], fastScrollSensitivity = fastScrollSensitivity.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], fixedOverflowWidgets = fixedOverflowWidgets.asInstanceOf[js.Any], folding = folding.asInstanceOf[js.Any], foldingHighlight = foldingHighlight.asInstanceOf[js.Any], foldingStrategy = foldingStrategy.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontInfo = fontInfo.asInstanceOf[js.Any], fontLigatures2 = fontLigatures2.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], formatOnPaste = formatOnPaste.asInstanceOf[js.Any], formatOnType = formatOnType.asInstanceOf[js.Any], glyphMargin = glyphMargin.asInstanceOf[js.Any], gotoLocation = gotoLocation.asInstanceOf[js.Any], hideCursorInOverviewRuler = hideCursorInOverviewRuler.asInstanceOf[js.Any], highlightActiveIndentGuide = highlightActiveIndentGuide.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], inDiffEditor = inDiffEditor.asInstanceOf[js.Any], layoutInfo = layoutInfo.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lightbulb = lightbulb.asInstanceOf[js.Any], lineDecorationsWidth = lineDecorationsWidth.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineNumbersMinChars = lineNumbersMinChars.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], minimap = minimap.asInstanceOf[js.Any], mouseStyle = mouseStyle.asInstanceOf[js.Any], mouseWheelScrollSensitivity = mouseWheelScrollSensitivity.asInstanceOf[js.Any], mouseWheelZoom = mouseWheelZoom.asInstanceOf[js.Any], multiCursorMergeOverlapping = multiCursorMergeOverlapping.asInstanceOf[js.Any], multiCursorModifier = multiCursorModifier.asInstanceOf[js.Any], multiCursorPaste = multiCursorPaste.asInstanceOf[js.Any], occurrencesHighlight = occurrencesHighlight.asInstanceOf[js.Any], overviewRulerBorder = overviewRulerBorder.asInstanceOf[js.Any], overviewRulerLanes = overviewRulerLanes.asInstanceOf[js.Any], parameterHints = parameterHints.asInstanceOf[js.Any], peekWidgetDefaultFocus = peekWidgetDefaultFocus.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], quickSuggestions = quickSuggestions.asInstanceOf[js.Any], quickSuggestionsDelay = quickSuggestionsDelay.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], renderControlCharacters = renderControlCharacters.asInstanceOf[js.Any], renderFinalNewline = renderFinalNewline.asInstanceOf[js.Any], renderIndentGuides = renderIndentGuides.asInstanceOf[js.Any], renderLineHighlight = renderLineHighlight.asInstanceOf[js.Any], renderValidationDecorations = renderValidationDecorations.asInstanceOf[js.Any], renderWhitespace = renderWhitespace.asInstanceOf[js.Any], revealHorizontalRightPadding = revealHorizontalRightPadding.asInstanceOf[js.Any], roundedSelection = roundedSelection.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], scrollBeyondLastColumn = scrollBeyondLastColumn.asInstanceOf[js.Any], scrollBeyondLastLine = scrollBeyondLastLine.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], selectOnLineNumbers = selectOnLineNumbers.asInstanceOf[js.Any], selectionClipboard = selectionClipboard.asInstanceOf[js.Any], selectionHighlight = selectionHighlight.asInstanceOf[js.Any], showFoldingControls = showFoldingControls.asInstanceOf[js.Any], showUnused = showUnused.asInstanceOf[js.Any], smoothScrolling = smoothScrolling.asInstanceOf[js.Any], snippetSuggestions = snippetSuggestions.asInstanceOf[js.Any], stopRenderingLineAfter = stopRenderingLineAfter.asInstanceOf[js.Any], suggest = suggest.asInstanceOf[js.Any], suggestFontSize = suggestFontSize.asInstanceOf[js.Any], suggestLineHeight = suggestLineHeight.asInstanceOf[js.Any], suggestOnTriggerCharacters = suggestOnTriggerCharacters.asInstanceOf[js.Any], suggestSelection = suggestSelection.asInstanceOf[js.Any], tabCompletion = tabCompletion.asInstanceOf[js.Any], tabFocusMode = tabFocusMode.asInstanceOf[js.Any], useTabStops = useTabStops.asInstanceOf[js.Any], wordSeparators = wordSeparators.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wordWrapBreakAfterCharacters = wordWrapBreakAfterCharacters.asInstanceOf[js.Any], wordWrapBreakBeforeCharacters = wordWrapBreakBeforeCharacters.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any], wordWrapMinified = wordWrapMinified.asInstanceOf[js.Any], wrappingIndent = wrappingIndent.asInstanceOf[js.Any], wrappingInfo = wrappingInfo.asInstanceOf[js.Any], wrappingStrategy = wrappingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcceptSuggestionOnCommitCharacter]
  }
}

