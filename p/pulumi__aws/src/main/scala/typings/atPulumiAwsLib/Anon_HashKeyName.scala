package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyName extends js.Object {
  var hashKey: java.lang.String
  var name: java.lang.String
  var nonKeyAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var projectionType: java.lang.String
  var rangeKey: js.UndefOr[java.lang.String] = js.undefined
  var readCapacity: js.UndefOr[scala.Double] = js.undefined
  var writeCapacity: js.UndefOr[scala.Double] = js.undefined
}

object Anon_HashKeyName {
  @scala.inline
  def apply(
    hashKey: java.lang.String,
    name: java.lang.String,
    projectionType: java.lang.String,
    nonKeyAttributes: js.Array[java.lang.String] = null,
    rangeKey: java.lang.String = null,
    readCapacity: scala.Int | scala.Double = null,
    writeCapacity: scala.Int | scala.Double = null
  ): Anon_HashKeyName = {
    val __obj = js.Dynamic.literal(hashKey = hashKey, name = name, projectionType = projectionType)
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes)
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey)
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HashKeyName]
  }
}

