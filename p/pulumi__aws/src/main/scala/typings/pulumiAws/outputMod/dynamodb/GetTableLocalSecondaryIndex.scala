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
}

