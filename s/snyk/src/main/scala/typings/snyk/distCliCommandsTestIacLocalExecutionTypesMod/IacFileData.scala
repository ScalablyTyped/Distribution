package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.distLibIacConstantsMod.IacFileTypes
import typings.snyk.distLibTypesMod.IacFileInDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacFileData
  extends StObject
     with IacFileInDirectory {
  
  var fileContent: String
}
object IacFileData {
  
  inline def apply(fileContent: String, filePath: String, fileType: IacFileTypes): IacFileData = {
    val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IacFileData]
  }
  
  extension [Self <: IacFileData](x: Self) {
    
    inline def setFileContent(value: String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
  }
}
