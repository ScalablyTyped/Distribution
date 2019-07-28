package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashKeyName extends js.Object {
  var hashKey: String
  var name: String
  var nonKeyAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var projectionType: String
  var rangeKey: js.UndefOr[String] = js.undefined
  var readCapacity: js.UndefOr[Double] = js.undefined
  var writeCapacity: js.UndefOr[Double] = js.undefined
}

object Anon_HashKeyName {
  @scala.inline
  def apply(
    hashKey: String,
    name: String,
    projectionType: String,
    nonKeyAttributes: js.Array[String] = null,
    rangeKey: String = null,
    readCapacity: Int | Double = null,
    writeCapacity: Int | Double = null
  ): Anon_HashKeyName = {
    val __obj = js.Dynamic.literal(hashKey = hashKey, name = name, projectionType = projectionType)
    if (nonKeyAttributes != null) __obj.updateDynamic("nonKeyAttributes")(nonKeyAttributes)
    if (rangeKey != null) __obj.updateDynamic("rangeKey")(rangeKey)
    if (readCapacity != null) __obj.updateDynamic("readCapacity")(readCapacity.asInstanceOf[js.Any])
    if (writeCapacity != null) __obj.updateDynamic("writeCapacity")(writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HashKeyName]
  }
}

