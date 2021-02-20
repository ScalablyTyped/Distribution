package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputTransformer extends StObject {
  
  var inputPathsMap: StringDictionary[String] = js.native
  
  var inputTemplate: String = js.native
}
object InputTransformer {
  
  @scala.inline
  def apply(inputPathsMap: StringDictionary[String], inputTemplate: String): InputTransformer = {
    val __obj = js.Dynamic.literal(inputPathsMap = inputPathsMap.asInstanceOf[js.Any], inputTemplate = inputTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTransformer]
  }
  
  @scala.inline
  implicit class InputTransformerMutableBuilder[Self <: InputTransformer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputPathsMap(value: StringDictionary[String]): Self = StObject.set(x, "inputPathsMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTemplate(value: String): Self = StObject.set(x, "inputTemplate", value.asInstanceOf[js.Any])
  }
}
