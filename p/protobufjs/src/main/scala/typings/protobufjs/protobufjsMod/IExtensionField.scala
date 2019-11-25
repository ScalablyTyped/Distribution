package typings.protobufjs.protobufjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtensionField
  extends AnyExtensionField
     with IField {
  /** Extended type */
  var extend: String
}

object IExtensionField {
  @scala.inline
  def apply(
    extend: String,
    id: Double,
    `type`: String,
    options: StringDictionary[js.Any] = null,
    rule: String = null
  ): IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionField]
  }
}

