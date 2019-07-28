package typings.qlik

import org.scalablytyped.runtime.StringDictionary
import typings.qlik.qlikMod.CustomProperty
import typings.qlik.qlikStrings.measures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items extends js.Object {
  var items: js.UndefOr[StringDictionary[CustomProperty]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var uses: measures
}

object Anon_Items {
  @scala.inline
  def apply(
    uses: measures,
    items: StringDictionary[CustomProperty] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    ref: String = null
  ): Anon_Items = {
    val __obj = js.Dynamic.literal(uses = uses)
    if (items != null) __obj.updateDynamic("items")(items)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_Items]
  }
}

