package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceDynamoDb extends StObject {
  
  /**
    * AWS region name of DynamoDB table, by default us-west-2 is used
    * @type {string}
    * @memberof SourceDynamoDb
    */
  var aws_region: js.UndefOr[String] = js.undefined
  
  /**
    * Max RCU usage for scan
    * @type {number}
    * @memberof SourceDynamoDb
    */
  var rcu: js.UndefOr[Double] = js.undefined
  
  /**
    * DynamoDB source status
    * @type {StatusDynamoDb}
    * @memberof SourceDynamoDb
    */
  var status: js.UndefOr[StatusDynamoDb] = js.undefined
  
  /**
    * name of DynamoDB table containing data
    * @type {string}
    * @memberof SourceDynamoDb
    */
  var table_name: String
}
object SourceDynamoDb {
  
  inline def apply(table_name: String): SourceDynamoDb = {
    val __obj = js.Dynamic.literal(table_name = table_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDynamoDb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceDynamoDb] (val x: Self) extends AnyVal {
    
    inline def setAws_region(value: String): Self = StObject.set(x, "aws_region", value.asInstanceOf[js.Any])
    
    inline def setAws_regionUndefined: Self = StObject.set(x, "aws_region", js.undefined)
    
    inline def setRcu(value: Double): Self = StObject.set(x, "rcu", value.asInstanceOf[js.Any])
    
    inline def setRcuUndefined: Self = StObject.set(x, "rcu", js.undefined)
    
    inline def setStatus(value: StatusDynamoDb): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTable_name(value: String): Self = StObject.set(x, "table_name", value.asInstanceOf[js.Any])
  }
}
