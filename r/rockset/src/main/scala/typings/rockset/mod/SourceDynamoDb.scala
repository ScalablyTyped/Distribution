package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceDynamoDb extends StObject {
  
  // AWS region name of DynamoDB table, by default us-west-2 is used
  var aws_region: js.UndefOr[String] = js.undefined
  
  // name of DynamoDB table containing data
  var table_name: String
}
object SourceDynamoDb {
  
  @scala.inline
  def apply(table_name: String): SourceDynamoDb = {
    val __obj = js.Dynamic.literal(table_name = table_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDynamoDb]
  }
  
  @scala.inline
  implicit class SourceDynamoDbMutableBuilder[Self <: SourceDynamoDb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAws_region(value: String): Self = StObject.set(x, "aws_region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAws_regionUndefined: Self = StObject.set(x, "aws_region", js.undefined)
    
    @scala.inline
    def setTable_name(value: String): Self = StObject.set(x, "table_name", value.asInstanceOf[js.Any])
  }
}
