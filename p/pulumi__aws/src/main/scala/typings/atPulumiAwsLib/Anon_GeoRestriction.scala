package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GeoRestriction extends js.Object {
  var geoRestriction: Anon_Locations
}

object Anon_GeoRestriction {
  @scala.inline
  def apply(geoRestriction: Anon_Locations): Anon_GeoRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("geoRestriction")(geoRestriction)
    __obj.asInstanceOf[Anon_GeoRestriction]
  }
}

