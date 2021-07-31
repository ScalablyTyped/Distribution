package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleDynamodb extends StObject {
  
  /**
    * The hash key name.
    */
  var hashKeyField: Input[String]
  
  /**
    * The hash key type. Valid values are "STRING" or "NUMBER".
    */
  var hashKeyType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The hash key value.
    */
  var hashKeyValue: Input[String]
  
  /**
    * The operation. Valid values are "INSERT", "UPDATE", or "DELETE".
    */
  var operation: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The action payload.
    */
  var payloadField: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The range key name.
    */
  var rangeKeyField: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The range key type. Valid values are "STRING" or "NUMBER".
    */
  var rangeKeyType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The range key value.
    */
  var rangeKeyValue: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: Input[String]
  
  /**
    * The name of the DynamoDB table.
    */
  var tableName: Input[String]
}
object TopicRuleDynamodb {
  
  @scala.inline
  def apply(
    hashKeyField: Input[String],
    hashKeyValue: Input[String],
    roleArn: Input[String],
    tableName: Input[String]
  ): TopicRuleDynamodb = {
    val __obj = js.Dynamic.literal(hashKeyField = hashKeyField.asInstanceOf[js.Any], hashKeyValue = hashKeyValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleDynamodb]
  }
  
  @scala.inline
  implicit class TopicRuleDynamodbMutableBuilder[Self <: TopicRuleDynamodb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashKeyField(value: Input[String]): Self = StObject.set(x, "hashKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKeyType(value: Input[String]): Self = StObject.set(x, "hashKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashKeyTypeUndefined: Self = StObject.set(x, "hashKeyType", js.undefined)
    
    @scala.inline
    def setHashKeyValue(value: Input[String]): Self = StObject.set(x, "hashKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: Input[String]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setPayloadField(value: Input[String]): Self = StObject.set(x, "payloadField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadFieldUndefined: Self = StObject.set(x, "payloadField", js.undefined)
    
    @scala.inline
    def setRangeKeyField(value: Input[String]): Self = StObject.set(x, "rangeKeyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyFieldUndefined: Self = StObject.set(x, "rangeKeyField", js.undefined)
    
    @scala.inline
    def setRangeKeyType(value: Input[String]): Self = StObject.set(x, "rangeKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyTypeUndefined: Self = StObject.set(x, "rangeKeyType", js.undefined)
    
    @scala.inline
    def setRangeKeyValue(value: Input[String]): Self = StObject.set(x, "rangeKeyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyValueUndefined: Self = StObject.set(x, "rangeKeyValue", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: Input[String]): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
