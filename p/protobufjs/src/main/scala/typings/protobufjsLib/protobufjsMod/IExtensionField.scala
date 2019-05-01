package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtensionField
  extends AnyExtensionField
     with IField {
  /** Extended type */
  var extend: java.lang.String
}

object IExtensionField {
  @scala.inline
  def apply(
    extend: java.lang.String,
    id: scala.Double,
    `type`: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    rule: java.lang.String = null
  ): IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend, id = id)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[IExtensionField]
  }
}

