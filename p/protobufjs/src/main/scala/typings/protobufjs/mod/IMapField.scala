package typings.protobufjs.mod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapField]
  }
}

