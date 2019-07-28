package typings.qlik.qlikMod

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikStrings.items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyItems
  extends CustomPropertyCommon
     with CustomProperty {
  var items: StringDictionary[CustomProperty]
  @JSName("type")
  var type_CustomPropertyItems: items
}

object CustomPropertyItems {
  @scala.inline
  def apply(
    items: StringDictionary[CustomProperty],
    `type`: items,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomPropertyItems = {
    val __obj = js.Dynamic.literal(items = items)
    __obj.updateDynamic("type")(`type`)
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyItems]
  }
}

