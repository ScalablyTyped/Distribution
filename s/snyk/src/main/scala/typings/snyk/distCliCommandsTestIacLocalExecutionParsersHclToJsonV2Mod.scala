package typings.snyk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionParsersHclToJsonV2Mod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/parsers/hcl-to-json-v2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(files: MapOfFiles): ParsedResults = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any]).asInstanceOf[ParsedResults]
  
  type FileContent = String
  
  type FilePath = String
  
  type MapOfFiles = Record[FilePath, FileContent]
  
  trait ParsedResults extends StObject {
    
    var debugLogs: MapOfFiles
    
    var failedFiles: MapOfFiles
    
    var parsedFiles: MapOfFiles
  }
  object ParsedResults {
    
    inline def apply(debugLogs: MapOfFiles, failedFiles: MapOfFiles, parsedFiles: MapOfFiles): ParsedResults = {
      val __obj = js.Dynamic.literal(debugLogs = debugLogs.asInstanceOf[js.Any], failedFiles = failedFiles.asInstanceOf[js.Any], parsedFiles = parsedFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedResults] (val x: Self) extends AnyVal {
      
      inline def setDebugLogs(value: MapOfFiles): Self = StObject.set(x, "debugLogs", value.asInstanceOf[js.Any])
      
      inline def setFailedFiles(value: MapOfFiles): Self = StObject.set(x, "failedFiles", value.asInstanceOf[js.Any])
      
      inline def setParsedFiles(value: MapOfFiles): Self = StObject.set(x, "parsedFiles", value.asInstanceOf[js.Any])
    }
  }
}
