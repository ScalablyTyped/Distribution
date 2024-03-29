package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleDynamodb extends StObject {
  
  /**
    * The hash key name.
    */
  var hashKeyField: String
  
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER".
    */
  var hashKeyType: js.UndefOr[String] = js.undefined
  
  /**
    * The hash key value.
    */
  var hashKeyValue: String
  
  /**
    * The operation. Valid values are "INSERT", "UPDATE", or "DELETE".
    */
  var operation: js.UndefOr[String] = js.undefined
  
  /**
    * The action payload.
    */
  var payloadField: js.UndefOr[String] = js.undefined
  
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[String] = js.undefined
  
  /**
    * The range key type. Valid values are "STRING" or "NUMBER".
    */
  var rangeKeyType: js.UndefOr[String] = js.undefined
  
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: String
  
  /**
    * The name of the DynamoDB table.
    */
  var tableName: String
}
object TopicRuleDynamodb {
  
  inline def apply(hashKeyField: String, hashKeyValue: String, roleArn: String, tableName: String): TopicRuleDynamodb = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleDynamodb]
  }
  
  extension [Self <: TopicRuleDynamodb](x: Self) {
    
    inline def setHashKeyField(value: String): Self = StObject.set(x, "hashKeyField", value.asInstanceOf[js.Any])
    
    inline def setHashKeyType(value: String): Self = StObject.set(x, "hashKeyType", value.asInstanceOf[js.Any])
    
    inline def setHashKeyTypeUndefined: Self = StObject.set(x, "hashKeyType", js.undefined)
    
    inline def setHashKeyValue(value: String): Self = StObject.set(x, "hashKeyValue", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setPayloadField(value: String): Self = StObject.set(x, "payloadField", value.asInstanceOf[js.Any])
    
    inline def setPayloadFieldUndefined: Self = StObject.set(x, "payloadField", js.undefined)
    
    inline def setRangeKeyField(value: String): Self = StObject.set(x, "rangeKeyField", value.asInstanceOf[js.Any])
    
    inline def setRangeKeyFieldUndefined: Self = StObject.set(x, "rangeKeyField", js.undefined)
    
    inline def setRangeKeyType(value: String): Self = StObject.set(x, "rangeKeyType", value.asInstanceOf[js.Any])
    
    inline def setRangeKeyTypeUndefined: Self = StObject.set(x, "rangeKeyType", js.undefined)
    
    inline def setRangeKeyValue(value: String): Self = StObject.set(x, "rangeKeyValue", value.asInstanceOf[js.Any])
    
    inline def setRangeKeyValueUndefined: Self = StObject.set(x, "rangeKeyValue", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
