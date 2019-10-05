package typings.atPulumiAws.typesOutputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableLocalSecondaryIndex extends js.Object {
  /**
    * The name of the DynamoDB table.
    */
  var name: String
  var nonKeyAttributes: js.Array[String]
  var projectionType: String
  var rangeKey: String
}

object GetTableLocalSecondaryIndex {
  @scala.inline
  def apply(name: String, nonKeyAttributes: js.Array[String], projectionType: String, rangeKey: String): GetTableLocalSecondaryIndex = {
    val __obj = js.Dynamic.literal(name = name, nonKeyAttributes = nonKeyAttributes, projectionType = projectionType, rangeKey = rangeKey)
  
    __obj.asInstanceOf[GetTableLocalSecondaryIndex]
  }
}

