package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableGlobalSecondaryIndex extends StObject {
  
  var hashKey: String
  
  /**
    * The name of the DynamoDB table.
    */
  var name: String
  
  var nonKeyAttributes: js.Array[String]
  
  var projectionType: String
  
  var rangeKey: String
  
  var readCapacity: Double
  
  var writeCapacity: Double
}
object GetTableGlobalSecondaryIndex {
  
  inline def apply(
    hashKey: String,
    name: String,
    nonKeyAttributes: js.Array[String],
    projectionType: String,
    rangeKey: String,
    readCapacity: Double,
    writeCapacity: Double
  ): GetTableGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonKeyAttributes = nonKeyAttributes.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any], readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableGlobalSecondaryIndex]
  }
  
  extension [Self <: GetTableGlobalSecondaryIndex](x: Self) {
    
    inline def setHashKey(value: String): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNonKeyAttributes(value: js.Array[String]): Self = StObject.set(x, "nonKeyAttributes", value.asInstanceOf[js.Any])
    
    inline def setNonKeyAttributesVarargs(value: String*): Self = StObject.set(x, "nonKeyAttributes", js.Array(value :_*))
    
    inline def setProjectionType(value: String): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
    
    inline def setRangeKey(value: String): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
    
    inline def setReadCapacity(value: Double): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
    
    inline def setWriteCapacity(value: Double): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
  }
}
