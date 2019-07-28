package typings.qunit

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | StringDictionary[String]] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(
    id: String = null,
    label: String = null,
    tooltip: String = null,
    value: String | js.Array[String] | StringDictionary[String] = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

