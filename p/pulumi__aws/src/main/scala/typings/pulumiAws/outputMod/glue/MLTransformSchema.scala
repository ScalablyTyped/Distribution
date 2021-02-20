package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MLTransformSchema extends StObject {
  
  /**
    * The type of data in the column.
    */
  var dataType: String = js.native
  
  /**
    * The name you assign to this ML Transform. It must be unique in your account.
    */
  var name: String = js.native
}
object MLTransformSchema {
  
  @scala.inline
  def apply(dataType: String, name: String): MLTransformSchema = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLTransformSchema]
  }
  
  @scala.inline
  implicit class MLTransformSchemaMutableBuilder[Self <: MLTransformSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
