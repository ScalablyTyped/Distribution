package typings.schematicsAngular.typescriptMod

import typings.schematicsAngular.anon.WithMetadataCompletionInf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageService extends StObject {
  
  def applyCodeActionCommand(action: js.Array[CodeActionCommand]): js.Promise[js.Array[ApplyCodeActionCommandResult]] = js.native
  def applyCodeActionCommand(action: js.Array[CodeActionCommand], formatSettings: FormatCodeSettings): js.Promise[js.Array[ApplyCodeActionCommandResult]] = js.native
  def applyCodeActionCommand(action: CodeActionCommand): js.Promise[ApplyCodeActionCommandResult] = js.native
  def applyCodeActionCommand(action: CodeActionCommand, formatSettings: FormatCodeSettings): js.Promise[ApplyCodeActionCommandResult] = js.native
  /** @deprecated `fileName` will be ignored */
  def applyCodeActionCommand(fileName: java.lang.String, action: js.Array[CodeActionCommand]): js.Promise[js.Array[ApplyCodeActionCommandResult]] = js.native
  /** @deprecated `fileName` will be ignored */
  def applyCodeActionCommand(fileName: java.lang.String, action: CodeActionCommand): js.Promise[ApplyCodeActionCommandResult] = js.native
  
  /** This is used as a part of restarting the language service. */
  def cleanupSemanticCache(): Unit = js.native
  
  def commentSelection(fileName: java.lang.String, textRange: TextRange): js.Array[TextChange] = js.native
  
  def dispose(): Unit = js.native
  
  def findReferences(fileName: java.lang.String, position: Double): js.UndefOr[js.Array[ReferencedSymbol]] = js.native
  
  def findRenameLocations(fileName: java.lang.String, position: Double, findInStrings: Boolean, findInComments: Boolean): js.UndefOr[js.Array[RenameLocation]] = js.native
  def findRenameLocations(
    fileName: java.lang.String,
    position: Double,
    findInStrings: Boolean,
    findInComments: Boolean,
    providePrefixAndSuffixTextForRename: Boolean
  ): js.UndefOr[js.Array[RenameLocation]] = js.native
  
  def getApplicableRefactors(fileName: java.lang.String, positionOrRange: Double): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: Double,
    preferences: Unit,
    triggerReason: Unit,
    kind: java.lang.String
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: Double,
    preferences: Unit,
    triggerReason: RefactorTriggerReason
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: Double,
    preferences: Unit,
    triggerReason: RefactorTriggerReason,
    kind: java.lang.String
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(fileName: java.lang.String, positionOrRange: Double, preferences: UserPreferences): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: Double,
    preferences: UserPreferences,
    triggerReason: Unit,
    kind: java.lang.String
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: Double,
    preferences: UserPreferences,
    triggerReason: RefactorTriggerReason
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: Double,
    preferences: UserPreferences,
    triggerReason: RefactorTriggerReason,
    kind: java.lang.String
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(fileName: java.lang.String, positionOrRange: TextRange): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: TextRange,
    preferences: Unit,
    triggerReason: Unit,
    kind: java.lang.String
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: TextRange,
    preferences: Unit,
    triggerReason: RefactorTriggerReason
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: TextRange,
    preferences: Unit,
    triggerReason: RefactorTriggerReason,
    kind: java.lang.String
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(fileName: java.lang.String, positionOrRange: TextRange, preferences: UserPreferences): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: TextRange,
    preferences: UserPreferences,
    triggerReason: Unit,
    kind: java.lang.String
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: TextRange,
    preferences: UserPreferences,
    triggerReason: RefactorTriggerReason
  ): js.Array[ApplicableRefactorInfo] = js.native
  def getApplicableRefactors(
    fileName: java.lang.String,
    positionOrRange: TextRange,
    preferences: UserPreferences,
    triggerReason: RefactorTriggerReason,
    kind: java.lang.String
  ): js.Array[ApplicableRefactorInfo] = js.native
  
  def getBraceMatchingAtPosition(fileName: java.lang.String, position: Double): js.Array[TextSpan] = js.native
  
  def getBreakpointStatementAtPosition(fileName: java.lang.String, position: Double): js.UndefOr[TextSpan] = js.native
  
  def getCodeFixesAtPosition(
    fileName: java.lang.String,
    start: Double,
    end: Double,
    errorCodes: js.Array[Double],
    formatOptions: FormatCodeSettings,
    preferences: UserPreferences
  ): js.Array[CodeFixAction] = js.native
  
  def getCombinedCodeFix(
    scope: CombinedCodeFixScope,
    fixId: js.Object,
    formatOptions: FormatCodeSettings,
    preferences: UserPreferences
  ): CombinedCodeActions = js.native
  
  /**
    * Gets global diagnostics related to the program configuration and compiler options.
    */
  def getCompilerOptionsDiagnostics(): js.Array[Diagnostic] = js.native
  
  /**
    * Gets the extended details for a completion entry retrieved from `getCompletionsAtPosition`.
    *
    * @param fileName The path to the file
    * @param position A zero based index of the character where you want the entries
    * @param entryName The `name` from an existing completion which came from `getCompletionsAtPosition`
    * @param formatOptions How should code samples in the completions be formatted, can be undefined for backwards compatibility
    * @param source `source` property from the completion entry
    * @param preferences User settings, can be undefined for backwards compatibility
    * @param data `data` property from the completion entry
    */
  def getCompletionEntryDetails(fileName: java.lang.String, position: Double, entryName: java.lang.String): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: Unit,
    source: java.lang.String
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: Unit,
    source: java.lang.String,
    preferences: Unit,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: Unit,
    source: java.lang.String,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: Unit,
    source: java.lang.String,
    preferences: UserPreferences,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: Unit,
    source: Unit,
    preferences: Unit,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: Unit,
    source: Unit,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: Unit,
    source: Unit,
    preferences: UserPreferences,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeOptions
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeOptions,
    source: java.lang.String
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeOptions,
    source: java.lang.String,
    preferences: Unit,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeOptions,
    source: java.lang.String,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeOptions,
    source: java.lang.String,
    preferences: UserPreferences,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeOptions,
    source: Unit,
    preferences: Unit,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeOptions,
    source: Unit,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeOptions,
    source: Unit,
    preferences: UserPreferences,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeSettings
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeSettings,
    source: java.lang.String
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeSettings,
    source: java.lang.String,
    preferences: Unit,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeSettings,
    source: java.lang.String,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeSettings,
    source: java.lang.String,
    preferences: UserPreferences,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeSettings,
    source: Unit,
    preferences: Unit,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeSettings,
    source: Unit,
    preferences: UserPreferences
  ): js.UndefOr[CompletionEntryDetails] = js.native
  def getCompletionEntryDetails(
    fileName: java.lang.String,
    position: Double,
    entryName: java.lang.String,
    formatOptions: FormatCodeSettings,
    source: Unit,
    preferences: UserPreferences,
    data: CompletionEntryData
  ): js.UndefOr[CompletionEntryDetails] = js.native
  
  def getCompletionEntrySymbol(fileName: java.lang.String, position: Double, name: java.lang.String): js.UndefOr[Symbol] = js.native
  def getCompletionEntrySymbol(fileName: java.lang.String, position: Double, name: java.lang.String, source: java.lang.String): js.UndefOr[Symbol] = js.native
  
  /**
    * Gets completion entries at a particular position in a file.
    *
    * @param fileName The path to the file
    * @param position A zero-based index of the character where you want the entries
    * @param options An object describing how the request was triggered and what kinds
    * of code actions can be returned with the completions.
    * @param formattingSettings settings needed for calling formatting functions.
    */
  def getCompletionsAtPosition(fileName: java.lang.String, position: Double): js.UndefOr[WithMetadataCompletionInf] = js.native
  def getCompletionsAtPosition(
    fileName: java.lang.String,
    position: Double,
    options: Unit,
    formattingSettings: FormatCodeSettings
  ): js.UndefOr[WithMetadataCompletionInf] = js.native
  def getCompletionsAtPosition(fileName: java.lang.String, position: Double, options: GetCompletionsAtPositionOptions): js.UndefOr[WithMetadataCompletionInf] = js.native
  def getCompletionsAtPosition(
    fileName: java.lang.String,
    position: Double,
    options: GetCompletionsAtPositionOptions,
    formattingSettings: FormatCodeSettings
  ): js.UndefOr[WithMetadataCompletionInf] = js.native
  
  def getDefinitionAndBoundSpan(fileName: java.lang.String, position: Double): js.UndefOr[DefinitionInfoAndBoundSpan] = js.native
  
  def getDefinitionAtPosition(fileName: java.lang.String, position: Double): js.UndefOr[js.Array[DefinitionInfo]] = js.native
  
  def getDocCommentTemplateAtPosition(fileName: java.lang.String, position: Double): js.UndefOr[TextInsertion] = js.native
  def getDocCommentTemplateAtPosition(fileName: java.lang.String, position: Double, options: DocCommentTemplateOptions): js.UndefOr[TextInsertion] = js.native
  
  def getDocumentHighlights(fileName: java.lang.String, position: Double, filesToSearch: js.Array[java.lang.String]): js.UndefOr[js.Array[DocumentHighlights]] = js.native
  
  def getEditsForFileRename(oldFilePath: java.lang.String, newFilePath: java.lang.String, formatOptions: FormatCodeSettings): js.Array[FileTextChanges] = js.native
  def getEditsForFileRename(
    oldFilePath: java.lang.String,
    newFilePath: java.lang.String,
    formatOptions: FormatCodeSettings,
    preferences: UserPreferences
  ): js.Array[FileTextChanges] = js.native
  
  def getEditsForRefactor(
    fileName: java.lang.String,
    formatOptions: FormatCodeSettings,
    positionOrRange: Double,
    refactorName: java.lang.String,
    actionName: java.lang.String
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEditsForRefactor(
    fileName: java.lang.String,
    formatOptions: FormatCodeSettings,
    positionOrRange: Double,
    refactorName: java.lang.String,
    actionName: java.lang.String,
    preferences: UserPreferences
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEditsForRefactor(
    fileName: java.lang.String,
    formatOptions: FormatCodeSettings,
    positionOrRange: TextRange,
    refactorName: java.lang.String,
    actionName: java.lang.String
  ): js.UndefOr[RefactorEditInfo] = js.native
  def getEditsForRefactor(
    fileName: java.lang.String,
    formatOptions: FormatCodeSettings,
    positionOrRange: TextRange,
    refactorName: java.lang.String,
    actionName: java.lang.String,
    preferences: UserPreferences
  ): js.UndefOr[RefactorEditInfo] = js.native
  
  def getEmitOutput(fileName: java.lang.String): EmitOutput = js.native
  def getEmitOutput(fileName: java.lang.String, emitOnlyDtsFiles: Boolean): EmitOutput = js.native
  def getEmitOutput(fileName: java.lang.String, emitOnlyDtsFiles: Boolean, forceDtsEmit: Boolean): EmitOutput = js.native
  def getEmitOutput(fileName: java.lang.String, emitOnlyDtsFiles: Unit, forceDtsEmit: Boolean): EmitOutput = js.native
  
  /**
    * Gets semantic highlights information for a particular file. Has two formats, an older
    * version used by VS and a format used by VS Code.
    *
    * @param fileName The path to the file
    * @param position A text span to return results within
    * @param format Which format to use, defaults to "original"
    * @returns a number array encoded as triples of [start, length, ClassificationType, ...].
    */
  def getEncodedSemanticClassifications(fileName: java.lang.String, span: TextSpan): Classifications = js.native
  def getEncodedSemanticClassifications(fileName: java.lang.String, span: TextSpan, format: SemanticClassificationFormat): Classifications = js.native
  
  /** Encoded as triples of [start, length, ClassificationType]. */
  def getEncodedSyntacticClassifications(fileName: java.lang.String, span: TextSpan): Classifications = js.native
  
  def getFileReferences(fileName: java.lang.String): js.Array[ReferenceEntry] = js.native
  
  def getFormattingEditsAfterKeystroke(fileName: java.lang.String, position: Double, key: java.lang.String, options: FormatCodeOptions): js.Array[TextChange] = js.native
  def getFormattingEditsAfterKeystroke(fileName: java.lang.String, position: Double, key: java.lang.String, options: FormatCodeSettings): js.Array[TextChange] = js.native
  
  def getFormattingEditsForDocument(fileName: java.lang.String, options: FormatCodeOptions): js.Array[TextChange] = js.native
  def getFormattingEditsForDocument(fileName: java.lang.String, options: FormatCodeSettings): js.Array[TextChange] = js.native
  
  def getFormattingEditsForRange(fileName: java.lang.String, start: Double, end: Double, options: FormatCodeOptions): js.Array[TextChange] = js.native
  def getFormattingEditsForRange(fileName: java.lang.String, start: Double, end: Double, options: FormatCodeSettings): js.Array[TextChange] = js.native
  
  def getImplementationAtPosition(fileName: java.lang.String, position: Double): js.UndefOr[js.Array[ImplementationLocation]] = js.native
  
  def getIndentationAtPosition(fileName: java.lang.String, position: Double, options: EditorOptions): Double = js.native
  def getIndentationAtPosition(fileName: java.lang.String, position: Double, options: EditorSettings): Double = js.native
  
  /**
    * This will return a defined result if the position is after the `>` of the opening tag, or somewhere in the text, of a JSXElement with no closing tag.
    * Editors should call this after `>` is typed.
    */
  def getJsxClosingTagAtPosition(fileName: java.lang.String, position: Double): js.UndefOr[JsxClosingTagInfo] = js.native
  
  def getNameOrDottedNameSpan(fileName: java.lang.String, startPos: Double, endPos: Double): js.UndefOr[TextSpan] = js.native
  
  def getNavigateToItems(searchValue: java.lang.String): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(searchValue: java.lang.String, maxResultCount: Double): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(searchValue: java.lang.String, maxResultCount: Double, fileName: java.lang.String): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(
    searchValue: java.lang.String,
    maxResultCount: Double,
    fileName: java.lang.String,
    excludeDtsFiles: Boolean
  ): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(searchValue: java.lang.String, maxResultCount: Double, fileName: Unit, excludeDtsFiles: Boolean): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(searchValue: java.lang.String, maxResultCount: Unit, fileName: java.lang.String): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(
    searchValue: java.lang.String,
    maxResultCount: Unit,
    fileName: java.lang.String,
    excludeDtsFiles: Boolean
  ): js.Array[NavigateToItem] = js.native
  def getNavigateToItems(searchValue: java.lang.String, maxResultCount: Unit, fileName: Unit, excludeDtsFiles: Boolean): js.Array[NavigateToItem] = js.native
  
  def getNavigationBarItems(fileName: java.lang.String): js.Array[NavigationBarItem] = js.native
  
  def getNavigationTree(fileName: java.lang.String): NavigationTree = js.native
  
  /** @deprecated */
  def getOccurrencesAtPosition(fileName: java.lang.String, position: Double): js.UndefOr[js.Array[ReferenceEntry]] = js.native
  
  def getOutliningSpans(fileName: java.lang.String): js.Array[OutliningSpan] = js.native
  
  def getProgram(): js.UndefOr[Program] = js.native
  
  /**
    * Gets semantic information about the identifier at a particular position in a
    * file. Quick info is what you typically see when you hover in an editor.
    *
    * @param fileName The path to the file
    * @param position A zero-based index of the character where you want the quick info
    */
  def getQuickInfoAtPosition(fileName: java.lang.String, position: Double): js.UndefOr[QuickInfo] = js.native
  
  def getReferencesAtPosition(fileName: java.lang.String, position: Double): js.UndefOr[js.Array[ReferenceEntry]] = js.native
  
  /** @deprecated Use the signature with `UserPreferences` instead. */
  def getRenameInfo(fileName: java.lang.String, position: Double): RenameInfo = js.native
  def getRenameInfo(fileName: java.lang.String, position: Double, options: RenameInfoOptions): RenameInfo = js.native
  def getRenameInfo(fileName: java.lang.String, position: Double, preferences: UserPreferences): RenameInfo = js.native
  
  /** @deprecated Use getEncodedSemanticClassifications instead. */
  def getSemanticClassifications(fileName: java.lang.String, span: TextSpan): js.Array[ClassifiedSpan] = js.native
  def getSemanticClassifications(fileName: java.lang.String, span: TextSpan, format: SemanticClassificationFormat): js.Array[ClassifiedSpan | ClassifiedSpan2020] = js.native
  
  /**
    * Gets warnings or errors indicating type system issues in a given file.
    * Requesting semantic diagnostics may start up the type system and
    * run deferred work, so the first call may take longer than subsequent calls.
    *
    * Unlike the other get*Diagnostics functions, these diagnostics can potentially not
    * include a reference to a source file. Specifically, the first time this is called,
    * it will return global diagnostics with no associated location.
    *
    * To contrast the differences between semantic and syntactic diagnostics, consider the
    * sentence: "The sun is green." is syntactically correct; those are real English words with
    * correct sentence structure. However, it is semantically invalid, because it is not true.
    *
    * @param fileName A path to the file you want semantic diagnostics for
    */
  def getSemanticDiagnostics(fileName: java.lang.String): js.Array[Diagnostic] = js.native
  
  def getSignatureHelpItems(fileName: java.lang.String, position: Double): js.UndefOr[SignatureHelpItems] = js.native
  def getSignatureHelpItems(fileName: java.lang.String, position: Double, options: SignatureHelpItemsOptions): js.UndefOr[SignatureHelpItems] = js.native
  
  def getSmartSelectionRange(fileName: java.lang.String, position: Double): SelectionRange = js.native
  
  def getSpanOfEnclosingComment(fileName: java.lang.String, position: Double, onlyMultiLine: Boolean): js.UndefOr[TextSpan] = js.native
  
  /**
    * Gets suggestion diagnostics for a specific file. These diagnostics tend to
    * proactively suggest refactors, as opposed to diagnostics that indicate
    * potentially incorrect runtime behavior.
    *
    * @param fileName A path to the file you want semantic diagnostics for
    */
  def getSuggestionDiagnostics(fileName: java.lang.String): js.Array[DiagnosticWithLocation] = js.native
  
  /** @deprecated Use getEncodedSyntacticClassifications instead. */
  def getSyntacticClassifications(fileName: java.lang.String, span: TextSpan): js.Array[ClassifiedSpan] = js.native
  def getSyntacticClassifications(fileName: java.lang.String, span: TextSpan, format: SemanticClassificationFormat): js.Array[ClassifiedSpan | ClassifiedSpan2020] = js.native
  
  /**
    * Gets errors indicating invalid syntax in a file.
    *
    * In English, "this cdeo have, erorrs" is syntactically invalid because it has typos,
    * grammatical errors, and misplaced punctuation. Likewise, examples of syntax
    * errors in TypeScript are missing parentheses in an `if` statement, mismatched
    * curly braces, and using a reserved keyword as a variable name.
    *
    * These diagnostics are inexpensive to compute and don't require knowledge of
    * other files. Note that a non-empty result increases the likelihood of false positives
    * from `getSemanticDiagnostics`.
    *
    * While these represent the majority of syntax-related diagnostics, there are some
    * that require the type system, which will be present in `getSemanticDiagnostics`.
    *
    * @param fileName A path to the file you want syntactic diagnostics for
    */
  def getSyntacticDiagnostics(fileName: java.lang.String): js.Array[DiagnosticWithLocation] = js.native
  
  def getTodoComments(fileName: java.lang.String, descriptors: js.Array[TodoCommentDescriptor]): js.Array[TodoComment] = js.native
  
  def getTypeDefinitionAtPosition(fileName: java.lang.String, position: Double): js.UndefOr[js.Array[DefinitionInfo]] = js.native
  
  def isValidBraceCompletionAtPosition(fileName: java.lang.String, position: Double, openingBrace: Double): Boolean = js.native
  
  def organizeImports(args: OrganizeImportsArgs, formatOptions: FormatCodeSettings): js.Array[FileTextChanges] = js.native
  def organizeImports(args: OrganizeImportsArgs, formatOptions: FormatCodeSettings, preferences: UserPreferences): js.Array[FileTextChanges] = js.native
  
  def prepareCallHierarchy(fileName: java.lang.String, position: Double): js.UndefOr[CallHierarchyItem | js.Array[CallHierarchyItem]] = js.native
  
  def provideCallHierarchyIncomingCalls(fileName: java.lang.String, position: Double): js.Array[CallHierarchyIncomingCall] = js.native
  
  def provideCallHierarchyOutgoingCalls(fileName: java.lang.String, position: Double): js.Array[CallHierarchyOutgoingCall] = js.native
  
  def provideInlayHints(fileName: java.lang.String, span: TextSpan): js.Array[InlayHint] = js.native
  def provideInlayHints(fileName: java.lang.String, span: TextSpan, preferences: UserPreferences): js.Array[InlayHint] = js.native
  
  var toLineColumnOffset: js.UndefOr[
    js.Function2[/* fileName */ java.lang.String, /* position */ Double, LineAndCharacter]
  ] = js.native
  
  def toggleLineComment(fileName: java.lang.String, textRange: TextRange): js.Array[TextChange] = js.native
  
  def toggleMultilineComment(fileName: java.lang.String, textRange: TextRange): js.Array[TextChange] = js.native
  
  def uncommentSelection(fileName: java.lang.String, textRange: TextRange): js.Array[TextChange] = js.native
}
