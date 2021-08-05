package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorActionDynamodbv2PutItem extends StObject {
  
  /**
    * The name of the DynamoDB table.
    */
  var tableName: String
}
object TopicRuleErrorActionDynamodbv2PutItem {
  
  inline def apply(tableName: String): TopicRuleErrorActionDynamodbv2PutItem = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionDynamodbv2PutItem]
  }
  
  extension [Self <: TopicRuleErrorActionDynamodbv2PutItem](x: Self) {
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
