package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapField extends IField {
  /** Key type */
  var keyType: java.lang.String
}

object IMapField {
  @scala.inline
  def apply(
    id: scala.Double,
    keyType: java.lang.String,
    `type`: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    rule: java.lang.String = null
  ): IMapField = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("keyType")(keyType)
    if (options != null) __obj.updateDynamic("options")(options)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[IMapField]
  }
}

