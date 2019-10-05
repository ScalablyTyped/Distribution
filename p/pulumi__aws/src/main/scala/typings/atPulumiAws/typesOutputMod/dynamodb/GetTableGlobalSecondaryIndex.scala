package typings.atPulumiAws.typesOutputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableGlobalSecondaryIndex extends js.Object {
  var hashKey: String
  /**
    * The name of the DynamoDB table.
    */
  var name: String
  var nonKeyAttributes: js.Array[String]
  var projectionType: String
  var rangeKey: String
  var readCapacity: Double
  var writeCapacity: Double
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
    val __obj = js.Dynamic.literal(hashKey = hashKey, name = name, nonKeyAttributes = nonKeyAttributes, projectionType = projectionType, rangeKey = rangeKey, readCapacity = readCapacity, writeCapacity = writeCapacity)
  
    __obj.asInstanceOf[GetTableGlobalSecondaryIndex]
  }
}

