package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableGlobalSecondaryIndex extends StObject {
  
  /**
    * The name of the hash key in the index; must be
    * defined as an attribute in the resource.
    */
  var hashKey: String
  
  /**
    * The name of the index
    */
  var name: String
  
  /**
    * Only required with `INCLUDE` as a
    * projection type; a list of attributes to project into the index. These
    * do not need to be defined as attributes on the table.
    */
  var nonKeyAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
    * where `ALL` projects every attribute into the index, `KEYS_ONLY`
    * projects just the hash and range key into the index, and `INCLUDE`
    * projects only the keys specified in the _non_key_attributes_
    * parameter.
    */
  var projectionType: String
  
  /**
    * The name of the range key; must be defined
    */
  var rangeKey: js.UndefOr[String] = js.undefined
  
  /**
    * The number of read units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var readCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of write units for this index. Must be set if billingMode is set to PROVISIONED.
    */
  var writeCapacity: js.UndefOr[Double] = js.undefined
}
object TableGlobalSecondaryIndex {
  
  @scala.inline
  def apply(hashKey: String, name: String, projectionType: String): TableGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(hashKey = hashKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableGlobalSecondaryIndex]
  }
  
  @scala.inline
  implicit class TableGlobalSecondaryIndexMutableBuilder[Self <: TableGlobalSecondaryIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashKey(value: String): Self = StObject.set(x, "hashKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonKeyAttributes(value: js.Array[String]): Self = StObject.set(x, "nonKeyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonKeyAttributesUndefined: Self = StObject.set(x, "nonKeyAttributes", js.undefined)
    
    @scala.inline
    def setNonKeyAttributesVarargs(value: String*): Self = StObject.set(x, "nonKeyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setProjectionType(value: String): Self = StObject.set(x, "projectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKey(value: String): Self = StObject.set(x, "rangeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKeyUndefined: Self = StObject.set(x, "rangeKey", js.undefined)
    
    @scala.inline
    def setReadCapacity(value: Double): Self = StObject.set(x, "readCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCapacityUndefined: Self = StObject.set(x, "readCapacity", js.undefined)
    
    @scala.inline
    def setWriteCapacity(value: Double): Self = StObject.set(x, "writeCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteCapacityUndefined: Self = StObject.set(x, "writeCapacity", js.undefined)
  }
}
