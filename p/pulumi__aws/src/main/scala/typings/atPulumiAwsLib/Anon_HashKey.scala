package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKey extends js.Object {
  var hashKey: java.lang.String
  var name: java.lang.String
  var nonKeyAttributes: js.Array[java.lang.String]
  var projectionType: java.lang.String
  var rangeKey: java.lang.String
  var readCapacity: scala.Double
  var writeCapacity: scala.Double
}

object Anon_HashKey {
  @scala.inline
  def apply(
    hashKey: java.lang.String,
    name: java.lang.String,
    nonKeyAttributes: js.Array[java.lang.String],
    projectionType: java.lang.String,
    rangeKey: java.lang.String,
    readCapacity: scala.Double,
    writeCapacity: scala.Double
  ): Anon_HashKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hashKey")(hashKey)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes)
    __obj.updateDynamic("projectionType")(projectionType)
    __obj.updateDynamic("rangeKey")(rangeKey)
    __obj.updateDynamic("readCapacity")(readCapacity)
    __obj.updateDynamic("writeCapacity")(writeCapacity)
    __obj.asInstanceOf[Anon_HashKey]
  }
}

