package typings.qunit.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | StringDictionary[String]] = js.undefined
}

object Id {
  @scala.inline
  def apply(
    id: String = null,
    label: String = null,
    tooltip: String = null,
    value: String | js.Array[String] | StringDictionary[String] = null
  ): Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

