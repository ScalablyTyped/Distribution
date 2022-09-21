package typings.schematicsAngular.typescriptMod

import typings.schematicsAngular.typescriptMod.ModuleKind.CommonJS
import typings.schematicsAngular.typescriptMod.ModuleKind.ESNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.schematicsAngular.typescriptMod.ModuleResolutionHost because var conflicts: directoryExists, getCurrentDirectory. Inlined fileExists, readFile, trace, realpath, getDirectories, useCaseSensitiveFileNames
- typings.schematicsAngular.typescriptMod.MinimalResolutionCacheHost because var conflicts: directoryExists, getCurrentDirectory. Inlined getCompilationSettings, getCompilerHost */ @js.native
trait LanguageServiceHost
  extends StObject
     with GetEffectiveTypeRootsHost {
  
  var error: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  
  def fileExists(path: java.lang.String): Boolean = js.native
  
  var getCancellationToken: js.UndefOr[js.Function0[HostCancellationToken]] = js.native
  
  def getCompilationSettings(): CompilerOptions = js.native
  
  var getCompilerHost: js.UndefOr[js.Function0[js.UndefOr[CompilerHost]]] = js.native
  
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MLanguageServiceHost(): java.lang.String = js.native
  
  /**
    * Gets a set of custom transformers to use during emit.
    */
  var getCustomTransformers: js.UndefOr[js.Function0[js.UndefOr[CustomTransformers]]] = js.native
  
  def getDefaultLibFileName(options: CompilerOptions): java.lang.String = js.native
  
  var getDirectories: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, js.Array[java.lang.String]]] = js.native
  
  var getLocalizedDiagnosticMessages: js.UndefOr[js.Function0[Any]] = js.native
  
  var getNewLine: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ java.lang.String, js.UndefOr[ParsedCommandLine]]] = js.native
  
  var getProjectReferences: js.UndefOr[js.Function0[js.UndefOr[js.Array[ProjectReference]]]] = js.native
  
  var getProjectVersion: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  var getResolvedModuleWithFailedLookupLocationsFromCache: js.UndefOr[
    js.Function3[
      /* modulename */ java.lang.String, 
      /* containingFile */ java.lang.String, 
      /* resolutionMode */ js.UndefOr[CommonJS | ESNext], 
      js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    ]
  ] = js.native
  
  def getScriptFileNames(): js.Array[java.lang.String] = js.native
  
  var getScriptKind: js.UndefOr[js.Function1[/* fileName */ java.lang.String, ScriptKind]] = js.native
  
  def getScriptSnapshot(fileName: java.lang.String): js.UndefOr[IScriptSnapshot] = js.native
  
  def getScriptVersion(fileName: java.lang.String): java.lang.String = js.native
  
  var getTypeRootsVersion: js.UndefOr[js.Function0[Double]] = js.native
  
  var installPackage: js.UndefOr[
    js.Function1[/* options */ InstallPackageOptions, js.Promise[ApplyCodeActionCommandResult]]
  ] = js.native
  
  var isKnownTypesPackageName: js.UndefOr[js.Function1[/* name */ java.lang.String, Boolean]] = js.native
  
  var log: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  
  var readDirectory: js.UndefOr[
    js.Function5[
      /* path */ java.lang.String, 
      /* extensions */ js.UndefOr[js.Array[java.lang.String]], 
      /* exclude */ js.UndefOr[js.Array[java.lang.String]], 
      /* include */ js.UndefOr[js.Array[java.lang.String]], 
      /* depth */ js.UndefOr[Double], 
      js.Array[java.lang.String]
    ]
  ] = js.native
  
  def readFile(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def readFile(path: java.lang.String, encoding: java.lang.String): js.UndefOr[java.lang.String] = js.native
  
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.native
  
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
  
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function5[
      /* typeDirectiveNames */ js.Array[FileReference | java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      /* containingFileMode */ js.UndefOr[ESNext | CommonJS], 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.native
  
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  
  var useCaseSensitiveFileNames: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
  var writeFile: js.UndefOr[
    js.Function2[/* fileName */ java.lang.String, /* content */ java.lang.String, Unit]
  ] = js.native
}
