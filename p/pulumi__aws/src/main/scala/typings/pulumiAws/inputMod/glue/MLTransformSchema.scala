package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MLTransformSchema extends StObject {
  
  /**
    * The type of data in the column.
    */
  var dataType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name you assign to this ML Transform. It must be unique in your account.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object MLTransformSchema {
  
  inline def apply(): MLTransformSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MLTransformSchema]
  }
  
  extension [Self <: MLTransformSchema](x: Self) {
    
    inline def setDataType(value: Input[String]): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
