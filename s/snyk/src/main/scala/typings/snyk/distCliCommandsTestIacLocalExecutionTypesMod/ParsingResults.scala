package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsingResults extends StObject {
  
  var failedFiles: js.Array[IacFileParseFailure]
  
  var parsedFiles: js.Array[IacFileParsed]
}
object ParsingResults {
  
  inline def apply(failedFiles: js.Array[IacFileParseFailure], parsedFiles: js.Array[IacFileParsed]): ParsingResults = {
    val __obj = js.Dynamic.literal(failedFiles = failedFiles.asInstanceOf[js.Any], parsedFiles = parsedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsingResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsingResults] (val x: Self) extends AnyVal {
    
    inline def setFailedFiles(value: js.Array[IacFileParseFailure]): Self = StObject.set(x, "failedFiles", value.asInstanceOf[js.Any])
    
    inline def setFailedFilesVarargs(value: IacFileParseFailure*): Self = StObject.set(x, "failedFiles", js.Array(value*))
    
    inline def setParsedFiles(value: js.Array[IacFileParsed]): Self = StObject.set(x, "parsedFiles", value.asInstanceOf[js.Any])
    
    inline def setParsedFilesVarargs(value: IacFileParsed*): Self = StObject.set(x, "parsedFiles", js.Array(value*))
  }
}
