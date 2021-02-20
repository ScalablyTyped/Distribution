package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableLocalSecondaryIndex extends StObject {
  
  /**
    * The name of the DynamoDB table.
    */
  var name: String = js.native
  
  var nonKeyAttributes: js.Array[String] = js.native
  
  var projectionType: String = js.native
  
  var rangeKey: String = js.native
}
object GetTableLocalSecondaryIndex {
  
  @scala.inline
  def apply(name: String, nonKeyAttributes: js.Array[String], projectionType: String, rangeKey: String): GetTableLocalSecondaryIndex = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nonKeyAttributes = nonKeyAttributes.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableLocalSecondaryIndex]
  }
  
  @scala.inline
  implicit class GetTableLocalSecondaryIndexMutableBuilder[Self <: GetTableLocalSecondaryIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonKeyAttributes(value: js.Array[String]): Self = StObject.set(x, "nonKeyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonKeyAttributesVarargs(value: String*): Self = StObject.set(x, "nonKeyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setProjectionType(value: String): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKey(value: String): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
  }
}
