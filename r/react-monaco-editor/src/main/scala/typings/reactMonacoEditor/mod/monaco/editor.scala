package typings.reactMonacoEditor.mod.monaco

import typings.monacoEditor.anon.Model
import typings.monacoEditor.anon.Owner
import typings.monacoEditor.anon.ReadonlyRequiredIBracketP
import typings.monacoEditor.anon.ReadonlyRequiredIDropInto
import typings.monacoEditor.anon.ReadonlyRequiredIEditorCo
import typings.monacoEditor.anon.ReadonlyRequiredIEditorFi
import typings.monacoEditor.anon.ReadonlyRequiredIEditorHo
import typings.monacoEditor.anon.ReadonlyRequiredIEditorIn
import typings.monacoEditor.anon.ReadonlyRequiredIEditorLi
import typings.monacoEditor.anon.ReadonlyRequiredIEditorMi
import typings.monacoEditor.anon.ReadonlyRequiredIEditorPa
import typings.monacoEditor.anon.ReadonlyRequiredIEditorPaCycle
import typings.monacoEditor.anon.ReadonlyRequiredIEditorSt
import typings.monacoEditor.anon.ReadonlyRequiredIGotoLoca
import typings.monacoEditor.anon.ReadonlyRequiredIGuidesOp
import typings.monacoEditor.anon.ReadonlyRequiredIInlineSu
import typings.monacoEditor.anon.ReadonlyRequiredISmartSel
import typings.monacoEditor.anon.ReadonlyRequiredISuggestO
import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.editor.AccessibilitySupport
import typings.monacoEditor.mod.editor.EditorAutoIndentStrategy
import typings.monacoEditor.mod.editor.EditorLayoutInfo
import typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter
import typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter
import typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize
import typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport
import typings.monacoEditor.mod.editor.EditorOption.ariaLabel
import typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets
import typings.monacoEditor.mod.editor.EditorOption.autoClosingDelete
import typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype
import typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes
import typings.monacoEditor.mod.editor.EditorOption.autoIndent
import typings.monacoEditor.mod.editor.EditorOption.autoSurround
import typings.monacoEditor.mod.editor.EditorOption.automaticLayout
import typings.monacoEditor.mod.editor.EditorOption.bracketPairColorization
import typings.monacoEditor.mod.editor.EditorOption.codeLens
import typings.monacoEditor.mod.editor.EditorOption.codeLensFontFamily
import typings.monacoEditor.mod.editor.EditorOption.codeLensFontSize
import typings.monacoEditor.mod.editor.EditorOption.colorDecorators
import typings.monacoEditor.mod.editor.EditorOption.colorDecoratorsLimit
import typings.monacoEditor.mod.editor.EditorOption.columnSelection
import typings.monacoEditor.mod.editor.EditorOption.comments
import typings.monacoEditor.mod.editor.EditorOption.contextmenu
import typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting
import typings.monacoEditor.mod.editor.EditorOption.cursorBlinking
import typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation
import typings.monacoEditor.mod.editor.EditorOption.cursorStyle
import typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines
import typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle
import typings.monacoEditor.mod.editor.EditorOption.cursorWidth
import typings.monacoEditor.mod.editor.EditorOption.defaultColorDecorators
import typings.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek
import typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting
import typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations
import typings.monacoEditor.mod.editor.EditorOption.domReadOnly
import typings.monacoEditor.mod.editor.EditorOption.dragAndDrop
import typings.monacoEditor.mod.editor.EditorOption.dropIntoEditor
import typings.monacoEditor.mod.editor.EditorOption.editorClassName
import typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard
import typings.monacoEditor.mod.editor.EditorOption.experimentalWhitespaceRendering
import typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName
import typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity
import typings.monacoEditor.mod.editor.EditorOption.find
import typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets
import typings.monacoEditor.mod.editor.EditorOption.folding
import typings.monacoEditor.mod.editor.EditorOption.foldingHighlight
import typings.monacoEditor.mod.editor.EditorOption.foldingImportsByDefault
import typings.monacoEditor.mod.editor.EditorOption.foldingMaximumRegions
import typings.monacoEditor.mod.editor.EditorOption.foldingStrategy
import typings.monacoEditor.mod.editor.EditorOption.fontFamily
import typings.monacoEditor.mod.editor.EditorOption.fontInfo
import typings.monacoEditor.mod.editor.EditorOption.fontLigatures
import typings.monacoEditor.mod.editor.EditorOption.fontSize
import typings.monacoEditor.mod.editor.EditorOption.fontVariations
import typings.monacoEditor.mod.editor.EditorOption.fontWeight
import typings.monacoEditor.mod.editor.EditorOption.formatOnPaste
import typings.monacoEditor.mod.editor.EditorOption.formatOnType
import typings.monacoEditor.mod.editor.EditorOption.glyphMargin
import typings.monacoEditor.mod.editor.EditorOption.gotoLocation
import typings.monacoEditor.mod.editor.EditorOption.guides
import typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler
import typings.monacoEditor.mod.editor.EditorOption.hover
import typings.monacoEditor.mod.editor.EditorOption.inDiffEditor
import typings.monacoEditor.mod.editor.EditorOption.inlayHints
import typings.monacoEditor.mod.editor.EditorOption.inlineSuggest
import typings.monacoEditor.mod.editor.EditorOption.layoutInfo
import typings.monacoEditor.mod.editor.EditorOption.letterSpacing
import typings.monacoEditor.mod.editor.EditorOption.lightbulb
import typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth
import typings.monacoEditor.mod.editor.EditorOption.lineHeight
import typings.monacoEditor.mod.editor.EditorOption.lineNumbers
import typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars
import typings.monacoEditor.mod.editor.EditorOption.linkedEditing
import typings.monacoEditor.mod.editor.EditorOption.links
import typings.monacoEditor.mod.editor.EditorOption.matchBrackets
import typings.monacoEditor.mod.editor.EditorOption.minimap
import typings.monacoEditor.mod.editor.EditorOption.mouseStyle
import typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity
import typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom
import typings.monacoEditor.mod.editor.EditorOption.multiCursorLimit
import typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping
import typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier
import typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste
import typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight
import typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder
import typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes
import typings.monacoEditor.mod.editor.EditorOption.padding
import typings.monacoEditor.mod.editor.EditorOption.parameterHints
import typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus
import typings.monacoEditor.mod.editor.EditorOption.pixelRatio
import typings.monacoEditor.mod.editor.EditorOption.quickSuggestions
import typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay
import typings.monacoEditor.mod.editor.EditorOption.readOnly
import typings.monacoEditor.mod.editor.EditorOption.renameOnType
import typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters
import typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline
import typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight
import typings.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus
import typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations
import typings.monacoEditor.mod.editor.EditorOption.renderWhitespace
import typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding
import typings.monacoEditor.mod.editor.EditorOption.roundedSelection
import typings.monacoEditor.mod.editor.EditorOption.rulers
import typings.monacoEditor.mod.editor.EditorOption.screenReaderAnnounceInlineSuggestion
import typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn
import typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine
import typings.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis
import typings.monacoEditor.mod.editor.EditorOption.scrollbar
import typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers
import typings.monacoEditor.mod.editor.EditorOption.selectionClipboard
import typings.monacoEditor.mod.editor.EditorOption.selectionHighlight
import typings.monacoEditor.mod.editor.EditorOption.showDeprecated
import typings.monacoEditor.mod.editor.EditorOption.showFoldingControls
import typings.monacoEditor.mod.editor.EditorOption.showUnused
import typings.monacoEditor.mod.editor.EditorOption.smartSelect
import typings.monacoEditor.mod.editor.EditorOption.smoothScrolling
import typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions
import typings.monacoEditor.mod.editor.EditorOption.stickyScroll
import typings.monacoEditor.mod.editor.EditorOption.stickyTabStops
import typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter
import typings.monacoEditor.mod.editor.EditorOption.suggest
import typings.monacoEditor.mod.editor.EditorOption.suggestFontSize
import typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight
import typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters
import typings.monacoEditor.mod.editor.EditorOption.suggestSelection
import typings.monacoEditor.mod.editor.EditorOption.tabCompletion
import typings.monacoEditor.mod.editor.EditorOption.tabFocusMode
import typings.monacoEditor.mod.editor.EditorOption.tabIndex
import typings.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine
import typings.monacoEditor.mod.editor.EditorOption.unicodeHighlighting
import typings.monacoEditor.mod.editor.EditorOption.unusualLineTerminators
import typings.monacoEditor.mod.editor.EditorOption.useShadowDOM
import typings.monacoEditor.mod.editor.EditorOption.useTabStops
import typings.monacoEditor.mod.editor.EditorOption.wordBreak
import typings.monacoEditor.mod.editor.EditorOption.wordSeparators
import typings.monacoEditor.mod.editor.EditorOption.wordWrap
import typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters
import typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters
import typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride1
import typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride2
import typings.monacoEditor.mod.editor.EditorOption.wrappingIndent
import typings.monacoEditor.mod.editor.EditorOption.wrappingInfo
import typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy
import typings.monacoEditor.mod.editor.EditorWrappingInfo
import typings.monacoEditor.mod.editor.IActionDescriptor
import typings.monacoEditor.mod.editor.ICodeEditor
import typings.monacoEditor.mod.editor.ICodeEditorOpener
import typings.monacoEditor.mod.editor.IColorizerElementOptions
import typings.monacoEditor.mod.editor.IColorizerOptions
import typings.monacoEditor.mod.editor.ICommandDescriptor
import typings.monacoEditor.mod.editor.IDiffEditor
import typings.monacoEditor.mod.editor.IDiffNavigator
import typings.monacoEditor.mod.editor.IDiffNavigatorOptions
import typings.monacoEditor.mod.editor.IEditorOption
import typings.monacoEditor.mod.editor.IEditorOverrideServices
import typings.monacoEditor.mod.editor.IEditorZoom
import typings.monacoEditor.mod.editor.IKeybindingRule
import typings.monacoEditor.mod.editor.ILinkOpener
import typings.monacoEditor.mod.editor.IMarker
import typings.monacoEditor.mod.editor.IMarkerData
import typings.monacoEditor.mod.editor.IStandaloneCodeEditor
import typings.monacoEditor.mod.editor.IStandaloneDiffEditor
import typings.monacoEditor.mod.editor.IStandaloneDiffEditorConstructionOptions
import typings.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typings.monacoEditor.mod.editor.IStandaloneThemeData
import typings.monacoEditor.mod.editor.ITextModel
import typings.monacoEditor.mod.editor.IWebWorkerOptions
import typings.monacoEditor.mod.editor.InternalEditorRenderLineNumbersOptions
import typings.monacoEditor.mod.editor.InternalEditorScrollbarOptions
import typings.monacoEditor.mod.editor.InternalQuickSuggestionsOptions
import typings.monacoEditor.mod.editor.MonacoWebWorker
import typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle
import typings.monacoEditor.mod.editor.TextEditorCursorStyle
import typings.monacoEditor.mod.editor.WrappingIndent
import typings.reactMonacoEditor.reactMonacoEditorStrings.`inline`
import typings.reactMonacoEditor.reactMonacoEditorStrings.advanced
import typings.reactMonacoEditor.reactMonacoEditorStrings.all
import typings.reactMonacoEditor.reactMonacoEditorStrings.altKey
import typings.reactMonacoEditor.reactMonacoEditorStrings.always
import typings.reactMonacoEditor.reactMonacoEditorStrings.auto
import typings.reactMonacoEditor.reactMonacoEditorStrings.beforeWhitespace
import typings.reactMonacoEditor.reactMonacoEditorStrings.bottom
import typings.reactMonacoEditor.reactMonacoEditorStrings.boundary
import typings.reactMonacoEditor.reactMonacoEditorStrings.bounded
import typings.reactMonacoEditor.reactMonacoEditorStrings.brackets
import typings.reactMonacoEditor.reactMonacoEditorStrings.copy
import typings.reactMonacoEditor.reactMonacoEditorStrings.ctrlKey
import typings.reactMonacoEditor.reactMonacoEditorStrings.default
import typings.reactMonacoEditor.reactMonacoEditorStrings.dimmed
import typings.reactMonacoEditor.reactMonacoEditorStrings.editable
import typings.reactMonacoEditor.reactMonacoEditorStrings.explicit
import typings.reactMonacoEditor.reactMonacoEditorStrings.first
import typings.reactMonacoEditor.reactMonacoEditorStrings.font
import typings.reactMonacoEditor.reactMonacoEditorStrings.full
import typings.reactMonacoEditor.reactMonacoEditorStrings.gutter
import typings.reactMonacoEditor.reactMonacoEditorStrings.indentation
import typings.reactMonacoEditor.reactMonacoEditorStrings.inherit
import typings.reactMonacoEditor.reactMonacoEditorStrings.keepAll
import typings.reactMonacoEditor.reactMonacoEditorStrings.languageDefined
import typings.reactMonacoEditor.reactMonacoEditorStrings.line
import typings.reactMonacoEditor.reactMonacoEditorStrings.metaKey
import typings.reactMonacoEditor.reactMonacoEditorStrings.mouseover
import typings.reactMonacoEditor.reactMonacoEditorStrings.near
import typings.reactMonacoEditor.reactMonacoEditorStrings.never
import typings.reactMonacoEditor.reactMonacoEditorStrings.none
import typings.reactMonacoEditor.reactMonacoEditorStrings.normal
import typings.reactMonacoEditor.reactMonacoEditorStrings.off
import typings.reactMonacoEditor.reactMonacoEditorStrings.on
import typings.reactMonacoEditor.reactMonacoEditorStrings.onlySnippets
import typings.reactMonacoEditor.reactMonacoEditorStrings.prompt
import typings.reactMonacoEditor.reactMonacoEditorStrings.quotes
import typings.reactMonacoEditor.reactMonacoEditorStrings.recentlyUsed
import typings.reactMonacoEditor.reactMonacoEditorStrings.recentlyUsedByPrefix
import typings.reactMonacoEditor.reactMonacoEditorStrings.selection
import typings.reactMonacoEditor.reactMonacoEditorStrings.simple
import typings.reactMonacoEditor.reactMonacoEditorStrings.smart
import typings.reactMonacoEditor.reactMonacoEditorStrings.spread
import typings.reactMonacoEditor.reactMonacoEditorStrings.svg
import typings.reactMonacoEditor.reactMonacoEditorStrings.text
import typings.reactMonacoEditor.reactMonacoEditorStrings.top
import typings.reactMonacoEditor.reactMonacoEditorStrings.trailing
import typings.reactMonacoEditor.reactMonacoEditorStrings.tree
import typings.reactMonacoEditor.reactMonacoEditorStrings.wordWrapColumn
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editor {
  
  @JSImport("react-monaco-editor", "monaco.editor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-monaco-editor", "monaco.editor.AccessibilitySupport")
  @js.native
  object AccessibilitySupport extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.AccessibilitySupport & Double] = js.native
    
    /* 1 */ val Disabled: typings.monacoEditor.mod.editor.AccessibilitySupport.Disabled & Double = js.native
    
    /* 2 */ val Enabled: typings.monacoEditor.mod.editor.AccessibilitySupport.Enabled & Double = js.native
    
    /* 0 */ val Unknown: typings.monacoEditor.mod.editor.AccessibilitySupport.Unknown & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.ApplyUpdateResult")
  @js.native
  open class ApplyUpdateResult[T] protected ()
    extends typings.monacoEditor.mod.editor.ApplyUpdateResult[T] {
    def this(newValue: T, didChange: Boolean) = this()
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.BareFontInfo")
  @js.native
  open class BareFontInfo ()
    extends typings.monacoEditor.mod.editor.BareFontInfo
  
  @JSImport("react-monaco-editor", "monaco.editor.ConfigurationChangedEvent")
  @js.native
  open class ConfigurationChangedEvent ()
    extends typings.monacoEditor.mod.editor.ConfigurationChangedEvent
  
  @JSImport("react-monaco-editor", "monaco.editor.ContentWidgetPositionPreference")
  @js.native
  object ContentWidgetPositionPreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.ContentWidgetPositionPreference & Double] = js.native
    
    /* 1 */ val ABOVE: typings.monacoEditor.mod.editor.ContentWidgetPositionPreference.ABOVE & Double = js.native
    
    /* 2 */ val BELOW: typings.monacoEditor.mod.editor.ContentWidgetPositionPreference.BELOW & Double = js.native
    
    /* 0 */ val EXACT: typings.monacoEditor.mod.editor.ContentWidgetPositionPreference.EXACT & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.CursorChangeReason")
  @js.native
  object CursorChangeReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.CursorChangeReason & Double] = js.native
    
    /* 1 */ val ContentFlush: typings.monacoEditor.mod.editor.CursorChangeReason.ContentFlush & Double = js.native
    
    /* 3 */ val Explicit: typings.monacoEditor.mod.editor.CursorChangeReason.Explicit & Double = js.native
    
    /* 0 */ val NotSet: typings.monacoEditor.mod.editor.CursorChangeReason.NotSet & Double = js.native
    
    /* 4 */ val Paste: typings.monacoEditor.mod.editor.CursorChangeReason.Paste & Double = js.native
    
    /* 2 */ val RecoverFromMarkers: typings.monacoEditor.mod.editor.CursorChangeReason.RecoverFromMarkers & Double = js.native
    
    /* 6 */ val Redo: typings.monacoEditor.mod.editor.CursorChangeReason.Redo & Double = js.native
    
    /* 5 */ val Undo: typings.monacoEditor.mod.editor.CursorChangeReason.Undo & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.DefaultEndOfLine")
  @js.native
  object DefaultEndOfLine extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.DefaultEndOfLine & Double] = js.native
    
    /* 2 */ val CRLF: typings.monacoEditor.mod.editor.DefaultEndOfLine.CRLF & Double = js.native
    
    /* 1 */ val LF: typings.monacoEditor.mod.editor.DefaultEndOfLine.LF & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.EditorAutoIndentStrategy")
  @js.native
  object EditorAutoIndentStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.EditorAutoIndentStrategy & Double] = js.native
    
    /* 3 */ val Advanced: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Advanced & Double = js.native
    
    /* 2 */ val Brackets: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Brackets & Double = js.native
    
    /* 4 */ val Full: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Full & Double = js.native
    
    /* 1 */ val Keep: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.Keep & Double = js.native
    
    /* 0 */ val None: typings.monacoEditor.mod.editor.EditorAutoIndentStrategy.None & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.EditorOption")
  @js.native
  object EditorOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.EditorOption & Double] = js.native
    
    /* 0 */ val acceptSuggestionOnCommitCharacter: typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter & Double = js.native
    
    /* 1 */ val acceptSuggestionOnEnter: typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter & Double = js.native
    
    /* 3 */ val accessibilityPageSize: typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize & Double = js.native
    
    /* 2 */ val accessibilitySupport: typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport & Double = js.native
    
    /* 4 */ val ariaLabel: typings.monacoEditor.mod.editor.EditorOption.ariaLabel & Double = js.native
    
    /* 5 */ val autoClosingBrackets: typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets & Double = js.native
    
    /* 7 */ val autoClosingDelete: typings.monacoEditor.mod.editor.EditorOption.autoClosingDelete & Double = js.native
    
    /* 8 */ val autoClosingOvertype: typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype & Double = js.native
    
    /* 9 */ val autoClosingQuotes: typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes & Double = js.native
    
    /* 10 */ val autoIndent: typings.monacoEditor.mod.editor.EditorOption.autoIndent & Double = js.native
    
    /* 12 */ val autoSurround: typings.monacoEditor.mod.editor.EditorOption.autoSurround & Double = js.native
    
    /* 11 */ val automaticLayout: typings.monacoEditor.mod.editor.EditorOption.automaticLayout & Double = js.native
    
    /* 13 */ val bracketPairColorization: typings.monacoEditor.mod.editor.EditorOption.bracketPairColorization & Double = js.native
    
    /* 15 */ val codeLens: typings.monacoEditor.mod.editor.EditorOption.codeLens & Double = js.native
    
    /* 16 */ val codeLensFontFamily: typings.monacoEditor.mod.editor.EditorOption.codeLensFontFamily & Double = js.native
    
    /* 17 */ val codeLensFontSize: typings.monacoEditor.mod.editor.EditorOption.codeLensFontSize & Double = js.native
    
    /* 18 */ val colorDecorators: typings.monacoEditor.mod.editor.EditorOption.colorDecorators & Double = js.native
    
    /* 19 */ val colorDecoratorsLimit: typings.monacoEditor.mod.editor.EditorOption.colorDecoratorsLimit & Double = js.native
    
    /* 20 */ val columnSelection: typings.monacoEditor.mod.editor.EditorOption.columnSelection & Double = js.native
    
    /* 21 */ val comments: typings.monacoEditor.mod.editor.EditorOption.comments & Double = js.native
    
    /* 22 */ val contextmenu: typings.monacoEditor.mod.editor.EditorOption.contextmenu & Double = js.native
    
    /* 23 */ val copyWithSyntaxHighlighting: typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting & Double = js.native
    
    /* 24 */ val cursorBlinking: typings.monacoEditor.mod.editor.EditorOption.cursorBlinking & Double = js.native
    
    /* 25 */ val cursorSmoothCaretAnimation: typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation & Double = js.native
    
    /* 26 */ val cursorStyle: typings.monacoEditor.mod.editor.EditorOption.cursorStyle & Double = js.native
    
    /* 27 */ val cursorSurroundingLines: typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines & Double = js.native
    
    /* 28 */ val cursorSurroundingLinesStyle: typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle & Double = js.native
    
    /* 29 */ val cursorWidth: typings.monacoEditor.mod.editor.EditorOption.cursorWidth & Double = js.native
    
    /* 141 */ val defaultColorDecorators: typings.monacoEditor.mod.editor.EditorOption.defaultColorDecorators & Double = js.native
    
    /* 84 */ val definitionLinkOpensInPeek: typings.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek & Double = js.native
    
    /* 30 */ val disableLayerHinting: typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting & Double = js.native
    
    /* 31 */ val disableMonospaceOptimizations: typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations & Double = js.native
    
    /* 32 */ val domReadOnly: typings.monacoEditor.mod.editor.EditorOption.domReadOnly & Double = js.native
    
    /* 33 */ val dragAndDrop: typings.monacoEditor.mod.editor.EditorOption.dragAndDrop & Double = js.native
    
    /* 34 */ val dropIntoEditor: typings.monacoEditor.mod.editor.EditorOption.dropIntoEditor & Double = js.native
    
    /* 136 */ val editorClassName: typings.monacoEditor.mod.editor.EditorOption.editorClassName & Double = js.native
    
    /* 35 */ val emptySelectionClipboard: typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard & Double = js.native
    
    /* 36 */ val experimentalWhitespaceRendering: typings.monacoEditor.mod.editor.EditorOption.experimentalWhitespaceRendering & Double = js.native
    
    /* 37 */ val extraEditorClassName: typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName & Double = js.native
    
    /* 38 */ val fastScrollSensitivity: typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity & Double = js.native
    
    /* 39 */ val find: typings.monacoEditor.mod.editor.EditorOption.find & Double = js.native
    
    /* 40 */ val fixedOverflowWidgets: typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets & Double = js.native
    
    /* 41 */ val folding: typings.monacoEditor.mod.editor.EditorOption.folding & Double = js.native
    
    /* 43 */ val foldingHighlight: typings.monacoEditor.mod.editor.EditorOption.foldingHighlight & Double = js.native
    
    /* 44 */ val foldingImportsByDefault: typings.monacoEditor.mod.editor.EditorOption.foldingImportsByDefault & Double = js.native
    
    /* 45 */ val foldingMaximumRegions: typings.monacoEditor.mod.editor.EditorOption.foldingMaximumRegions & Double = js.native
    
    /* 42 */ val foldingStrategy: typings.monacoEditor.mod.editor.EditorOption.foldingStrategy & Double = js.native
    
    /* 47 */ val fontFamily: typings.monacoEditor.mod.editor.EditorOption.fontFamily & Double = js.native
    
    /* 48 */ val fontInfo: typings.monacoEditor.mod.editor.EditorOption.fontInfo & Double = js.native
    
    /* 49 */ val fontLigatures: typings.monacoEditor.mod.editor.EditorOption.fontLigatures & Double = js.native
    
    /* 50 */ val fontSize: typings.monacoEditor.mod.editor.EditorOption.fontSize & Double = js.native
    
    /* 52 */ val fontVariations: typings.monacoEditor.mod.editor.EditorOption.fontVariations & Double = js.native
    
    /* 51 */ val fontWeight: typings.monacoEditor.mod.editor.EditorOption.fontWeight & Double = js.native
    
    /* 53 */ val formatOnPaste: typings.monacoEditor.mod.editor.EditorOption.formatOnPaste & Double = js.native
    
    /* 54 */ val formatOnType: typings.monacoEditor.mod.editor.EditorOption.formatOnType & Double = js.native
    
    /* 55 */ val glyphMargin: typings.monacoEditor.mod.editor.EditorOption.glyphMargin & Double = js.native
    
    /* 56 */ val gotoLocation: typings.monacoEditor.mod.editor.EditorOption.gotoLocation & Double = js.native
    
    /* 14 */ val guides: typings.monacoEditor.mod.editor.EditorOption.guides & Double = js.native
    
    /* 57 */ val hideCursorInOverviewRuler: typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler & Double = js.native
    
    /* 58 */ val hover: typings.monacoEditor.mod.editor.EditorOption.hover & Double = js.native
    
    /* 59 */ val inDiffEditor: typings.monacoEditor.mod.editor.EditorOption.inDiffEditor & Double = js.native
    
    /* 135 */ val inlayHints: typings.monacoEditor.mod.editor.EditorOption.inlayHints & Double = js.native
    
    /* 60 */ val inlineSuggest: typings.monacoEditor.mod.editor.EditorOption.inlineSuggest & Double = js.native
    
    /* 139 */ val layoutInfo: typings.monacoEditor.mod.editor.EditorOption.layoutInfo & Double = js.native
    
    /* 61 */ val letterSpacing: typings.monacoEditor.mod.editor.EditorOption.letterSpacing & Double = js.native
    
    /* 62 */ val lightbulb: typings.monacoEditor.mod.editor.EditorOption.lightbulb & Double = js.native
    
    /* 63 */ val lineDecorationsWidth: typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth & Double = js.native
    
    /* 64 */ val lineHeight: typings.monacoEditor.mod.editor.EditorOption.lineHeight & Double = js.native
    
    /* 65 */ val lineNumbers: typings.monacoEditor.mod.editor.EditorOption.lineNumbers & Double = js.native
    
    /* 66 */ val lineNumbersMinChars: typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars & Double = js.native
    
    /* 67 */ val linkedEditing: typings.monacoEditor.mod.editor.EditorOption.linkedEditing & Double = js.native
    
    /* 68 */ val links: typings.monacoEditor.mod.editor.EditorOption.links & Double = js.native
    
    /* 69 */ val matchBrackets: typings.monacoEditor.mod.editor.EditorOption.matchBrackets & Double = js.native
    
    /* 70 */ val minimap: typings.monacoEditor.mod.editor.EditorOption.minimap & Double = js.native
    
    /* 71 */ val mouseStyle: typings.monacoEditor.mod.editor.EditorOption.mouseStyle & Double = js.native
    
    /* 72 */ val mouseWheelScrollSensitivity: typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity & Double = js.native
    
    /* 73 */ val mouseWheelZoom: typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom & Double = js.native
    
    /* 77 */ val multiCursorLimit: typings.monacoEditor.mod.editor.EditorOption.multiCursorLimit & Double = js.native
    
    /* 74 */ val multiCursorMergeOverlapping: typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping & Double = js.native
    
    /* 75 */ val multiCursorModifier: typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier & Double = js.native
    
    /* 76 */ val multiCursorPaste: typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste & Double = js.native
    
    /* 78 */ val occurrencesHighlight: typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight & Double = js.native
    
    /* 79 */ val overviewRulerBorder: typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder & Double = js.native
    
    /* 80 */ val overviewRulerLanes: typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes & Double = js.native
    
    /* 81 */ val padding: typings.monacoEditor.mod.editor.EditorOption.padding & Double = js.native
    
    /* 82 */ val parameterHints: typings.monacoEditor.mod.editor.EditorOption.parameterHints & Double = js.native
    
    /* 83 */ val peekWidgetDefaultFocus: typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus & Double = js.native
    
    /* 137 */ val pixelRatio: typings.monacoEditor.mod.editor.EditorOption.pixelRatio & Double = js.native
    
    /* 85 */ val quickSuggestions: typings.monacoEditor.mod.editor.EditorOption.quickSuggestions & Double = js.native
    
    /* 86 */ val quickSuggestionsDelay: typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay & Double = js.native
    
    /* 87 */ val readOnly: typings.monacoEditor.mod.editor.EditorOption.readOnly & Double = js.native
    
    /* 88 */ val renameOnType: typings.monacoEditor.mod.editor.EditorOption.renameOnType & Double = js.native
    
    /* 89 */ val renderControlCharacters: typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters & Double = js.native
    
    /* 90 */ val renderFinalNewline: typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline & Double = js.native
    
    /* 91 */ val renderLineHighlight: typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight & Double = js.native
    
    /* 92 */ val renderLineHighlightOnlyWhenFocus: typings.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus & Double = js.native
    
    /* 93 */ val renderValidationDecorations: typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations & Double = js.native
    
    /* 94 */ val renderWhitespace: typings.monacoEditor.mod.editor.EditorOption.renderWhitespace & Double = js.native
    
    /* 95 */ val revealHorizontalRightPadding: typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding & Double = js.native
    
    /* 96 */ val roundedSelection: typings.monacoEditor.mod.editor.EditorOption.roundedSelection & Double = js.native
    
    /* 97 */ val rulers: typings.monacoEditor.mod.editor.EditorOption.rulers & Double = js.native
    
    /* 6 */ val screenReaderAnnounceInlineSuggestion: typings.monacoEditor.mod.editor.EditorOption.screenReaderAnnounceInlineSuggestion & Double = js.native
    
    /* 99 */ val scrollBeyondLastColumn: typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn & Double = js.native
    
    /* 100 */ val scrollBeyondLastLine: typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine & Double = js.native
    
    /* 101 */ val scrollPredominantAxis: typings.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis & Double = js.native
    
    /* 98 */ val scrollbar: typings.monacoEditor.mod.editor.EditorOption.scrollbar & Double = js.native
    
    /* 104 */ val selectOnLineNumbers: typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers & Double = js.native
    
    /* 102 */ val selectionClipboard: typings.monacoEditor.mod.editor.EditorOption.selectionClipboard & Double = js.native
    
    /* 103 */ val selectionHighlight: typings.monacoEditor.mod.editor.EditorOption.selectionHighlight & Double = js.native
    
    /* 134 */ val showDeprecated: typings.monacoEditor.mod.editor.EditorOption.showDeprecated & Double = js.native
    
    /* 105 */ val showFoldingControls: typings.monacoEditor.mod.editor.EditorOption.showFoldingControls & Double = js.native
    
    /* 106 */ val showUnused: typings.monacoEditor.mod.editor.EditorOption.showUnused & Double = js.native
    
    /* 108 */ val smartSelect: typings.monacoEditor.mod.editor.EditorOption.smartSelect & Double = js.native
    
    /* 109 */ val smoothScrolling: typings.monacoEditor.mod.editor.EditorOption.smoothScrolling & Double = js.native
    
    /* 107 */ val snippetSuggestions: typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions & Double = js.native
    
    /* 110 */ val stickyScroll: typings.monacoEditor.mod.editor.EditorOption.stickyScroll & Double = js.native
    
    /* 111 */ val stickyTabStops: typings.monacoEditor.mod.editor.EditorOption.stickyTabStops & Double = js.native
    
    /* 112 */ val stopRenderingLineAfter: typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter & Double = js.native
    
    /* 113 */ val suggest: typings.monacoEditor.mod.editor.EditorOption.suggest & Double = js.native
    
    /* 114 */ val suggestFontSize: typings.monacoEditor.mod.editor.EditorOption.suggestFontSize & Double = js.native
    
    /* 115 */ val suggestLineHeight: typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight & Double = js.native
    
    /* 116 */ val suggestOnTriggerCharacters: typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters & Double = js.native
    
    /* 117 */ val suggestSelection: typings.monacoEditor.mod.editor.EditorOption.suggestSelection & Double = js.native
    
    /* 118 */ val tabCompletion: typings.monacoEditor.mod.editor.EditorOption.tabCompletion & Double = js.native
    
    /* 138 */ val tabFocusMode: typings.monacoEditor.mod.editor.EditorOption.tabFocusMode & Double = js.native
    
    /* 119 */ val tabIndex: typings.monacoEditor.mod.editor.EditorOption.tabIndex & Double = js.native
    
    /* 46 */ val unfoldOnClickAfterEndOfLine: typings.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine & Double = js.native
    
    /* 120 */ val unicodeHighlighting: typings.monacoEditor.mod.editor.EditorOption.unicodeHighlighting & Double = js.native
    
    /* 121 */ val unusualLineTerminators: typings.monacoEditor.mod.editor.EditorOption.unusualLineTerminators & Double = js.native
    
    /* 122 */ val useShadowDOM: typings.monacoEditor.mod.editor.EditorOption.useShadowDOM & Double = js.native
    
    /* 123 */ val useTabStops: typings.monacoEditor.mod.editor.EditorOption.useTabStops & Double = js.native
    
    /* 124 */ val wordBreak: typings.monacoEditor.mod.editor.EditorOption.wordBreak & Double = js.native
    
    /* 125 */ val wordSeparators: typings.monacoEditor.mod.editor.EditorOption.wordSeparators & Double = js.native
    
    /* 126 */ val wordWrap: typings.monacoEditor.mod.editor.EditorOption.wordWrap & Double = js.native
    
    /* 127 */ val wordWrapBreakAfterCharacters: typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters & Double = js.native
    
    /* 128 */ val wordWrapBreakBeforeCharacters: typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters & Double = js.native
    
    /* 129 */ val wordWrapColumn: typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn & Double = js.native
    
    /* 130 */ val wordWrapOverride1: typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride1 & Double = js.native
    
    /* 131 */ val wordWrapOverride2: typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride2 & Double = js.native
    
    /* 132 */ val wrappingIndent: typings.monacoEditor.mod.editor.EditorOption.wrappingIndent & Double = js.native
    
    /* 140 */ val wrappingInfo: typings.monacoEditor.mod.editor.EditorOption.wrappingInfo & Double = js.native
    
    /* 133 */ val wrappingStrategy: typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy & Double = js.native
  }
  
  object EditorOptions {
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.acceptSuggestionOnCommitCharacter")
    @js.native
    def acceptSuggestionOnCommitCharacter: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter, 
        Boolean
      ] = js.native
    inline def acceptSuggestionOnCommitCharacter_=(x: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnCommitCharacter")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.acceptSuggestionOnEnter")
    @js.native
    def acceptSuggestionOnEnter: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter, 
        on | off | smart
      ] = js.native
    inline def acceptSuggestionOnEnter_=(x: IEditorOption[acceptSuggestionOnEnter, on | off | smart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnEnter")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.accessibilityPageSize")
    @js.native
    def accessibilityPageSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.accessibilityPageSize, Double] = js.native
    inline def accessibilityPageSize_=(x: IEditorOption[accessibilityPageSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityPageSize")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.accessibilitySupport")
    @js.native
    def accessibilitySupport: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.accessibilitySupport, 
        AccessibilitySupport
      ] = js.native
    inline def accessibilitySupport_=(x: IEditorOption[accessibilitySupport, AccessibilitySupport]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilitySupport")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.ariaLabel")
    @js.native
    def ariaLabel: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.ariaLabel, String] = js.native
    inline def ariaLabel_=(x: IEditorOption[ariaLabel, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.autoClosingBrackets")
    @js.native
    def autoClosingBrackets: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.autoClosingBrackets, 
        always | languageDefined | beforeWhitespace | never
      ] = js.native
    inline def autoClosingBrackets_=(x: IEditorOption[autoClosingBrackets, always | languageDefined | beforeWhitespace | never]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingBrackets")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.autoClosingDelete")
    @js.native
    def autoClosingDelete: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.autoClosingDelete, 
        always | never | auto
      ] = js.native
    inline def autoClosingDelete_=(x: IEditorOption[autoClosingDelete, always | never | auto]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingDelete")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.autoClosingOvertype")
    @js.native
    def autoClosingOvertype: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.autoClosingOvertype, 
        always | never | auto
      ] = js.native
    inline def autoClosingOvertype_=(x: IEditorOption[autoClosingOvertype, always | never | auto]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingOvertype")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.autoClosingQuotes")
    @js.native
    def autoClosingQuotes: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.autoClosingQuotes, 
        always | languageDefined | beforeWhitespace | never
      ] = js.native
    inline def autoClosingQuotes_=(x: IEditorOption[autoClosingQuotes, always | languageDefined | beforeWhitespace | never]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingQuotes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.autoIndent")
    @js.native
    def autoIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.autoIndent, EditorAutoIndentStrategy] = js.native
    inline def autoIndent_=(x: IEditorOption[autoIndent, EditorAutoIndentStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.autoSurround")
    @js.native
    def autoSurround: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.autoSurround, 
        languageDefined | never | quotes | brackets
      ] = js.native
    inline def autoSurround_=(x: IEditorOption[autoSurround, languageDefined | never | quotes | brackets]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoSurround")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.automaticLayout")
    @js.native
    def automaticLayout: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.automaticLayout, Boolean] = js.native
    inline def automaticLayout_=(x: IEditorOption[automaticLayout, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("automaticLayout")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.bracketPairColorization")
    @js.native
    def bracketPairColorization: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.bracketPairColorization, 
        ReadonlyRequiredIBracketP
      ] = js.native
    inline def bracketPairColorization_=(x: IEditorOption[bracketPairColorization, ReadonlyRequiredIBracketP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketPairColorization")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.bracketPairGuides")
    @js.native
    def bracketPairGuides: IEditorOption[guides, ReadonlyRequiredIGuidesOp] = js.native
    inline def bracketPairGuides_=(x: IEditorOption[guides, ReadonlyRequiredIGuidesOp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketPairGuides")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.codeLens")
    @js.native
    def codeLens: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.codeLens, Boolean] = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.codeLensFontFamily")
    @js.native
    def codeLensFontFamily: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.codeLensFontFamily, String] = js.native
    inline def codeLensFontFamily_=(x: IEditorOption[codeLensFontFamily, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeLensFontFamily")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.codeLensFontSize")
    @js.native
    def codeLensFontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.codeLensFontSize, Double] = js.native
    inline def codeLensFontSize_=(x: IEditorOption[codeLensFontSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeLensFontSize")(x.asInstanceOf[js.Any])
    
    inline def codeLens_=(x: IEditorOption[codeLens, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeLens")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.colorDecorators")
    @js.native
    def colorDecorators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.colorDecorators, Boolean] = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.colorDecoratorsLimit")
    @js.native
    def colorDecoratorsLimit: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.colorDecoratorsLimit, Double] = js.native
    inline def colorDecoratorsLimit_=(x: IEditorOption[colorDecoratorsLimit, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorDecoratorsLimit")(x.asInstanceOf[js.Any])
    
    inline def colorDecorators_=(x: IEditorOption[colorDecorators, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorDecorators")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.columnSelection")
    @js.native
    def columnSelection: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.columnSelection, Boolean] = js.native
    inline def columnSelection_=(x: IEditorOption[columnSelection, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("columnSelection")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.comments")
    @js.native
    def comments: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.comments, ReadonlyRequiredIEditorCo] = js.native
    inline def comments_=(x: IEditorOption[comments, ReadonlyRequiredIEditorCo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comments")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.contextmenu")
    @js.native
    def contextmenu: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.contextmenu, Boolean] = js.native
    inline def contextmenu_=(x: IEditorOption[contextmenu, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.copyWithSyntaxHighlighting")
    @js.native
    def copyWithSyntaxHighlighting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting, Boolean] = js.native
    inline def copyWithSyntaxHighlighting_=(x: IEditorOption[copyWithSyntaxHighlighting, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copyWithSyntaxHighlighting")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.cursorBlinking")
    @js.native
    def cursorBlinking: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.cursorBlinking, 
        TextEditorCursorBlinkingStyle
      ] = js.native
    inline def cursorBlinking_=(x: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorBlinking")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.cursorSmoothCaretAnimation")
    @js.native
    def cursorSmoothCaretAnimation: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation, 
        on | off | explicit
      ] = js.native
    inline def cursorSmoothCaretAnimation_=(x: IEditorOption[cursorSmoothCaretAnimation, on | off | explicit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorSmoothCaretAnimation")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.cursorStyle")
    @js.native
    def cursorStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorStyle, TextEditorCursorStyle] = js.native
    inline def cursorStyle_=(x: IEditorOption[cursorStyle, TextEditorCursorStyle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.cursorSurroundingLines")
    @js.native
    def cursorSurroundingLines: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines, Double] = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.cursorSurroundingLinesStyle")
    @js.native
    def cursorSurroundingLinesStyle: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle, 
        default | all
      ] = js.native
    inline def cursorSurroundingLinesStyle_=(x: IEditorOption[cursorSurroundingLinesStyle, default | all]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorSurroundingLinesStyle")(x.asInstanceOf[js.Any])
    
    inline def cursorSurroundingLines_=(x: IEditorOption[cursorSurroundingLines, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorSurroundingLines")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.cursorWidth")
    @js.native
    def cursorWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.cursorWidth, Double] = js.native
    inline def cursorWidth_=(x: IEditorOption[cursorWidth, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.defaultColorDecorators")
    @js.native
    def defaultColorDecorators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.defaultColorDecorators, Boolean] = js.native
    inline def defaultColorDecorators_=(x: IEditorOption[defaultColorDecorators, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultColorDecorators")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.definitionLinkOpensInPeek")
    @js.native
    def definitionLinkOpensInPeek: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek, Boolean] = js.native
    inline def definitionLinkOpensInPeek_=(x: IEditorOption[definitionLinkOpensInPeek, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitionLinkOpensInPeek")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.disableLayerHinting")
    @js.native
    def disableLayerHinting: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.disableLayerHinting, Boolean] = js.native
    inline def disableLayerHinting_=(x: IEditorOption[disableLayerHinting, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableLayerHinting")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.disableMonospaceOptimizations")
    @js.native
    def disableMonospaceOptimizations: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations, 
        Boolean
      ] = js.native
    inline def disableMonospaceOptimizations_=(x: IEditorOption[disableMonospaceOptimizations, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableMonospaceOptimizations")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.domReadOnly")
    @js.native
    def domReadOnly: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.domReadOnly, Boolean] = js.native
    inline def domReadOnly_=(x: IEditorOption[domReadOnly, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domReadOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.dragAndDrop")
    @js.native
    def dragAndDrop: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.dragAndDrop, Boolean] = js.native
    inline def dragAndDrop_=(x: IEditorOption[dragAndDrop, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.dropIntoEditor")
    @js.native
    def dropIntoEditor: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.dropIntoEditor, 
        ReadonlyRequiredIDropInto
      ] = js.native
    inline def dropIntoEditor_=(x: IEditorOption[dropIntoEditor, ReadonlyRequiredIDropInto]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropIntoEditor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.editorClassName")
    @js.native
    def editorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.editorClassName, String] = js.native
    inline def editorClassName_=(x: IEditorOption[editorClassName, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorClassName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.emptySelectionClipboard")
    @js.native
    def emptySelectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard, Boolean] = js.native
    inline def emptySelectionClipboard_=(x: IEditorOption[emptySelectionClipboard, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptySelectionClipboard")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.experimentalWhitespaceRendering")
    @js.native
    def experimentalWhitespaceRendering: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.experimentalWhitespaceRendering, 
        off | svg | font
      ] = js.native
    inline def experimentalWhitespaceRendering_=(x: IEditorOption[experimentalWhitespaceRendering, off | svg | font]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("experimentalWhitespaceRendering")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.extraEditorClassName")
    @js.native
    def extraEditorClassName: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.extraEditorClassName, String] = js.native
    inline def extraEditorClassName_=(x: IEditorOption[extraEditorClassName, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraEditorClassName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.fastScrollSensitivity")
    @js.native
    def fastScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity, Double] = js.native
    inline def fastScrollSensitivity_=(x: IEditorOption[fastScrollSensitivity, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fastScrollSensitivity")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.find")
    @js.native
    def find: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.find, ReadonlyRequiredIEditorFi] = js.native
    inline def find_=(x: IEditorOption[find, ReadonlyRequiredIEditorFi]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("find")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.fixedOverflowWidgets")
    @js.native
    def fixedOverflowWidgets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets, Boolean] = js.native
    inline def fixedOverflowWidgets_=(x: IEditorOption[fixedOverflowWidgets, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixedOverflowWidgets")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.folding")
    @js.native
    def folding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.folding, Boolean] = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.foldingHighlight")
    @js.native
    def foldingHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingHighlight, Boolean] = js.native
    inline def foldingHighlight_=(x: IEditorOption[foldingHighlight, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldingHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.foldingImportsByDefault")
    @js.native
    def foldingImportsByDefault: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingImportsByDefault, Boolean] = js.native
    inline def foldingImportsByDefault_=(x: IEditorOption[foldingImportsByDefault, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldingImportsByDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.foldingMaximumRegions")
    @js.native
    def foldingMaximumRegions: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingMaximumRegions, Double] = js.native
    inline def foldingMaximumRegions_=(x: IEditorOption[foldingMaximumRegions, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldingMaximumRegions")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.foldingStrategy")
    @js.native
    def foldingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.foldingStrategy, auto | indentation] = js.native
    inline def foldingStrategy_=(x: IEditorOption[foldingStrategy, auto | indentation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldingStrategy")(x.asInstanceOf[js.Any])
    
    inline def folding_=(x: IEditorOption[folding, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("folding")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.fontFamily")
    @js.native
    def fontFamily: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontFamily, String] = js.native
    inline def fontFamily_=(x: IEditorOption[fontFamily, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.fontInfo")
    @js.native
    def fontInfo: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.fontInfo, 
        typings.monacoEditor.mod.editor.FontInfo
      ] = js.native
    inline def fontInfo_=(x: IEditorOption[fontInfo, typings.monacoEditor.mod.editor.FontInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontInfo")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.fontLigatures2")
    @js.native
    def fontLigatures2: IEditorOption[fontLigatures, String] = js.native
    inline def fontLigatures2_=(x: IEditorOption[fontLigatures, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontLigatures2")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.fontSize")
    @js.native
    def fontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontSize, Double] = js.native
    inline def fontSize_=(x: IEditorOption[fontSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.fontVariations")
    @js.native
    def fontVariations: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontVariations, String] = js.native
    inline def fontVariations_=(x: IEditorOption[fontVariations, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontVariations")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.fontWeight")
    @js.native
    def fontWeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.fontWeight, String] = js.native
    inline def fontWeight_=(x: IEditorOption[fontWeight, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.formatOnPaste")
    @js.native
    def formatOnPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnPaste, Boolean] = js.native
    inline def formatOnPaste_=(x: IEditorOption[formatOnPaste, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatOnPaste")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.formatOnType")
    @js.native
    def formatOnType: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.formatOnType, Boolean] = js.native
    inline def formatOnType_=(x: IEditorOption[formatOnType, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatOnType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.glyphMargin")
    @js.native
    def glyphMargin: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.glyphMargin, Boolean] = js.native
    inline def glyphMargin_=(x: IEditorOption[glyphMargin, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glyphMargin")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.gotoLocation")
    @js.native
    def gotoLocation: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.gotoLocation, 
        ReadonlyRequiredIGotoLoca
      ] = js.native
    inline def gotoLocation_=(x: IEditorOption[gotoLocation, ReadonlyRequiredIGotoLoca]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gotoLocation")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.hideCursorInOverviewRuler")
    @js.native
    def hideCursorInOverviewRuler: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler, Boolean] = js.native
    inline def hideCursorInOverviewRuler_=(x: IEditorOption[hideCursorInOverviewRuler, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideCursorInOverviewRuler")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.hover")
    @js.native
    def hover: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.hover, ReadonlyRequiredIEditorHo] = js.native
    inline def hover_=(x: IEditorOption[hover, ReadonlyRequiredIEditorHo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hover")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.inDiffEditor")
    @js.native
    def inDiffEditor: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.inDiffEditor, Boolean] = js.native
    inline def inDiffEditor_=(x: IEditorOption[inDiffEditor, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inDiffEditor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.inlayHints")
    @js.native
    def inlayHints: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.inlayHints, ReadonlyRequiredIEditorIn] = js.native
    inline def inlayHints_=(x: IEditorOption[inlayHints, ReadonlyRequiredIEditorIn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlayHints")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.inlineSuggest")
    @js.native
    def inlineSuggest: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.inlineSuggest, 
        ReadonlyRequiredIInlineSu
      ] = js.native
    inline def inlineSuggest_=(x: IEditorOption[inlineSuggest, ReadonlyRequiredIInlineSu]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineSuggest")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.layoutInfo")
    @js.native
    def layoutInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.layoutInfo, EditorLayoutInfo] = js.native
    inline def layoutInfo_=(x: IEditorOption[layoutInfo, EditorLayoutInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layoutInfo")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.letterSpacing")
    @js.native
    def letterSpacing: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.letterSpacing, Double] = js.native
    inline def letterSpacing_=(x: IEditorOption[letterSpacing, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.lightbulb")
    @js.native
    def lightbulb: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lightbulb, ReadonlyRequiredIEditorLi] = js.native
    inline def lightbulb_=(x: IEditorOption[lightbulb, ReadonlyRequiredIEditorLi]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightbulb")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.lineDecorationsWidth")
    @js.native
    def lineDecorationsWidth: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth, Double] = js.native
    inline def lineDecorationsWidth_=(x: IEditorOption[lineDecorationsWidth, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineDecorationsWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.lineHeight")
    @js.native
    def lineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineHeight, Double] = js.native
    inline def lineHeight_=(x: IEditorOption[lineHeight, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.lineNumbers")
    @js.native
    def lineNumbers: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.lineNumbers, 
        InternalEditorRenderLineNumbersOptions
      ] = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.lineNumbersMinChars")
    @js.native
    def lineNumbersMinChars: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars, Double] = js.native
    inline def lineNumbersMinChars_=(x: IEditorOption[lineNumbersMinChars, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineNumbersMinChars")(x.asInstanceOf[js.Any])
    
    inline def lineNumbers_=(x: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.linkedEditing")
    @js.native
    def linkedEditing: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.linkedEditing, Boolean] = js.native
    inline def linkedEditing_=(x: IEditorOption[linkedEditing, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkedEditing")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.links")
    @js.native
    def links: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.links, Boolean] = js.native
    inline def links_=(x: IEditorOption[links, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("links")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.matchBrackets")
    @js.native
    def matchBrackets: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.matchBrackets, always | never | near] = js.native
    inline def matchBrackets_=(x: IEditorOption[matchBrackets, always | never | near]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchBrackets")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.minimap")
    @js.native
    def minimap: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.minimap, ReadonlyRequiredIEditorMi] = js.native
    inline def minimap_=(x: IEditorOption[minimap, ReadonlyRequiredIEditorMi]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minimap")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.mouseStyle")
    @js.native
    def mouseStyle: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseStyle, default | text | copy] = js.native
    inline def mouseStyle_=(x: IEditorOption[mouseStyle, default | text | copy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.mouseWheelScrollSensitivity")
    @js.native
    def mouseWheelScrollSensitivity: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity, Double] = js.native
    inline def mouseWheelScrollSensitivity_=(x: IEditorOption[mouseWheelScrollSensitivity, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelScrollSensitivity")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.mouseWheelZoom")
    @js.native
    def mouseWheelZoom: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.mouseWheelZoom, Boolean] = js.native
    inline def mouseWheelZoom_=(x: IEditorOption[mouseWheelZoom, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoom")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.multiCursorLimit")
    @js.native
    def multiCursorLimit: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorLimit, Double] = js.native
    inline def multiCursorLimit_=(x: IEditorOption[multiCursorLimit, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.multiCursorMergeOverlapping")
    @js.native
    def multiCursorMergeOverlapping: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping, Boolean] = js.native
    inline def multiCursorMergeOverlapping_=(x: IEditorOption[multiCursorMergeOverlapping, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorMergeOverlapping")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.multiCursorModifier")
    @js.native
    def multiCursorModifier: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.multiCursorModifier, 
        altKey | metaKey | ctrlKey
      ] = js.native
    inline def multiCursorModifier_=(x: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorModifier")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.multiCursorPaste")
    @js.native
    def multiCursorPaste: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.multiCursorPaste, spread | full] = js.native
    inline def multiCursorPaste_=(x: IEditorOption[multiCursorPaste, spread | full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorPaste")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.occurrencesHighlight")
    @js.native
    def occurrencesHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.occurrencesHighlight, Boolean] = js.native
    inline def occurrencesHighlight_=(x: IEditorOption[occurrencesHighlight, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("occurrencesHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.overviewRulerBorder")
    @js.native
    def overviewRulerBorder: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerBorder, Boolean] = js.native
    inline def overviewRulerBorder_=(x: IEditorOption[overviewRulerBorder, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerBorder")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.overviewRulerLanes")
    @js.native
    def overviewRulerLanes: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.overviewRulerLanes, Double] = js.native
    inline def overviewRulerLanes_=(x: IEditorOption[overviewRulerLanes, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerLanes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.padding")
    @js.native
    def padding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.padding, ReadonlyRequiredIEditorPa] = js.native
    inline def padding_=(x: IEditorOption[padding, ReadonlyRequiredIEditorPa]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.parameterHints")
    @js.native
    def parameterHints: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.parameterHints, 
        ReadonlyRequiredIEditorPaCycle
      ] = js.native
    inline def parameterHints_=(x: IEditorOption[parameterHints, ReadonlyRequiredIEditorPaCycle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameterHints")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.peekWidgetDefaultFocus")
    @js.native
    def peekWidgetDefaultFocus: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus, 
        tree | typings.reactMonacoEditor.reactMonacoEditorStrings.editor
      ] = js.native
    inline def peekWidgetDefaultFocus_=(
      x: IEditorOption[
          peekWidgetDefaultFocus, 
          tree | typings.reactMonacoEditor.reactMonacoEditorStrings.editor
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peekWidgetDefaultFocus")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.pixelRatio")
    @js.native
    def pixelRatio: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.pixelRatio, Double] = js.native
    inline def pixelRatio_=(x: IEditorOption[pixelRatio, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.quickSuggestions")
    @js.native
    def quickSuggestions: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.quickSuggestions, 
        InternalQuickSuggestionsOptions
      ] = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.quickSuggestionsDelay")
    @js.native
    def quickSuggestionsDelay: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay, Double] = js.native
    inline def quickSuggestionsDelay_=(x: IEditorOption[quickSuggestionsDelay, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestionsDelay")(x.asInstanceOf[js.Any])
    
    inline def quickSuggestions_=(x: IEditorOption[quickSuggestions, InternalQuickSuggestionsOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestions")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.readOnly")
    @js.native
    def readOnly: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.readOnly, Boolean] = js.native
    inline def readOnly_=(x: IEditorOption[readOnly, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.renameOnType")
    @js.native
    def renameOnType: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renameOnType, Boolean] = js.native
    inline def renameOnType_=(x: IEditorOption[renameOnType, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renameOnType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.renderControlCharacters")
    @js.native
    def renderControlCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderControlCharacters, Boolean] = js.native
    inline def renderControlCharacters_=(x: IEditorOption[renderControlCharacters, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderControlCharacters")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.renderFinalNewline")
    @js.native
    def renderFinalNewline: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.renderFinalNewline, on | off | dimmed] = js.native
    inline def renderFinalNewline_=(x: IEditorOption[renderFinalNewline, on | off | dimmed]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderFinalNewline")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.renderLineHighlight")
    @js.native
    def renderLineHighlight: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.renderLineHighlight, 
        all | line | none | gutter
      ] = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.renderLineHighlightOnlyWhenFocus")
    @js.native
    def renderLineHighlightOnlyWhenFocus: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus, 
        Boolean
      ] = js.native
    inline def renderLineHighlightOnlyWhenFocus_=(x: IEditorOption[renderLineHighlightOnlyWhenFocus, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderLineHighlightOnlyWhenFocus")(x.asInstanceOf[js.Any])
    
    inline def renderLineHighlight_=(x: IEditorOption[renderLineHighlight, all | line | none | gutter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderLineHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.renderValidationDecorations")
    @js.native
    def renderValidationDecorations: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.renderValidationDecorations, 
        on | off | editable
      ] = js.native
    inline def renderValidationDecorations_=(x: IEditorOption[renderValidationDecorations, on | off | editable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderValidationDecorations")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.renderWhitespace")
    @js.native
    def renderWhitespace: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.renderWhitespace, 
        all | none | boundary | selection | trailing
      ] = js.native
    inline def renderWhitespace_=(x: IEditorOption[renderWhitespace, all | none | boundary | selection | trailing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderWhitespace")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.revealHorizontalRightPadding")
    @js.native
    def revealHorizontalRightPadding: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding, Double] = js.native
    inline def revealHorizontalRightPadding_=(x: IEditorOption[revealHorizontalRightPadding, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revealHorizontalRightPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.roundedSelection")
    @js.native
    def roundedSelection: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.roundedSelection, Boolean] = js.native
    inline def roundedSelection_=(x: IEditorOption[roundedSelection, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roundedSelection")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.rulers")
    @js.native
    def rulers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.rulers, js.Object] = js.native
    inline def rulers_=(x: IEditorOption[rulers, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rulers")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.screenReaderAnnounceInlineSuggestion")
    @js.native
    def screenReaderAnnounceInlineSuggestion: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.screenReaderAnnounceInlineSuggestion, 
        Boolean
      ] = js.native
    inline def screenReaderAnnounceInlineSuggestion_=(x: IEditorOption[screenReaderAnnounceInlineSuggestion, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screenReaderAnnounceInlineSuggestion")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.scrollBeyondLastColumn")
    @js.native
    def scrollBeyondLastColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn, Double] = js.native
    inline def scrollBeyondLastColumn_=(x: IEditorOption[scrollBeyondLastColumn, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastColumn")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.scrollBeyondLastLine")
    @js.native
    def scrollBeyondLastLine: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine, Boolean] = js.native
    inline def scrollBeyondLastLine_=(x: IEditorOption[scrollBeyondLastLine, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastLine")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.scrollPredominantAxis")
    @js.native
    def scrollPredominantAxis: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis, Boolean] = js.native
    inline def scrollPredominantAxis_=(x: IEditorOption[scrollPredominantAxis, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollPredominantAxis")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.scrollbar")
    @js.native
    def scrollbar: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.scrollbar, 
        InternalEditorScrollbarOptions
      ] = js.native
    inline def scrollbar_=(x: IEditorOption[scrollbar, InternalEditorScrollbarOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.selectOnLineNumbers")
    @js.native
    def selectOnLineNumbers: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers, Boolean] = js.native
    inline def selectOnLineNumbers_=(x: IEditorOption[selectOnLineNumbers, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectOnLineNumbers")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.selectionClipboard")
    @js.native
    def selectionClipboard: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionClipboard, Boolean] = js.native
    inline def selectionClipboard_=(x: IEditorOption[selectionClipboard, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionClipboard")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.selectionHighlight")
    @js.native
    def selectionHighlight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.selectionHighlight, Boolean] = js.native
    inline def selectionHighlight_=(x: IEditorOption[selectionHighlight, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.showDeprecated")
    @js.native
    def showDeprecated: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.showDeprecated, Boolean] = js.native
    inline def showDeprecated_=(x: IEditorOption[showDeprecated, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDeprecated")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.showFoldingControls")
    @js.native
    def showFoldingControls: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.showFoldingControls, 
        always | never | mouseover
      ] = js.native
    inline def showFoldingControls_=(x: IEditorOption[showFoldingControls, always | never | mouseover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showFoldingControls")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.showUnused")
    @js.native
    def showUnused: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.showUnused, Boolean] = js.native
    inline def showUnused_=(x: IEditorOption[showUnused, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showUnused")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.smartSelect")
    @js.native
    def smartSelect: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.smartSelect, 
        ReadonlyRequiredISmartSel
      ] = js.native
    inline def smartSelect_=(x: IEditorOption[smartSelect, ReadonlyRequiredISmartSel]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartSelect")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.smoothScrolling")
    @js.native
    def smoothScrolling: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.smoothScrolling, Boolean] = js.native
    inline def smoothScrolling_=(x: IEditorOption[smoothScrolling, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smoothScrolling")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.snippetSuggestions")
    @js.native
    def snippetSuggestions: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.snippetSuggestions, 
        none | top | bottom | `inline`
      ] = js.native
    inline def snippetSuggestions_=(x: IEditorOption[snippetSuggestions, none | top | bottom | `inline`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snippetSuggestions")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.stickyScroll")
    @js.native
    def stickyScroll: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.stickyScroll, 
        ReadonlyRequiredIEditorSt
      ] = js.native
    inline def stickyScroll_=(x: IEditorOption[stickyScroll, ReadonlyRequiredIEditorSt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyScroll")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.stickyTabStops")
    @js.native
    def stickyTabStops: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.stickyTabStops, Boolean] = js.native
    inline def stickyTabStops_=(x: IEditorOption[stickyTabStops, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyTabStops")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.stopRenderingLineAfter")
    @js.native
    def stopRenderingLineAfter: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter, Double] = js.native
    inline def stopRenderingLineAfter_=(x: IEditorOption[stopRenderingLineAfter, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopRenderingLineAfter")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.suggest")
    @js.native
    def suggest: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggest, ReadonlyRequiredISuggestO] = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.suggestFontSize")
    @js.native
    def suggestFontSize: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestFontSize, Double] = js.native
    inline def suggestFontSize_=(x: IEditorOption[suggestFontSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.suggestLineHeight")
    @js.native
    def suggestLineHeight: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestLineHeight, Double] = js.native
    inline def suggestLineHeight_=(x: IEditorOption[suggestLineHeight, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.suggestOnTriggerCharacters")
    @js.native
    def suggestOnTriggerCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters, Boolean] = js.native
    inline def suggestOnTriggerCharacters_=(x: IEditorOption[suggestOnTriggerCharacters, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestOnTriggerCharacters")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.suggestSelection")
    @js.native
    def suggestSelection: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.suggestSelection, 
        first | recentlyUsed | recentlyUsedByPrefix
      ] = js.native
    inline def suggestSelection_=(x: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestSelection")(x.asInstanceOf[js.Any])
    
    inline def suggest_=(x: IEditorOption[suggest, ReadonlyRequiredISuggestO]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggest")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.tabCompletion")
    @js.native
    def tabCompletion: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.tabCompletion, 
        on | off | onlySnippets
      ] = js.native
    inline def tabCompletion_=(x: IEditorOption[tabCompletion, on | off | onlySnippets]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabCompletion")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.tabFocusMode")
    @js.native
    def tabFocusMode: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.tabFocusMode, Boolean] = js.native
    inline def tabFocusMode_=(x: IEditorOption[tabFocusMode, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabFocusMode")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.tabIndex")
    @js.native
    def tabIndex: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.tabIndex, Double] = js.native
    inline def tabIndex_=(x: IEditorOption[tabIndex, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.unfoldOnClickAfterEndOfLine")
    @js.native
    def unfoldOnClickAfterEndOfLine: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine, Boolean] = js.native
    inline def unfoldOnClickAfterEndOfLine_=(x: IEditorOption[unfoldOnClickAfterEndOfLine, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unfoldOnClickAfterEndOfLine")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.unicodeHighlight")
    @js.native
    def unicodeHighlight: IEditorOption[unicodeHighlighting, Any] = js.native
    inline def unicodeHighlight_=(x: IEditorOption[unicodeHighlighting, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unicodeHighlight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.unusualLineTerminators")
    @js.native
    def unusualLineTerminators: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.unusualLineTerminators, 
        auto | off | prompt
      ] = js.native
    inline def unusualLineTerminators_=(x: IEditorOption[unusualLineTerminators, auto | off | prompt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unusualLineTerminators")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.useShadowDOM")
    @js.native
    def useShadowDOM: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.useShadowDOM, Boolean] = js.native
    inline def useShadowDOM_=(x: IEditorOption[useShadowDOM, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useShadowDOM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.useTabStops")
    @js.native
    def useTabStops: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.useTabStops, Boolean] = js.native
    inline def useTabStops_=(x: IEditorOption[useTabStops, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useTabStops")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wordBreak")
    @js.native
    def wordBreak: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordBreak, normal | keepAll] = js.native
    inline def wordBreak_=(x: IEditorOption[wordBreak, normal | keepAll]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordBreak")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wordSeparators")
    @js.native
    def wordSeparators: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordSeparators, String] = js.native
    inline def wordSeparators_=(x: IEditorOption[wordSeparators, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordSeparators")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wordWrap")
    @js.native
    def wordWrap: IEditorOption[
        typings.monacoEditor.mod.editor.EditorOption.wordWrap, 
        on | off | wordWrapColumn | bounded
      ] = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wordWrapBreakAfterCharacters")
    @js.native
    def wordWrapBreakAfterCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters, String] = js.native
    inline def wordWrapBreakAfterCharacters_=(x: IEditorOption[wordWrapBreakAfterCharacters, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakAfterCharacters")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wordWrapBreakBeforeCharacters")
    @js.native
    def wordWrapBreakBeforeCharacters: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters, String] = js.native
    inline def wordWrapBreakBeforeCharacters_=(x: IEditorOption[wordWrapBreakBeforeCharacters, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakBeforeCharacters")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wordWrapColumn")
    @js.native
    def wordWrapColumn: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double] = js.native
    inline def wordWrapColumn_=(x: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapColumn")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wordWrapOverride1")
    @js.native
    def wordWrapOverride1: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride1, on | off | inherit] = js.native
    inline def wordWrapOverride1_=(x: IEditorOption[wordWrapOverride1, on | off | inherit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapOverride1")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wordWrapOverride2")
    @js.native
    def wordWrapOverride2: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wordWrapOverride2, on | off | inherit] = js.native
    inline def wordWrapOverride2_=(x: IEditorOption[wordWrapOverride2, on | off | inherit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapOverride2")(x.asInstanceOf[js.Any])
    
    inline def wordWrap_=(x: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wrappingIndent")
    @js.native
    def wrappingIndent: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingIndent, WrappingIndent] = js.native
    inline def wrappingIndent_=(x: IEditorOption[wrappingIndent, WrappingIndent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappingIndent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wrappingInfo")
    @js.native
    def wrappingInfo: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingInfo, EditorWrappingInfo] = js.native
    inline def wrappingInfo_=(x: IEditorOption[wrappingInfo, EditorWrappingInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappingInfo")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorOptions.wrappingStrategy")
    @js.native
    def wrappingStrategy: IEditorOption[typings.monacoEditor.mod.editor.EditorOption.wrappingStrategy, simple | advanced] = js.native
    inline def wrappingStrategy_=(x: IEditorOption[wrappingStrategy, simple | advanced]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappingStrategy")(x.asInstanceOf[js.Any])
  }
  
  object EditorType {
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorType.ICodeEditor")
    @js.native
    def ICodeEditor: String = js.native
    inline def ICodeEditor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICodeEditor")(x.asInstanceOf[js.Any])
    
    @JSImport("react-monaco-editor", "monaco.editor.EditorType.IDiffEditor")
    @js.native
    def IDiffEditor: String = js.native
    inline def IDiffEditor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDiffEditor")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.EditorZoom")
  @js.native
  val EditorZoom: IEditorZoom = js.native
  
  @JSImport("react-monaco-editor", "monaco.editor.EndOfLinePreference")
  @js.native
  object EndOfLinePreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.EndOfLinePreference & Double] = js.native
    
    /* 2 */ val CRLF: typings.monacoEditor.mod.editor.EndOfLinePreference.CRLF & Double = js.native
    
    /* 1 */ val LF: typings.monacoEditor.mod.editor.EndOfLinePreference.LF & Double = js.native
    
    /* 0 */ val TextDefined: typings.monacoEditor.mod.editor.EndOfLinePreference.TextDefined & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.EndOfLineSequence")
  @js.native
  object EndOfLineSequence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.EndOfLineSequence & Double] = js.native
    
    /* 1 */ val CRLF: typings.monacoEditor.mod.editor.EndOfLineSequence.CRLF & Double = js.native
    
    /* 0 */ val LF: typings.monacoEditor.mod.editor.EndOfLineSequence.LF & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.FindMatch")
  @js.native
  open class FindMatch ()
    extends typings.monacoEditor.mod.editor.FindMatch
  
  @JSImport("react-monaco-editor", "monaco.editor.FontInfo")
  @js.native
  open class FontInfo ()
    extends typings.monacoEditor.mod.editor.FontInfo
  
  @JSImport("react-monaco-editor", "monaco.editor.GlyphMarginLane")
  @js.native
  object GlyphMarginLane extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.GlyphMarginLane & Double] = js.native
    
    /* 1 */ val Left: typings.monacoEditor.mod.editor.GlyphMarginLane.Left & Double = js.native
    
    /* 2 */ val Right: typings.monacoEditor.mod.editor.GlyphMarginLane.Right & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.InjectedTextCursorStops")
  @js.native
  object InjectedTextCursorStops extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.InjectedTextCursorStops & Double] = js.native
    
    /* 0 */ val Both: typings.monacoEditor.mod.editor.InjectedTextCursorStops.Both & Double = js.native
    
    /* 2 */ val Left: typings.monacoEditor.mod.editor.InjectedTextCursorStops.Left & Double = js.native
    
    /* 3 */ val None: typings.monacoEditor.mod.editor.InjectedTextCursorStops.None & Double = js.native
    
    /* 1 */ val Right: typings.monacoEditor.mod.editor.InjectedTextCursorStops.Right & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.LineRange")
  @js.native
  open class LineRange protected ()
    extends typings.monacoEditor.mod.editor.LineRange {
    def this(startLineNumber: Double, endLineNumberExclusive: Double) = this()
  }
  /* static members */
  object LineRange {
    
    @JSImport("react-monaco-editor", "monaco.editor.LineRange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param lineRanges1 Must be sorted.
      * @param lineRanges2 Must be sorted.
      */
    inline def join(
      lineRanges1: js.Array[typings.monacoEditor.mod.editor.LineRange],
      lineRanges2: js.Array[typings.monacoEditor.mod.editor.LineRange]
    ): js.Array[typings.monacoEditor.mod.editor.LineRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(lineRanges1.asInstanceOf[js.Any], lineRanges2.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.monacoEditor.mod.editor.LineRange]]
    
    /**
      * @param lineRanges An array of sorted line ranges.
      */
    inline def joinMany(lineRanges: js.Array[js.Array[typings.monacoEditor.mod.editor.LineRange]]): js.Array[typings.monacoEditor.mod.editor.LineRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("joinMany")(lineRanges.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.monacoEditor.mod.editor.LineRange]]
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.LineRangeMapping")
  @js.native
  open class LineRangeMapping protected ()
    extends typings.monacoEditor.mod.editor.LineRangeMapping {
    def this(
      originalRange: typings.monacoEditor.mod.editor.LineRange,
      modifiedRange: typings.monacoEditor.mod.editor.LineRange
    ) = this()
    def this(
      originalRange: typings.monacoEditor.mod.editor.LineRange,
      modifiedRange: typings.monacoEditor.mod.editor.LineRange,
      innerChanges: js.Array[typings.monacoEditor.mod.editor.RangeMapping]
    ) = this()
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.MinimapPosition")
  @js.native
  object MinimapPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.MinimapPosition & Double] = js.native
    
    /* 2 */ val Gutter: typings.monacoEditor.mod.editor.MinimapPosition.Gutter & Double = js.native
    
    /* 1 */ val Inline: typings.monacoEditor.mod.editor.MinimapPosition.Inline & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.MouseTargetType")
  @js.native
  object MouseTargetType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.MouseTargetType & Double] = js.native
    
    /* 7 */ val CONTENT_EMPTY: typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_EMPTY & Double = js.native
    
    /* 6 */ val CONTENT_TEXT: typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_TEXT & Double = js.native
    
    /* 8 */ val CONTENT_VIEW_ZONE: typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_VIEW_ZONE & Double = js.native
    
    /* 9 */ val CONTENT_WIDGET: typings.monacoEditor.mod.editor.MouseTargetType.CONTENT_WIDGET & Double = js.native
    
    /* 2 */ val GUTTER_GLYPH_MARGIN: typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_GLYPH_MARGIN & Double = js.native
    
    /* 4 */ val GUTTER_LINE_DECORATIONS: typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_LINE_DECORATIONS & Double = js.native
    
    /* 3 */ val GUTTER_LINE_NUMBERS: typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_LINE_NUMBERS & Double = js.native
    
    /* 5 */ val GUTTER_VIEW_ZONE: typings.monacoEditor.mod.editor.MouseTargetType.GUTTER_VIEW_ZONE & Double = js.native
    
    /* 13 */ val OUTSIDE_EDITOR: typings.monacoEditor.mod.editor.MouseTargetType.OUTSIDE_EDITOR & Double = js.native
    
    /* 12 */ val OVERLAY_WIDGET: typings.monacoEditor.mod.editor.MouseTargetType.OVERLAY_WIDGET & Double = js.native
    
    /* 10 */ val OVERVIEW_RULER: typings.monacoEditor.mod.editor.MouseTargetType.OVERVIEW_RULER & Double = js.native
    
    /* 11 */ val SCROLLBAR: typings.monacoEditor.mod.editor.MouseTargetType.SCROLLBAR & Double = js.native
    
    /* 1 */ val TEXTAREA: typings.monacoEditor.mod.editor.MouseTargetType.TEXTAREA & Double = js.native
    
    /* 0 */ val UNKNOWN: typings.monacoEditor.mod.editor.MouseTargetType.UNKNOWN & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.OverlayWidgetPositionPreference")
  @js.native
  object OverlayWidgetPositionPreference extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.OverlayWidgetPositionPreference & Double] = js.native
    
    /* 1 */ val BOTTOM_RIGHT_CORNER: typings.monacoEditor.mod.editor.OverlayWidgetPositionPreference.BOTTOM_RIGHT_CORNER & Double = js.native
    
    /* 2 */ val TOP_CENTER: typings.monacoEditor.mod.editor.OverlayWidgetPositionPreference.TOP_CENTER & Double = js.native
    
    /* 0 */ val TOP_RIGHT_CORNER: typings.monacoEditor.mod.editor.OverlayWidgetPositionPreference.TOP_RIGHT_CORNER & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.OverviewRulerLane")
  @js.native
  object OverviewRulerLane extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.OverviewRulerLane & Double] = js.native
    
    /* 2 */ val Center: typings.monacoEditor.mod.editor.OverviewRulerLane.Center & Double = js.native
    
    /* 7 */ val Full: typings.monacoEditor.mod.editor.OverviewRulerLane.Full & Double = js.native
    
    /* 1 */ val Left: typings.monacoEditor.mod.editor.OverviewRulerLane.Left & Double = js.native
    
    /* 4 */ val Right: typings.monacoEditor.mod.editor.OverviewRulerLane.Right & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.PositionAffinity")
  @js.native
  object PositionAffinity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.PositionAffinity & Double] = js.native
    
    /* 0 */ val Left: typings.monacoEditor.mod.editor.PositionAffinity.Left & Double = js.native
    
    /* 3 */ val LeftOfInjectedText: typings.monacoEditor.mod.editor.PositionAffinity.LeftOfInjectedText & Double = js.native
    
    /* 2 */ val None: typings.monacoEditor.mod.editor.PositionAffinity.None & Double = js.native
    
    /* 1 */ val Right: typings.monacoEditor.mod.editor.PositionAffinity.Right & Double = js.native
    
    /* 4 */ val RightOfInjectedText: typings.monacoEditor.mod.editor.PositionAffinity.RightOfInjectedText & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.RangeMapping")
  @js.native
  open class RangeMapping protected ()
    extends typings.monacoEditor.mod.editor.RangeMapping {
    def this(originalRange: typings.monacoEditor.mod.Range, modifiedRange: typings.monacoEditor.mod.Range) = this()
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.RenderLineNumbersType")
  @js.native
  object RenderLineNumbersType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.RenderLineNumbersType & Double] = js.native
    
    /* 4 */ val Custom: typings.monacoEditor.mod.editor.RenderLineNumbersType.Custom & Double = js.native
    
    /* 3 */ val Interval: typings.monacoEditor.mod.editor.RenderLineNumbersType.Interval & Double = js.native
    
    /* 0 */ val Off: typings.monacoEditor.mod.editor.RenderLineNumbersType.Off & Double = js.native
    
    /* 1 */ val On: typings.monacoEditor.mod.editor.RenderLineNumbersType.On & Double = js.native
    
    /* 2 */ val Relative: typings.monacoEditor.mod.editor.RenderLineNumbersType.Relative & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.RenderMinimap")
  @js.native
  object RenderMinimap extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.RenderMinimap & Double] = js.native
    
    /* 2 */ val Blocks: typings.monacoEditor.mod.editor.RenderMinimap.Blocks & Double = js.native
    
    /* 0 */ val None: typings.monacoEditor.mod.editor.RenderMinimap.None & Double = js.native
    
    /* 1 */ val Text: typings.monacoEditor.mod.editor.RenderMinimap.Text & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.ScrollType")
  @js.native
  object ScrollType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.ScrollType & Double] = js.native
    
    /* 1 */ val Immediate: typings.monacoEditor.mod.editor.ScrollType.Immediate & Double = js.native
    
    /* 0 */ val Smooth: typings.monacoEditor.mod.editor.ScrollType.Smooth & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.ScrollbarVisibility")
  @js.native
  object ScrollbarVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.ScrollbarVisibility & Double] = js.native
    
    /* 1 */ val Auto: typings.monacoEditor.mod.editor.ScrollbarVisibility.Auto & Double = js.native
    
    /* 2 */ val Hidden: typings.monacoEditor.mod.editor.ScrollbarVisibility.Hidden & Double = js.native
    
    /* 3 */ val Visible: typings.monacoEditor.mod.editor.ScrollbarVisibility.Visible & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.TextEditorCursorBlinkingStyle")
  @js.native
  object TextEditorCursorBlinkingStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle & Double] = js.native
    
    /* 1 */ val Blink: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Blink & Double = js.native
    
    /* 4 */ val Expand: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Expand & Double = js.native
    
    /* 0 */ val Hidden: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Hidden & Double = js.native
    
    /* 3 */ val Phase: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Phase & Double = js.native
    
    /* 2 */ val Smooth: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Smooth & Double = js.native
    
    /* 5 */ val Solid: typings.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle.Solid & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.TextEditorCursorStyle")
  @js.native
  object TextEditorCursorStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.TextEditorCursorStyle & Double] = js.native
    
    /* 2 */ val Block: typings.monacoEditor.mod.editor.TextEditorCursorStyle.Block & Double = js.native
    
    /* 5 */ val BlockOutline: typings.monacoEditor.mod.editor.TextEditorCursorStyle.BlockOutline & Double = js.native
    
    /* 1 */ val Line: typings.monacoEditor.mod.editor.TextEditorCursorStyle.Line & Double = js.native
    
    /* 4 */ val LineThin: typings.monacoEditor.mod.editor.TextEditorCursorStyle.LineThin & Double = js.native
    
    /* 3 */ val Underline: typings.monacoEditor.mod.editor.TextEditorCursorStyle.Underline & Double = js.native
    
    /* 6 */ val UnderlineThin: typings.monacoEditor.mod.editor.TextEditorCursorStyle.UnderlineThin & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.TextModelResolvedOptions")
  @js.native
  open class TextModelResolvedOptions ()
    extends typings.monacoEditor.mod.editor.TextModelResolvedOptions
  
  @JSImport("react-monaco-editor", "monaco.editor.TrackedRangeStickiness")
  @js.native
  object TrackedRangeStickiness extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.TrackedRangeStickiness & Double] = js.native
    
    /* 0 */ val AlwaysGrowsWhenTypingAtEdges: typings.monacoEditor.mod.editor.TrackedRangeStickiness.AlwaysGrowsWhenTypingAtEdges & Double = js.native
    
    /* 3 */ val GrowsOnlyWhenTypingAfter: typings.monacoEditor.mod.editor.TrackedRangeStickiness.GrowsOnlyWhenTypingAfter & Double = js.native
    
    /* 2 */ val GrowsOnlyWhenTypingBefore: typings.monacoEditor.mod.editor.TrackedRangeStickiness.GrowsOnlyWhenTypingBefore & Double = js.native
    
    /* 1 */ val NeverGrowsWhenTypingAtEdges: typings.monacoEditor.mod.editor.TrackedRangeStickiness.NeverGrowsWhenTypingAtEdges & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.editor.WrappingIndent")
  @js.native
  object WrappingIndent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.monacoEditor.mod.editor.WrappingIndent & Double] = js.native
    
    /* 3 */ val DeepIndent: typings.monacoEditor.mod.editor.WrappingIndent.DeepIndent & Double = js.native
    
    /* 2 */ val Indent: typings.monacoEditor.mod.editor.WrappingIndent.Indent & Double = js.native
    
    /* 0 */ val None: typings.monacoEditor.mod.editor.WrappingIndent.None & Double = js.native
    
    /* 1 */ val Same: typings.monacoEditor.mod.editor.WrappingIndent.Same & Double = js.native
  }
  
  inline def addCommand(descriptor: ICommandDescriptor): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("addCommand")(descriptor.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def addEditorAction(descriptor: IActionDescriptor): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("addEditorAction")(descriptor.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def addKeybindingRule(rule: IKeybindingRule): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("addKeybindingRule")(rule.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def addKeybindingRules(rules: js.Array[IKeybindingRule]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("addKeybindingRules")(rules.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def colorize(text: String, languageId: String, options: IColorizerOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("colorize")(text.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def colorizeElement(domNode: HTMLElement, options: IColorizerElementOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizeElement")(domNode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def colorizeModelLine(model: ITextModel, lineNumber: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizeModelLine")(model.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def colorizeModelLine(model: ITextModel, lineNumber: Double, tabSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("colorizeModelLine")(model.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def create(domElement: HTMLElement): IStandaloneCodeEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any]).asInstanceOf[IStandaloneCodeEditor]
  inline def create(domElement: HTMLElement, options: Unit, `override`: IEditorOverrideServices): IStandaloneCodeEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[IStandaloneCodeEditor]
  inline def create(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IStandaloneCodeEditor]
  inline def create(
    domElement: HTMLElement,
    options: IStandaloneEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneCodeEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[IStandaloneCodeEditor]
  
  inline def createDiffEditor(domElement: HTMLElement): IStandaloneDiffEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any]).asInstanceOf[IStandaloneDiffEditor]
  inline def createDiffEditor(domElement: HTMLElement, options: Unit, `override`: IEditorOverrideServices): IStandaloneDiffEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[IStandaloneDiffEditor]
  inline def createDiffEditor(domElement: HTMLElement, options: IStandaloneDiffEditorConstructionOptions): IStandaloneDiffEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IStandaloneDiffEditor]
  inline def createDiffEditor(
    domElement: HTMLElement,
    options: IStandaloneDiffEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneDiffEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[IStandaloneDiffEditor]
  
  inline def createDiffNavigator(diffEditor: IStandaloneDiffEditor): IDiffNavigator = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffNavigator")(diffEditor.asInstanceOf[js.Any]).asInstanceOf[IDiffNavigator]
  inline def createDiffNavigator(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffNavigator")(diffEditor.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IDiffNavigator]
  
  inline def createModel(value: String): ITextModel = ^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any]).asInstanceOf[ITextModel]
  inline def createModel(value: String, language: String): ITextModel = (^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[ITextModel]
  inline def createModel(value: String, language: String, uri: typings.monacoEditor.mod.Uri): ITextModel = (^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[ITextModel]
  inline def createModel(value: String, language: Unit, uri: typings.monacoEditor.mod.Uri): ITextModel = (^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[ITextModel]
  
  inline def createWebWorker[T /* <: js.Object */](opts: IWebWorkerOptions): MonacoWebWorker[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebWorker")(opts.asInstanceOf[js.Any]).asInstanceOf[MonacoWebWorker[T]]
  
  inline def defineTheme(themeName: String, themeData: IStandaloneThemeData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineTheme")(themeName.asInstanceOf[js.Any], themeData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDiffEditors(): js.Array[IDiffEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiffEditors")().asInstanceOf[js.Array[IDiffEditor]]
  
  inline def getEditors(): js.Array[ICodeEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditors")().asInstanceOf[js.Array[ICodeEditor]]
  
  inline def getModel(uri: typings.monacoEditor.mod.Uri): ITextModel | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getModel")(uri.asInstanceOf[js.Any]).asInstanceOf[ITextModel | Null]
  
  inline def getModelMarkers(filter: Owner): js.Array[IMarker] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModelMarkers")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[IMarker]]
  
  inline def getModels(): js.Array[ITextModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModels")().asInstanceOf[js.Array[ITextModel]]
  
  inline def onDidChangeMarkers(listener: js.Function1[/* e */ js.Array[typings.monacoEditor.mod.Uri], Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidChangeMarkers")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def onDidChangeModelLanguage(listener: js.Function1[/* e */ Model, Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidChangeModelLanguage")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def onDidCreateDiffEditor(listener: js.Function1[/* diffEditor */ IDiffEditor, Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateDiffEditor")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def onDidCreateEditor(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateEditor")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateModel")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("onWillDisposeModel")(listener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def registerCommand(id: String, handler: js.Function2[/* accessor */ Any, /* repeated */ Any, Unit]): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCommand")(id.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerEditorOpener(opener: ICodeEditorOpener): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerEditorOpener")(opener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def registerLinkOpener(opener: ILinkOpener): IDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkOpener")(opener.asInstanceOf[js.Any]).asInstanceOf[IDisposable]
  
  inline def remeasureFonts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remeasureFonts")().asInstanceOf[Unit]
  
  inline def removeAllMarkers(owner: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllMarkers")(owner.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setModelLanguage(model: ITextModel, mimeTypeOrLanguageId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setModelLanguage")(model.asInstanceOf[js.Any], mimeTypeOrLanguageId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setModelMarkers(model: ITextModel, owner: String, markers: js.Array[IMarkerData]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setModelMarkers")(model.asInstanceOf[js.Any], owner.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTheme(themeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTheme")(themeName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def tokenize(text: String, languageId: String): js.Array[js.Array[typings.monacoEditor.mod.Token]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[typings.monacoEditor.mod.Token]]]
}
