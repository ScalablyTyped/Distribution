package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.distLibIacConstantsMod.IacFileTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacFileParseFailure
  extends StObject
     with IacFileData {
  
  var engineType: Null
  
  var err: js.Error
  
  @JSName("failureReason")
  var failureReason_IacFileParseFailure: String
  
  var jsonContent: Null
}
object IacFileParseFailure {
  
  inline def apply(
    engineType: Null,
    err: js.Error,
    failureReason: String,
    fileContent: String,
    filePath: String,
    fileType: IacFileTypes,
    jsonContent: Null
  ): IacFileParseFailure = {
    val __obj = js.Dynamic.literal(engineType = engineType.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], jsonContent = jsonContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IacFileParseFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IacFileParseFailure] (val x: Self) extends AnyVal {
    
    inline def setEngineType(value: Null): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setJsonContent(value: Null): Self = StObject.set(x, "jsonContent", value.asInstanceOf[js.Any])
  }
}
