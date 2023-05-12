package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilerHost
  extends StObject
     with ModuleResolutionHost {
  
  var createHash: js.UndefOr[js.Function1[/* data */ java.lang.String, java.lang.String]] = js.native
  
  var getCancellationToken: js.UndefOr[js.Function0[CancellationToken]] = js.native
  
  def getCanonicalFileName(fileName: java.lang.String): java.lang.String = js.native
  
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MCompilerHost(): java.lang.String = js.native
  
  def getDefaultLibFileName(options: CompilerOptions): java.lang.String = js.native
  
  var getDefaultLibLocation: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ java.lang.String, js.UndefOr[java.lang.String]]] = js.native
  
  /**
    * Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
    */
  var getModuleResolutionCache: js.UndefOr[js.Function0[js.UndefOr[ModuleResolutionCache]]] = js.native
  
  def getNewLine(): java.lang.String = js.native
  
  var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ java.lang.String, js.UndefOr[ParsedCommandLine]]] = js.native
  
  def getSourceFile(fileName: java.lang.String, languageVersionOrOptions: CreateSourceFileOptions): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersionOrOptions: CreateSourceFileOptions,
    onError: js.Function1[/* message */ java.lang.String, Unit]
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersionOrOptions: CreateSourceFileOptions,
    onError: js.Function1[/* message */ java.lang.String, Unit],
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersionOrOptions: CreateSourceFileOptions,
    onError: Unit,
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(fileName: java.lang.String, languageVersionOrOptions: ScriptTarget): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersionOrOptions: ScriptTarget,
    onError: js.Function1[/* message */ java.lang.String, Unit]
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersionOrOptions: ScriptTarget,
    onError: js.Function1[/* message */ java.lang.String, Unit],
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  def getSourceFile(
    fileName: java.lang.String,
    languageVersionOrOptions: ScriptTarget,
    onError: Unit,
    shouldCreateNewSourceFile: Boolean
  ): js.UndefOr[SourceFile] = js.native
  
  var getSourceFileByPath: js.UndefOr[
    js.Function5[
      /* fileName */ java.lang.String, 
      /* path */ Path, 
      /* languageVersionOrOptions */ ScriptTarget | CreateSourceFileOptions, 
      /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, Unit]], 
      /* shouldCreateNewSourceFile */ js.UndefOr[Boolean], 
      js.UndefOr[SourceFile]
    ]
  ] = js.native
  
  /** If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives */
  var hasInvalidatedResolutions: js.UndefOr[js.Function1[/* filePath */ Path, Boolean]] = js.native
  
  var readDirectory: js.UndefOr[
    js.Function5[
      /* rootDir */ java.lang.String, 
      /* extensions */ js.Array[java.lang.String], 
      /* excludes */ js.UndefOr[js.Array[java.lang.String]], 
      /* includes */ js.Array[java.lang.String], 
      /* depth */ js.UndefOr[Double], 
      js.Array[java.lang.String]
    ]
  ] = js.native
  
  var resolveModuleNameLiterals: js.UndefOr[
    js.Function6[
      /* moduleLiterals */ js.Array[StringLiteralLike], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      /* containingSourceFile */ SourceFile, 
      /* reusedNames */ js.UndefOr[js.Array[StringLiteralLike]], 
      js.Array[ResolvedModuleWithFailedLookupLocations]
    ]
  ] = js.native
  
  /** @deprecated supply resolveModuleNameLiterals instead for resolution that can handle newer resolution modes like nodenext */
  var resolveModuleNames: js.UndefOr[
    js.Function6[
      /* moduleNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      /* containingSourceFile */ js.UndefOr[SourceFile], 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.native
  
  var resolveTypeReferenceDirectiveReferences: js.UndefOr[
    js.Function6[
      /* typeDirectiveReferences */ js.Array[FileReference | java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      /* containingSourceFile */ js.UndefOr[SourceFile], 
      /* reusedNames */ js.UndefOr[js.Array[FileReference | java.lang.String]], 
      js.Array[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
    ]
  ] = js.native
  
  /**
    * @deprecated supply resolveTypeReferenceDirectiveReferences instead for resolution that can handle newer resolution modes like nodenext
    *
    * This method is a companion for 'resolveModuleNames' and is used to resolve 'types' references to actual type declaration files
    */
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function5[
      /* typeReferenceDirectiveNames */ js.Array[FileReference | java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      /* containingFileMode */ js.UndefOr[ResolutionMode], 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.native
  
  @JSName("useCaseSensitiveFileNames")
  def useCaseSensitiveFileNames_MCompilerHost(): Boolean = js.native
  
  def writeFile(fileName: java.lang.String, text: java.lang.String, writeByteOrderMark: Boolean): Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    text: java.lang.String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ java.lang.String, Unit]
  ): Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    text: java.lang.String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ java.lang.String, Unit],
    sourceFiles: js.Array[SourceFile]
  ): Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    text: java.lang.String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ java.lang.String, Unit],
    sourceFiles: js.Array[SourceFile],
    data: WriteFileCallbackData
  ): Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    text: java.lang.String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ java.lang.String, Unit],
    sourceFiles: Unit,
    data: WriteFileCallbackData
  ): Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    text: java.lang.String,
    writeByteOrderMark: Boolean,
    onError: Unit,
    sourceFiles: js.Array[SourceFile]
  ): Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    text: java.lang.String,
    writeByteOrderMark: Boolean,
    onError: Unit,
    sourceFiles: js.Array[SourceFile],
    data: WriteFileCallbackData
  ): Unit = js.native
  def writeFile(
    fileName: java.lang.String,
    text: java.lang.String,
    writeByteOrderMark: Boolean,
    onError: Unit,
    sourceFiles: Unit,
    data: WriteFileCallbackData
  ): Unit = js.native
  @JSName("writeFile")
  var writeFile_Original: WriteFileCallback = js.native
}
