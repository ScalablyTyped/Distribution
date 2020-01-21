package typings.pulumiAws.outputMod.waf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchSetGeoMatchConstraint extends js.Object {
  /**
    * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
    */
  var `type`: String = js.native
  /**
    * The country that you want AWS WAF to search for.
    * This is the two-letter country code, e.g. `US`, `CA`, `RU`, `CN`, etc.
    * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
    */
  var value: String = js.native
}

object GeoMatchSetGeoMatchConstraint {
  @scala.inline
  def apply(`type`: String, value: String): GeoMatchSetGeoMatchConstraint = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchSetGeoMatchConstraint]
  }
}

