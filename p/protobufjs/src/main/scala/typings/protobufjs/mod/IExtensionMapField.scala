package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtensionMapField
  extends IMapField
     with AnyExtensionField {
  /** Extended type */
  var extend: String
}

object IExtensionMapField {
  @scala.inline
  def apply(
    extend: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.Any] = null,
    rule: String = null
  ): IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionMapField]
  }
}

