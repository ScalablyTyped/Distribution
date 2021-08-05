package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputTransformer extends StObject {
  
  var inputPathsMap: StringDictionary[String]
  
  var inputTemplate: String
}
object InputTransformer {
  
  inline def apply(inputPathsMap: StringDictionary[String], inputTemplate: String): InputTransformer = {
    val __obj = js.Dynamic.literal(inputPathsMap = inputPathsMap.asInstanceOf[js.Any], inputTemplate = inputTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTransformer]
  }
  
  extension [Self <: InputTransformer](x: Self) {
    
    inline def setInputPathsMap(value: StringDictionary[String]): Self = StObject.set(x, "inputPathsMap", value.asInstanceOf[js.Any])
    
    inline def setInputTemplate(value: String): Self = StObject.set(x, "inputTemplate", value.asInstanceOf[js.Any])
  }
}
