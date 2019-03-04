package typings
package qlikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  var items: js.UndefOr[org.scalablytyped.runtime.StringDictionary[qlikLib.qlikMod.CustomProperty]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var uses: qlikLib.qlikLibStrings.dimensions
}

object Anon_Dimensions {
  @scala.inline
  def apply(
    uses: qlikLib.qlikLibStrings.dimensions,
    items: org.scalablytyped.runtime.StringDictionary[qlikLib.qlikMod.CustomProperty] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    ref: java.lang.String = null
  ): Anon_Dimensions = {
    val __obj = js.Dynamic.literal(uses = uses)
    if (items != null) __obj.updateDynamic("items")(items)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

