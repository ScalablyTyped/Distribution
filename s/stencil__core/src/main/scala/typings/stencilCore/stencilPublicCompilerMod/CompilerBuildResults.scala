package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerBuildResults extends StObject {
  
  var buildId: Double
  
  var componentGraph: js.UndefOr[BuildResultsComponentGraph] = js.undefined
  
  var diagnostics: js.Array[Diagnostic]
  
  var dirsAdded: js.Array[String]
  
  var dirsDeleted: js.Array[String]
  
  var duration: Double
  
  var filesAdded: js.Array[String]
  
  var filesChanged: js.Array[String]
  
  var filesDeleted: js.Array[String]
  
  var filesUpdated: js.Array[String]
  
  var hasError: Boolean
  
  var hasSuccessfulBuild: Boolean
  
  var hmr: js.UndefOr[HotModuleReplacement] = js.undefined
  
  var hydrateAppFilePath: js.UndefOr[String] = js.undefined
  
  var isRebuild: Boolean
  
  var namespace: String
  
  var outputs: js.Array[BuildOutput]
  
  var rootDir: String
  
  var srcDir: String
  
  var timestamp: String
}
object CompilerBuildResults {
  
  inline def apply(
    buildId: Double,
    diagnostics: js.Array[Diagnostic],
    dirsAdded: js.Array[String],
    dirsDeleted: js.Array[String],
    duration: Double,
    filesAdded: js.Array[String],
    filesChanged: js.Array[String],
    filesDeleted: js.Array[String],
    filesUpdated: js.Array[String],
    hasError: Boolean,
    hasSuccessfulBuild: Boolean,
    isRebuild: Boolean,
    namespace: String,
    outputs: js.Array[BuildOutput],
    rootDir: String,
    srcDir: String,
    timestamp: String
  ): CompilerBuildResults = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], dirsAdded = dirsAdded.asInstanceOf[js.Any], dirsDeleted = dirsDeleted.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], filesAdded = filesAdded.asInstanceOf[js.Any], filesChanged = filesChanged.asInstanceOf[js.Any], filesDeleted = filesDeleted.asInstanceOf[js.Any], filesUpdated = filesUpdated.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], hasSuccessfulBuild = hasSuccessfulBuild.asInstanceOf[js.Any], isRebuild = isRebuild.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], srcDir = srcDir.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerBuildResults]
  }
  
  extension [Self <: CompilerBuildResults](x: Self) {
    
    inline def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setComponentGraph(value: BuildResultsComponentGraph): Self = StObject.set(x, "componentGraph", value.asInstanceOf[js.Any])
    
    inline def setComponentGraphUndefined: Self = StObject.set(x, "componentGraph", js.undefined)
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setDirsAdded(value: js.Array[String]): Self = StObject.set(x, "dirsAdded", value.asInstanceOf[js.Any])
    
    inline def setDirsAddedVarargs(value: String*): Self = StObject.set(x, "dirsAdded", js.Array(value*))
    
    inline def setDirsDeleted(value: js.Array[String]): Self = StObject.set(x, "dirsDeleted", value.asInstanceOf[js.Any])
    
    inline def setDirsDeletedVarargs(value: String*): Self = StObject.set(x, "dirsDeleted", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFilesAdded(value: js.Array[String]): Self = StObject.set(x, "filesAdded", value.asInstanceOf[js.Any])
    
    inline def setFilesAddedVarargs(value: String*): Self = StObject.set(x, "filesAdded", js.Array(value*))
    
    inline def setFilesChanged(value: js.Array[String]): Self = StObject.set(x, "filesChanged", value.asInstanceOf[js.Any])
    
    inline def setFilesChangedVarargs(value: String*): Self = StObject.set(x, "filesChanged", js.Array(value*))
    
    inline def setFilesDeleted(value: js.Array[String]): Self = StObject.set(x, "filesDeleted", value.asInstanceOf[js.Any])
    
    inline def setFilesDeletedVarargs(value: String*): Self = StObject.set(x, "filesDeleted", js.Array(value*))
    
    inline def setFilesUpdated(value: js.Array[String]): Self = StObject.set(x, "filesUpdated", value.asInstanceOf[js.Any])
    
    inline def setFilesUpdatedVarargs(value: String*): Self = StObject.set(x, "filesUpdated", js.Array(value*))
    
    inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    
    inline def setHasSuccessfulBuild(value: Boolean): Self = StObject.set(x, "hasSuccessfulBuild", value.asInstanceOf[js.Any])
    
    inline def setHmr(value: HotModuleReplacement): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
    
    inline def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
    
    inline def setHydrateAppFilePath(value: String): Self = StObject.set(x, "hydrateAppFilePath", value.asInstanceOf[js.Any])
    
    inline def setHydrateAppFilePathUndefined: Self = StObject.set(x, "hydrateAppFilePath", js.undefined)
    
    inline def setIsRebuild(value: Boolean): Self = StObject.set(x, "isRebuild", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[BuildOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: BuildOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setSrcDir(value: String): Self = StObject.set(x, "srcDir", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
