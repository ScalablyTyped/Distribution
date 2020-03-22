package typings.qlik

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.mod.CustomProperty
import typings.qlik.qlikStrings.dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems extends js.Object {
  var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var uses: dimensions
}

object AnonItems {
  @scala.inline
  def apply(
    uses: dimensions,
    items: StringDictionary[CustomProperty] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    ref: String = null
  ): AnonItems = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems]
  }
}

