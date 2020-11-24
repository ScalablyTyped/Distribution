package typings.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableGlobalSecondaryIndex extends js.Object {
  
  var hashKey: String = js.native
  
  /**
    * The name of the DynamoDB table.
    */
  var name: String = js.native
  
  var nonKeyAttributes: js.Array[String] = js.native
  
  var projectionType: String = js.native
  
  var rangeKey: String = js.native
  
  var readCapacity: Double = js.native
  
  var writeCapacity: Double = js.native
}
object GetTableGlobalSecondaryIndex {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GetTableGlobalSecondaryIndexOps[Self <: GetTableGlobalSecondaryIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHashKey(value: String): Self = this.set("hashKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonKeyAttributesVarargs(value: String*): Self = this.set("nonKeyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setNonKeyAttributes(value: js.Array[String]): Self = this.set("nonKeyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionType(value: String): Self = this.set("projectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeKey(value: String): Self = this.set("rangeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCapacity(value: Double): Self = this.set("readCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteCapacity(value: Double): Self = this.set("writeCapacity", value.asInstanceOf[js.Any])
  }
}
