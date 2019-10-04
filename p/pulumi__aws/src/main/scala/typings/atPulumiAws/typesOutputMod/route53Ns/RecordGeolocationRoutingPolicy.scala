package typings.atPulumiAws.typesOutputMod.route53Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordGeolocationRoutingPolicy extends js.Object {
  /**
    * A two-letter continent code. See http://docs.aws.amazon.com/Route53/latest/APIReference/API_GetGeoLocation.html for code details. Either `continent` or `country` must be specified.
    */
  var continent: js.UndefOr[String] = js.undefined
  /**
    * A two-character country code or `*` to indicate a default resource record set.
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * A subdivision code for a country.
    */
  var subdivision: js.UndefOr[String] = js.undefined
}

object RecordGeolocationRoutingPolicy {
  @scala.inline
  def apply(continent: String = null, country: String = null, subdivision: String = null): RecordGeolocationRoutingPolicy = {
    val __obj = js.Dynamic.literal()
    if (continent != null) __obj.updateDynamic("continent")(continent)
    if (country != null) __obj.updateDynamic("country")(country)
    if (subdivision != null) __obj.updateDynamic("subdivision")(subdivision)
    __obj.asInstanceOf[RecordGeolocationRoutingPolicy]
  }
}

