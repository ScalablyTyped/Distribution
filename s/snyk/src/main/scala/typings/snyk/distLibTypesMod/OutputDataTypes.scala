package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputDataTypes extends StObject {
  
  var stdout: Any
  
  var stringifiedData: String
  
  var stringifiedJsonData: String
  
  var stringifiedSarifData: String
}
object OutputDataTypes {
  
  inline def apply(stdout: Any, stringifiedData: String, stringifiedJsonData: String, stringifiedSarifData: String): OutputDataTypes = {
    val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any], stringifiedData = stringifiedData.asInstanceOf[js.Any], stringifiedJsonData = stringifiedJsonData.asInstanceOf[js.Any], stringifiedSarifData = stringifiedSarifData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDataTypes]
  }
  
  extension [Self <: OutputDataTypes](x: Self) {
    
    inline def setStdout(value: Any): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStringifiedData(value: String): Self = StObject.set(x, "stringifiedData", value.asInstanceOf[js.Any])
    
    inline def setStringifiedJsonData(value: String): Self = StObject.set(x, "stringifiedJsonData", value.asInstanceOf[js.Any])
    
    inline def setStringifiedSarifData(value: String): Self = StObject.set(x, "stringifiedSarifData", value.asInstanceOf[js.Any])
  }
}
