package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtensionMapField extends IMapField {
  /** Extended type */
  var extend: java.lang.String
}

object IExtensionMapField {
  @scala.inline
  def apply(
    extend: java.lang.String,
    id: scala.Double,
    keyType: java.lang.String,
    `type`: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    rule: java.lang.String = null
  ): IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend, id = id, keyType = keyType)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[IExtensionMapField]
  }
}

