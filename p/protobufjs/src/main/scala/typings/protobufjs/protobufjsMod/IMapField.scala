package typings.protobufjs.protobufjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapField extends IField {
  /** Key type */
  var keyType: String
}

object IMapField {
  @scala.inline
  def apply(
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.Any] = null,
    rule: String = null
  ): IMapField = {
    val __obj = js.Dynamic.literal(id = id, keyType = keyType)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[IMapField]
  }
}

