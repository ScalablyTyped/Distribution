package typings.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableLocalSecondaryIndex extends js.Object {
  /**
    * The name of the DynamoDB table.
    */
  var name: String = js.native
  var nonKeyAttributes: js.Array[String] = js.native
  var projectionType: String = js.native
  var rangeKey: String = js.native
}

object GetTableLocalSecondaryIndex {
  @scala.inline
  def apply(name: String, nonKeyAttributes: js.Array[String], projectionType: String, rangeKey: String): GetTableLocalSecondaryIndex = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nonKeyAttributes = nonKeyAttributes.asInstanceOf[js.Any], projectionType = projectionType.asInstanceOf[js.Any], rangeKey = rangeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableLocalSecondaryIndex]
  }
  @scala.inline
  implicit class GetTableLocalSecondaryIndexOps[Self <: GetTableLocalSecondaryIndex] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonKeyAttributesVarargs(value: String*): Self = this.set("nonKeyAttributes", js.Array(value :_*))
    @scala.inline
    def setNonKeyAttributes(value: js.Array[String]): Self = this.set("nonKeyAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectionType(value: String): Self = this.set("projectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeKey(value: String): Self = this.set("rangeKey", value.asInstanceOf[js.Any])
  }
  
}

