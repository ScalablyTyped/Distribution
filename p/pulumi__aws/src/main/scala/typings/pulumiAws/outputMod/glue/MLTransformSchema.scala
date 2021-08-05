package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MLTransformSchema extends StObject {
  
  /**
    * The type of data in the column.
    */
  var dataType: String
  
  /**
    * The name you assign to this ML Transform. It must be unique in your account.
    */
  var name: String
}
object MLTransformSchema {
  
  inline def apply(dataType: String, name: String): MLTransformSchema = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLTransformSchema]
  }
  
  extension [Self <: MLTransformSchema](x: Self) {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
