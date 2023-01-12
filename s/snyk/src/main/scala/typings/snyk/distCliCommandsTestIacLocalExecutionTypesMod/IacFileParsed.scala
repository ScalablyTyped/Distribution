package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.distLibIacConstantsMod.IacFileTypes
import typings.snyk.distLibIacConstantsMod.IacProjectType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacFileParsed
  extends StObject
     with IacFileData {
  
  var docId: js.UndefOr[Double] = js.undefined
  
  var engineType: EngineType
  
  var jsonContent: (Record[String, Any]) | TerraformScanInput
  
  @JSName("projectType")
  var projectType_IacFileParsed: IacProjectType
}
object IacFileParsed {
  
  inline def apply(
    engineType: EngineType,
    fileContent: String,
    filePath: String,
    fileType: IacFileTypes,
    jsonContent: (Record[String, Any]) | TerraformScanInput,
    projectType: IacProjectType
  ): IacFileParsed = {
    val __obj = js.Dynamic.literal(engineType = engineType.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], jsonContent = jsonContent.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IacFileParsed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IacFileParsed] (val x: Self) extends AnyVal {
    
    inline def setDocId(value: Double): Self = StObject.set(x, "docId", value.asInstanceOf[js.Any])
    
    inline def setDocIdUndefined: Self = StObject.set(x, "docId", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setJsonContent(value: (Record[String, Any]) | TerraformScanInput): Self = StObject.set(x, "jsonContent", value.asInstanceOf[js.Any])
    
    inline def setProjectType(value: IacProjectType): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
  }
}
