package typings.atPulumiAws.typesOutputMod.waf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoMatchSetGeoMatchConstraint extends js.Object {
  /**
    * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
    */
  var `type`: String
  /**
    * The country that you want AWS WAF to search for.
    * This is the two-letter country code, e.g. `US`, `CA`, `RU`, `CN`, etc.
    * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchConstraint.html) for all supported values.
    */
  var value: String
}

object GeoMatchSetGeoMatchConstraint {
  @scala.inline
  def apply(`type`: String, value: String): GeoMatchSetGeoMatchConstraint = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GeoMatchSetGeoMatchConstraint]
  }
}

