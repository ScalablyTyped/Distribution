package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleDynamodb extends StObject {
  
  /**
    * The hash key name.
    */
  var hashKeyField: String = js.native
  
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER".
    */
  var hashKeyType: js.UndefOr[String] = js.native
  
  /**
    * The hash key value.
    */
  var hashKeyValue: String = js.native
  
  /**
    * The operation. Valid values are "INSERT", "UPDATE", or "DELETE".
    */
  var operation: js.UndefOr[String] = js.native
  
  /**
    * The action payload.
    */
  var payloadField: js.UndefOr[String] = js.native
  
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[String] = js.native
  
  /**
    * The range key type. Valid values are "STRING" or "NUMBER".
    */
  var rangeKeyType: js.UndefOr[String] = js.native
  
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: String = js.native
  
  /**
    * The name of the DynamoDB table.
    */
  var tableName: String = js.native
}
object TopicRuleDynamodb {
  
  @scala.inline
  def apply(hashKeyField: String, hashKeyValue: String, roleArn: String, tableName: String): TopicRuleDynamodb = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleDynamodb]
  }
  
  @scala.inline
  implicit class TopicRuleDynamodbMutableBuilder[Self <: TopicRuleDynamodb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashKeyField(value: String): Self = StObject.set(x, "hashKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKeyType(value: String): Self = StObject.set(x, "hashKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKeyTypeUndefined: Self = StObject.set(x, "hashKeyType", js.undefined)
    
    @scala.inline
    def setHashKeyValue(value: String): Self = StObject.set(x, "hashKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setPayloadField(value: String): Self = StObject.set(x, "payloadField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadFieldUndefined: Self = StObject.set(x, "payloadField", js.undefined)
    
    @scala.inline
    def setRangeKeyField(value: String): Self = StObject.set(x, "rangeKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyFieldUndefined: Self = StObject.set(x, "rangeKeyField", js.undefined)
    
    @scala.inline
    def setRangeKeyType(value: String): Self = StObject.set(x, "rangeKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyTypeUndefined: Self = StObject.set(x, "rangeKeyType", js.undefined)
    
    @scala.inline
    def setRangeKeyValue(value: String): Self = StObject.set(x, "rangeKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyValueUndefined: Self = StObject.set(x, "rangeKeyValue", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
