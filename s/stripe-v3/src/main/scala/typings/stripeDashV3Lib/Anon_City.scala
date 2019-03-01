package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_City extends js.Object {
  var city: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var line1: js.UndefOr[java.lang.String] = js.undefined
  var line2: js.UndefOr[java.lang.String] = js.undefined
  var postal_code: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_City {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    country: java.lang.String = null,
    line1: java.lang.String = null,
    line2: java.lang.String = null,
    postal_code: java.lang.String = null,
    state: java.lang.String = null
  ): Anon_City = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (line1 != null) __obj.updateDynamic("line1")(line1)
    if (line2 != null) __obj.updateDynamic("line2")(line2)
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_City]
  }
}

