package typings.protobufjs.protobufjsMod

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
    val __obj = js.Dynamic.literal(extend = extend, id = id, keyType = keyType)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[IExtensionMapField]
  }
}

