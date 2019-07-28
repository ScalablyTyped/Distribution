package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKey extends js.Object {
  var hashKey: String
  var name: String
  var nonKeyAttributes: js.Array[String]
  var projectionType: String
  var rangeKey: String
  var readCapacity: Double
  var writeCapacity: Double
}

object Anon_HashKey {
  @scala.inline
  def apply(
    hashKey: String,
    name: String,
    nonKeyAttributes: js.Array[String],
    projectionType: String,
    rangeKey: String,
    readCapacity: Double,
    writeCapacity: Double
  ): Anon_HashKey = {
    val __obj = js.Dynamic.literal(hashKey = hashKey, name = name, nonKeyAttributes = nonKeyAttributes, projectionType = projectionType, rangeKey = rangeKey, readCapacity = readCapacity, writeCapacity = writeCapacity)
  
    __obj.asInstanceOf[Anon_HashKey]
  }
}

