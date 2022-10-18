package typings.snyk.distLibTypesMod

import typings.snyk.distLibIacConstantsMod.IacFileTypes
import typings.snyk.distLibIacConstantsMod.IacProjectTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacFileInDirectory extends StObject {
  
  var failureReason: js.UndefOr[String] = js.undefined
  
  var filePath: String
  
  var fileType: IacFileTypes
  
  var projectType: js.UndefOr[IacProjectTypes] = js.undefined
}
object IacFileInDirectory {
  
  inline def apply(filePath: String, fileType: IacFileTypes): IacFileInDirectory = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IacFileInDirectory]
  }
  
  extension [Self <: IacFileInDirectory](x: Self) {
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFileType(value: IacFileTypes): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setProjectType(value: IacProjectTypes): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
    
    inline def setProjectTypeUndefined: Self = StObject.set(x, "projectType", js.undefined)
  }
}
