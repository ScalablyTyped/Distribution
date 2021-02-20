package typings.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableLocalSecondaryIndex extends StObject {
  
  /**
    * The name of the index
    */
  var name: String = js.native
  
  /**
    * Only required with `INCLUDE` as a
    * projection type; a list of attributes to project into the index. These
    * do not need to be defined as attributes on the table.
    */
  var nonKeyAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
    * where `ALL` projects every attribute into the index, `KEYS_ONLY`
    * projects just the hash and range key into the index, and `INCLUDE`
    * projects only the keys specified in the _non_key_attributes_
    * parameter.
    */
  var projectionType: String = js.native
  
  /**
    * The name of the range key; must be defined
    */
  var rangeKey: String = js.native
}
object TableLocalSecondaryIndex {
  
  @scala.inline
  def apply(name: String, projectionType: String, rangeKey: String): TableLocalSecondaryIndex = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableLocalSecondaryIndex]
  }
  
  @scala.inline
  implicit class TableLocalSecondaryIndexMutableBuilder[Self <: TableLocalSecondaryIndex] (val x: Self) extends AnyVal {
    
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
  }
}
