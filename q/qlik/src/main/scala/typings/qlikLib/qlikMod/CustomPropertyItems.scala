package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyItems
  extends CustomPropertyCommon
     with CustomProperty {
  var items: org.scalablytyped.runtime.StringDictionary[CustomProperty]
  @JSName("type")
  var type_CustomPropertyItems: qlikLib.qlikLibStrings.items
}

object CustomPropertyItems {
  @scala.inline
  def apply(
    items: org.scalablytyped.runtime.StringDictionary[CustomProperty],
    `type`: qlikLib.qlikLibStrings.items,
    label: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomPropertyItems = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("items")(items)
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyItems]
  }
}

