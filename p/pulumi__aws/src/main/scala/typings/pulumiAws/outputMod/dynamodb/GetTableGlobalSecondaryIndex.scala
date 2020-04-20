package typings.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

