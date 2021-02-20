package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleDynamodbv2PutItem extends StObject {
  
  /**
    * The name of the DynamoDB table.
    */
  var tableName: String = js.native
}
object TopicRuleDynamodbv2PutItem {
  
  @scala.inline
  def apply(tableName: String): TopicRuleDynamodbv2PutItem = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleDynamodbv2PutItem]
  }
  
  @scala.inline
  implicit class TopicRuleDynamodbv2PutItemMutableBuilder[Self <: TopicRuleDynamodbv2PutItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
